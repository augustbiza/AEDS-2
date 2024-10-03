import java.util.Scanner;
import java.io.IOException;

class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 0; i < n; i++) {
            double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
            double average = ((a*2)+(b*3)+(c*5)) / 10;
            System.out.printf("%.1f\n", average);
        }

        scan.close();
    }
}