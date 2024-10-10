import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String []args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int i = 1;

        while(i < 10) {

            for(int j = 7; j >=5; j--) {
                System.out.println("I="+i+" J="+j);
            }

            i += 2;
        }

        scan.close();
    }
}