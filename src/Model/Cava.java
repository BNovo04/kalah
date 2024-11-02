package Model.src.Model;

import java.util.Optional;

public class Cava extends Poco {

    private Cava oposta;

    Cava(NumeroJogador dono, int sementes) {
        super(dono, sementes);
    }

    @Override
    public Integer pegar() {
        int sementes = this.sementes;
        this.sementes = 0;
        return sementes;
    }

    @Override
    public Optional<Cava> getOposta() {
        return Optional.ofNullable(oposta);
    }

    public void setOposta(Cava oposta) {
        this.oposta = oposta;
    }

    boolean eSemeavel(NumeroJogador jogador) {
        return true;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "sementes=" + sementes +
                ", vez=" + vez +
                '}';
    }

}
