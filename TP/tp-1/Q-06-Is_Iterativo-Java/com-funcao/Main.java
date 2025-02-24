// Is em Java (iterativo)
// vogal - consoante - inteiro - real
// vogal: 65 - 69 - 73 - 79 - 85 - 97 - 101 - 105 - 111 - 117
// números: 48...57
// , = 44 /// . = 46
import java.util.Scanner;

class Main {

    public static boolean verificaVogal(String str, int tam) {

        int []vogais = new int[]{65, 69, 73, 79, 85, 97, 101, 105, 111, 117};    // número ascii das vogais em um array

        boolean vogal = false;

        if(tam > 0) {

            for(int i = 0; i < tam; i++) {                              //string
                
                vogal = false;

                for(int j = 0; j < vogais.length && !vogal; j++) {     //array de vogal

                    if(str.charAt(i) == vogais[j]) vogal = true;
                }

                if(!vogal) i = tam;
            }
        }

        return vogal;
    }

    public static boolean verificaConsoante(String str, int tam) {
        
        int []vogais = new int[]{65, 69, 73, 79, 85, 97, 101, 105, 111, 117};

        boolean vogal = false;

        if(tam > 0) {

            for(int i = 0; i < tam; i++) {

                //vogal = false;

                for(int j = 0; j < vogais.length && !vogal; j++) {

                    if(str.charAt(i) == vogais[j]) vogal = true;
                    else if((str.charAt(i) < 65) || (str.charAt(i) > 90 && str.charAt(i) < 97) || str.charAt(i) > 122) vogal = true;
                }

                if(vogal) i = tam;
            }
        }

        return vogal;
    }

    public static boolean verificaInteiro(String str, int tam) {
        
        boolean inteiro = true;
        int separadorDecimal = 0;

        for(int i = 0; i < tam && inteiro; i++) {

            if(str.charAt(i) < 48 || str.charAt(i) > 57) {
                
                if(str.charAt(i) == 44 || str.charAt(i) == 46) separadorDecimal++;      //quantidade de pontos e vígulas
                else inteiro = false;
            }

            if(separadorDecimal > 0) inteiro = false;

        }

        return inteiro;
    }



    public static boolean verificaReal(String str, int tam) {
        
        boolean status = true;
        int separadorDecimal = 0;

        for(int i = 0; i < tam && status; i++) {

            if(str.charAt(i) < 48 || str.charAt(i) > 57) {
                
                if(str.charAt(i) == 44 || str.charAt(i) == 46) separadorDecimal++;      //quantidade de pontos e vígulas
                else status = false;
            }

            if(separadorDecimal > 1) status = false;       //pode ter um ponto ou uma vírgula

        }

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
                if(verificaConsoante(str, tam)) System.out.print("NAO ");
                else System.out.print("SIM ");
                if(verificaInteiro(str, tam)) System.out.print("SIM ");
                else System.out.print("NAO ");
                if(verificaReal(str, tam)) System.out.println("SIM");
                else System.out.println("NAO");
            }

        }while(!str.equals("FIM"));


        scan.close();
    }

}