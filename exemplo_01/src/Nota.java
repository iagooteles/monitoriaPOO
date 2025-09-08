public class Nota {
    private int valor;
    private int quantidade;

    public Nota(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int sacarNotas(int qtdNecessaria) {
        int qtdSaque = Math.min(qtdNecessaria, quantidade);
        quantidade -= qtdSaque;
        return qtdSaque;
    }

    @Override
    public String toString() {
        return "R$" + valor + " -> " + quantidade + " disponíveis";
    }
}
