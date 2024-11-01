package Model;

public class Jogo {

    public enum Status {

        ATIVO,

        EMPATE,

        JOGADOR_UM_VENCEU,

        JOGADOR_DOIS_VENCEU

    }

    public record Resultado(Status status, NumeroJogador proximo, Tabuleiro tabuleiro) {}

    private Tabuleiro tabuleiro;

    private Jogador jogador;

    private Status status;

    public static Jogo criarTabuleiro(Tabuleiro tabuleiro) {
        Jogo jogo = new Jogo();
        jogo.tabuleiro = tabuleiro;
        jogo.jogador = tabuleiro.getJogadores().jogador1();
        jogo.status = Status.ATIVO;
        return jogo;
    }

    public Resultado selecionar(NumeroJogador num, int casa) {
        if (!jogador.num().equals(num)) {
            throw new IllegalStateException(String.format("Jogador %s ainda não pode jogar", num));
        }
        Poco selecionado = jogador.selecionarJogada(casa);
        if (jogador.completo()) {
            outroJogador().finalizar();
            status = declararVencedor();
        }
        jogador = proximoJogador(selecionado);
        return new Resultado(status, jogador.num(), tabuleiro);
    }

    private Status declararVencedor() {
        Tabuleiro.Jogadores jogadores = tabuleiro.getJogadores();
        int pontuacao1 = jogadores.jogador1().pontuacao();
        int pontuacao2 = jogadores.jogador2().pontuacao();
        if (pontuacao1 > pontuacao2) {
            return Status.JOGADOR_UM_VENCEU;
        }
        if (pontuacao2 > pontuacao1) {
            return Status.JOGADOR_DOIS_VENCEU;
        }
        return Status.EMPATE;
    }

    public Jogador proximoJogador(Poco aterrissado) {
        if (aterrissado.equals(jogador.armazem())) {
            return jogador;
        }
        return outroJogador();
    }

    private Jogador outroJogador() {
        Tabuleiro.Jogadores jogadores = tabuleiro.getJogadores();
        return switch (jogador.num()) {
            case UM -> jogadores.jogador2();
            case DOIS -> jogadores.jogador1();
        };
    }

    public Jogador getJogadorAtivo() {
        return jogador;
    }

}
