import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt(), D = scan.nextInt(), diff;
        diff = (A*B-C*D);

        System.out.println("DIFERENCA = "+diff);

        scan.close();
    }

}