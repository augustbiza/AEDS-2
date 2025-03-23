import java.util.Scanner;

public class Teste {
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
        String a = "Abacaxi";
        String b = "Pera";
        
        if(a.equals(b)) System.out.println("iguais");
        else System.out.println("diferentes");
        
        scan.close();
	}
}
