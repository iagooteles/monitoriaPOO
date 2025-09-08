import java.util.ArrayList;

public class CaixaEletronico {
    private ArrayList<Notas> notas;

    public CaixaEletronico() {
        notas = new ArrayList<>();
        notas.add(new Notas(100, 100));
        notas.add(new Notas(50, 25));
        notas.add(new Notas(10, 10));
        notas.add(new Notas(5, 5));
        notas.add(new Notas(2, 200));
        notas.add(new Notas(1, 100));
    }

    public boolean sacar(int valor) {
        if (valor < 10 || valor > 2000) {
            System.out.println("Valor inválido. O saque deve ser entre R$10 e R$2000.");
            return false;
        }

        int restante = valor;
        boolean saquePossivel = false;

        System.out.println("Saque solicidado: R$ " + valor);
        for (Notas nota: notas) {
            int qtd = restante / nota.getValor();

            int qtdSacada = nota.sacarNotas(qtd);

            if (qtdSacada > 0) {
                System.out.println(qtdSacada + " nota(s) de R$ " + nota.getValor());
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
        for (Notas nota : notas) {
            System.out.println(nota);
        }
    }
}
