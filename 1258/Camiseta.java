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
    public int compareTo(Camiseta outraCamiseta) {
        // 1. Cor em ordem ascendente
        int corCompare = this.cor.compareTo(outraCamiseta.cor);
        if (corCompare != 0) return corCompare;

        // 2. Tamanho em ordem decrescente: G > M > P
        int thisCamisetaTamanho = tamanhoValor(this.tamanho);
        int outraCamisetaTamanho = tamanhoValor(outraCamiseta.tamanho);
        if (thisCamisetaTamanho != outraCamisetaTamanho) return thisCamisetaTamanho - outraCamisetaTamanho;

        // 3. Nome em ordem ascendente
        return this.nome.compareTo(outraCamiseta.nome);
    }

    // Método para transformamos os 'P', 'M' e 'G' em números para usarmos no comparable;
    private int tamanhoValor(String tamanho) {
        switch (tamanho) {
            case "P": return 1;
            case "M": return 2;
            case "G": return 3;
            default: return 0;
        }
    }

    @Override
    public String toString() {
        return cor + " " + tamanho + " " + nome;
    }
}
