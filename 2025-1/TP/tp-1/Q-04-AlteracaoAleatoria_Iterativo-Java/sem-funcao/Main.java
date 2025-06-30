//Alteração Aleatória em Java (iterativo)
import java.util.Scanner;
import java.util.Random;

class Main {

    public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
    }

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
        int tam = 1;
        char a, b;

        Random gerador = new Random();  // cria um objeto de Random para gerar números aleatorios
        gerador.setSeed(4);             // faz com que os números aleatórios sejam sempre iguais (pro verde corrigir)
        
        do{
            
            str = scan.nextLine();
            tam = str.length();

            a = (char)('a' + Math.abs(gerador.nextInt()) % 26);
            b = (char)('a' + Math.abs(gerador.nextInt()) % 26);

            //System.out.println(a + "\n" + b);

            if(!comparaFim(str, tam)) {

                System.out.println(alteracaoAleatoria(str, a, b, tam));
            }

        }while(!comparaFim(str, tam));

        scan.close();
    }
}