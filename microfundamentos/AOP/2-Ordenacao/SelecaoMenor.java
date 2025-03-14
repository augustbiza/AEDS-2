//seleciona sempre o maior elemento

public class SelecaoMenor {
    
    public static void selecao(int[] arr, int tam) {
    
        for(int i = 0; i < tam-1; i++) {
            
            int menor = i;  //assume que o primeiro número é o menor - guarda seu índice
                            //pivô
            for(int f = i+1; f < tam; f++) {
                
                if(arr[f] < arr[menor]) {
                    menor = f;  //se o número a frente for menor guarda o índice dele
                }
            }
            
            if(arr[i] != arr[menor]) {  //faza troca dos dois números
                int aux = arr[i];   
                arr[i] = arr[menor];    //pivô vira o menor
                arr[menor] = aux;       //menor vira o pivô
            }
            
            // na próxima vez o primeiro número (menor de todos) não participa das comparações
        }
    }
    
    public static void mostrarArray(int[] arr, int tam) {
        System.out.println("Array: " + tam + " elementos");
        
        for(int i = 0; i < tam; i++) {
            
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
    
	public static void main(String[] args) {
	    
	    int arr[] = new int[]{7,9,1,3,4};
	    
	    int tam = arr.length;
	    
	    mostrarArray(arr, tam);
	    
	    selecao(arr, tam);
	    
	    mostrarArray(arr, tam);
	}
	
}
