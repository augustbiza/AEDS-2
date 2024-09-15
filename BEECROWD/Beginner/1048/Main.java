import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        double salary = scan.nextDouble(), newSalary;
        
            if(salary > 2000) {
                newSalary = salary + salary*0.04;
                System.out.printf("Novo salario: %.2f\n", newSalary);
                System.out.printf("Reajuste ganho: %.2f\n", salary*0.04);
                System.out.println("Em percentual: 4 %");
            }

            else if(salary <= 2000 && salary > 1200) {
                newSalary = salary + salary*0.07;
                System.out.printf("Novo salario: %.2f\n", newSalary);
                System.out.printf("Reajuste ganho: %.2f\n", salary*0.07);
                System.out.println("Em percentual: 7 %");
            }

            else if(salary <= 1200 && salary > 800) {
                newSalary = salary + salary*0.1;
                System.out.printf("Novo salario: %.2f\n", newSalary);
                System.out.printf("Reajuste ganho: %.2f\n", salary*0.1);
                System.out.println("Em percentual: 10 %");
            }
            
            else if(salary <= 800 && salary > 400) {
                newSalary = salary + salary*0.12;
                System.out.printf("Novo salario: %.2f\n", newSalary);
                System.out.printf("Reajuste ganho: %.2f\n", salary*0.12);
                System.out.println("Em percentual: 12 %");
            }
            else {
                newSalary = salary + salary*0.15;
                System.out.printf("Novo salario: %.2f\n", newSalary);
                System.out.printf("Reajuste ganho: %.2f\n", salary*0.15);
                System.out.println("Em percentual: 15 %");
            }

        scan.close();
    }
 
}