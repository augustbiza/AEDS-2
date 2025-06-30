
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //DECLARAÇÃO DO ALGORITMO E SEU TAMANHO
        Ordenacao algoritmo;
        int tam = 10;


        //TIPO DE ORDENAÇÃO
        algoritmo = new Selecao(tam);


        //PREENCHER ARRAY
        algoritmo.preencherArray(scan);

        //MOSTRAR ARRAY
        algoritmo.mostrarArray();

        //ORDENAR ARRAY CRESCENTE
        algoritmo.sort();

        //MOSTRAR ARRAY
        algoritmo.mostrarArray();

        //ORDENAR ARRAY DECRESCENTE
        algoritmo.sortInverse();

        //MOSTRAR ARRAY
        algoritmo.mostrarArray();

        scan.close();
    }

}