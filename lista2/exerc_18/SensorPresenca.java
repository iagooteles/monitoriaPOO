public class SensorPresenca extends DispositivoBase {
    private boolean presencaDetectada;

    public SensorPresenca(String nome) {
        super(nome);
    }

    public void detectarPresenca(boolean presenca) {
        presencaDetectada = presenca;
        String msg = presenca ? "Presença detectada!" : "Nenhuma presença detectada.";
        System.out.println(nome + ": " + msg);
    }
}
