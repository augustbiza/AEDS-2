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

        System.out.print("Heap tam: "+ tam + " -> ");
        for(int i = 0; i < tam; i++) System.out.print(array[i] + " "); System.out.println();
    }

    public void ajustarHeapMax() {

        int indexFi = tam-1;
        int indexPai = (indexFi-1)/2;

        while(indexFi > 0) {

            if(array[indexFi] > array[indexPai]) {
                int aux = array[indexFi]; array[indexFi] = array[indexPai]; array[indexPai] = aux;
            }

            indexFi = indexPai;
            indexPai = (indexFi-1)/2;
        }
    }

    public void ajustarHeapMin() {

        int indexFi = tam-1;
        int indexPai = (indexFi-1)/2;

        while(indexFi > 0) {

            if(array[indexFi] < array[indexPai]) {
                int aux = array[indexFi]; array[indexFi] = array[indexPai]; array[indexPai] = aux;
            }

            indexFi = indexPai;
            indexPai = (indexFi-1)/2;
        }
    }

    public void inserirHeap(int elem) {
        if(tam >= TAM) {
            System.out.println("Heap cheia"); return;
        }

        array[tam++] = elem;

        this.mostrarHeap();
        //this.ajustarHeapMax();
        this.ajustarHeapMin();
        this.mostrarHeap();
    }

    public void inserirCrescHeap() {
        if(tam >= TAM) {
            System.out.println("Heap cheia"); return;
        }

        for(int i = 0; tam < TAM; i++) {
            array[tam++] = i;
        }

        this.mostrarHeap();
        this.ajustarHeapMax();
        //this.ajustarHeapMin();
        this.mostrarHeap();
    }

    public void inserirDerescHeap() {
        if(tam >= TAM) {
            System.out.println("Heap cheia"); return;
        }

        for(int i = TAM; tam < TAM; i--) {
            array[tam++] = i;
        }

        this.mostrarHeap();
        //this.ajustarHeapMax();
        this.ajustarHeapMin();
        this.mostrarHeap();
    }
}

class Main {

    public static void main(String[] args) {

        Heap minhaHeap = new Heap();

        minhaHeap.mostrarHeap();

        minhaHeap.inserirCrescHeap();
        //minhaHeap.inserirDerescHeap();

        minhaHeap.mostrarHeap();

        System.out.println(minhaHeap.getTAM());
    }
}