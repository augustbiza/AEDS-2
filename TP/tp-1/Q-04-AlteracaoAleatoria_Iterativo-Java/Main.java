//Alteração Aleatória em Java (iterativo)
import java.util.Scanner;
import java.util.Random;

class Main {

    public static String alteracaoAleatoria(String str, char a, char b, int tam) {

        char[] arr = new char[tam];

        for(int i = 0; i < tam; i++) {

            if(str.charAt(i) == a) arr[i] = b;
            else arr[i] = str.charAt(i);
        }

        String str2 = new String(arr);
        
        return str2;        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String();
        char a, b;

        Random gerador = new Random();  // cria um objeto de Random para gerar números aleatorios
        gerador.setSeed(4);             // faz com que os números aleatórios sejam sempre iguais (pro verde corrigir)
        
        do{
            
            str = scan.nextLine();
            int tam = str.length();

            a = (char)('a' + Math.abs(gerador.nextInt()) % 26);
            b = (char)('a' + Math.abs(gerador.nextInt()) % 26);

            //System.out.println(a + "\n" + b);

            if(!str.equals("FIM")) {

                System.out.println(alteracaoAleatoria(str, a, b, tam));
            }

        }while(!str.equals("FIM"));

        scan.close();
    }
}