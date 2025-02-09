//Pesquisa Sequencial em Java (recurssiva)
//buscando do último para o primeiro
import java.util.Scanner;

class Main {

    public static boolean buscaSequencial(int arr[], int chave, int tam) {
        boolean chaveEncontrada = false;

        if(arr[tam] == chave) chaveEncontrada = true;
        else if(tam > 0) {

            chaveEncontrada = buscaSequencial(arr, chave, tam-1);
        }

        return chaveEncontrada;
    }

    public static void main(String []args) {
        
        int []arr = new int[]{1,2,3,4,5};
        int tam = 5;
        int chave = 0;

        if(buscaSequencial(arr, chave, tam-1)) System.out.println("Chave encontrada");
        else System.out.println("Chave não encontrada");
    }
}