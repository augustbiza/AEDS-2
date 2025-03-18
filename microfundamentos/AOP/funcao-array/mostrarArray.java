public static void mostrarArray(int[] arr) {

    int tam = arr.lenght;
    
    System.out.println("Array: " + tam + " elementos");
        
        for(int i = 0; i < tam; i++) {
            
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
}