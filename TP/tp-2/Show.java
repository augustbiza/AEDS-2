
import java.util.*;
import java.io.*;

class Show {

    //
    public static final String FILE_PATH = "/tmp/disneyplus.csv";       //variavel global que não pode ser modficada
    public static ArrayList<Show> shows = new ArrayList<Show>();        // conjunto de objetos Show

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
        //implementar
    }

    public String getCountry() { return country; }
    public Date getDateAdded() { return date_added; }
    public int getReleaseYear() { return release_year; }
    public String getRating() { return rating; }
    public String getDuration() { return duration; }

    public String getListedIn() {
        //implementar
    } 

    /*
    EXEMPLO DE get arraylist
    public String getAlternateNames() { 
        
        // Construct string e.g. {item1, item2, item3}
        String alternateNames = "{";

        for(int i = 0; i < this.alternateNames.size(); i++) {

            alternateNames += this.alternateNames.get(i);

            if(i < this.alternateNames.size() - 1) alternateNames += ", ";
        }

        alternateNames += "}";

        return alternateNames;
    }
    */


}