import java.util.List;

package 2311;

public class Main {
    public static void main(String[] args) {
        List<Mergulhador> competidores = Arrays.asList(
            new Mergulhador("Gabriela", 2.0, Arrays.asList(6.0, 5.0, 5.0, 5.0, 5.0, 5.0, 4.0)),
            new Mergulhador("Marina", 1.5, Arrays.asList(8.5, 7.0, 8.0, 8.0, 8.4, 7.5, 7.7)),
            new Mergulhador("Mafalda", 3.0, Arrays.asList(6.0, 7.0, 6.5, 6.8, 7.9, 6.2, 6.6))
        );

        for (Mergulhador m : competidores) {
            System.out.println(m);
        }
    }
}
