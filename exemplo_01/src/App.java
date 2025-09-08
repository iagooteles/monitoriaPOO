import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CaixaEletronico caixa = new CaixaEletronico();
        Scanner sc = new Scanner(System.in);
        int repetir;

        do {
            System.out.print("\nDigite o valor do saque (R$10 a R$2000): ");
            int valor = sc.nextInt();

            caixa.sacar(valor);

            caixa.exibirEstoque();

            System.out.print("\nDeseja realizar outro saque? (1 = sim / 0 = não): ");
            repetir = sc.nextInt();

        } while (repetir == 1);

        System.out.println("\nCaixa encerrado.");
        sc.close();
    }
}
