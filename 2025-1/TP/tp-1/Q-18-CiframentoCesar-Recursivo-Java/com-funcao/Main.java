//Ciframento de Cesar em Java (recursivo)
import java.util.Scanner;
class Main {

    public static String ciframentoCesar(String str, char[] str2, int caract) {

        if(caract >= 0) {

            if(str2[caract] >= 32 && str2[caract] <= 127) {   //só vai trocar se o char tiver dentro da tabela ascii

                str2[caract] += 3;                   //alterando o unicode da tabela ascci, logo altera-se o caractere em 3 pra frente
            }

            ciframentoCesar(str, str2, caract-1);
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

            if(!str.equals("FIM")) {
        
                char[] str2 = new char[tam];
                for(int i = 0; i < tam; i++) {
                    str2[i] = str.charAt(i);
                }

                System.out.println(ciframentoCesar(str, str2, tam-1));
            }

        }while(!str.equals("FIM"));

        scan.close();
    }
}