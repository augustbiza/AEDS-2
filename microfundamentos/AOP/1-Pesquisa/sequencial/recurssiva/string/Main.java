//Pesquisa Sequencial em Java (recursivo)
//String[]
class Main {

    public static boolean buscaSequencial(String lista[], String chave, int tam) {
        boolean chaveEncontrada = false;

        if(lista[tam].equals(chave)) chaveEncontrada = true;
        else if(tam > 0) {

            chaveEncontrada = buscaSequencial(lista, chave, tam-1);
        }

        return chaveEncontrada;
    }

    public static void main(String []args) {
        
        String []lista = new String[]{"Ana", "Joao", "Maria", "Pedro"};
        int tam = lista.length;
        String chave = "Pedrao";

        if(buscaSequencial(lista, chave, tam-1)) System.out.println("Chave encontrada");
        else System.out.println("Chave não encontrada");
    }
}