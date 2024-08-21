import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

            int num = scan.nextInt(), hours = scan.nextInt();
            double salary = scan.nextDouble(), total;
            total = salary * hours;

            System.out.printf("NUMBER = %d\nSALARY = U$%.2f\n", num, total); 

        scan.close();
    }

}