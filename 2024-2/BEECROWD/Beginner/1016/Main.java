import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int km = scan.nextInt();

        int time = 2*km;

        System.out.println(time+" minutos"); 

        scan.close();
    }

}