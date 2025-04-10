class ex2 {

    public static boolean pesquisa(int[] arr, int x) {
        boolean achou = false;

        int esq = 0, dir = arr.length-1;

        while(esq <= dir && !achou) {

            int meio = (esq+dir)/2;

            if(arr[meio] == x) achou = true;
            else if(arr[meio] < x) esq = meio+1;
            else if(arr[meio] > x) dir = meio-1;
        }

        return achou;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,4,7,11,14,18};

        if(pesquisa(arr, 3)) System.out.println("SIM");
        else System.out.println("NAO");
    }
}