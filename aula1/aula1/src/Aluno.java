public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private String curso;

    public Aluno(String nome, String matricula, int idade, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibirInfo() {
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("matricula: " + this.matricula);
        System.out.println("curso: " + this.curso);
    }
}
