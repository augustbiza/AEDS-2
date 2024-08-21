import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
        int code1 = scan.nextInt(), numU1 = scan.nextInt();
        double priceU1 = scan.nextDouble();
        int code2 = scan.nextInt(), numU2 = scan.nextInt();
        double priceU2 = scan.nextDouble();
        double total = (numU1 * priceU1) + (numU2 * priceU2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
    scan.close();
    }
 
}