package aulao2.interfaces.exemplo1;

public class Moto implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Moto acelerando a " + velocidade + " km/h.");
    }
}
