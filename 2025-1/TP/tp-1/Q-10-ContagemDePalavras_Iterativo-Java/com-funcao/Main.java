// Contagem de Palavras em Java (iterativo)
import java.util.Scanner;

class Main {

    private static int contarPalavras(String str, int tam) {

        int qt = 0;

        if(tam > 0) {
            
            boolean dentroPalavra = false;

            for(int i = 0; i < tam; i++) {

                if(str.charAt(i) != 32) {           //se não for espaço:

                    if(!dentroPalavra) {            //verifica se já está dentro da palavra - se não tiver ele soma 1

                        dentroPalavra = true;
                        qt++;
                    }

                    //else{}                                //se ele ja estiver dentro não soma nada - else vazio
                }
                else {
                    dentroPalavra = false;      //é um espaço
                }
                
            }
        }

        return qt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String();
        int tam = 1;

        do{

            str = scan.nextLine();
            tam = str.length();

            if(!str.equals("FIM")) {

                System.out.println(contarPalavras(str, tam));
            }


        }while(!str.equals("FIM"));

        scan.close();
    }
}