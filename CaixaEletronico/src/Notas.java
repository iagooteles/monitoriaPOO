public class Notas {
    private int valor;
    private int quantidade;

    public Notas(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int sacarNotas(int qntNecessaria) {
        int qntdSaque = Math.min(qntNecessaria, quantidade);

        quantidade -= qntdSaque;
        return qntdSaque;
    }

    @Override
    public String toString() {
        return "R$" + valor + " -> " + quantidade + " disponíveis.";
    }
}
