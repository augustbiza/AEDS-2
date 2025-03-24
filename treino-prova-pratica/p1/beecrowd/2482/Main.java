import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtIdiomas;

        qtIdiomas = scan.nextInt();
        scan.nextLine();

        String[] idiomas = new String[qtIdiomas];
        String[] felizNatal = new String[qtIdiomas];

        for(int i = 0; i < qtIdiomas; i++) { 
            idiomas[i] = scan.nextLine();
            felizNatal[i] = scan.nextLine();
        }

        int qtPessoas;

        qtPessoas = scan.nextInt();
        scan.nextLine();

        String[] pessoas = new String[qtPessoas];
        String[] nacionalidade = new String[qtPessoas];

        for(int i = 0; i < qtPessoas; i++) {
            pessoas[i] = scan.nextLine();
            nacionalidade[i] = scan.nextLine();
        }

        for(int i = 0; i < qtPessoas; i++) {
            System.out.println(pessoas[i]);

            int pos = i;

            for(int j = 0; j < idiomas.length; j++) {
                if(idiomas[j].equals(nacionalidade[i])) {
                    pos = j;
                    j = idiomas.length;
                }
            }

            System.out.println(felizNatal[pos] + "\n");
        }

        scan.close();
    }
}