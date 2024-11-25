class Pessoa {
    private String nome;
    private int idade;

    // Construtor principal
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor alternativo, chama o construtor principal
    public Pessoa(String nome) {
        this(nome, 0); // Chama o construtor principal
    }

    public void mostra() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa person1 = new Pessoa("Alice", 30);
        Pessoa person2 = new Pessoa("Bob");

        person1.mostra();
        person2.mostra();
    }
}