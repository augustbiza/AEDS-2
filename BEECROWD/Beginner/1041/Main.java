import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        double x = scan.nextDouble(), y = scan.nextDouble();
        
        String coord = "Q";
        
        if(x == 0 && y == 0) System.out.println("Origem");
        else if(x == 0 && y != 0) System.out.println("Eixo Y");
        else if(x != 0 && y == 0) System.out.println("Eixo X");
        else {
            if(x > 0) {
            if(y > 0) coord += '1';
            else coord += '4';
            } else {
                if(y > 0) coord += '2';
                else coord += '3';
            }
            
            System.out.println(coord);
        }
        
        
        
        scan.close();
    }
 
}