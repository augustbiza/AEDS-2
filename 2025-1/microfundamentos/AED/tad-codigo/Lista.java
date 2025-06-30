import java.util.Scanner;
// TAD Lista
/*
- Inserir elemento: início, final, posição
- Remover elemento: início, final, posição
- Mostrar: Array, elemento
- Criar Lista
*/

class Lista {

    private static int[] arr;
    private static int  n;


    Lista() {

        this(5);    
    }

    Lista(int tam) {

        arr = new int[tam]; 
        n = 0;
    }


    public static void inserirInicio(int x) throws Exception {

        if(n >= arr.length) {

            throw new Exception("Lista cheia. Impossível inserir elementos.");
        }

        for(int i = n; i > 0; i--) {

            arr[i] = arr[i-1];
        }

        arr[0] = x;
        n++;
    }

    public static void inserirFinal(int x) throws Exception {

        if(n >= arr.length) {

            throw new Exception("Lista cheia. Impossível inserir elementos.");
        }

        arr[n] = x;
        n++;
    }

    public static void inserir(int x, int pos) throws Exception {

        if(n >= arr.length || pos < 0 || pos > n) {

            throw new Exception("Lista cheia. Impossível inserir elementos.");
        }

        for(int i = n; i > pos; i--) {

            arr[i] = arr[i-1];
        }

        arr[pos] = x;
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

    public static void removerFinal() throws Exception {

        if(n == 0) {

            throw new Exception("Lista vazia. Impossível remover elementos.");
        }

        n--;
    }

    public static void remover(int pos) throws Exception {

        if(pos < 0 || pos > n) {

            throw new Exception("Lista vazia. Impossível remover elementos.");
        }

        n--;

        for(int i = pos; i < n; i++) {

            arr[i] = arr[i+1];
        }
    }

    public static void mostrar() throws Exception {

        if(n == 0) {

            throw new Exception("Lista vazia. Impossível listar elementos.");
        }

        System.out.println(n + " elemento(s):");

        for(int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{

            Lista l1 = new Lista(5);

                l1.inserirInicio(2);
                l1.inserirInicio(1);
                l1.inserirFinal(4);
                l1.inserir(3, 2);
                //l1.mostrar();

                l1.removerInicio();
                l1.removerFinal();
                remover(0);
                //l1.mostrar();

        } catch (Exception e) {
        
            System.out.println("Erro: " + e.getMessage());
        }


        scan.close();
    }

}