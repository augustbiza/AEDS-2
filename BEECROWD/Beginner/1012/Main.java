import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
        double A = scan.nextDouble(), B = scan.nextDouble(), C = scan.nextDouble();
        
        double a = A*C / 2, b = 3.14159 * C*C, c = (A+B)*C/2, d = B*B, e = A*B;
        
        System.out.printf("TRIANGULO: %.3f\n",a);
        System.out.printf("CIRCULO: %.3f\n",b);
        System.out.printf("TRAPEZIO: %.3f\n",c);
        System.out.printf("QUADRADO: %.3f\n",d);
        System.out.printf("RETANGULO: %.3f\n",e);
        
        
    scan.close();
    }
 
}