import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
        String str = new String();

        while(scan.hasNextLine()) {

            str = scan.nextLine();
            
            int n = str.length();
            int c = 0;
            boolean erro = false;
            
            for(int i = 0; i < n; i++) {
                
                if(str.charAt(i) == '(') c++;
                if(str.charAt(i) == ')') c--;
                
                if(c < 0) {
                    erro = true;
                    i = n;
                }

            }

            if(erro) System.out.println("incorrect");
            else  {
                if(c > 0) System.out.println("incorrect");
                else System.out.println("correct");
            }
        }
        
        
        scan.close();
	}
}
