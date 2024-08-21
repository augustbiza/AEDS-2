import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble(), B = scan.nextDouble(), media = ((A*3.5)+(B*7.5))/11;

        System.out.printf("MEDIA = %.5f\n", media);

        scan.close();
    }

}