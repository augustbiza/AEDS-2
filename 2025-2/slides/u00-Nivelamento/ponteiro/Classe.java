class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {  }
    public Pessoa(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrar() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }

}

class Classe {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 21);
        p1.mostrar();
        System.out.println(p1);   //endereço de p1

        Pessoa p2 = new Pessoa();
        p2.mostrar();
        System.out.println(p2);     //endereço de p2

        Pessoa p3;
        p3.mostrar();   //erro
        System.out.println(p3);

        Pessoa p4 = null;
        p4.mostrar(); //erro
        System.out.println(p4);     //null
    }
}