import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input = new String();

        do {

            input = scan.nextLine();

            String[] str = input.split(" ");    //str[0] = digito e str[1] = numero

            String nova = str[1].replace(str[0], "");

            int n = nova.length();
            boolean soZeros = true;
            for(int i = 0; i < n; i++) {
                if(nova.charAt(i) != '0') {
                    soZeros = false;
                    i = n;
                }
            }

            if(soZeros) System.out.println('0');
            else {
                
                if()
                else System.out.println(nova);

            }

        }while(!input.equals("0 0"));

        scan.close();
    }
}








/*

        String str = new String();

        str = scan.nextLine();
        int n = str.length();

        char digito = str.charAt(0);
        char[] str2 = new char[n-2];

        int c = 0;

        for(int i = 2; i < n; i++) {

            //if(str.charAt(i) != digito) System.out.print(str.charAt(i));

            if(str.charAt(i) != digito) {

                str2[c] = str.charAt(i);
                c++;
            }
        }

        for(int i = 0; i < str2.length; i++) {
            System.out.print()
        }

        //String nova = new String(str2);
        //System.out.println(nova);
*/