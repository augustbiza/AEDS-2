//Busca Binária em Java (iterativa)
//Núemros inteiros
class Main {

    public static boolean buscaBinaria(int[] arr, int chave, int tam) {

        boolean achou = false;
        int esq = 0, dir = tam-1, meio;

        while(esq <= dir && !achou) {

            meio = (esq + dir) / 2;

            if(arr[meio] == chave) achou = true;
            else if(chave < arr[meio]) dir = meio - 1;
            else if(chave > arr[meio])esq = meio + 1;
        }

        return achou;
    }


    public static void main(String args[]) {

        int []arr = new int[]{1,2,3,4,5};
        int chave = 6;
        int tam = arr.length;

        if(buscaBinaria(arr, chave, tam)) System.out.println("Chave encontrada");
        else System.out.println("Chave não encontrada");
    }
}