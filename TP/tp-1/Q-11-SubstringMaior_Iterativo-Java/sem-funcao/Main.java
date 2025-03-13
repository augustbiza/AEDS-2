
import java.util.Scanner;

public class Main {

    public static boolean comparaFim(String str, int tam) {     //str.equals("FIM")

        boolean igualFim = false;

        if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(tam-1) == 'M') igualFim = true;   //tam-1 = ultimo char, em java não possui \0

        return igualFim;
    }
    
    public static int maiorSubstring(String str, int tam) {
        
        int[] posicao = new int[256];   //posição de cada char
        
        for(int c = 0; c < 256; c++) {
            
            posicao[c] = -1;    //
        }

        int i = 0, seq = 0;     //inicio  e  sequência de char

        for(int f = 0; f < tam; f++) {  //percorrer toda String
            
            char charAtual = str.charAt(f);
            
            if(posicao[charAtual] >= i) {      //se o caractere repetiu, o novo início começa depois dele
                
                i = posicao[charAtual] + 1;    //adiciona 1 a aprição do char atual
            }

            posicao[charAtual] = f;             //salva a nova posição do char na sua posição do array

            int seq2 = 1;           //sequência sempre começa com 1
                seq2 += f - i;      //string = final - inicio(novo sem repetição) = total
            
            if(seq2 > seq) {        //compara a maior sequência anterior com a nova
                seq = seq2;
            }
        }

        return seq;
    }
    
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    String str = new String();
        int tam = 1;
	    
	    do{
	        
	        str = scan.nextLine();
	        tam = str.length();
	        
	        if(!comparaFim(str, tam)) {
	            System.out.println(maiorSubstring(str, tam));
	        }
	        
	    }while(!comparaFim(str, tam));
	    
	    scan.close();
	}
}
