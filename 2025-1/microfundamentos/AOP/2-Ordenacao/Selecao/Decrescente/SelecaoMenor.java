//seleciona sempre o menor elemento e coloca na direita

class SelecaoMenor {
    
    public static void mostrarArray(int[] arr, int tam) {
    
        System.out.println("Array: " + tam + " elementos");
            
            for(int i = 0; i < tam; i++) {
                
                System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void selecao(int[] arr, int tam) {
        
        for(int i = tam-1; i > 0; i--) {
            
            int menor = i;
            
            for(int f = i-1; f >= 0; f--) {
                
                if(arr[f] < arr[menor]) menor = f;
            }
            
            if(arr[i] != arr[menor]) {
                
                int aux = arr[i];
                arr[i] = arr[menor];
                arr[menor] = aux;
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = new int[]{5,1,8,9,4};
        int tam = arr.length;
        
        mostrarArray(arr, tam);
        
        selecao(arr, tam);
        
        mostrarArray(arr, tam);
    }
}