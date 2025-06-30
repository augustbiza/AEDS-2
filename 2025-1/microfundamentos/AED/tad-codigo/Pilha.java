import java.util.Scanner;
/*
inserirInicio e removerInicio
ou
inserirFinal e removerFinal
*/
class Pilha {

    protected static int[] arr;
    protected static int n;


    Pilha() {

        this(5);
    }

    Pilha(int tam) {

        arr[] = new int[tam];
        n = 0;
    }


    public static void inserirInicio(int x) throws Exception {

        if(n >= arr.length) {

            throw new Exception ("Lista cheia. Impossível inserir elementos.");
        }

        for(int i = n; i > 0; i--) {

            arr[i] = arr[i-1];
        }

        arr[0] = x;
        n++;
    }

    public static void removerInicio() throws Exception {

        if(n == 0) {

            throw new Exception("Lista vazia. Impossível remover elementos.");
        }

        n--;

        for(int i = 0; i < n; i++) {

            arr[i] = arr[i+1];
        }
    }


    public static void inserirFinal(int x) throws Exception {

        if(n >= arr.length) {

            throw new Exception ("Lista cheia. Impossível inserir elementos.");
        }

        arr[n] = x;
        n++;
    }

    public static void removerFinal() throws Exception {

        if(n == 0) {

            throw new Exception("Lista vazia. Impossível remover elementos.");
        }

        n--;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        scan.close();
    }
}