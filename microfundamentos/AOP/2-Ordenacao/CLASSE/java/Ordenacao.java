// Classe com métodos de Ordenação
import java.util.*;

class Ordenacao {

    private int[] arr;
    private int tam;

    public Ordenacao(void) {        //construtor sem parâmetro

        arr = new int[100];
        tam = arr.length;
    }

    public Ordenacao(int tam) {     //construtor com parâmetro "tamanho"

        this.tam = tam;
        arr = new int[tam];
    }

    public void mostrarArray(void) {

        System.out.println("Array: " + tam + " elementos:");

        for(int i = 0; i < tam; i++) {

            System.out.println(arr[i] + " ");
        }
    }

    public void mostrarPosicao(int posicao) {

        if(posicao >= 0 && posicao < tam) {

            System.out.println("arr[" + posicao + "] = " + arr[posicao]);
        }

        else {

            System.out.println("Posição inexistente");
        }

    }

    public void verificarOrdenacao(void) {

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
}