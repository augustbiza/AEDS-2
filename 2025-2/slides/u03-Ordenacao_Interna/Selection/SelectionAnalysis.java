import java.util.Scanner;

class SelectionAnalysis {

    public static Scanner scan = new Scanner(System.in);

    public static int comp = 0;
    public static int mov = 0;

    public static void selection(Array vet) {
        for(int i = 0; i < vet.n-1; i++) {
            int menorIndex = i;
            for(int j = i+1; j < vet.n; j++) {
                comp++;
                if(vet.array[j] < vet.array[menorIndex]) menorIndex = j;
            }
            vet.swap(i, menorIndex);
            mov += 3;
        }
    }

    public static void showAnalysis() {
        System.out.println("Comparacoes: " + comp + "\nMovimentacoes: " + mov);
    }

    public static void main(String [] args) {

        System.out.print("Tamanho do vetor: ");
        int n = scan.nextInt();
        Array vet = new Array(n);
        vet.showArray();

        selection(vet);
        vet.showArray();
        showAnalysis();

        
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

