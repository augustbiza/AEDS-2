//cifr cesar rec

import java.util.Scanner;

class Main {



    private static String cesarREc(String texto, int index, char[] saida) {
        if(index == texto.length()) {
            String str = new String(saida);
            return str;
        }

        if(texto.charAt(index) == '\uFFFD') {
            saida[index] = '\uFFFD';
        }
        else {
            saida[index] = (char)(texto.charAt(index) + 3);

            if(saida[index] == 127) saida[index] = 32;
            else if(saida[index] == 128) saida[index] = 33;
            else if(saida[index] == 129) saida[index] = 34;
        }

        return cesarREc(texto, ++index, saida);
    }





    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String texto;

        do{
            texto = scan.nextLine();

            if(!texto.equals("FIM")) {
                String saida = cesarREc(texto, 0, new char[texto.length()]);
                System.out.println(saida);
            }
        }while(!texto.equals("FIM"));

        scan.close();
    }

}