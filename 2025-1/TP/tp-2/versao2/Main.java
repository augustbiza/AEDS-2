// Classe Show - Java
import java.io.*;
import java.util.*;
import java.time.*;

class Show {

    private String showId;
    private String type;
    private String title;
    private String director;
    private String[] cast;
    private String country;
    private LocalDate dateAdded;
    private int releaseYear;
    private String rating;
    private String duration;
    private String[] listedIn;


    // construtor
    public Show(String line) {}
}


class Main {


    public static void main(String[] args) throws IOException {

        String csvFile = "/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv";

        Show[] shows = new Show[1368];                                                          //Array de Shows do csv
        int showCount = 0;                                                                      //contar o número de Show

        Scanner scan = new Scanner(new File(csvFile));                                          //scanner vai ler o arquivo
        scan.nextLine();                                                                        //pular o cabeçalho do arquivo
        
        while(scan.hasNextLine()) {                                                             //enquanto tiver linha no arquivo
            shows[showCount++] = new Show(scan.nextLine());                                     //pega a linha e trata ela pra criar um objeto Show e colocar no array shows
        }
        scan.close();                                                                           //fecha o scanner de arquivo


    }
}