// Validação de Senha em Java (iterativo)
/*
tam >= 8
maiúscula >= 1
minúscula >= 1
especial >= 1
número >= 1
*/
import java.util.Scanner;

public class Main {

    public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
    }
    
    private static boolean verificaSenha(String str, int tam) {
        //boolean tam8, min, mai, esp, num, senha;
        
        boolean tam8 = true;
            if(tam < 8) tam8 = false;
            
        boolean min = false;
            for(int i = 0; i < tam && !min; i++) {
                if(str.charAt(i) >= 97 && str.charAt(i) <= 122) min = true;
            }
            
        boolean mai = false;
            for(int i = 0; i < tam && !mai; i++) {
                if(str.charAt(i) >= 65 && str.charAt(i) <= 90) mai = true;
            }
            
        boolean num = false;
            for(int i = 0; i < tam && !num; i++) {
                if(str.charAt(i) >= 48 && str.charAt(i) <= 57) num = true;
            }
            
        boolean esp = false;
            for(int i = 0; i < tam && !esp; i++) {
                if(str.charAt(i) >= 33 && str.charAt(i) <= 47) esp = true;
                else if(str.charAt(i) >= 58 && str.charAt(i) <= 64) esp = true;
                else if(str.charAt(i) >= 91 && str.charAt(i) <= 96) esp = true;
            }
            
        boolean senha = tam8 && min && mai && num && esp;
        
        return senha;
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = new String();
        int tam = 1;
		
		do {
		    
		    str = scan.nextLine();
		    tam = str.length();
		    
		    if(!comparaFim(str, tam)) {
		        
		        if(verificaSenha(str, tam)) System.out.print("SIM\n");
		        else System.out.print("NÃO\n");
		    }
		    
		}while(!comparaFim(str, tam));
		
		scan.close();
	}
}
