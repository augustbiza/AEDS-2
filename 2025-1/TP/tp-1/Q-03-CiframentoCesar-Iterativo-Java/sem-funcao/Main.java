//Ciframento de Cesar em Java (interativo)
import java.util.Scanner;
class Main {

    public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
    }

    public static String ciframentoCesar(String str, int tam) {

        char[] str2 = new char[tam];        
        int tam2 = str2.length;

        for(int i = 0; i < tam2; i++) {
            str2[i] = str.charAt(i);            //copia a string para um char array

            if(str2[i] >= 32 && str2[i] <= 127) {   //só vai trocar se o char tiver dentro da tabela ascii

                str2[i] += 3;                   //alterando o unicode da tabela ascci, logo altera-se o caractere em 3 pra frente
            }
        }

        String strCesar = new String (str2);    //transforma o char array em string

        return strCesar;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String();
        int tam = 1;

        do{

            str = scan.nextLine();
            tam = str.length();

            if(!comparaFim(str, tam)) {

                System.out.println(ciframentoCesar(str, tam));
            }

        }while(!comparaFim(str, tam));

        scan.close();
    }
}