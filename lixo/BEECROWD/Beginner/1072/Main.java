import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int inside = 0, outside = 0, n;

        for(int i = 1; i <= num; i++) {
            n = scan.nextInt();
                if(n >= 10 && n <= 20) inside++;
                else outside++;
        }

        System.out.printf(inside+" in\n");
        System.out.printf(outside+" out\n");       

        scan.close();
    }
}