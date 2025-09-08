import java.util.ArrayList;

public class CaixaEletronico {
    private ArrayList<Nota> notas;

    public CaixaEletronico() {
        notas = new ArrayList<>();
        notas.add(new Nota(100, 10));
        notas.add(new Nota(50, 10));
        notas.add(new Nota(10, 20));
        notas.add(new Nota(5, 20));
        notas.add(new Nota(2, 50));
        notas.add(new Nota(1, 50));
    }

    public boolean sacar(int valor) {
        if (valor < 10 || valor > 2000) {
            System.out.println("Valor inválido. O saque deve ser entre R$10 e R$2000.");
            return false;
        }

        int restante = valor;
        boolean saquePossivel = false;

        System.out.println("Saque solicitado: R$" + valor);
        for (Nota nota : notas) {
            int qtd = restante / nota.getValor();

            int qtdSacada = nota.sacarNotas(qtd);

            if (qtdSacada > 0) {
                System.out.println(qtdSacada + " nota(s) de R$" + nota.getValor());
                restante -= qtdSacada * nota.getValor();
            }
        }

        if (restante == 0) {
            saquePossivel = true;
        } else {
            System.out.println("Não foi possível realizar o saque com as notas disponíveis.");
        }

        return saquePossivel;
    }

    public void exibirEstoque() {
        System.out.println("\nEstoque atual de notas:");
        for (Nota nota : notas) {
            System.out.println(nota);
        }
    }
}
