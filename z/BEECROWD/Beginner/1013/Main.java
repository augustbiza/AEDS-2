import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), greatest;

        greatest = (a+b + Math.abs(a-b))/2;
        greatest = (greatest + c + Math.abs(greatest-c))/2;

        System.out.println(greatest+" eh o maior");

        scan.close();
    }

}