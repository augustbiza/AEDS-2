import java.util.*;     //. ArrayList .List .Scanner
import java.text.*;
import java.io.*;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class Pokemon {

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    //atributos
    private int id;
    private int generation;
    private String name;
    private String description;
    private List<String> types;
    private List<String> abilities;
    private double weight_kg;
    private double height_m;
    private int captureRate;
    private boolean legendary;
    private Date captureDate;

    //construtor vazio
    public Pokemon() {}

    //construtor cheio
    public Pokemon(int id, int generation, String name, String description, List<String> types, List<String> abilities, double weight_kg, double height_m, int captureRate, boolean legendary, Date captureDate) {
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

    // id
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    // generation
    public void setGeneration(int generation) {
        this.generation = generation;
    }
    public int getGeneration() {
        return generation;
    }

    // name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // description
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    // types
    public void setTypes(List<String> types) {
        this.types = types;
    }
    public List<String> getTypes() {
        return types;
    }

    // abilities
    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
    public List<String> getAbilities() {
        return abilities;
    }

    // weight
    public void setWeight(double weight_kg) {
        this.weight_kg = weight_kg;    
    }
    public double getWeight() {
        return weight_kg;
    }

    // height
    public void setHeight(double height_m) {
        this.height_m = height_m;
    }
    public double getHeight() {
        return height_m;
    }

    // captureRate
    public void setCaptureRate(int captureRate) {
        this.captureRate = captureRate;
    }
    public int getCaptureRate() {
        return captureRate;
    }

    // legendary
    public void setIsLegendary(boolean legendary) {
        this.legendary = legendary;
    }
    public boolean getIsLegendary() {
        return legendary;
    }

    // captureDate
    public void setCaptureDate(Date captureDate) {
        this.captureDate = captureDate;
    }
    public String getCaptureDate() {
        return formatter.format(this.captureDate);
    }

    //imprimir
    public void imprimir() {
        if(this.weight_kg != 0.0 && this.height_m != 0.0){
            System.out.printf("[#%d -> %s: %s - %s - %s - %.1fkg - %.1fm - %d%% - %b - %d gen] - %s%n",
                getId(), getName(), getDescription(), getTypes(), getAbilities(), getWeight(), getHeight(), getCaptureRate(), getIsLegendary(), getGeneration(), getCaptureDate());
        }else System.out.printf("[#%d -> %s: %s - %s - %s - 0.0fkg - 0.0m - %d%% - %b - %d gen] - %s%n",
        getId(), getName(), getDescription(), getTypes(), getAbilities(), getCaptureRate(), getIsLegendary(), getGeneration(), getCaptureDate());
    }

    //ler
    public Pokemon ler(String linha) {
        String[] megaparts = linha.split("\"");
        String[] parts = megaparts[0].split(",");

        id = Integer.parseInt(parts[0]);
        generation = Integer.parseInt(parts[1]);
        name = parts[2];
        description = parts[3];

        // types
        types = new ArrayList<>();
        types.add("'" + parts[4] + "'");
        if (parts.length > 5 && !parts[5].isEmpty()) {
            types.add("'" + parts[5] + "'");
        }

        //abilities
        abilities = new ArrayList<>();

        if (megaparts.length > 1) {
            String[] abilitiesArray = megaparts[1].replaceAll("[\\[\\]]", "").split(","); // Remove colchetes e apóstrofos
            for(String ability : abilitiesArray){
                ability = "'" + ability + "'";
            }
            abilities.addAll(Arrays.asList(abilitiesArray));
        }

        String[] parts2 = megaparts[2].split(",");
        if(!parts2[1].isEmpty()){
            weight_kg = Double.parseDouble(parts2[1]);
        }else weight_kg = 0.0;
        if(!parts2[2].isEmpty()){
            height_m = Double.parseDouble(parts2[2]);
        }else height_m = 0.0;
        captureRate = Integer.parseInt(parts2[3]);
        legendary = parts2[4].equals("1");
        try{
            captureDate = formatter.parse(parts2[5]);
        }catch(ParseException e){
            System.out.println("Data inválida. Escreva novamente.");
        }

        return new Pokemon(id, generation, name, description, types, abilities, weight_kg, height_m, captureRate, legendary, captureDate);
    }
} //FIM POKEMON


public class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pokemon> pokedex = new ArrayList<>();
        ArrayList<Pokemon> bag = new ArrayList<>();

        List<String> linhas = new ArrayList<>();
        try (Scanner reader = new Scanner(new File("/tmp/pokemon.csv"))) {
            reader.nextLine();
            while (reader.hasNextLine()) {
                String linha = reader.nextLine();
                linhas.add(linha);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String linha : linhas) {
            Pokemon pokemon = new Pokemon();
            pokedex.add(pokemon.ler(linha));
        }
        String input = "";
        while (!input.equals("FIM")) {
            input = scan.nextLine();
            if (!input.equals("FIM")) {
                try {
                    int i = Integer.parseInt(input);
                    if (i >= 0 && i < pokedex.size()) {
                        bag.add(pokedex.get(i - 1));
                    } else {
                        System.out.println("erro");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("erro");
                }
            }
        }


        for (int i = 0; i < (pokedex.size() - 1); i++) {

			int menor = i;
			for (int j = (i + 1); j < pokedex.size(); j++){
				
                if (pokedex.get(menor).getName().compareTo(pokedex.get(j).getName()) > 0){
					menor = j;
				}
			}
			Pokemon temp = pokedex.get(i);
            pokedex.set(i, pokedex.get(menor));
            pokedex.set(menor, temp);
		}

        for(Pokemon pkmn : pokedex) {
            pkmn.imprimir();
        }

        scan.close();
    } //FIM main

} //FIM Main