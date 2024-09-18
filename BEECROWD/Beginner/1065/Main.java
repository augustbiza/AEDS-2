import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int []num = new int[5];
        int c = 0;
        
        for(int i = 0; i < 5; i++) {
            num[i] = scan.nextInt();
            
            if(num[i] % 2 == 0) c++;
        }
        
        System.out.println(c+" valores pares");
        
        scan.close();
    }
 
}