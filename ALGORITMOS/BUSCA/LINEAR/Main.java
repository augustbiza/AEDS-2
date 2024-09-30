//BUSCA LINEAR = buscar em todos os elementos o elemento desejado
        //melhor caso = primeiro elemento = 1
        //pior caso = ultimo elemento = n
        
import java.util.Scanner;

class Main {

    private static boolean buscaLinar(int array[], int tam, int elemento) {
        boolean achou = false;

        for(int i = 0; i < tam && !achou; i++) {
            if(array[i] == elemento) achou = true;
        }

        return achou;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //declaracao do array
        int [] array = new int[5];

       //preencher o vetor de forma ORDENADA
        for(int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
        }

        //qual elemento voce deseja encontrar?
        int elemento = scan.nextInt();

        //qual o tamanho do array?
        int tam = array.length;

        if(buscaLinar(array, tam, elemento)) System.out.println("SIM");
        else System.out.println("NAO");

        scan.close();
    }
}