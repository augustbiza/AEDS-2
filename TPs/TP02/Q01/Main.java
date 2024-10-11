//TP02Q01 - Classe Pokemon em Java

import java.util.*;     //. ArrayList .List .Scanner
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Pokemon {

    private int id;
    private int generation;
    private String name;
    private String description;
    private List<String> types;
    private List<String> abilities;
    private double weight_kg;
    private double height_m;
    private double captureRate;
    private boolean legendary;
    private LocalDate captureDate;

    //construtor vazio
    public Pokemon() {}

    //construtor cheio
    public Pokemon(int id, int generation, String name, String description, List<String> types, List<String> abilities, double weight_kg, double height_m, double captureRate, boolean legendary, LocalDate captureDate)
    {
        setId(id);
        setGeneration(generation);
        setName(name);
        setDescription(description);
        setTypes(types);
        setAbilities(abilities);
        setWeight(weight_kg);
        setHeight(height_m);
        setCaptureRate(captureRate);
        setIsLegendary(legendary);
        setCaptureDate(captureDate);
    }

    //id
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    //generation
    public void setGeneration(int generation) {
        this.generation = generation;
    }
    public int getGeneration() {
        return generation;
    }

    //name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //description
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    //types
    public void setTypes(List<String> types) {
        this.types = types;
    }
    public List<String> getTypes() {
        return types;
    }

    //abilities
    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
    public List<String> getAbilities() {
        return abilities;
    }

    //weight
    public void setWeight(double weight_kg) {
        this.weight_kg = weight_kg;    
    }
    public double getWeight() {
        return weight_kg;
    }

    //height
    public void setHeight(double height_m) {
        this.height_m = height_m;
    }
    public double getHeight() {
        return height_m;
    }

    //captureRate
    public void setCaptureRate(double captureRate) {
        this.captureRate = captureRate;
    }
    public double getCaptureRate() {
        return captureRate;
    }

    //Legendary
    public void setIsLegendary(boolean legendary) {
        this.legendary = legendary;
    }
    public boolean getIsLegendary() {
        return legendary;
    }

    //Date
    public void setCaptureDate(LocalDate captureDate) {
        this.captureDate = captureDate;
    }
    public LocalDate getCaptureDate() {
        return captureDate;
    }

    //
    public Pokemon(String texto) {
        String []item = texto.split(",");

        setId(Integer.parseInt(item[0]));

        setGeneration(Integer.parseInt(item[1]));

        setName(item[2]);

        setDescription(item[3]);

        List<String> types = new ArrayList<>();
        types.add(item[4]);
        if (!item[5].isEmpty())
            types.add(item[5]);
        setTypes(types);

        int c = 6;
        boolean IsDouble = false;
        List<String> abilities = new ArrayList<>();

        while (!IsDouble) {
            try {
                Double.parseDouble(item[c]); 
                IsDouble = true;
            } catch (NumberFormatException e) {
                if(!item[c].isEmpty()){
                    String abilitie = item[c].replaceAll("[\\[\\]'\"']", "").trim();
                    abilities.add(abilitie);
                    c++;
                }else{
                    IsDouble = true;
                }
            }
        }
        setAbilities(abilities);

    }

    //clone
    public Pokemon clone() {

        Pokemon clone = new Pokemon(getId(), getGeneration(), getName(), getDescription(), getTypes(), getAbilities(), getWeight(), getHeight(), getCaptureRate(), getIsLegendary(), getCaptureDate());

        return clone;
    }


}

public class Main {

    public static void main(String []args) {
        //csv
        String csvString = "/tmp/pokemon.csv";

        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

        try {
            Scanner scan = new Scanner(new File(csvString));
            scan.nextLine();
            while (scan.hasNextLine()) {
            pokemons.add(new Pokemon(scan.nextLine()));
            }

            scan.close();

        } catch (Exception e) { System.out.println("error");}

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while(!input.equals("FIM")) {
            int number = Integer.parseInt(input);
            pokemons.get(number - 1).imprimir();
            input = scan.nextLine();
        }

        scan.close();
    }

}

