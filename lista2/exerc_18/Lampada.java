import java.util.ArrayList;
import java.util.List;

public class Lampada extends DispositivoBase {
    private int intensidade;

    public Lampada(String nome) {
        super(nome);
        this.intensidade = 100;
    }

    public void ajustarIntensidade(int intensidade) {
        try {
            if (intensidade < 0 || intensidade > 100) {
                throw new IllegalArgumentException("Intensidade deve estar entre 0 e 100.");
            }
            this.intensidade = intensidade;
            System.out.println(nome + " ajustada para " + intensidade + "% de intensidade.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao ajustar intensidade da " + nome + ": " + e.getMessage());
        }
    }

    @Override
    public void ligar() {
        System.out.println("A lampada foi ligada...");
    }
}
