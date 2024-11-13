package Model.src.Model;

import java.util.Optional;

public class Deposito {

    protected int sementes;

    private Deposito proximo;

    protected final NumeroJogador vez;

    Deposito(NumeroJogador vez, int sementes) {
        this.vez = vez;
        this.sementes = sementes;
    }

    public Integer contar() {
        return sementes;
    }

    public Deposito proximo() {
        return proximo;
    }

    public Deposito setProximo(Deposito proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public void distribuir() {
        this.sementes++;
    }

    public NumeroJogador getVez() {
        return vez;
    }

    boolean podeDistribuir(NumeroJogador jogador) {
        return false;
    }

    public boolean estaVazio() {
        return this.sementes == 0;
    }

    public Optional<Casa> getOposta() {
        return Optional.empty();
    }

    // Pegar sementes da casa oposta
    public Integer capturar() {
        if (this.getOposta().isEmpty()) {
            return 0;
        }
        return this.getOposta().get().pegar();
    }

    public Integer pegar() {
        return 0;
    }

}
