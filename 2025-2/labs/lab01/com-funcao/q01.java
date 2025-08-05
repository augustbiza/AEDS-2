import java.util.Scanner;

class q01 {

	public static int contarMaiusculas(String str) {
		int qt = 0;

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) qt++;
		}

		return qt;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str;
		do {
		
			str = scan.nextLine();
			if(!str.equals("FIM")) {
				System.out.println(contarMaiusculas(str));
			}

		}while(!str.equals("FIM"));		

		scan.close();		
	}
}
