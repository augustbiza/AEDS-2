//Ciframento de Cesar em Java (interativo)
import java.util.Scanner;
class Main {

    public static String ciframentoCesar(String str, int tam) {

        char[] str2 = new char[tam];        
        int tam2 = str2.length;

        for(int i = 0; i < tam2; i++) {
            str2[i] = str.charAt(i);            //copia a string para um char array

            str2[i] += 3;                       //alterando o unicode da tabela ascci, logo altera-se o caractere em 3 pra frente
        }

        String strCesar = new String (str2);    //transforma o char array em string

        return strCesar;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String();

        do{

            str = scan.nextLine();
            int tam = str.length();

            if(!str.equals("FIM")) {

                System.out.println(ciframentoCesar(str, tam));
            }

        }while(!str.equals("FIM"));



        scan.close();
    }
}