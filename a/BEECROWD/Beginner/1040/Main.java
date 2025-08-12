import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
 
        double n1 = scan.nextDouble(), n2 = scan.nextDouble(), n3 = scan.nextDouble(), n4 = scan.nextDouble();
        
        double media = ((n1*2)+(n2*3)+(n3*4)+(n4));
        media /= 10;
        
        //media = Math.round(media * 10.0) / 10.0
        
        System.out.printf("Media: %.1f\n",media);
        
        if(media < 5.0) System.out.println("Aluno reprovado.");
        else {
            
            if(media >= 7.0) System.out.println("Aluno aprovado.");
            
            else{
                System.out.println("Aluno em exame.");
                double exame = scan.nextDouble();
                System.out.printf("Nota do exame: %.1f\n", exame);
                
                exame = (exame + media)/2;
                    if(exame < 5.0) System.out.println("Aluno reprovado.");
                    else System.out.println("Aluno aprovado.");
            
                System.out.printf("Media final: %.1f\n", exame);
            }
        }
        
        scan.close();
    }
 
}