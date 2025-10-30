abstract public class DispositivoBase implements Dispositivo {
    protected String nome;
    protected boolean ligado;

    public DispositivoBase(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println(nome + " foi ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println(nome + " foi desligado.");
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
