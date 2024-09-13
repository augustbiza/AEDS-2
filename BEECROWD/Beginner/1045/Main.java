import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();

        if(a > 0 && b > 0 && c > 0) {

            double maior = 0;
                if(a > b && a > c) maior = a;
                else if(b > a && b > c) {
                    maior = b;
                    b = a;
                    a = maior;
                }
                else if(c > a && c > b) {
                    maior = c;
                    c = a;
                    a = maior;
                }

            if((a >= b+c) || (b >= a+c) || (c >= a+b)) {
                System.out.println("NAO FORMA TRIANGULO");
            }        
            else {
                if((a*a) == (b*b) + (c*c)) System.out.println("TRIANGULO RETANGULO");
                else if((a*a) > (b*b) + (c*c)) System.out.println("TRIANGULO OBTUSANGULO");
                else if((a*a) < (b*b) + (c*c)) System.out.println("TRIANGULO ACUTANGULO");

                if(a == b && a == c && b == c) System.out.println("TRIANGULO EQUILATERO");
                else if(a == b || a == c || b == c) System.out.println("TRIANGULO ISOSCELES");
                //else System.out.println("TRIANGULO ESCALENO");
            }
        }

        scan.close(); 
    }

}