
class escrita {

	public static void main(String[] args) {
	
		Arq.openWrite("teste.txt");

		Arq.println("Belo Horizonte");
		Arq.println(2025);

		Arq.close();
	}
}
