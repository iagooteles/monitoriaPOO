public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista(String nome, String matricula, int idade, String curso, double bolsa) {
        super(nome, matricula, idade, curso);
        this.bolsa = bolsa;
    }

    @Override
    public void exibirInfo() {
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.getIdade());
        System.out.println("matricula: " + this.getMatricula());
        System.out.println("curso: " + this.getCurso());
        System.out.println("Bolsa: " + this.bolsa);
    }
}
