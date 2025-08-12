//seleciona sempre o maior elemento e coloca na esquerda

class SelecaoMaior {
    
    public static void mostrarArray(int[] arr, int tam) {
    
        System.out.println("Array: " + tam + " elementos");
            
            for(int i = 0; i < tam; i++) {
                
                System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void selecao(int[] arr, int tam) {
        
        for(int i = 0; i < tam-1; i++) {
            
            int maior = i;
            
            for(int f = i+1; f < tam; f++) {
                
                if(arr[f] > arr[maior]) maior = f;
            }
            
            if(arr[i] != arr[maior]) {
                
                int aux = arr[i];
                arr[i] = arr[maior];
                arr[maior] = aux;
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