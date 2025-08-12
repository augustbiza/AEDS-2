import java.util.Scanner;

class Selection {

    public static Scanner scan = new Scanner(System.in);

    public static void selection(Array vet) {
        for(int i = 0; i < vet.n-1; i++) {
            int menorIndex = i;
            for(int j = i+1; j < vet.n; j++) {
                if(vet.array[j] < vet.array[menorIndex]) menorIndex = j;
            }
            vet.swap(i, menorIndex);
        }
    }

    public static void main(String [] args) {

        System.out.print("Tamanho do vetor: ");
        int n = scan.nextInt();
        Array vet = new Array(n);
        vet.showArray();

        selection(vet);
        vet.showArray();
        
    }
}

class Array {

    public static Scanner scan = new Scanner(System.in);

    public int[] array;
    public int n;

    public Array() { this(0); }
    public Array(int n) {
        this.n = n;
        this.array = new int[n];
        System.out.print("Insira os " + n + " elementos: ");
        for(int i = 0; i < n; i++) array[i] = scan.nextInt();
    }

    public void showArray() {
        for(int i = 0; i < n; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

    public void swap(int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}

