import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 1;
        int x = n*i;

        System.out.println("2");

        while(x < 10000) {
            System.out.println(x+2);
            i++;
            x = n*i;
        }

        scan.close();
    }
}