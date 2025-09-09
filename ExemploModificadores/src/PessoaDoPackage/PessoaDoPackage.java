package PessoaDoPackage;

public class PessoaDoPackage {
    public String nome;         // Qualquer classe pode acessar
    protected int idade;        // Apenas mesma classe, pacote e subclasses
    String cidade;              // (default) Apenas mesma classe e dentro do mesmo pacote .... default não permite acesso em classes filhas que estão em outro pacote.
    private double salario;     // Apenas dentro da própria classe

    public PessoaDoPackage(String nome, int idade, String cidade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.salario = salario;
    }
}
