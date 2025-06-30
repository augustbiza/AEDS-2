public static void selectionByTitle(ArrayList<Show> shows) {
        int n = shows.size();

        long mov = 0, comp = 0;

        try {

            FileWriter Log = new FileWriter("853033.txt");

            Long inicio = System.nanoTime();

            //metodo de ordenação

            long fim = System.nanoTime();
			long tempoTotal = fim - inicio;

            Log.write("853033" + "\t" + comp + "\t" + mov + "\t" + tempoTotal);

            Log.close();

        } catch (Exception e) { }
    }