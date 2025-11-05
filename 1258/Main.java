import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = """
                9
                Maria Jose
                branco P
                Mangojata Mancuda
                vermelho P
                Cezar Torres Mo
                branco P
                Baka Lhau
                vermelho P
                JuJu Mentina
                branco M
                Amaro Dinha
                vermelho P
                Adabi Finho
                branco G
                Severina Rigudinha
                branco G
                Carlos Chade Losna
                vermelho P
                3
                Maria Joao
                branco P
                Marcio Guess
                vermelho P
                Maria Jose
                branco P
                0
                """;

        Scanner sc = new Scanner(input);
        boolean primeiroCaso = true;

        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) break;

            List<Camiseta> lista = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String nome = sc.nextLine();
                String[] corTamanho = sc.nextLine().split(" ");
                String cor = corTamanho[0];
                String tamanho = corTamanho[1];

                lista.add(new Camiseta(nome, cor, tamanho));
            }

            Collections.sort(lista);

            if (!primeiroCaso) System.out.println();
            primeiroCaso = false;

            for (Camiseta c : lista) {
                System.out.println(c);
            }
        }

        sc.close();

    }
}
