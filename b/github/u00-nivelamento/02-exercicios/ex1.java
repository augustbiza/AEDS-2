
class ex1 {

    public static boolean pesquisa (int[] arr, int x) {
        boolean achou = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                achou = true;
                i = arr.length;
            }
        }

        return achou;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5,1,2,9,7,6};

        if(pesquisa(arr, 10)) System.out.println("SIM");
        else System.out.println("NAO");
    }
}