import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int i = 0;  //a cada numero impar o 'i' adiciona 1; quando 'i' chegar no limete sai do while
        while(i < 6) {
            if(num % 2 != 0) {
                System.out.println(num);
                i++;
            }
            num++;
        }

        scan.close();
    }
}