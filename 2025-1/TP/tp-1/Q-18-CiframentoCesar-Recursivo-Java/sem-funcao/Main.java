//Ciframento de Cesar em Java (recursivo)
import java.util.Scanner;
class Main {

    public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
    }

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

            if(!comparaFim(str, tam)) {
        
                char[] str2 = new char[tam];
                for(int i = 0; i < tam; i++) {
                    str2[i] = str.charAt(i);
                }

                System.out.println(ciframentoCesar(str, str2, tam-1));
            }

        }while(!comparaFim(str, tam));

        scan.close();
    }
}