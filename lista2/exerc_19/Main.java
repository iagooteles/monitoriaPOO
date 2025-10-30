import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();

        sistema.cadastrarCliente("Iago Teles", "12345678900");
        sistema.cadastrarCliente("Maria Souza", "98765432100");

        sistema.registrarReserva("12345678900", "R001", LocalDate.now(), 300.0);
        sistema.registrarReserva("12345678900", "R002", LocalDate.now().plusDays(2), 500.0);
        sistema.registrarReserva("98765432100", "R003", LocalDate.now(), 200.0);

        sistema.listarReservasDoCliente("12345678900");

        sistema.cancelarReserva("12345678900", "R001");

        System.out.println("\nApós cancelamento:");
        sistema.listarReservasDoCliente("12345678900");
    }
}
