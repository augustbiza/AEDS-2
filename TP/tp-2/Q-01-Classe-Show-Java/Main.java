// Q_01 - Classe Show - Java
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Show {

        //atributes
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
    private String description;

        //methods

    //constructors
    public Show() {}

    public Show(String show_id, String type, String title, ArrayList<String> director, ArrayList<String> cast, ArrayList<String> country, String date_added, int release_year, String rating, String duration, ArrayList<String> listed_in, String description) {

        setShowId(show_id);
        setType(type);
        setTitle(title);
        setDirector(director);
        setCast(cast);
        setCountry(country);
        setDateAdded(date_added);
        setReleaseYear(release_year);
        setRating(rating);
        setDuration(duration);
        setListedIn(listed_in);
        setDescription(description);
    }

    public Show(String line) {
        String[] atributes = line.split(",");
    }

    //clone
    public Show clone() {
        Show clone = new Show(getShowId(), getType(), getTitle(), getDirector(), new ArrayList<>(getCast()), getCountry(), getDateAdded(), getReleaseYear(), getRating(), getDuration(), new ArrayList<>(getListedIn()), getDescription());

        return new clone;
    }
    
    //sets and gets
    public void setShowId(String show_id) {
        this.setShowId = show_id;
    }
    public String getShowId() {
        return show_id;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public String getDirector() {
        return director;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }
    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setDateAdded(Date date_added) {
        this.date_added = date_added;
    }
    public DAte getDateAdded() {
        return date_added;
    }

    public void setReleaseYear(int release_year) {
        this.release_year = release_year;
    }
    public int getReleaseYear() {
        return release_year;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getRating() {
        return rating;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return duration;
    }

    public void setListedIn(ArrayList<String> listed_in) {
        this.listed_in = listed_in;
    }
    public ArrayList<String> getListedIn() {
        return listed_in;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}


class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Show> = new ArrayList<Show>();

        scan.close();
    }
}