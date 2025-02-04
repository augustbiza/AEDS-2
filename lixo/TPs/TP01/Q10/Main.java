import java.util.Scanner;

class Main {

    private static boolean palindromo(String texto, int tam) {

        boolean palin = false;
        int c = 0;

        if(tam == 0) palin = true;
        else {
            int i = 0, f = tam;
            if(texto.charAt(i) == texto.charAt(f)) c++;
            palindromo(texto, tam-1);
        }

        if(c > 0) palin = true;
        return palin;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String texto;

        do{
            texto = scan.nextLine();

            if(!texto.equals("FIM")) {
                int n = texto.length()-1;
                if(palindromo(texto, n)) System.out.println("SIM");
                else System.out.println("NAO");
            }
        }while(!texto.equals("FIM"));

        scan.close();
    }
}