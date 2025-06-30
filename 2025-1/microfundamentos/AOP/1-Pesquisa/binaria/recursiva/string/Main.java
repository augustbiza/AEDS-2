//Busca Binária em Java (recursiva)
//String
class Main {

    public static boolean buscaBinaria(String []lista, String chave, int esq, int dir) {

        boolean achou = false;
        int meio = (esq + dir)/2;

        if(chave.compareTo(lista[meio]) == 0) achou = true;      //if(lista[meio].equals(chave))
        else if(esq <= dir) {

            if(chave.compareTo(lista[meio]) < 0) achou = buscaBinaria(lista, chave, esq, meio-1);
            else if(chave.compareTo(lista[meio]) > 0) achou = buscaBinaria(lista, chave, meio+1, dir);
        }

        return achou;
    }


    public static void main(String args[]) {

        String []lista = new String[]{"Ana", "Joao", "Maria", "Pedro"};
        int tam = lista.length;
        String chave = "Pedro";

        int esq = 0, dir = tam-1;

        if(buscaBinaria(lista, chave, esq, dir)) System.out.println("Chave encontrada");
        else System.out.println("Chave não encontrada");
    }
}