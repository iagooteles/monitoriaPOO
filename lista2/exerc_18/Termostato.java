public class Termostato extends DispositivoBase {
    private double temperaturaAtual;

    public Termostato(String nome, double temperaturaInicial) {
        super(nome);
        this.temperaturaAtual = temperaturaInicial;
    }

    public void ajustarTemperatura(double novaTemp) {
        try {
            if (novaTemp < 10 || novaTemp > 35) {
                throw new IllegalArgumentException("Temperatura deve estar entre 10°C e 35°C.");
            }
            
            this.temperaturaAtual = novaTemp;
            System.out.println(nome + " ajustado para " + novaTemp + "°C.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao ajustar temperatura do " + nome + ": " + e.getMessage());
        }
    }

    public double lerTemperatura() {
        System.out.println(nome + " mediu temperatura: " + temperaturaAtual + "°C");
        return temperaturaAtual;
    }
}
