//Pesquisa Sequencial em Java (iterativo)
//buscando do inicio pro final
import java.util.Scanner;

class Main {

    public static boolean buscaSequencial(int arr[], int chave, int tam) {
        boolean chaveEncontrada = false;
        int i = 0;
        while(!chaveEncontrada && i < tam) {
            if(arr[i] == chave) chaveEncontrada = true;

            i++;
        }

        return chaveEncontrada;
    }

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int []arr = new int[]{1,2,3,4,5};
        int tam = 5;
        int chave = -5;

        if(buscaSequencial(arr, chave, tam)) System.out.println("Chave encontrada");
        else System.out.println("Chave não encontrada");

        scan.close();
    }
}