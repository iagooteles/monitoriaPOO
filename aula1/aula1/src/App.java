public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Will", "123312231123", 15, "ADS");

        aluno1.exibirInfo();
        System.out.println("____________________________");
        aluno2.exibirInfo();
        System.out.println("____________________________");
    }
}
