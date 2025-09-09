import PessoaDoPackage.PessoaDoPackage;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("Pandora", 9, "Fortaleza", 100);
        // PessoaDoPackage pessoaDoPackage = new PessoaDoPackage("Bilas", 8, "Pacajus", 50);

        // System.out.println("Nome: " + pessoa1.nome);                                             // ✅ public → permitido
        // System.out.println("Nome: " + pessoa1.getNome());                                        // ✅ public → permitido
        // System.out.println("Idade da pessoa normal: " + pessoa1.idade);                          // ✅ protected → permitido (mesmo pacote)
        // System.out.println("Idade da pessoa do package: " + pessoaDoPackage.idade);              // ❌ protected → não permitido (pacote diferente!)
        // System.out.println("Cidade: " + pessoa1.cidade);                                         // ✅ default → permitido (mesmo pacote)
        // System.out.println("Cidade da pessoa do package: " + pessoaDoPackage.cidade);            // ❌ default → não permitido (pacote diferente)
        // System.out.println("Salário: " + pessoa1.salario);                                       // ❌ ERRO: private → não permitido
        // System.out.println("Salário (via getter): " + pessoa1.getSalario());                     // ✅ permitido via método público
        
        // System.out.println("idade: " + pessoa1.salario);
        // System.out.println("idade: " + pessoaDoPackage.idade);


    }
}
