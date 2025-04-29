//TP02Q18 - Quicksort Parcial em Java
import java.util.*;
import java.io.*;
import java.time.*;
import java.text.*;

class Show {

    //atributos
    private String show_id;
    private String type;
    private String title;
    private String director;
    private ArrayList<String> cast;
    private String country;
    private Date date_added;
    private int release_year;
    private String rating;
    private String duration;
    private ArrayList<String> listed_in;

    //construtores
    public Show() {
    
        this.show_id = "";
        this.type = "";
        this.title = "";
        this.director = "";
        this.cast = new ArrayList<String>();
        this.country = "";
        this.date_added = null;
        this.release_year = 0;
        this.rating = "";
        this.duration = "";
        this.listed_in = new ArrayList<String>();

    }
    
    public Show(String show_id, String type, String title, String director, ArrayList<String> cast, String country, Date date_added, int release_year, String rating, String duration, ArrayList<String> listed_in) {

        this.show_id = show_id;
        this.type = type;
        this.title = title;
        this.director = director;
        this.cast = cast;
        this.country = country;
        this.date_added = date_added;
        this.release_year = release_year;
        this.rating = rating;
        this.duration = duration;
        this.listed_in = listed_in;
    }

    public Show(String linha) throws ParseException {
        String[] item = linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", 12);

        setShowId(item[0].trim());
        setType(item[1].trim());
        
        String newTitle = item[2].trim().replace("\"", "");
        setTitle(newTitle);

        //director (pode ser vazio)
        String newDirector = item[3].trim().replace("\"", "");
        setDirector(newDirector.isEmpty() ? "NaN" : newDirector);     

        //cast (pode ser vazio)
        ArrayList<String> castList = new ArrayList<>();
        String elencoBruto = item[4].replaceAll("\"", "").trim();
        if(!elencoBruto.isEmpty()) {
            for(String actor : elencoBruto.split(",")) {
                if(!actor.trim().isEmpty()) {
                    castList.add(actor.trim());
                }
            }
        }
        setCast(castList);
        insertionSort(this.cast);   //ordena cast

        //country (pode ser vazio)
        String newCountry = item[5].replaceAll("\"", "").trim();
        setCountry(newCountry.isEmpty() ? null : newCountry);

        // Date added (pode ser vazia)
        String newDate = item[6].replaceAll("\"", "").trim();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
        if(!newDate.isEmpty()) setDateAdded(sdf.parse(newDate));
        else setDateAdded(sdf.parse("March 1, 1900"));

        setReleaseYear(Integer.parseInt(item[7].trim()));
        setRating(item[8].trim());
        setDuration(item[9].trim());

        // Listed_in
        ArrayList<String> genreList = new ArrayList<>();
        String generoBruto = item[10].replaceAll("\"", "").trim();
        for (String genre : generoBruto.split(",")) {
            if (!genre.trim().isEmpty()) {
                genreList.add(genre.trim());
            }
        }
        setListedIn(genreList);
        insertionSort(this.listed_in);  //ordena listed in

    }

    //gets
    public String getShowId() { return show_id; }
    public String getType() { return type; }
    public String getTitle() { return title; };
    public String getDirector() { return director; }
    public String getCast() {

        if(cast == null || cast.isEmpty()) return "[NaN]";

        String cast = "[";

        for(int i = 0; i < this.cast.size(); i++) {

            cast += this.cast.get(i);

            if(i < this.cast.size() - 1) cast += ", ";
        }

        cast += "]";

        return cast;
    }

    public String getCountry() { return country; }
    public Date getDateAdded() { return date_added; }
    public int getReleaseYear() { return release_year; }
    public String getRating() { return rating; }
    public String getDuration() { return duration; }

    public String getListedIn() {
        String listed_in = "[";

        for(int i = 0; i < this.listed_in.size(); i++) {

            listed_in += this.listed_in.get(i);

            if(i < this.listed_in.size() - 1) listed_in += ", ";
        }

        listed_in += "]";

        return listed_in;
    }

    //sets
    public void setShowId(String show_id) { this.show_id = show_id; }
    public void setType(String type) { this.type = type; }
    public void setTitle(String title) { this.title = title; }
    public void setDirector(String director) { this.director = director; }
    public void setCast(ArrayList<String> cast) { this.cast = cast; }
    public void setCountry(String country) { this.country = country; }
    public void setDateAdded(Date date_added) { this.date_added = date_added; }
    public void setReleaseYear(int release_year) { this.release_year = release_year; }
    public void setRating(String rating) { this.rating = rating; }
    public void setDuration(String duration) { this.duration = duration; }
    public void setListedIn(ArrayList<String> listed_in) { this.listed_in = listed_in; }

    //ordenar
    private void insertionSort(ArrayList<String> arr) {
    for(int i = 1; i < arr.size(); i++) {
        String aux = arr.get(i);
        int j = i - 1;

        while(j >= 0 && arr.get(j).compareToIgnoreCase(aux) > 0) {
            arr.set(j + 1, arr.get(j));
            j--;
        }

        arr.set(j + 1, aux);
    }
}


    //clone
    public Show clone() {
        return new Show(this.show_id, this.type, this.title, this.director, this.cast, this.country, this.date_added, this.release_year, this.rating, this.duration, this.listed_in);
    }

    //print
    public void imprimir() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");

        System.out.println("=> " +
        this.getShowId() + " ## " +
        this.getTitle() + " ## " +
        this.getType() + " ## " +
        (this.getDirector() == null || this.getDirector().isEmpty() ? "NaN" : this.getDirector()) + " ## " +
        this.getCast() + " ## " +
        (this.getCountry() == null || this.getCountry().isEmpty() ? "NaN" : this.getCountry()) + " ## " +
        (this.getDateAdded() == null ? "March 1, 1900" : sdf.format(this.getDateAdded())) + " ## " +
        this.getReleaseYear() + " ## " +
        (this.getRating() == null || this.getRating().isEmpty() ? "NaN" : this.getRating()) + " ## " +
        (this.getDuration() == null || this.getDuration().isEmpty() ? "NaN" : this.getDuration()) + " ## " +
        this.getListedIn() + " ##"
        );
    }
}

public class Main {

    public static int compareShows(Show a, Show b) {

        int cmp = a.getDateAdded().compareTo(b.getDateAdded());

        if(cmp != 0) return cmp;

        return a.getTitle().compareToIgnoreCase(b.getTitle());
    }


    public static void quicksortParcial(ArrayList<Show> shows, int inicio, int fim, int k) {
        
        if(inicio >= fim) return;

        Show pivo = shows.get((inicio + fim) / 2);
        int i = inicio, j = fim;

        while(i <= j) {
            while(compareShows(shows.get(i), pivo) < 0) i++;
            while(compareShows(shows.get(j), pivo) > 0) j--;

            if(i <= j) {
                Show temp = shows.get(i);
                shows.set(i, shows.get(j));
                shows.set(j, temp);
                i++;
                j--;
            }
        }

        if (inicio < j) quicksortParcial(shows, inicio, j, k);
        if (i < k && i < fim) quicksortParcial(shows, i, fim, k);
    }

    public static void main(String[] args) {

        String csvFile = "/tmp/disneyplus.csv";
        //String csvFile = "/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv";

        ArrayList<Show> shows = new ArrayList<Show>();

        try {
            Scanner scan = new Scanner(new File(csvFile));
            scan.nextLine();    //pular cabeçalho

            while(scan.hasNextLine()) {
                shows.add(new Show(scan.nextLine()));
            }

            scan.close();
        } catch(Exception e) { }


        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        ArrayList<Show> base = new ArrayList<Show>();   //novo arraylist só com os show_id de entrada
                                                        //manipular somente esse arraylist
        while(!input.equals("FIM")) {

            for(Show show : shows) {

                if(show.getShowId().equals(input)) base.add(show);
            }

            input = scan.nextLine();
        }

        int tamBase = base.size();
        int k = 10;

        try {

            FileWriter Log = new FileWriter("853033_quicksortParcial.txt");

            Long inicio = System.nanoTime();

            quicksortParcial(base, 0, tamBase-1, k);

            long fim = System.nanoTime();
			long tempoTotal = fim - inicio;

            Log.write("853033" + "\t" + tempoTotal);
            //Log.write("853033" + "\t" + comp + "\t" + mov + "\t" + tempoTotal);

            Log.close();

        } catch (Exception e) { }

        //mostrar
        for(int i = 0; i < k; i++) {
            Show s = base.get(i);
            s.imprimir();
        }

    }
}
