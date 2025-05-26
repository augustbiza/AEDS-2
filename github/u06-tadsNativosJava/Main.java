import java.util.*;

class Main {

    public static void main(String[] args) {

        Vector<String> humanas = new Vector<String>();
        humanas.add("Literatura");
        humanas.add("História");
        humanas.add("Filosofia");
        humanas.add("Arte");

        ArrayList<String> exatas = new ArrayList<String>();
        exatas.add("Engenharia");
        exatas.add("Física");
        exatas.add("Matemática");
        exatas.add("Computação");

        LinkedList<String> biologicas = new LinkedList<String>();
        biologicas.add("Biologia");
        biologicas.add("Medicina");
        biologicas.add("Farmácia");

        for(Iterator i = biologicas.iterator(); i.hasNext();) System.out.println((String)i.next());

    }
}