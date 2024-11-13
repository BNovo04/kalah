package Model.src.Model;

import java.util.Optional;

public class Casa extends Deposito {

    private Casa oposta;

    Casa(NumeroJogador dono, int sementes) {
        super(dono, sementes);
    }

    @Override
    public Integer pegar() {
        int sementes = this.sementes;
        this.sementes = 0;
        return sementes;
    }

    @Override
    public Optional<Casa> getOposta() {
        return Optional.ofNullable(oposta);
    }

    public void setOposta(Casa oposta) {
        this.oposta = oposta;
    }

    boolean podeDistribuir(NumeroJogador jogador) {
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
