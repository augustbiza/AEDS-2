
import java.util.*;
import java.io.*;
import java.time.*;

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

    //gets
    public String getShowId() { return show_id; }
    public String getType() { return type; }
    public String getTitle() { return title; };
    public String getDirector() { return director; }
    public String getCast() {
        String cast = "{";

        for(int i = 0; i < this.cast.size(); i++) {

            cast += this.cast.get(i);

            if(i < this.cast.size() - 1) cast += ", ";
        }

        cast += "}";

        return cast;
    }
    public String getCountry() { return country; }
    public Date getDateAdded() { return date_added; }
    public int getReleaseYear() { return release_year; }
    public String getRating() { return rating; }
    public String getDuration() { return duration; }

    public String getListedIn() {
        String listed_in = "{";

        for(int i = 0; i < this.listed_in.size(); i++) {

            listed_in += this.listed_in.get(i);

            if(i < this.listed_in.size() - 1) listed_in += ", ";
        }

        listed_in += "}";

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

    //clone
    public Show clone() {
        return new Show(this.show_id, this.type, this.title, this.director, this.cast, this.country, this.date_added, this.release_year, this.rating, this.duration, this.listed_in);
    }

    //print
    public void imprimir() {
        System.out.println("=> " +
        this.getShowId() + " ## " +
        this.getType() + " ## " +
        this.getTitle() + " ## " +
        (this.getDirector() == "" ? "NaN" : this.getDirector()) + " ## " +
        (this.getCast() == "" ? "NaN" : this.getCast()) + " ## " +
        (this.getCountry() == "" ? "NaN" : this.getCountry()) + " ## " +
        
        )
    }

}

public class Main {

    public static void main(String[] args) {
        
        String csvFile = "/tmp/disneyplus.csv";

        ArrayList<Show> shows = new ArrayList<Show>();

        try {
        Scanner scan = new Scanner(new File(csvFile));
        scan.nextLine();    //pular cabeçalho

        while (scan.hasNextLine()) {
            shows.add(new Show(scan.nextLine()));
        }

        scan.close();
        } catch (Exception e) { }

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while(!input.equals("FIM")) {
            int number = Integer.parseInt(input);
            shows.get(number - 1).imprimir();
            input = sc.nextLine();
        }

        scan.close();
  
    }
}