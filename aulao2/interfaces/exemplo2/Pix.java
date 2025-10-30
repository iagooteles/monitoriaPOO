package aulao2.interfaces.exemplo2;

public class Pix implements Pagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Enviando R$" + valor + " via PIX para a chave " + chavePix + ".");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Recibo: pagamento PIX concluído com sucesso!");
    }
}
