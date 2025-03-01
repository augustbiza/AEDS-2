//Caracteres Maiúsculos em Java (iterativo)
import java.util.Scanner;

class Main {

    private static int caracteresMaiusculos(String str, int tam) {
        
        int qt = 0;

        for(int i = 0; i < tam; i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) qt++;
        }

        return qt;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String();

        do{
            
            str = scan.nextLine();
            int tamStr = str.length();

            if(!str.equals("FIM")) {

                System.out.println(caracteresMaiusculos(str, tamStr));
            }


        }while(!str.equals("FIM"));

        scan.close();
    }
}