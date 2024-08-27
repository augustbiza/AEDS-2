import java.util.*;

class Main {

    private static void cesar(String texto, int n) {
        
        char[] copia = new char[n];

        for(int i = 0; i < n; i++) {
            char charAtual = texto.charAt(i);

            if(charAtual == '\uFFFD') {
                copia[i] = '\uFFFD';
            }
            else {
                char novochar = (char)(charAtual+3);
                    if(novochar == 127) novochar = 32;
                    else if(novochar == 128) novochar = 33;
                    else if(novochar == 129) novochar = 34;
                copia[i] = novochar; 
            }
        }
        String nova = new String(copia);

        System.out.printf("%s\n", nova);
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String texto;

        do{
            texto = scan.nextLine();

            if(!texto.equals("FIM")) {
                int n = texto.length();
                cesar(texto, n);
            }
        }while(!texto.equals("FIM"));
        
        scan.close();
    }
}

/*
char[]copia is a character array (in c  ->  char copia[tam])       L:7

crio um char auxiliar(charatual) que vai guardar letra por letra da string      L:10

crio outro char(novochar) que vai receber o caractere da posicao de charatual+3     L:16

a sttring(copia) recebe a letra que esta em novochar       L:20

crio uma nova string(nova) que recebe os caracteres de char[]copia      L:23

*/

