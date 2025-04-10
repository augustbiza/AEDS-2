
class ex03 {
    public static void passagemDeArray(int[] b){
        for (int i = 0; i < 5; i++){
            b[i] *= 5; 
            
            System.out.print("b[" + i + "]: " + b[i] + " ");
        }
        System.out.println();

        b = new int [5];

        for (int i = 0; i < 5; i++){
            b[i] = i; 
            
            System.out.print("b[" + i + "]: " + b[i] + " ");
        } 
        System.out.println();
    }

    public static void main(String[] args) {
        int [] y = new int [5];

        for (int i = 0; i < 5; i++){
            y[i] = i; 
            
            System.out.print("y[" + i + "]: " + y[i] + " ");
        }
        System.out.println();

        passagemDeArray(y);

        for (int i = 0; i < 5; i++){
            System.out.print("y[" + i + "]: " + y[i] + " ");
        }
        System.out.println();

    } 
}