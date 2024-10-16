import java.util.*;     //. ArrayList .List .Scanner
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class Pokemon {

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
    private LocalDate captureDate;

    // Construtor vazio
    public Pokemon() {}

    // Construtor cheio
    public Pokemon(int id, int generation, String name, String description, List<String> types, List<String> abilities, double weight_kg, double height_m, int captureRate, boolean legendary, LocalDate captureDate) {
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

    // Métodos getters e setters

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
    public void setCaptureDate(LocalDate captureDate) {
        this.captureDate = captureDate;
    }
    public LocalDate getCaptureDate() {
        return captureDate;
    }

    // Construtor que processa a linha CSV
    public Pokemon(String texto) {
        // Usando regex para lidar com as vírgulas entre aspas ou colchetes
        String[] item = texto.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

        // Processando os dados
        setId(Integer.parseInt(item[0]));
        setGeneration(Integer.parseInt(item[1]));
        setName(item[2]);
        setDescription(item[3]);

        // Tipos
        List<String> types = new ArrayList<>();
        types.add(item[4]);  // Primeiro tipo
        if (!item[5].isEmpty())  // Verifica se o segundo tipo não é vazio
            types.add(item[5]);
        setTypes(types);

        // Habilidades
        List<String> abilities = new ArrayList<>();
        String abilitiesRaw = item[6].replace("[", "").replace("]", "").replace("'", "").replace("\"", "").trim();
        if (!abilitiesRaw.isEmpty()) {
            String[] abilitiesArray = abilitiesRaw.split(", ");
            abilities.addAll(Arrays.asList(abilitiesArray));
        }
        setAbilities(abilities);

        // Peso
        if (!item[7].isEmpty()) {
            setWeight(Double.parseDouble(item[7]));
        }

        // Altura
        if (!item[8].isEmpty()) {
            setHeight(Double.parseDouble(item[8]));
        }

        // Capture Rate
        if (!item[9].isEmpty()) {
            setCaptureRate(Integer.parseInt(item[9]));
        }

        // Legendary
        setIsLegendary(item[10].equals("1"));

        // Data de Captura
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            setCaptureDate(LocalDate.parse(item[11], formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Erro ao ler a data de captura.");
        }
    }

    // Método para imprimir os dados formatados
    public void imprimir() {
        System.out.printf("[#" + id + " -> " + name + ": " + description + " - [");
        int counter = 1;
        for (String type : types) {
            if (counter == 1) {
                System.out.printf("'" + type + "'");
                counter++;
            } else {
                System.out.printf(", '" + type + "'");
            }
        }
        System.out.printf("] - [");
        counter = 1;
        for (String abilitie : abilities) {
            if (counter == 1) {
                System.out.printf("'" + abilitie + "'");
                counter++;
            } else {
                System.out.printf(", '" + abilitie + "'");
            }
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("] - " + weight_kg + "kg - " + height_m + "m - " + captureRate + "%% - " + legendary + " - " + generation + " gen] - " + captureDate.format(formatter));
        System.out.println();
    }

    // Método clone
    public Pokemon clone() {
        return new Pokemon(getId(), getGeneration(), getName(), getDescription(), getTypes(), getAbilities(), getWeight(), getHeight(), getCaptureRate(), getIsLegendary(), getCaptureDate());
    }
}

public class Main {

    public static void main(String[] args) {

        long inicioTemp = System.nanoTime(); // Correção: adicionado ponto e vírgula
        // Caminho do arquivo CSV
        String csvString = "pokemon.csv";
        ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();

        // Lendo o arquivo CSV
        try {
            Scanner scan = new Scanner(new File(csvString));
            scan.nextLine(); // Ignorando o cabeçalho
            while (scan.hasNextLine()) {
                pokedex.add(new Pokemon(scan.nextLine()));
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
        }

        // Entrada do usuário
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int comp = 0; // Contador de comparações adicionado
        while (!input.equals("FIM")) {
            int num = Integer.parseInt(input);
            if (num > 0 && num <= pokedex.size()) { // Verifica se o índice está dentro dos limites
                pokedex.get(num - 1).imprimir();
                comp++;
            } else {
                System.out.println("Número fora dos limites.");
            }
            input = scan.nextLine();
        }

        long finalTemp = System.nanoTime();

        double totalTemp = (finalTemp - inicioTemp);

        String conteudo = "853033" + "\t" + totalTemp + "\t" + comp;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("853033_sequencial.txt"))) {
            writer.write(conteudo);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo:");
        }

        scan.close();
    }
}