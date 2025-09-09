public class Pessoa {
    public String nome;         // Qualquer classe pode acessar
    protected int idade;        // Apenas mesma classe, pacote e subclasses
    String cidade;              // (default) Apenas dentro do mesmo pacote
    private double salario;     // Apenas dentro da própria classe

    public Pessoa(String nome, int idade, String cidade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }
}
