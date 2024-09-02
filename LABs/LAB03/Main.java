import java.util.Scanner;

class Main {

    private static Boolean correto(String texto) {
        Boolean situ = true;
        char charAtual;
        char[] vetPos = new char[2];

        int abre = 0, fecha = 0;

        for(int i = 0; i < texto.length(); i++) {
            charAtual = texto.charAt(i);

            if(charAtual == 40) vetPos[0] +=1;
            else if(charAtual == 41)  vetPos[1] +=1;

        }

        if(vetPos[0] != vetPos[1]) situ = false;
        else {
            int n = vetPos[0];

            for(int i = 0; i < texto.length() && situ; i++) {
                charAtual = texto.charAt(i);

                if(charAtual == 40) abre += 1;
                else if(charAtual == 41) fecha += 1;

                if(fecha > abre) situ = false;
            }
        }

        return situ;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String texto;

        do{
            texto = scan.nextLine();

            if(!texto.equals("FIM")) {
                if(correto(texto)) System.out.println("correto");
                else System.out.println("incorreto");
            }
        } while(!texto.equals("FIM"));

        scan.close();
    }

}