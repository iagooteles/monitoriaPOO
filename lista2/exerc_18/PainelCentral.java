import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class PainelCentral extends DispositivoBase {
    private Map<String, Dispositivo> dispositivos = new HashMap<>();

    public PainelCentral(String nome) {
        super(nome);
    }

    public void adicionarDispositivo(Dispositivo dispositivo) {
        try {
            if (dispositivos.containsKey(dispositivo.getNome())) {
                throw new IllegalArgumentException("Dispositivo com nome '" + dispositivo.getNome() + "' já existe.");
            }
            dispositivos.put(dispositivo.getNome(), dispositivo);
            System.out.println("Dispositivo " + dispositivo.getNome() + " adicionado ao " + nome + ".");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao adicionar dispositivo: " + e.getMessage());
        }
    }

    public void removerDispositivo(String nomeDispositivo) {
        try {
            if (!dispositivos.containsKey(nomeDispositivo)) {
                throw new NoSuchElementException("Dispositivo '" + nomeDispositivo + "' não encontrado.");
            }
            dispositivos.remove(nomeDispositivo);
            System.out.println("Dispositivo '" + nomeDispositivo + "' removido do " + nome + ".");
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public void listarDispositivos() {
        System.out.println("\n=== Dispositivos controlados por " + nome + " ===");
        for (Dispositivo d : dispositivos.values()) {
            System.out.println("- " + d.getNome() + " | Ligado: " + d.estaLigado());
        }
        System.out.println("=============================================\n");
    }

    public void ligarTodos() {
        System.out.println("\nLigando todos os dispositivos...");
        for (Dispositivo d : dispositivos.values()) {
            d.ligar();
        }
    }

    public void desligarTodos() {
        System.out.println("\nDesligando todos os dispositivos...");
        for (Dispositivo d : dispositivos.values()) {
            d.desligar();
        }
    }
}
