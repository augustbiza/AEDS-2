import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt(), b = scan.nextInt();

        boolean multiples = false;

        if((a % b == 0) || (b % a == 0)) multiples = true;

        if(multiples) System.out.println("Sao Multiplos");
        else System.out.println("Nao sao multiplos");

        scan.close();
    }
 
}