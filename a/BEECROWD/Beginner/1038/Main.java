//import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) /*throws IOException*/ {
        Scanner scan = new Scanner(System.in); 
        
        int code = scan.nextInt(), qt = scan.nextInt();
        double price;
        
        switch(code) {
            case 1: price = qt * 4.00; break;
            case 2: price = qt * 4.50; break;
            case 3: price = qt * 5.00; break;
            case 4: price = qt * 2.00; break;
            case 5: price = qt * 1.50; break;
            default: price = 0;
        }
        System.out.printf("Total: R$ %.2f\n", price);
        scan.close();
    }
 
}