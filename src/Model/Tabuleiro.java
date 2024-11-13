package Model.src.Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static Model.src.Model.NumeroJogador.DOIS;
import static Model.src.Model.NumeroJogador.UM;

public class Tabuleiro {

    public record Jogadores(Jogador jogador1, Jogador jogador2) {}

    private List<Casa> Casas;

    private List<Armazem> armazens;

    private Jogadores jogadores;

    //private Tabuleiro() {}

    // Criação de um tabuleiro de acordo com as regras do jogo
    public Tabuleiro criar() {
        return criar(4, 6);
    }

    public Tabuleiro criar(int numeroDeSementes, int tamanho) {
        var sementes = Stream.generate(() -> numeroDeSementes).limit(tamanho).toList();
        return definicoes(sementes, 0, sementes, 0);
    }

    // Definição e construção dos objetos do tabuleiro de acordo com a lógica de listas ligadas
    public Tabuleiro definicoes(List<Integer> CasasP1, int armazemP1, List<Integer> CasasP2, int armazemP2) {
        LinkedList<Casa> CasasUm = construirCasas(UM, CasasP1);
        LinkedList<Casa> CasasDois = construirCasas(DOIS, CasasP2);
        opostasMutuamente(CasasUm, CasasDois);

        Armazem armazemUm = new Armazem(UM, armazemP1);
        Armazem armazemDois = new Armazem(DOIS, armazemP2);

        listaCircular(CasasUm, armazemUm, CasasDois, armazemDois);

        Jogador jogadorUm = new Jogador(UM, CasasUm, armazemUm);
        Jogador jogadorDois = new Jogador(DOIS, CasasDois, armazemDois);

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.Casas = new ArrayList<>(CasasUm);
        tabuleiro.Casas.addAll(CasasDois);
        tabuleiro.armazens = List.of(armazemUm, armazemDois);
        tabuleiro.jogadores = new Jogadores(jogadorUm, jogadorDois);

        return tabuleiro;
    }

    // Construção das Casas
    public static LinkedList<Casa> construirCasas(NumeroJogador numeroJogador, List<Integer> sementes) {
        LinkedList<Casa> Casas = new LinkedList<>();
        Casas.addLast(new Casa(numeroJogador, sementes.get(0)));
        while (Casas.size() < sementes.size()) {
            Casa Casa = new Casa(numeroJogador, sementes.get(Casas.size()));
            Casas.getLast().setProximo(Casa);
            Casas.addLast(Casa);
        }
        return Casas;
    }

    // Função para definir se as Casas são opostas
    private void opostasMutuamente(List<Casa> CasasUm, List<Casa> CasasDois) {
        for (int i=0; i< CasasUm.size(); i++) {
            Casa um = CasasUm.get(i);
            Casa dois = CasasDois.get(CasasDois.size() - i - 1);
            um.setOposta(dois);
            dois.setOposta(um);
        }
    }

    // Função para definir atributos da lista circular
    private void listaCircular(LinkedList<Casa> CasasUm, Armazem armazemUm, LinkedList<Casa> CasasDois, Armazem armazemDois) {
        CasasUm.getLast().setProximo(armazemUm);
        armazemUm.setProximo(CasasDois.getFirst());
        CasasDois.getLast().setProximo(armazemDois);
        armazemDois.setProximo(CasasUm.getFirst());
    }

    public List<Casa> getCasas() {
        return Casas;
    }

    public List<Armazem> getArmazens() {
        return armazens;
    }

    public Jogadores getJogadores() {
        return jogadores;
    }
}
