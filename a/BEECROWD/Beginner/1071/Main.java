import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt(), y = scan.nextInt();

        int i = x-1, sum = 0;
        while(i > y) {
            if(i % 2 != 0) sum += i;
            i--;
        }

        System.out.println(sum);

        scan.close();
    }
}