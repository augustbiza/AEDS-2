import java.io.IOException;
import java.util.Scanner; 

class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i <= num; i += 2) {
            System.out.println(i);
        }

        scan.close();
    }
}