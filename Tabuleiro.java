package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static Model.NumeroJogador.UM;
import static Model.NumeroJogador.DOIS;

public class Tabuleiro {

    public record Jogadores(Jogador jogador1, Jogador jogador2) {}

    private List<Cava> cavas;

    private List<Armazem> armazens;

    private Jogadores jogadores;

    private Tabuleiro() {}

    public Tabuleiro criar() {
        return criar(4, 6);
    }

    public Tabuleiro criar(int numeroDeSementes, int tamanho) {
        var sementes = Stream.generate(() -> numeroDeSementes).limit(tamanho).toList();
        return definicoes(sementes, 0, sementes, 0);
    }

    public Tabuleiro definicoes(List<Integer> cavasP1, int armazemP1, List<Integer> cavasP2, int armazemP2) {
        LinkedList<Cava> cavasUm = construirCavas(UM, cavasP1);
        LinkedList<Cava> cavasDois = construirCavas(DOIS, cavasP2);
        opostasMutuamente(cavasUm, cavasDois);

        Armazem armazemUm = new Armazem(UM, armazemP1);
        Armazem armazemDois = new Armazem(DOIS, armazemP2);

        listaCircular(cavasUm, armazemUm, cavasDois, armazemDois);

        Jogador jogadorUm = new Jogador(UM, cavasUm, armazemUm);
        Jogador jogadorDois = new Jogador(DOIS, cavasDois, armazemDois);

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.cavas = new ArrayList<>(cavasUm);
        tabuleiro.cavas.addAll(cavasDois);
        tabuleiro.armazens = List.of(armazemUm, armazemDois);
        tabuleiro.jogadores = new Jogadores(jogadorUm, jogadorDois);

        return tabuleiro;
    }

    private static LinkedList<Cava> construirCavas(NumeroJogador numeroJogador, List<Integer> sementes) {
        LinkedList<Cava> cavas = new LinkedList<>();
        cavas.addLast(new Cava(numeroJogador, sementes.get(0)));
        while (cavas.size() < sementes.size()) {
            Cava cava = new Cava(numeroJogador, sementes.get(cavas.size()));
            cavas.getLast().setProximo(cava);
            cavas.addLast(cava);
        }
        return cavas;
    }

    // Função para definir se as cavas são opostas
    private void opostasMutuamente(List<Cava> cavasUm, List<Cava> cavasDois) {
        for (int i=0; i< cavasUm.size(); i++) {
            Cava um = cavasUm.get(i);
            Cava dois = cavasDois.get(cavasDois.size() - i - 1);
            um.setOposta(dois);
            dois.setOposta(um);
        }
    }

    // Função para definir atributos da lista circular
    private void listaCircular(LinkedList<Cava> cavasUm, Armazem armazemUm, LinkedList<Cava> cavasDois, Armazem armazemDois) {
        cavasUm.getLast().setProximo(armazemUm);
        armazemUm.setProximo(cavasDois.getFirst());
        cavasDois.getLast().setProximo(armazemDois);
        armazemDois.setProximo(cavasUm.getFirst());
    }

    public List<Cava> getCavas() {
        return cavas;
    }

    public List<Armazem> getArmazens() {
        return armazens;
    }

    public Jogadores getJogadores() {
        return jogadores;
    }
}
