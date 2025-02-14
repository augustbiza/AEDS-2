//BUSCA BINARIA = 2^n = sempre pega o elemento do meio e verifica se é o elemento
                      //caso contrario verifica se o elemento é menor ou maior que o elemento do meio

import java.util.Scanner;

class Main {

    private static boolean buscaBinaria(int []array, int tam, int elemento) {
        boolean achou = false;

        int left = 0, right = tam-1, meio;
        while(left <= right && !achou) {
            meio = (left + right)/2;

            if(array[meio] == elemento) {
                achou = true;
            }
            else if(elemento >= array[meio]) {
                left = meio+1;
            }
            else {
                right = meio-1;
            }
        }

        return achou;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //declaracao do array
        int []array = new int[5];

        //preencher o array de forma ORDENADA
        for(int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
        }

        //qual elemento voce deseja encontrar?
        int elemento = scan.nextInt();

        //qual o tamanho do array
        int tam = array.length;

        if(buscaBinaria(array, tam, elemento)) System.out.println("SIM");
        else System.out.println("NAO");

        scan.close();
    }
}