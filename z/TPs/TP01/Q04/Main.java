
import java.util.Scanner;
import java.util.Random;

class Main {

    private static String altAle(String texto, char letra1, char letra2, int tam) {

        char[] copia = new char[tam];

        for(int i = 0; i < tam; i++) {

            char charAtual = ' ';

            if(texto.charAt(i) == letra1) {
                
                charAtual = letra2;
                //copia[i] = letra2;
            }
            else{
                charAtual = texto.charAt(i);
            } 
            copia[i] = charAtual;
        }

        String nova = new String(copia);

        return nova;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String texto;

        Random gerador = new Random();
        gerador.setSeed(4);


        do{
            char letra1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
            char letra2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        
            // System.out.println(letra2 + " " + letra1);
            texto = scan.nextLine();
            int n = texto.length();
            
            if(!texto.equals("FIM")) {                

                System.out.println(altAle(texto, letra1, letra2, n));
            }
        }while(!texto.equals("FIM"));

        scan.close();
    }
}
