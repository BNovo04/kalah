package Model.src.Model;

import java.util.List;

public record Jogador(NumeroJogador num, List<Casa> casas, Armazem armazem) {

    // Seleção da casa da qual as sementes serão movidas
    public Deposito selecionarJogada(int numeroCasa) {
        Casa casa = getCasa(numeroCasa);
        verificarTemSementes(casa);
        Deposito Deposito = executarJogada(casa);
        if (capturarOposta(Deposito)) {
            armazem.distribuir(Deposito.pegar());
            armazem.distribuir(Deposito.capturar());
        }
        return Deposito;
    }

    // Verificação se o jogo está encerrado
    public boolean completo() {
        return casas.stream().allMatch(Casa::estaVazio);
    }

    // Fim do jogo, distribuição das sementes restantes
    public void finalizar() {
        for (Casa casa: casas) {
            armazem.distribuir(casa.pegar());
        }
    }

    public int pontuacao() {
        return armazem.contar();
    }

    private boolean capturarOposta(Deposito Deposito) {
        return Deposito.contar() == 1 && Deposito.getOposta().isPresent();
    }

    private void verificarTemSementes(Casa casa) {
        if (casa.estaVazio()) {
            throw new IllegalArgumentException("Casa deve ter sementes para jogar");
        }
    }

    private Deposito executarJogada(Casa casa) {
        Integer sementes = casa.pegar();
        Deposito Deposito = casa;
        while (sementes > 0) {
            Deposito = Deposito.proximo();
            if (Deposito.podeDistribuir(num)) {
                sementes--;
                Deposito.distribuir();
            };
        }
        return Deposito;
    }

    private Casa getCasa(int numeroCasa) {
        if (numeroCasa < 1 || numeroCasa > casas.size()) {
            throw new IllegalArgumentException("O número da casa deve estar entre 1 e " + casas.size());
        }
        return this.casas.get(numeroCasa - 1);
    }

}
