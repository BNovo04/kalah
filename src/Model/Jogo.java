package Model.src.Model;

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

    public Status status;

    public static Jogo criarTabuleiro(Tabuleiro tabuleiro) {
        Jogo jogo = new Jogo();
        jogo.tabuleiro = tabuleiro;
        jogo.jogador = tabuleiro.getJogadores().jogador1();
        jogo.status = Status.ATIVO;
        return jogo;
    }

    // Seleção da cava a ser jogada
    public Resultado selecionar(NumeroJogador num, int cava) {
        if (!jogador.num().equals(num)) {
            throw new IllegalStateException(String.format("Jogador %s ainda não pode jogar", num));
        }
        Poco selecionado = jogador.selecionarJogada(cava);
        if (jogador.completo()) {
            outroJogador().finalizar();
            status = declararVencedor();
        }
        else{
        jogador = proximoJogador(selecionado);}
        return new Resultado(status, jogador.num(), tabuleiro);
    }

    public Status declararVencedor() {
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

    // Transição de jogador
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

    public NumeroJogador getJogadorNumAtivo(Jogador jogador) {
        return jogador.num();
    }

}
