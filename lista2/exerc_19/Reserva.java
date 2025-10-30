import java.time.LocalDate;

public class Reserva {
    private String codigo;
    private LocalDate data;
    private double valor;
    private boolean ativa;

    public Reserva(String codigo, LocalDate data, double valor) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.ativa = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void cancelar() {
        this.ativa = false;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "código='" + codigo + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                ", ativa=" + ativa +
                '}';
    }
}
