import java.io.IOException;
import java.util.Scanner;

class Heap {
    private static final int TAM = 9;
    int[] array;
    int tam;

    public Heap() {
        this.tam = 0;
        this.array = new int[TAM];
    }

    public int getTAM() {
        return TAM;
    }

    public void mostrarHeap() {
        if(tam == 0) {
            System.out.println("Heap vazia\n"); return;
        }

        System.out.println("Heap tam: "+ tam);
        for(int i = 0; i < tam; i++) System.out.print(array[i] + " "); System.out.println();
    }

    public void inserirHeap(int elem) {
        if(tam >= TAM) {
            System.out.println("Heap cheia"); return;
        }

        array[tam++] = elem;
    }
}

class Main {

    public static void main(String[] args) {

        Heap minhaHeap = new Heap();

        minhaHeap.mostrarHeap();

        minhaHeap.inserirHeap(5);
        minhaHeap.inserirHeap(2);
        minhaHeap.inserirHeap(7);

        minhaHeap.mostrarHeap();

        System.out.println(minhaHeap.getTAM());
    }
}