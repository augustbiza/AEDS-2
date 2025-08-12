import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        String class1 = scan.nextLine(), class2 = scan.nextLine(), class3 = scan.nextLine();

            if(class1.equals("vertebrado")) {
                if(class2.equals("ave")) {
                    if(class3.equals("carnivoro")) System.out.println("aguia");
                    else System.out.println("pomba");
                }
                else {
                    if(class3.equals("onivoro")) System.out.println("homem");
                    else System.out.println("vaca");
                }
            }
            else {
                if(class2.equals("inseto")) {
                    if(class3.equals("hematofago")) System.out.println("pulga");
                    else System.out.println("lagarta");
                }
                else {
                    if(class3.equals("hematofago")) System.out.println("sanguessuga");
                    else System.out.println("minhoca");
                }
            }

        scan.close();
    }
 
}