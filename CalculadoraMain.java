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