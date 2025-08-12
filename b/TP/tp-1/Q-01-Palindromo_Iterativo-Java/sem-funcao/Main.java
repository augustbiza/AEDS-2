//Palindromo iterativo em Java
import java.util.Scanner;

class Main {

    public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
    }

    public static boolean verificaPalindromo(String str, int tam) {

        boolean palindromo = true;

        int i = 0;

        while(i < tam/2 && palindromo) {

            if(str.charAt(i) != str.charAt(tam-1-i)) palindromo = false;      //tam-1 = ultimo caractere da string
                                                                             //tam-i = a mesma distancia que i está do início(0) tam estará do final(tam-1)
            i++;
        }

        return palindromo;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String();
        int tam = 1;
        
        do{
            
            str = scan.nextLine();
            tam = str.length();

            if(!comparaFim(str, tam)) {
            
                if(verificaPalindromo(str, tam)) System.out.println("SIM");
                else System.out.println("NAO");
            }

        } while(!comparaFim(str, tam));

        scan.close();
    }
}