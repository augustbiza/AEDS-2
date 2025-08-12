class ex3 {

    public static void extremos(int[] arr) {
        int menor = arr[0], maior = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < menor) menor = arr[i];
            if(arr[i] > maior) maior = arr[i];
        }

        System.out.println("Menor: " + menor + "\nMaior: " + maior);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5,1,2,9,7,6};

        extremos(arr);
    }

}