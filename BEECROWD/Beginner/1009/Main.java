import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

            String name = scan.nextLine();
            double fixedSalary = scan.nextDouble(), total = scan.nextDouble(), finalSalary;

            finalSalary = fixedSalary + (total * 0.15);

            System.out.printf("TOTAL = R$%.2f\n", finalSalary); 

        scan.close();
    }

}