//Busca Binária em Java (iterativa)
//Números inteiros
class Main {

    public static boolean buscaBinaria(int[] arr, int chave, int esq, int dir) {

        boolean achou = false;
        int meio = (esq + dir)/2;

        if(arr[meio] == chave) achou = true;
        else if(esq <= dir) {

            if(chave < arr[meio]) achou = buscaBinaria(arr, chave, esq, meio-1);
            else if(chave > arr[meio]) achou = buscaBinaria(arr, chave, meio+1, dir);
        }

        return achou;
    }


    public static void main(String args[]) {

        int []arr = new int[]{1,2,3,4,5};
        int chave = 6;
        int tam = arr.length;

        int esq = 0, dir = tam-1;

        if(buscaBinaria(arr, chave, esq, dir)) System.out.println("Chave encontrada");
        else System.out.println("Chave não encontrada");
    }
}