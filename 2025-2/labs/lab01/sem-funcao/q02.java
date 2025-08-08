import java.util.Scanner;

class q02 {

    public static boolean verificaFim(String str) {
		boolean ehFim = false;

		if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M') ehFim = true; 
		
		return ehFim;
	}

	public static int contarMaiusculas(String str, int i) {
		int qt = 0;

        if(i >= str.length()) qt = 0;
        else{
		    if(str.charAt(i) >= 65 && str.charAt(i) <= 90) qt = 1 + contarMaiusculas(str, i+1);
            else qt = 0 + contarMaiusculas(str, i+1);
        }

		return qt;
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;

        do{

            str = scan.nextLine();
			if(!verificaFim(str)) {
				System.out.println(contarMaiusculas(str, 0));
			}

        }while(!verificaFim(str));

        scan.close();
    }
}