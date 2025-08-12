import java.util.*;

class Date {
    String dia;
    String mes;
    String ano;
}

class Jogadores {

    public String nome;
    public String foto;
    public Date nascimento;
    public int id;
    public int[] times;

    public Jogadores(String input) {
        ler(input);
    }

    public void imprimir() {
        System.out.print(this.id + " " + this.nome + " " + this.nascimento.dia + "/" +
                this.nascimento.mes + "/" + this.nascimento.ano + " " + this.foto + " (");
        for (int i = 0; i < times.length - 1; i++) {
            System.out.print(times[i] + ", ");
        }
        System.out.println(times[times.length - 1] + ")");
    }

    public void ler(String input) {
        int i = 0;
        String index = separar(input, i, ',');
        i += index.length() + 1;
        this.nome = separar(input, i, ',');
        i += nome.length() + 1;
        this.foto = separar(input, i, ',');
        i += foto.length() + 1;
        this.nascimento = new Date();
        this.nascimento.dia = separar(input, i, '/');
        i += nascimento.dia.length() + 1;
        this.nascimento.mes = separar(input, i, '/');
        i += nascimento.mes.length() + 1;
        this.nascimento.ano = separar(input, i, ',');
        i += nascimento.ano.length() + 1;
        index = separar(input, i, ',');
        i += index.length() + 1;
        String idString = separar(input, i, ',');
        this.id = Integer.parseInt(idString);
        i += idString.length() + 1;
        int n = contarTimes(input, i);
        if (input.charAt(i) == '"') i += 2;
        else i++;
        this.times = new int[n];
        for (int j = 0; j < n - 1; j++) {
            String timeString = separar(input, i, ',');
            this.times[j] = Integer.parseInt(timeString);
            i += timeString.length() + 2;
        }
        String timeString = separar(input, i, ']');
        this.times[n - 1] = Integer.parseInt(timeString);
    }

    public String separar(String input, int i, char delimiter) {
        String stringer = "";
        while (input.charAt(i) != delimiter) {
            stringer += input.charAt(i);
            i++;
        }
        return stringer;
    }

    public int contarTimes(String input, int i) {
        int times = 1;
        while (input.charAt(i) != ']') {
            if (input.charAt(i) == ',') {
                times++;
            }
            i++;
        }
        return times;
    }

    // Versão correta da busca binária recursiva
    public static boolean pesqBin(ArrayList<Jogadores> jog, String str, int in, int fim) {
        if (in > fim) return false;
        int meio = (in + fim) / 2;
        int cmp = jog.get(meio).nome.compareTo(str);

        if (cmp == 0) return true;
        else if (cmp > 0) return pesqBin(jog, str, in, meio - 1);
        else return pesqBin(jog, str, meio + 1, fim);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Jogadores> jog = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("FIM")) {
            Jogadores jogador = new Jogadores(input);
            jog.add(jogador);
            input = scan.nextLine();
        }

        // Ordena os jogadores por nome para a busca binária
        Collections.sort(jog, new Comparator<Jogadores>() {
            public int compare(Jogadores a, Jogadores b) {
                return a.nome.compareTo(b.nome);
            }
        });

        input = scan.nextLine();
        while (!input.equals("FIM")) {
            boolean achou = Jogadores.pesqBin(jog, input, 0, jog.size() - 1);
            System.out.println(achou ? "SIM" : "NAO");
            input = scan.nextLine();
        }

        scan.close();
    }
}
