import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), rabbit = 0, rat = 0, frog = 0, total = 0;
        String type;

        for(int i = 1; i <= n; i++) {
            int value = scan.nextInt();
            total += value;
            type = scan.next();
                if(type.equals("C")) rabbit += value;
                else if(type.equals("R")) rat += value;
                else frog += value;
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
