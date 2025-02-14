import java.util.Scanner;

class Main {

    private static int procuraMaiuscula(String texto) {
        int n = texto.length();
        int qtMa = 0;

        for(int i = 0; i < n; i++) {
        if(texto.charAt(i) >= 65 && texto.charAt(i) <= 90) qtMa++;
        }
    return qtMa;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String texto;
        
        do{

            texto = scan.nextLine();
            if(!texto.equals("FIM")) {
                System.out.println(procuraMaiuscula(texto));
            }

        }while(!texto.equals("FIM"));

        scan.close();
    }

}