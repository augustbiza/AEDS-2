import java.util.Scanner;

class Main {

    public static void preencherArray(int[] array, int n) {
        for(int i = 0; i < n; i++) {
            array[i] = i+1;
        }
    }

    public static void inserirFinal(int[] array, int n) {
        int temp = array[0];

        removerInicio(array, n);

        n--;

        array[n-1] = temp;
    }

    public static void removerInicio(int[] array, int n) {

        for(int i = 0; i < n-1; i++) {
            array[i] = array[i+1];
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        while((n = scan.nextInt()) != 0) {

            int[] array = new int[n];
            
            preencherArray(array, n);

            while(n > 1) {

                removerInicio(array, n);

                inserirFinal(array, n);
            }

            System.out.println(array[0]);
        }


        scan.close();
    }
}