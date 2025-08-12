import java.io.IOException;
import java.util.Scanner;

class Main2 {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), rabbit = 0, rat = 0, frog = 0, total = 0;
        char type;

        for(int i = 1; i <= n; i++) {
            int value = scan.nextInt();
            total += value;
            type = scan.next().charAt(0);
                if (type == 'C') rabbit += value;
                else if (type == 'R') rat += value;
                else if (type == 'S') frog += value;
        }

        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+rabbit);
        System.out.println("Total de ratos: "+rat);
        System.out.println("Total de sapos: "+frog);

        System.out.printf("Percentual de coelhos: %.2f %%\n", ((double)rabbit/total)*100.);
        System.out.printf("Percentual de ratos: %.2f %%\n", ((double)rat/total)*100.);
        System.out.printf("Percentual de sapos: %.2f %%\n", ((double)frog/total)*100.);

        scan.close();
    }
}
