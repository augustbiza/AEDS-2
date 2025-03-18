//Menor elemento no começo

class IsertionMenor {

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
	    
	    int[] arr = new int[]{3,4,1,8,5};
	    
	    mostrarArray(arr);
	    
	    insertion(arr);
	    
	    mostrarArray(arr);
	    
	}
}