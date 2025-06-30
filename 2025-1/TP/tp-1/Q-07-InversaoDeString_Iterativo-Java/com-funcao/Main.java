// Inversão de String em Java (iterativo)
import java.util.Scanner;

class Main {
    
    public static String inverteString(String str, int tam) {
    
        char[] arr = new char[tam];
        
        for(int i = 0; i < tam; i++) {
            arr[i] = str.charAt(tam-i-1);
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
                
                System.out.println(inverteString(str, tam));
            }
    
        } while(!str.equals("FIM"));
        
        scan.close();
    }
    
}