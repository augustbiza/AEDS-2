// Classe com métodos de Ordenação
import java.util.*;

class Ordenacao {

    protected int[] arr;
    protected int tam;

    public Ordenacao() {        //construtor sem parâmetro

        arr = new int[100];
        tam = arr.length;
    }

    public Ordenacao(int tam) {     //construtor com parâmetro "tamanho"

        this.tam = tam;
        arr = new int[tam];
    }

    public void preencherArray(Scanner scan) {

        for(int i = 0; i < tam; i++) {

            arr[i] = scan.nextInt();
        }
    }

    public void mostrarArray() {

        System.out.println("Array " + tam + " elementos:");

        for(int i = 0; i < tam; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void mostrarPosicao(int posicao) {

        if(posicao >= 0 && posicao < tam) {

            System.out.println("arr[" + posicao + "] = " + arr[posicao]);
        }

        else {

            System.out.println("Posição inexistente");
        }

    }

    public void verificarOrdenacao() {

        boolean crescente = true;

        for(int i = 1; i < tam; i++) {

            if(arr[i] < arr[i-1]) {
                crescente = false;
                i = tam;
            }
        }

        if(crescente) {

            System.out.println("Array ordenado CRESCENTE");
        }


        boolean decrescente = true;

        for(int i = 1; i < tam; i++) {

            if(arr[i] > arr[i-1]) {
                decrescente = false;
                i = tam;
            }
        }

        if(decrescente) {

            System.out.println("Array ordenado DECRESCENTE");
        }

        if(!crescente && !decrescente) {

            System.out.println("Array NÃO está ordenado");
        }
    }

    public void sort() {}

    public void sortInverse() {}

}