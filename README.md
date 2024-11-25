# 19:Comparar usos de this: "this(...)" e "this." (criar e executar programas de exemplo)
[Codespace](https://jubilant-cod-74v9q5v45grcr67x.github.dev/)
### this(...) X this.
#### this(...)
O operador this(...) chama o construtor principal da classe, pode ser usado em um construtor alternativo para evitar repetições. Nele passamos todos os parâmetros necessários para o uso do construtor padrão, como exemplo:
``` java
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

```
#### this.
O operador this. serve quando queremos fazer referência à um atributo do objeto instanciado, um uso muito comum é em getters e setters, como exemplo:
``` java
class Calculadora {
    private int resultado = 0;

    public void soma(int resultado) {
        this.resultado += resultado; // Referencia a variável de instância
    }

    public int getResultado() {
        return this.resultado; // Usa "this" para acessar o membro
    }
}

public class CalculadoraMain {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.soma(1);
        System.out.println("Resultado: " + calc.getResultado());
        calc.soma(2);
        System.out.println("Resultado: " + calc.getResultado());
        calc.soma(3);
        System.out.println("Resultado: " + calc.getResultado());
    }
}
```

### Referências
https://stackoverflow.com/questions/3728062/what-is-the-meaning-of-this-in-java