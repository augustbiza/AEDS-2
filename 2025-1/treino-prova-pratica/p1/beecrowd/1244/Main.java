import java.util.Scanner;

class Main {

    public static void sort(String[] str) {

        int n = str.length;

        for(int i = 0; i < n-1; i++) {

            int maior = i;
            for(int j = i+1; j < n; j++) {
                if(str[j].length() > str[maior].length()) maior = j;
            }

            String aux = str[i];
            str[i] = str[maior];
            str[maior] = aux;
        }
    }

    public static void mostrar(String[] str) {

        int n = str.length;

        for(int i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();       

            for(int i = 0; i < n; i++) {

                String str = scan.nextLine();

                String[] nova = str.split(" ");

                sort(nova);
                mostrar(nova);
            }

        scan.close();
    }
}