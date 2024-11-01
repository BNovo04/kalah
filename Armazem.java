package Model;

public class Armazem extends Poco {

    Armazem(NumeroJogador vez) {
        super(vez, 0);
    }

    Armazem(NumeroJogador vez, int sementes) {
        super(vez, sementes);
    }

    public void distribuir(int i) {
        sementes += i;
    }

    boolean podeDistribuir(NumeroJogador jogador) {
        return jogador.equals(vez);
    }

    @Override
    public String toString() {
        return "Armazem{" +
                "sementes=" + sementes +
                ", vez=" + vez +
                '}';
    }

}
