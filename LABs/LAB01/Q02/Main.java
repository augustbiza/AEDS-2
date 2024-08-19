import java.util.Scanner;

class Main {

    private static int procuraMaiuscula(String texto, int tam) {
    
        int qtMa = 0;
            if(tam > 0) {
                if(texto.charAt(tam - 1) >= 65 && texto.charAt(tam - 1) <= 90) qtMa += 1 + procuraMaiuscula(texto, tam-1);
                else qtMa += 0 + procuraMaiuscula(texto, tam-1);
            }

            return qtMa;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String texto;

        do{
            texto = scan.nextLine();
            int n = texto.length();

            if(!texto.equals("FIM")) {
                int x = procuraMaiuscula(texto, n);
                    System.out.println(x);
            }

        }while(!texto.equals("FIM"));


        scan.close();

    }
    
}
