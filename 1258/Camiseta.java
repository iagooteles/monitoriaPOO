public class Camiseta implements Comparable<Camiseta>  {
    String nome;
    String cor;
    String tamanho;

    public Camiseta(String nome, String cor, String tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public int compareTo(Camiseta outra) {
        // 1. Cor em ordem ascendente
        int corCompare = this.cor.compareTo(outra.cor);
        if (corCompare != 0) return corCompare;

        // 2. Tamanho em ordem decrescente: G > M > P
        int thisT = tamanhoValor(this.tamanho);
        int outraT = tamanhoValor(outra.tamanho);
        if (thisT != outraT) return thisT - outraT;

        // 3. Nome em ordem ascendente
        return this.nome.compareTo(outra.nome);
    }

    private int tamanhoValor(String tamanho) {
        switch (tamanho) {
            case "P": return 1;
            case "M": return 2;
            case "G": return 3;
        }
        return 0;
    }

    @Override
    public String toString() {
        return cor + " " + tamanho + " " + nome;
    }
}
