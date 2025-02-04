import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num[] = new int[5];
        int even = 0, odd = 0, pos = 0, neg = 0;

            for(int i = 0; i < 5; i++) {
                num[i] = scan.nextInt();
                    if(num[i] % 2 == 0) even++;
                    else odd++;

                    if(num[i] > 0) pos++;
                    else if(num[i] < 0) neg++;
            }

            System.out.println(even+" valor(es) par(es)");
            System.out.println(odd+" valor(es) impar(es)");
            System.out.println(pos+" valor(es) positivo(s)");
            System.out.println(neg+" valor(es) negativo(s)");
        
        scan.close();
    }
}