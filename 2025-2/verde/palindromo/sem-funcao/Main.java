import java.util.Scanner;

class Main {

    public static boolean ehFim(String str) {
        boolean fim = false;
        if(str.length() == 3 && str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M') fim = true;
        return fim;
    }

    public static boolean ehPalindromo(String str) {
        boolean palin = true;
        int n = str.length();
        
        for(int i = 0; i <= n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                palin = false;
                i = n;
            }
        }

        return palin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;

        do{
            input = scan.nextLine();

            if(!ehFim(input)) {
                if(ehPalindromo(input)) System.out.println("SIM");
                else System.out.println("NAO");
            }
        }while(!ehFim(input));

        scan.close();
    }
}