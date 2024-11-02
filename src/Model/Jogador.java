package Model.src.Model;

import java.util.List;

public record Jogador(NumeroJogador num, List<Cava> cavas, Armazem armazem) {

    public Poco selecionarJogada(int numeroCava) {
        Cava cava = getCava(numeroCava);
        verificarTemSementes(cava);
        Poco poco = executarJogada(cava);
        if (capturarOposta(poco)) {
            armazem.distribuir(poco.pegar());
            armazem.distribuir(poco.capturar());
        }
        return poco;
    }

    public boolean completo() {
        return cavas.stream().allMatch(Cava::estaVazio);
    }

    public void finalizar() {
        for (Cava cava: cavas) {
            armazem.distribuir(cava.pegar());
        }
    }

    public int pontuacao() {
        return armazem.contar();
    }

    private boolean capturarOposta(Poco poco) {
        return poco.contar() == 1 && poco.getOposta().isPresent();
    }

    private void verificarTemSementes(Cava cava) {
        if (cava.estaVazio()) {
            throw new IllegalArgumentException("Cava deve ter sementes para jogar");
        }
    }

    private Poco executarJogada(Cava cava) {
        Integer sementes = cava.pegar();
        Poco poco = cava;
        while (sementes > 0) {
            poco = poco.proximo();
            if (poco.eSemeavel(num)) {
                sementes--;
                poco.semear();
            };
        }
        return poco;
    }

    private Cava getCava(int numeroCava) {
        if (numeroCava < 1 || numeroCava > cavas.size()) {
            throw new IllegalArgumentException("O número da cava deve estar entre 1 e " + cavas.size());
        }
        return this.cavas.get(numeroCava - 1);
    }

}
