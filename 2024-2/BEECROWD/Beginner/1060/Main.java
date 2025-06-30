import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        double[] num = new double[6];
        int c = 0;
            for(int i = 0; i < 6; i++) {
                num[i] = scan.nextDouble();
                    if(num[i] > 0) c++;
            }
        
        System.out.println(c+" valores positivos");

        scan.close();
    }

}