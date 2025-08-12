//Palindromo em Java (recursivo)
import java.util.Scanner;

class Main {

    public static boolean verificaPalindromo(String str, int i, int tam) {

        boolean palindromo = true;

        if(i <= tam/2)
        {

            if(str.charAt(i) != str.charAt(tam-i-1)) palindromo = false;
            else {
                palindromo = verificaPalindromo(str, i+1, tam);
            }
        }

        return palindromo;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String();
        int tam = 1;

        do{

            str = scan.nextLine();
            tam = str.length();

            if(!str.equals("FIM")) {

                if(verificaPalindromo(str, 0, tam)) System.out.println("SIM");
                else System.out.println("NAO");
            }

        }while(!str.equals("FIM"));

        scan.close();
    }
}