import java.util.Scanner;

class QtVogais {

    public static Scanner scan = new Scanner(System.in);

    public static int qtVogais(String input, int i, int n) {
        int qt = 0;

        if(i < n) {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') qt += 1 + qtVogais(input, i+1, n);
            else qt += 0 + qtVogais(input, i+1, n);
        }


        return qt;
    }

    public static void main(String[] args) {
        String input = scan.nextLine();
        input = input.toLowerCase();

        int qt = qtVogais(input, 0, input.length());
        System.out.println(input + " = " + qt + " vogais");
    }
}