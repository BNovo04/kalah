package Model.src.Model;

import java.util.Optional;

public class Poco {

    protected int sementes;

    private Poco proximo;

    protected final NumeroJogador vez;

    Poco(NumeroJogador vez, int sementes) {
        this.vez = vez;
        this.sementes = sementes;
    }

    public Integer contar() {
        return sementes;
    }

    public Poco proximo() {
        return proximo;
    }

    public Poco setProximo(Poco proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public void semear() {
        this.sementes++;
    }

    public NumeroJogador getVez() {
        return vez;
    }

    boolean eSemeavel(NumeroJogador jogador) {
        return false;
    }

    public boolean estaVazio() {
        return this.sementes == 0;
    }

    public Optional<Cava> getOposta() {
        return Optional.empty();
    }

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
