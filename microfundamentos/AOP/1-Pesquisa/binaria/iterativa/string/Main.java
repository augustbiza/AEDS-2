//Busca Binária em Java (iterativa)
//String
class Main {

    public static boolean buscaBinaria(String[] lista, String chave, int tam) {

        boolean achou = false;
        int esq = 0, dir = tam-1, meio;

        while(esq <= dir && !achou) {

            meio = (esq + dir) / 2;

            if(lista[meio].compareTo(chave) == 0) achou = true;
            else if(chave.compareTo(lista[meio]) < 0) dir = meio - 1;
            else if(chave.compareTo(lista[meio]) > 0) esq = meio + 1;
        }

        return achou;
    }


    public static void main(String args[]) {

        String []lista = new String[]{"Ana", "Joao", "Maria", "Pedro"};
        int tam = lista.length;
        String chave = "Pedpro";

        if(buscaBinaria(lista, chave, tam)) System.out.println("Chave encontrada");
        else System.out.println("Chave não encontrada");
    }
}