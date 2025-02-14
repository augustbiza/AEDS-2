import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int time = scan.nextInt(), speed = scan.nextInt();
        
        double distance = speed * time, liters = distance / 12;
        
        System.out.printf("%.3f\n", liters);
        
        scan.close();
    }
 
}