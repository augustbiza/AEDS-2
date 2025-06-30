import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        for(int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }

        scan.close();
    }

}