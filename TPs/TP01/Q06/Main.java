//TP 1 - Q 6

import java.util.*;

class Main {

    //VOGAIS
    private static Boolean vogais(String texto, int tam) {
        Boolean vog = true;

        for(int i = 0; i < tam && vog; i++) {
            char charAtual = texto.charAt(i);
            charAtual = Character.toUpperCase(charAtual);

            if(charAtual != 65 && charAtual != 69 && charAtual != 73 && charAtual != 79 && charAtual != 85) {
                vog = false;
            }
        }

        return vog;
    }

    //CONSOANTES
    private static Boolean consoantes(String texto, int tam) {
        Boolean cons = false;

        for(int i = 0; i < tam && !cons; i++) {
            char charAtual = texto.charAt(i);
            charAtual = Character.toUpperCase(charAtual);

            if(charAtual == 65 || charAtual == 69 || charAtual == 73 || charAtual == 79 || charAtual == 85 || charAtual == 44 || charAtual == 46) {
                cons = false;
            }
        }

        return cons;
    }

    //NUM INTEIRO
    private static Boolean numInt(String texto, int tam) {
        Boolean inteiro = true;

        for(int i = 0; i < tam; i++) {
            char charAtual = texto.charAt(i);

            if(charAtual != '0' && charAtual != '1' && charAtual != '2' && charAtual != '3' && charAtual != '4' && charAtual != '5' && charAtual != '6' && charAtual != '7' && charAtual != '8' && charAtual != '9') {
                inteiro = false;
                i = tam;
            }
        }

        return inteiro;
    }

    //NUM REAL
    private static Boolean numReal(String texto, int tam) {
        Boolean real = false;
        int c = 0, c2 = 0;

        for(int i = 0; i < tam; i++) {
            char charAtual = texto.charAt(i);

            if(((charAtual == 44 || charAtual == 46) || (charAtual > 47 && charAtual < 58))) {
                if(charAtual == 44 || charAtual == 46) c++;
            }
            if(charAtual == 33 || charAtual == 40 || charAtual == 41 || charAtual == 63) c2++;
        }

        if((c == 1) && (c2 == 0) ) real = true;

        return real;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String texto;

        do{

            texto = scan.nextLine();
            int n = texto.length();

            if(!texto.equals("FIM")) {
                if(vogais(texto, n)) System.out.printf("SIM ");
                else System.out.printf("NAO ");

                if(consoantes(texto, n)) System.out.printf("SIM ");
                else System.out.printf("NAO ");

                if(numInt(texto, n)) System.out.printf("SIM ");
                else System.out.printf("NAO ");

                if(numReal(texto, n)) System.out.println("SIM");
                else System.out.println("NAO");
            }

        }while(!texto.equals("FIM"));

        scan.close();
    }

}