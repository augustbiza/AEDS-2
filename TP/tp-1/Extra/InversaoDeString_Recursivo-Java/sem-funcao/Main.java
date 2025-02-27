// Inversão de String em Java (recursivo)
import java.util.Scanner;

class Main {

    public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
    }
    
    public static String inverteString(String str, char[] arr, int i, int tam) {

        if(i < tam) {

            arr[i] = str.charAt(tam-i-1);

            inverteString(str, arr, i+1, tam);
        }
        
        String str2 = new String(arr);
        
        return str2;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String str = new String();
        int tam = 1;

        do{
            
            str = scan.nextLine();
            tam = str.length();
    
            if(!comparaFim(str, tam)) {

                char[] arr = new char[tam];
                
                System.out.println(inverteString(str, arr, 0, tam));
            }
    
        } while(!comparaFim(str, tam));
        
        scan.close();
    }
    
}