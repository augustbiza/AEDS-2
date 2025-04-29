//TP02_Q19 - Comparativo de Ordenação
import java.util.Random;

class Sort {

    private int comp;
    private int mov;

    public Sort() {
        this.comp = 0;
        this.mov = 0;
    }

    public int getComp() { return comp; }
    public int getMov() { return mov; }

    public void zeraDados() { this.comp = 0; this.mov = 0;}

    public void swap(int[] array, int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }

    public void selectionSort(int[] array, int n) {

        for(int i = 0; i < n-1; i++) {

            int posMenor = i;

            for(int j = i+1; j < n; j++) {

                if(array[j] < array[posMenor]) posMenor = j;
                this.comp++;
            }

            swap(array, i, posMenor); this.mov +=3;
        }
    }

    public void insertionSort(int[] array, int n){

        for(int i = 1; i < n; i++) {

            int j = i-1;
            int aux = array[i]; this.mov++;
        
            while(j >= 0 && array[j] > aux) {
                this.comp++;
                array[j+1] = array[j]; this.mov++;
                j--;
            } this.comp++; //quando (array[j] > aux) é false

            array[j+1] = aux; this.mov++;
        }
    }

    public void quickSort(int[] array, int inicio, int fim) {

        int pivo = array[inicio]; this.mov++;
        int i = inicio, j = fim;

        while(i <= j) {

            while(array[i] < pivo)  {
                i++;
                this.comp++;
            }this.comp++;

            while(array[j] > pivo) {
                j--;
                this.comp++;
            }this.comp++;

            if(i <= j) {
                swap(array, i, j); this.mov += 3;
                i++;
                j--;
            }
        }
        
        if(inicio < j) quickSort(array, inicio, j);
        if(fim > i) quickSort(array, i, fim);
    }

    public void bubbleSort(){}
}



class Main {

    public static void preencherArray(int[] array, int n, Random rand) {
        for(int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1,100);
        }
    }

    public static void mostrar(int[] array, int n) {
        for(int i = 0; i < n-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[n-1]);
    }

    public static void dados(Sort sort) {
        System.out.println("Comparacoes: " + sort.getComp() + "\nMovimentacoes: " + sort.getMov() + "\n");
    }

    

    public static void main(String[] args) {
        
        Random rand = new Random();

        int[] array = new int[20];
        int n = array.length;

        preencherArray(array, n, rand);
        //mostrar(array, n);


        Sort sort = new Sort();
/*
            sort.selectionSort(array, n);
            mostrar(array, n);
            System.out.println("Selection Sort");
            dados(sort);
            sort.zeraDados();

            sort.insertionSort(array, n);
            mostrar(array, n);
            System.out.println("Insertion Sort");
            dados(sort);
            sort.zeraDados();

            sort.quickSort(array, 0, n-1);
            mostrar(array, n);
            System.out.println("Quick Sort");
            dados(sort);
            sort.zeraDados();
*/
    }
}