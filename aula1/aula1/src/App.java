public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Iago", "4848484884", 15, "ADS");

        aluno1.exibirInfo();

        Aluno pedro = new Aluno("pedro", "22222", 54, "Ciencia da Comp");
        pedro.exibirInfo();
    }
}
