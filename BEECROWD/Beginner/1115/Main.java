import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
            
        int x, y;
        
        do{
        
            x = scan.nextInt();
            y = scan.nextInt();
            
            boolean erro = x == 0 || y == 0;
        
            if(!erro) {
                if(x > 0) {
                    if(y > 0) System.out.println("primeiro");
                    else System.out.println("quarto");
                }
                else {
                    if(y > 0) System.out.println("segundo");
                    else System.out.println("terceiro");
                }
            }
            
        }while(x != 0 && y != 0);
        
        scan.close();
    }
 
}