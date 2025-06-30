import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int sum = A + B;

        System.out.println("X = " + sum);

        scan.close();
    }

}