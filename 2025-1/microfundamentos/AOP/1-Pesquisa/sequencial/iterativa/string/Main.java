//Pesquisa Sequencial em C (iterativo)
//String[]
class Main {

    public static boolean buscaSequencial(String arr[], String chave, int tam) {
        boolean chaveEncontrada = false;
        int i = 0;
        while(!chaveEncontrada && i < tam) {
            if(arr[tam].equals(chave)) chaveEncontrada = true;

            i++;
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