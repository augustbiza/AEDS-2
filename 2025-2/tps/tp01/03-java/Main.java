import java.util.Scanner;

class Main {

    public static Scanner scan = new Scanner(System.in);

    public static boolean ehFim(String str) {
        boolean fim = false;
        if(str.length() == 3 && str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M') fim = true;

        return fim;
    }

    public static String cifraCesar(String s, int n) {
        String cesar = "";
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) > 31 && s.charAt(i) < 128) cesar += (char)(s.charAt(i) + 3);
            else cesar += s.charAt(i);
        }

        return cesar;
    }

    public static void main(String[] args) {
        String s;
        
        do {
            s = scan.nextLine();
            if(!ehFim(s)) {
                System.out.println(cifraCesar(s, s.length()));
            }
        }while(!ehFim(s));    
    }

}