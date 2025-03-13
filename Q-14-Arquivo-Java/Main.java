import java.io.*;
import java.util.Scanner;

public class Main {
    
    public static void escreverFile(int n) {

        try (PrintWriter writer = new PrintWriter(new FileWriter("dados.txt"))) {
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                double valor = scan.nextDouble();
                writer.println(valor);
            }
        } catch (IOException e) {
            System.err.println("Erro" + e.getMessage());
        }
    }

    public static void lerFileInverso(int n) {
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String[] valores = new String[n];
            for (int i = 0; i < n; i++) {
                valores[i] = reader.readLine();
            }
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(valores[i]);
            }
        } catch (IOException e) {
            System.err.println("Erro" + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        escreverFile(n);
        lerFileInverso(n);
    }
}
