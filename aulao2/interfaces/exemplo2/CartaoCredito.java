package aulao2.interfaces.exemplo2;

public class CartaoCredito implements Pagamento, Reembolsavel {
    private String titular;
    private String numeroCartao;

    public CartaoCredito(String titular, String numeroCartao) {
        this.titular = titular;
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via cartão de crédito de " + titular + ".");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Recibo: pagamento realizado com cartão " + numeroCartao.substring(12));
    }
    
    @Override
    public void reembolsar(double valor) {
        System.out.println("Reembolso de R$" + valor + " processado para o cartão de " + titular + ".");
    }
}
