import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        int menor = a, maior = a;
        
        if(a > b && a > c) {
            maior = a;
            if(b > c) menor = c;
            else menor = b;
        }
        else if(b > a && b > c) {
            maior = b;
            if(a > c) menor = c;
            else menor = a;
        }
        else if(c > a && c > b) {
            maior = c;
            if(a > b) menor = b;
            else menor = a;
        }

        System.out.printf("%d\n%d\n%d\n", menor, a+b+c-menor-maior, maior);
        System.out.printf("\n%d\n%d\n%d\n", a, b, c);
        
        scan.close();
    }
 
}