import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        double salary = scan.nextDouble();

        if(salary <= 2000) System.out.println("Isento");

        else {

            double tax = 0;
            salary -= 2000;
            double temp = 0;

            if(salary <= 1000) {
                tax += salary * 0.08;
            }
            else if(salary > 1000 && salary <= 1500) {      //3460 - 2000  = 1460
                temp = salary - 1000;                       //1460 - 1000  = 460
                tax += 1000 * 0.08;                         //8% sobre 1000
                tax += temp * 0.18;                         //18% sobre 460 
            }

            else if(salary > 1500) {    //5127
                temp = salary - 2500;   //2627
                tax += 1000 * 0.08;     //8% sobre 1000 
                tax += 1500 * 0.18;     //18% sobre 1500
                tax += temp * 0.28;     //28% sobre 5127 - (2000 + 1000 + 1500)  =  127
            }

                System.out.printf("R$ %.2f\n", tax);
            }


        scan.close();
        }
    }

