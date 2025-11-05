import java.util.Collections;
import java.util.List;

package 2311;

public class Mergulhador {
    String nome;
    double dificuldade;
    List<Double> notas;

    Mergulhador(String nome, double dificuldade, List<Double> notas) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.notas = notas;
    }

    double calcularPontuacao() {
        Collections.sort(notas);
        double soma = 0;
        for (int i = 1; i < 6; i++) {
            soma += notas.get(i);
        }
        return soma * dificuldade;
    }

    @Override
    public String toString() {
        return String.format("%s %.1f", nome, calcularPontuacao());
    }
}
