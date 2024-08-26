import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        int time = scan.nextInt();
        
        int y = time/365;
            if(y > 0) time -= y*365;
            
        int m = time/30;
            if(m > 0) time -= m*30;
            
        int d = time;
        
        System.out.println(y+" ano(s)");
        System.out.println(m+" mes(es)");
        System.out.println(d+" dia(s)");
        
        scan.close();
 
    }
 
}