import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int []arr = new int[100];
        arr[0] = 0;

        int highest = arr[0], pos = 0;

        for(int i = 1; i <=101; i++) {
            arr[i] = scan.nextInt();
            if(arr[i] > highest) {
                highest = arr[i];
                pos = i;
            }
        }

        System.out.printf("%d\n%d\n", highest, pos);

        scan.close();
    }
}