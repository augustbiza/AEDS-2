import java.util.Scanner;

class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
/*
        try {
            String s = args[1];
            System.out.println(s);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("posicao invalida");
        } catch(NumberFormatException e) {
            System.out.println("tipo invalido");
        }
*/

        try {
        Integer i = new Integer(args[0]);
        System.out.println(i);            
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("erro");
    }catch(NumberFormatException e){
        System.out.println("invalid format");
    }
    }
}