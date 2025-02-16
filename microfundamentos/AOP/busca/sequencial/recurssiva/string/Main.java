
import java.util.Scanner;

class Main {

    public static boolean buscaSequencial(String arr[], String chave, int tam) {
        boolean chaveEncontrada = false;

        if(arr[tam].equals(chave)) chaveEncontrada = true;
        else if(tam > 0) {

            chaveEncontrada = buscaSequencial(arr, chave, tam-1);
        }

        return chaveEncontrada;
    }

    public static void main(String []args) {
        
        String []arr = new String[]{"Ana", "Joao", "Maria", "Pedro"};
        int tam = arr.length;
        String chave = "Pedrao";

        if(buscaSequencial(arr, chave, tam-1)) System.out.println("Chave encontrada");
        else System.out.println("Chave não encontrada");
    }
}