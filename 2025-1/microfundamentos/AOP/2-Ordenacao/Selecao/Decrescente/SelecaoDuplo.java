//Seleção que troca o maior e o menor a cada laço

class SelecaoDuplo {
    
    public static void mostrarArray(int[] arr, int tam) {
    
        System.out.println("Array: " + tam + " elementos");
            
            for(int i = 0; i < tam; i++) {
                
                System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void selecao(int[] arr, int tam) {
        
        for(int i = 0; i < tam/2; i++) {
            
            int menor = tam-i-1, maior = i;
            
            for(int f = tam-i-1; f > i; f--) {
                
                if(arr[f] > arr[maior]) maior = f;
                
                if(arr[f] < arr[menor]) menor = f;
            }
            
            if(arr[i] != arr[maior]) {
                
                int aux = arr[i];
                arr[i] = arr[maior];
                arr[maior] = aux;
            }
            
            if(arr[tam-i-1] != arr[menor]) {
                
                int aux = arr[tam-i-1];
                arr[tam-i-1] = arr[menor];
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