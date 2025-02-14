import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+n+" = "+n*i);
        }

        scan.close();
    }
}