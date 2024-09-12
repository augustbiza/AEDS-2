import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String args[]) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble(), value;

        boolean desigualdadeTriangular = true;

            if((a+b <= c) || (a+c <= b) || (b+c <= a)) desigualdadeTriangular = false;

            if(desigualdadeTriangular) {
                value = a + b + c;
                System.out.printf("Perimetro = %.1f\n", value);
            }
            else {
                value = (a+b)*c/2;
                System.out.printf("Area = %.1f\n", value);
            }

        scan.close(); 
    }
}