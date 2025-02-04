import java.util.Scanner;
import java.io.IOException;

class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int []num = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(num[i] == 0) {
                System.out.println("NULL");
            }
            else {
                if(num[i] % 2 == 0) {
                    System.out.printf("EVEN ");
                    if(num[i] > 0) System.out.println("POSITIVE");
                    else System.out.println("NEGATIVE");
                }
                else {
                    System.out.printf("ODD ");
                    if(num[i] > 0) System.out.println("POSITIVE");
                    else System.out.println("NEGATIVE");
                }
            }
        }

        scan.close();
    }
}