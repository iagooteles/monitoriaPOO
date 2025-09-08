public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria minhaConta = new ContaBancaria("12345-6", "iago T");

        minhaConta.exibirDados();

        minhaConta.depositar(500);
        minhaConta.sacar(200);
        minhaConta.sacar(400);

        minhaConta.setTitular("Iago T. M.");

        System.out.println("\nApós operações:");
        minhaConta.exibirDados();
    }
}
