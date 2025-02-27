// Inversão de String em Java (recursivo)
import java.util.Scanner;

class Main {
    
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
    
            if(!str.equals("FIM")) {

                char[] arr = new char[tam];
                
                System.out.println(inverteString(str, arr, 0, tam));
            }
    
        } while(!str.equals("FIM"));
        
        scan.close();
    }
    
}