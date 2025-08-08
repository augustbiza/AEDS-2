import java.util.Scanner;

class q02 {

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
			if(!str.equals("FIM")) {
				System.out.println(contarMaiusculas(str, 0));
			}

        }while(!str.equals("FIM"));

        scan.close();
    }
}