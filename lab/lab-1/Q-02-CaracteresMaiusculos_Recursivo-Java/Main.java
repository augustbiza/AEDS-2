//Caracteres Maiúsculos em Java (iterativo)
import java.util.Scanner;

class Main {

    private static int caracteresMaiusculos(String str, int tam) {
        
        int qt = 0;

        if(tam > 0) {

            if(str.charAt(tam-1) >= 65 && str.charAt(tam-1) <= 90) qt = 1 + caracteresMaiusculos(str, tam-1);
            else qt = 0 + caracteresMaiusculos(str, tam-1);
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