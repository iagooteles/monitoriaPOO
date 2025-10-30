package aulao2.interfaces.exemplo1;

public class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado.");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Carro acelerando a " + velocidade + " km/h.");
    }
}
