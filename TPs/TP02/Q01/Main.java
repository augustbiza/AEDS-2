//TP02Q01 - Classe em Java

import java.util.*;     //. ArrayList .List.  Scanner
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
    private boolean Legendary;
    private LocalDate captureDate;

    //construtor vazio
    public Pokemon() {}

    //construtor cheio
    public Pokemon(int id, int generation, String name, String description, List<String> types, List<String> abilities, double weight_kg, double height_m, double captureRate, boolean legendary, LocalDate captureDate)
    {
        this.id = id;
        this.generation = generation;
        this.name = name;
        this.description = description;
        this.types = types;
        this.abilities = abilities;
        this.weight_kg = weight_kg;
        this.height_m = height_m;
        this captureRate = captureRate;
        this.legendary = legendary;
        this.captureDate = captureDate;
    }

    //id
    public void setId(int id) {
        this.id = id;
    }
    public int getId(void) {
        return id;
    }

    //generation
    public void setGeneration(int generation) {
        this.generation = generation;
    }
    public int getGeneration(void) {
        return generation;
    }

    //name
    public void setName(String name) {
        this.name = name;
    }
    public String getName(void) {
        return name;
    }

    //description
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription(void) {
        return description;
    }

    //types
    public void setTypes(List<String> types) {
        this.types = types;
    }
    public List<String> getTypes(void) {
        this.types = types;
    }

    //abilities
    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
    public List<String> getAbilities(void) {
        return abilities;
    }

    //weight
    public void setWeight(double weight_kg) {
        this.weight_kg = weight_kg;    
    }
    public double getWeight(void) {
        return weight_kg;
    }

    //height
    public void setHeight(double height_m) {
        this.height_m = height_m;
    }
    public double getHeight(void) {
        return height_m;
    }

    //captureRate
    public int setCaptureRate(int captureRate) {
        this.captureRate = captureRate;
    }
    public void getCaptureRate(void) {
        return captureRate;
    }

    //Legendary
    public void setIsLegendary(boolean legendary) {
        this.legendary = legendary;
    }
    public boolean getIsLegendary(void) {
        return legendary;
    }

    //Date
    public void setCaptureDate(LocalDate captureDate) {
        this.captureDate = captureDate;
    }
    public LocalDate getCaptureDate(void) {
        return captureDate;
    }

    //clone
    public Pokemon clone() {
        
    }

}

