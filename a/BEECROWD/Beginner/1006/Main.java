import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble(), B = scan.nextDouble(), C = scan.nextDouble(), media = ((A*2)+(B*3)+(C*5))/10;

        System.out.printf("MEDIA = %.1f\n", media);

        scan.close();
    }

}