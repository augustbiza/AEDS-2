// Anagrama em Java (iterativo)
import java.util.Scanner;

public class Main {
    
    
    private static void charMinusculo(char[] a, char[] b) {
        
        int tam = a.length;
    
        for (int i = 0; i < tam; i++) {
            if(a[i] >= 97 && a[i] <= 122) a[i] = (char) (a[i] - 32);
            
            if(b[i] >= 97 && a[i] <= 122) b[i] = (char) (b[i] - 32);
        }
    }
    
    
    private static boolean verificaAnagrama(String a, String b) {
        
        boolean anagrama = true;
        
        if(a.length() != b.length()) {
            
            anagrama = false;
        }
        
        else {
            
            int tam = a.length();
            
            int[] charA = new int[65536];     
            int[] charB = new int[65536];
                                                //ex: casa (99-97-115-97) | asac (97-115-97-99)
            for(int i = 0; i < tam; i++) {
                
                charA[a.charAt(i)]++;           //charA[c] = charA[99] = 0 --> charA[99]++ = 1
                charB[b.charAt(i)]++;           //charB[c] = charB[97] = 0 --> charB[97]++ = 1
            }
            
            for(int i = 32; i < 65536; i++) {     //a partir do 32 que se ve
                
                if(charA[i] != charB[i]) {
                    anagrama = false;
                    i = 256;
                }
            }
        }
        
        return anagrama;
    }
    
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    String str = new String();
	    
	    do{
	        
	        str = scan.nextLine();
	        int tamStr = str.length();
	        
	        if(!str.equals("FIM")) {
	            
	            //Separar a string em duas palavras armazenadas em um array
	            char[] arrayA = new char[tamStr];
	            char[] arrayB = new char[tamStr];
	            
	            int i = 0;
	            
	            while(str.charAt(i) != 32) {
	                
	                arrayA[i] = str.charAt(i);
	                i++;
	            }
	            
	            while(i < tamStr) {
	                
	                if(str.charAt(i)!= 32 && str.charAt(i) != 45) {     //pular espaço e traço
	                    
    	                arrayB[i] = str.charAt(i);
	                }
    	                i++;
	            }
	            //--
	            
	            //transformar tudo em minusculo
	            charMinusculo(arrayA, arrayB);
	            
	            //as duas Strings prontas
	            String a = new String(arrayA);
	            String b = new String(arrayB);
	            
	            if(verificaAnagrama(a, b)) System.out.println("SIM");
	            else System.out.println("NÃO");
	        }
	        
	    }while(!str.equals("FIM"));
	    
	    scan.close();
	}
}
