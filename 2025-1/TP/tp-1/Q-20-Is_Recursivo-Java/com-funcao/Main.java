// Is em Java (resursivo)
// vogal - consoante - inteiro - real
// vogal: 65 - 69 - 73 - 79 - 85 - 97 - 101 - 105 - 111 - 117
// números: 48...57
// , = 44 /// . = 46
import java.util.Scanner;

class Main {


    public static boolean verificaVogal(String str, int tam) {

        boolean vogal = true;

        if(tam > 0) {

            char charStr = str.charAt(tam-1);

            if(charStr == 'a' || charStr == 'A' || charStr == 'e' || charStr == 'E' || charStr == 'i' || charStr == 'I' || charStr == 'o' || charStr == 'O' || charStr == 'u' || charStr == 'U') {
                vogal = (verificaVogal(str, tam-1));
            }
            else {
                vogal = false;
            }
        }

        return vogal;
    }

    public static boolean verificaConsoante(String str, int tam) {

        boolean consoante = true;

        if(tam > 0) {

            char charStr = str.charAt(tam-1);

            if((charStr <= 65 || charStr > 90) && ((charStr <= 97 || charStr > 122))) consoante = false;
            else if(charStr == 'a' || charStr == 'A' || charStr == 'e' || charStr == 'E' || charStr == 'i' || charStr == 'I' || charStr == 'o' || charStr == 'O' || charStr == 'u' || charStr == 'U') consoante = false;
            else consoante = (verificaConsoante(str, tam-1));

        }

        return consoante;
    }


    public static boolean verificaInteiro(String str, int tam) {
        
        boolean inteiro = true;

        if(tam > 0) {

            char charStr = str.charAt(tam-1);

            if(charStr >= 48 && charStr <= 57) inteiro = verificaInteiro(str, tam-1);
            else inteiro = false;
        }

        return inteiro;
    }


    public static boolean verificaReal(String str, int tam, int c) {
        
        boolean status = true;

        if(tam > 0 && c <= 1) {

            char charStr = str.charAt(tam-1);

            if(charStr >= 48 && charStr <= 57) status = verificaReal(str, tam-1, c);
            else if(charStr == 44 || charStr == 46) {
                status = verificaReal(str, tam-1, c+1);
            }
            else status = false;
        }
        
        if(c > 1) status = false;

        return status;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String();
        int tam = 1;

        do {
        
            str = scan.nextLine();
            tam = str.length();

            if(!str.equals("FIM")) {
                
                if(verificaVogal(str, tam)) System.out.print("SIM ");
                else System.out.print("NAO ");

                if(verificaConsoante(str, tam)) System.out.print("SIM ");
                else System.out.print("NAO ");

                if(verificaInteiro(str, tam)) System.out.print("SIM ");
                else System.out.print("NAO ");

                int c = 0;  //contar ponto ou vírgula
                if(verificaReal(str, tam, c)) System.out.println("SIM");
                else System.out.println("NAO");
            }

        }while(!str.equals("FIM"));


        scan.close();
    }

}