import java.util.Scanner;
import java.util.Random;

class Main {
    public static Scanner scan = new Scanner(System.in);

    public static boolean ehFim(String s) {
        boolean fim = false;
        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') fim = true;

        return fim;
    }

    public static String altAle(String s, char i, char j) {
        String alt = "";
        for(int k = 0; k < s.length(); k++) {
            if(s.charAt(k) == i) alt += j;
            else alt += s.charAt(k);
        }

        return alt;
    }

    public static void main(String[] args) {
        String s;
        Random gerador = new Random();
        gerador.setSeed(4);

        do{
            s = scan.nextLine();
            char a = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
            char b = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
            System.out.println(a + " " + b);
            
            if(!ehFim(s)) {
                String alt = altAle(s, a, b);
                System.out.println(alt);
            }

        }while(!ehFim(s));
    }
}