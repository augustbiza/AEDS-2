import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        int hours = N/3600;
            N -= hours*3600;

        int minutes =  N/60;
            N -= minutes*60;

        int sec = N;
        
        System.out.println(hours+":"+minutes+":"+sec);
        
        scan.close();
    }
 
}