public class App {
    public static void main(String[] args) throws Exception {

        int codigo = 2;
        Comanda comanda = new Comanda();
        int quantidade = 20;

        double total = comanda.getItem(2).getPreco() * quantidade;

        System.out.println(total);
    }
}
