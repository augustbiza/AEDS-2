// Algoritmos de Ordenação

class Ordenacao {
    
    public static void selection(int[] arr) {
        
        int n = arr.length;
        
        for(int i = 0; i < n-1; i++) {
            
            int menor = i;
            
            for(int j = i+1; j < n; j++) {
                
                if(arr[j] < arr[menor]) menor = j;
            }
            
            int aux = arr [i];
            arr[i] = arr[menor];
            arr[menor] = aux;
        }
    }
    
    public static void insertion(int[] arr) {
        
        int n = arr.length;
        
        for(int i = 1; i < n; i++) {
            
            int temp = arr[i];
            int j = i-1;
            
            while(j >= 0 && arr[j] > temp) {
                
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = temp;
        }
    }
    
    
    
    public static void mostrarArray(int[] arr) {

        int tam = arr.length;
        
        System.out.println("Array: " + tam + " elementos");
            
            for(int i = 0; i < tam; i++) {
                
                System.out.print(arr[i] + " ");
            }
            
            System.out.println();
    }
    
    
	public static void main(String[] args) {
	    
	    int[] arr = new int[]{3,5,1,7,12,4};
	    
	    mostrarArray(arr);
	    
	    //selection(arr);
	    //insertion(arr);
        
	    
	    mostrarArray(arr);
	}
}
