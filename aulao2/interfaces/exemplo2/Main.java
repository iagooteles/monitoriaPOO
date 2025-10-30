package aulao2.interfaces.exemplo2;

public class Main {
    public static void main(String[] args) {
        CartaoCredito p1 = new CartaoCredito("Iago", "1234 5678 9123 4567");
        Pix p2 = new Pix("iago@banco.com");

        realizarCompra(p1, 250.0);
        realizarCompra(p2, 99.9);

        p1.reembolsar(250.0);

        // ponto de atenção 
        Pagamento p3 = new Pix("iagoexemplo2@banco.com");
        realizarCompra(p3,100.0);
    }

    public static void realizarCompra(Pagamento pagamento, double valor) {
        pagamento.processarPagamento(valor);
        pagamento.emitirRecibo();
        System.out.println("----------------------");
    }
}
