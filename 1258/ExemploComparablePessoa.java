public class ExemploComparablePessoa implements Comparable<ExemploComparablePessoa> {
    String nome;
    int idade;

    public ExemploComparablePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(ExemploComparablePessoa outra) {
        // Ordena por idade crescente
        return this.idade - outra.idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }
}
