import java.util.Scanner;

class Main {

    private static void inverter(String texto, String copia) {        

        int i = 0, f = texto.length()-1;
        while(i <= f) {
            copia = copia + texto.charAt(f);
        }

    }

    private static boolean palindromo(String texto) {
        String copia = "";
        int i = 0, f = texto.length()-1;
        while(i <= f) {
            copia = copia + texto.charAt(f);
            f--;
        }
        //inverter(texto, copia);

        boolean palin = false;
        if(texto.equals(copia)) palin = true;

        return palin;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String texto;

        do{

            texto = scan.nextLine();
            if(!texto.equals("FIM")) {
                    if(palindromo(texto)) System.out.println("SIM");
                    else System.out.println("NAO");
            }

        }while(!texto.equals("FIM"));


        scan.close();
    }


}