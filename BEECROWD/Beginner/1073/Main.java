import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 2; i < num; i+=2) {
            System.out.printf("%d^2 = %.0f\n", i, Math.pow(i,2));
            //System.out.println(i+"^2"+" = "+Math.pow(i,2));
        }
        if(num % 2 == 0) System.out.printf("%d^2 = %.0f\n", num, Math.pow(num,2));
        //System.out.println(num+"^2"+" = "+Math.pow(num,2));

        scan.close();
    }
}