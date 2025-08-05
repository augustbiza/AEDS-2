class leitura {

	public static void main(String[] args) {
	
		Arq.openRead("teste.txt");

		String name = Arq.readString();
		Arq.readString();
		int year = Arq.readInt();

		Arq.close();

		System.out.println("City: "+  name + "\nYear: " + year);
			
	}
}
