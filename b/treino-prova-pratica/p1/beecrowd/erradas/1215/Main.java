import java.util.Scanner;

class Main {

    public static void insertion(String[] array) {
        int n = array.length;

        for(int i = 1; i < n; i++) {
            String aux = array[i];
            int j = i-1;

            while(j >= 0 && array[j].compareTo(aux) > 0) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = aux;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = new String();            //linha por linha

        String[] palavras = new String[5000];   //máximo 5.000 palavras

        int c = 0;

        while(scan.hasNextLine()) {

            input = scan.nextLine().toLowerCase();  //guarda a linha com letras minúsculas

            String[] aux = input.split("\\s+");

            for(int i = 0; i < aux.length; i++) {

                if(!aux[i].isEmpty()) {
                    palavras[c] = aux[i];
                    c++;
                }
            }

        }

        insertion(palavras);

        for(int i = 0; i < c; i++) {

            String ultimaPalavra = "";

            if(!palavras[i].isEmpty()) {
                if(palavras[i] != ultimaPalavra) {
                    System.out.println(palavras[i]);
                    ultimaPalavra = palavras[i];
                }
            }
        }

        scan.close();
    }
}