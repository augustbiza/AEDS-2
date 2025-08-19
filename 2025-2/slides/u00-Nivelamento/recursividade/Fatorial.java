import java.util.Scanner;

class Fatorial {

    public static int fatorial(int n) {
        int fat = 1;
        for(int i = n; i > 1; i--) fat *= i;

        return fat;
    }

    public static int fatorialRec(int n) {
        int fat;
        if(n == 1) fat = n;             //condição de parada
        else fat = n * fatorialRec(n-1);

        return fat;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 5;
        //int fat = fatorial(n);
        int fat = fatorialRec(n);
        System.out.println(n + "! = " + fat);

        scan.close();
    }
}