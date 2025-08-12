import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String []args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int i = 1, j = 7;

        while(i < 10) {
            for(int c = 3; c > 0; c--) {
                System.out.println("I="+i+" J="+j);
                j--;
            }

            j += 5;
            i +=2;
        }

        scan.close();
    }
}