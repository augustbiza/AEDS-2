import java.util.Scanner;
import java.lang.Math;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //coeficients
        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
        //roots and discriminant
        double x1, x2, discriminant;
        discriminant = (b*b) - (4*a*c);
            if((discriminant < 0) || (a == 0.0)) System.out.println("Impossivel calcular");     //no real roots 
            else {
                double delta = Math.sqrt(discriminant);
                x1 = (-1*b + delta)/(2*a);
                x2 = (-1*b - delta)/(2*a);        
                System.out.printf("R1 = %.5f\n", x1);
                System.out.printf("R2 = %.5f\n", x2);

            }

        scan.close();
    }
}