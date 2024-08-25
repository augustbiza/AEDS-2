import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double x1 = scan.nextDouble(), y1 = scan.nextDouble();
        double x2 = scan.nextDouble(), y2 = scan.nextDouble();
        
        double distance = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        distance = Math.sqrt(distance);
        
        System.out.printf("%.4f\n", distance);
        
        scan.close();
    }
 
}