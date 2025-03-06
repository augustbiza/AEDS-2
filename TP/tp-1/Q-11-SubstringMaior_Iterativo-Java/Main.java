// Substring Mais Longa em Java (iterativo)
import java.util.Scanner;

public class Main {
    
    public static int seqString(String str, int tam) {
        
        int p = 0;
        
        int[] posicao = new int[tam];
        
        for(int i = 0; i < tam; i++) {
            
            int pos = 0;
            
            for(int j = tam-1; j > i; j--) {                //achar a ocorrência de um char repetido de trás para frente, ou seja, sua primeira repetição
                                                            // j > i para não comparar a letra com ela mesma
                if(str.charAt(i) == str.charAt(j)) {
                    pos = j;
                }
            }
            
            posicao[p] = pos;                               //guardo a posição da primeira repetição em um vetor
            p++;
        }
        
        
        int maiorSeq = posicao[0];
        
        for(int i = 1; i < posicao.length; i++) {
            
            if(posicao[i] != 0) {               //tiro o 0 da comparação porque o 0 vai ser sempre o menor
                if(posicao[i] < maiorSeq) maiorSeq = posicao[i];    //a menor posição é a maior sequência
            }
        }
        
        if(maiorSeq == 0) maiorSeq = tam;       //se maior sequencia for 0 é por que não repetiu nenhum char
        
        return maiorSeq;
    }
    
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    String str = new String();
	    
	    do{
	        
	        str = scan.nextLine();
	        int tam = str.length();
	        
	        if(!str.equals("FIM")) {
	            System.out.println(seqString(str, tam));
	        }
	        
	    }while(!str.equals("FIM"));
	    
	    scan.close();
	}
}
