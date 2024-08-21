import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt(), num2 = scan.nextInt(), PROD = num1 * num2;

        System.out.println("PROD = "+PROD);

        scan.close();
    }

}