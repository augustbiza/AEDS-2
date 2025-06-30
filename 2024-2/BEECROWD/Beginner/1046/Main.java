import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int start = scan.nextInt(), end = scan.nextInt(), res;

        if(start < end) res = end - start;
        else if(start > end) res = 24 - start + end;
        else res = 24;

        System.out.println("O JOGO DUROU "+res+ " HORA(S)");
    
        scan.close();
    }
 
}