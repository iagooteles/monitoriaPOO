import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SistemaReservas {
    private Map<String, Cliente> clientes;

    public SistemaReservas() {
        clientes = new HashMap<>();
    }

    public void cadastrarCliente(String nome, String cpf) {
        if (clientes.containsKey(cpf)) {
            System.out.println("Cliente já cadastrado!");
        } else {
            clientes.put(cpf, new Cliente(nome, cpf));
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }

    public void registrarReserva(String cpf, String codigo, LocalDate data, double valor) {
        Cliente cliente = clientes.get(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }
        Reserva reserva = new Reserva(codigo, data, valor);
        cliente.adicionarReserva(reserva);
        System.out.println("Reserva registrada para " + cliente.getNome());
    }

    public void listarReservasDoCliente(String cpf) {
        Cliente cliente = clientes.get(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.println("\nReservas de " + cliente.getNome() + ":");
        for (Reserva r : cliente.getReservas()) {
            System.out.println(r);
        }

        System.out.println("Total de reservas ativas: R$ " + cliente.getTotalReservasAtivas());
    }

    public void cancelarReserva(String cpf, String codigo) {
        Cliente cliente = clientes.get(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        for (Reserva r : cliente.getReservas()) {
            if (r.getCodigo().equals(codigo)) {
                r.cancelar();
                System.out.println("Reserva " + codigo + " cancelada.");
                return;
            }
        }

        System.out.println("Reserva não encontrada.");
    }
}
