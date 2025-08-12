import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int sH = scan.nextInt(), sM = scan.nextInt(), fH = scan.nextInt(), fM = scan.nextInt(), hours = 0, minutes = 0;

        if(sH == fH) {
            if(sM == fM) {
                hours = 24;
                //minutes = 0;
            }
            else if(sM > fM) {
                hours = 23;
                minutes = 60 - (sM - fM);
            }
            else if(sM < fM) {
                minutes = fM - sM;
            }
        }
        else if(sH < fH) {
            if(sM == fM) {
                hours = fH - sH;
            }
            else if(sM > fM) {
                hours = fH - sH - 1;
                minutes = 60 - sM + fM;
            }
            else if(sM < fM) {
                hours = fH - sH;
                minutes = fM - sM;
            }
        }
        else {
            if(sM == fM) {
                hours = 24 - sH + fH;
            }
            else if(sM > fM) {
                hours = 23 - sH + fH;
                minutes = 60 - sM + fM;
            }
            else if(sM < fM) {
                hours = sH - fH;
                minutes = fM - sM;
            }
        }

        System.out.println("O JOGO DUROU "+hours+" HORA(S) E "+minutes+" MINUTO(S)");

        scan.close();
    }
}