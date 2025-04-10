import java.util.*;
public class selecaoParcial {
    
    public static void mostrar(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void selection(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n-1; i++) {
            int menor = i;
            
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[menor]) menor = j;
            }
        
            int aux = arr[i];
            arr[i] = arr[menor];
            arr[menor] = aux;
        }
    }
    
    public static void parcialSelection(int[] arr, int k) {
        int n = arr.length;
        
        for(int i = 0; i < k; i++) {
            int menor = i;
            
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[menor]) menor = j;
            }
        
            int aux = arr[i];
            arr[i] = arr[menor];
            arr[menor] = aux;
        }
    }
    
    
	public static void main(String[] args) {
	    
	    int[] arr = new int[]{3,4,8,1,6,7,2};
	    
	    mostrar(arr);
	    
	    //selection(arr);
	    //parcialSelection(arr, 3);
	    
	    mostrar(arr);
	}
}
