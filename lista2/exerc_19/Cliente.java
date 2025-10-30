import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Reserva> reservas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> getReservasAtivas() {
        List<Reserva> ativas = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.isAtiva()) {
                ativas.add(reserva);
            }
        }
        return ativas;
    }

    public double getTotalReservasAtivas() {
        double total = 0;
        for (Reserva reserva : getReservasAtivas()) {
            total += reserva.getValor();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | CPF: " + cpf;
    }
}
