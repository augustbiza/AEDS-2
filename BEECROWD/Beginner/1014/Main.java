import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
        int x = scan.nextInt();
        double y = scan.nextDouble(), spentFuel = x/y;
        
        System.out.printf("%.3f km/l\n", spentFuel);
 
    scan.close();
    }
 
}