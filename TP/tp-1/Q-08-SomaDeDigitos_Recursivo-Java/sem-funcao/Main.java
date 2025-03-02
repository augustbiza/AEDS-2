// Soma de Dígitos em Java (recursivo)
import java.util.Scanner;

class Main {

    public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
    }

    private static int somaDigitos(String num, int tam) {

        int soma = 0;

        if(tam > 0) {



            switch(num.charAt(tam-1)) {
                case '1':
                    soma += 1 + somaDigitos(num, tam-1); break;
                case '2':
                    soma += 2 + somaDigitos(num, tam-1); break;
                case '3':
                    soma += 3 + somaDigitos(num, tam-1); break;
                case '4':
                    soma += 4 + somaDigitos(num, tam-1); break;
                case '5':
                    soma += 5 + somaDigitos(num, tam-1); break;
                case '6':
                    soma += 6 + somaDigitos(num, tam-1); break;
                case '7':
                    soma += 7 + somaDigitos(num, tam-1); break;
                case '8':
                    soma += 8 + somaDigitos(num, tam-1); break;
                case '9':
                    soma += 9 + somaDigitos(num, tam-1); break;
                default:
                    soma += 0 + somaDigitos(num, tam-1);
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num = new String();
        int tam = 1;

        do{

            num = scan.nextLine();
            tam = num.length();

            if(!comparaFim(num, tam)) {

                System.out.println(somaDigitos(num, tam));
            }

        }while(!comparaFim(num, tam));

        scan.close();
    }
}