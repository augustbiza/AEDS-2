import java.util.Scanner;

class q01 {

	public static boolean verificaFim(String str) {
		boolean ehFim = false;

		if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M') ehFim = true; 
		
		return ehFim;
	}

	public static int contarMaiusculas(String str) {
		int qt = 0;

		for(int i = 0; str.charAt(i) != '\n'; i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) qt++;
		}

		return qt;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str;
		do {
		
			str = scan.nextLine();
			if(!verificaFim(str)) {
				System.out.println("Maiusculas: " + contarMaiusculas(str));
			}

		}while(!verificaFim(str));		

		scan.close();		
	}
}
