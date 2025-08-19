import java.util.Scanner;

class Distributiva {

    public static Scanner scan = new Scanner(System.in);

    public static int distributiva(int x, int k) {
        int soma = 0;
        if(k > 0) soma += x + distributiva(x, k-1);

        return soma;
    }

    public static void main(String[] args) {
        int x = scan.nextInt();
        int k = scan.nextInt();

        int xk = distributiva(x, k);

        System.out.println(x + " * " + k + " = " + xk);
    }
}