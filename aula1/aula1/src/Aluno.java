public class Aluno {
    public String nome;
    private String matricula;
    private int idade;
    private String curso;

    public Aluno() {
        this.nome = "fulano";
        this.matricula = "0000";
        this.idade = 0;
        this.curso = "none";
    }

    public Aluno(String nome, String matricula, int idade, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
