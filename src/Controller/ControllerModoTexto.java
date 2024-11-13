package Model.src.Controller;

import Model.src.Model.*;
import Model.src.View.IMenus;
import Model.src.View.ITabuleiro;

import java.util.Scanner;

public class ControllerModoTexto {

    private static boolean finalJogo(Jogo.Status partidaStatus) {
        IMenus menu = new IMenus();
        if (partidaStatus != Jogo.Status.ATIVO) {
            menu.menuFinaljogo(partidaStatus);
            return true;
        }
        return false;
    }

    public void menus() {
        ITabuleiro interfaceTabuleiros = new ITabuleiro();
        IMenus menu = new IMenus();

        Tabuleiro tabuleiroPartida = new Tabuleiro();
        Tabuleiro tabuleiroInstanciado  = tabuleiroPartida.criar();
        Jogo Iniciar = new Jogo();
        Jogo partida = Iniciar.criarTabuleiro(tabuleiroInstanciado);
        boolean jogoAtivo = true;

        Jogador jogador;
        NumeroJogador jogadorNumero;
        Jogo.Status avaliacaoJogo;

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        int jogada;

        while (opcao != 0) {
            menu.menuPrincipal();
            opcao = scanner.nextInt();
            boolean continuarMenu = true;

            while (continuarMenu) {
                switch (opcao) {
                    case 1:
                        try {
                            while (jogoAtivo) {
                                try {
                                    jogador = partida.getJogadorAtivo();
                                    jogadorNumero = partida.getJogadorNumAtivo(jogador);

                                    interfaceTabuleiros.tabuleiroJogo(tabuleiroInstanciado);
                                    menu.menuJogadas(jogadorNumero);

                                    jogada = scanner.nextInt();
                                    scanner.nextLine();

                                    Jogo.Resultado resultado = partida.selecionar(jogadorNumero, jogada);
                                    tabuleiroInstanciado = resultado.tabuleiro();
                                    avaliacaoJogo = resultado.status();

                                    if (finalJogo(avaliacaoJogo)) {
                                        interfaceTabuleiros.tabuleiroJogo(tabuleiroInstanciado);
                                        menu.menuRetorno(1);
                                        String confirmacao = scanner.nextLine();
                                        if (confirmacao.isEmpty()){
                                            jogoAtivo = false;
                                            menu.menuRetorno(2);
                                            continuarMenu = false;
                                        }
                                    }
                                } catch (Exception e) {
                                    menu.menuErros(1);
                                    scanner.nextLine();
                                }
                            }
                        } catch (Exception e) {
                            menu.menuErros(2);
                            scanner.nextLine();
                        }
                        break;

                    case 2:
                        menu.menuRegras();
                        menu.menuRetorno(1);
                        int confirmacao = scanner.nextInt();
                        if (confirmacao == 0){
                            menu.menuRetorno(2);
                            continuarMenu = false;
                        }
                        break;

                    case 0:
                        menu.menuRetorno(0);
                        continuarMenu = false;
                        break;

                    default:
                        menu.menuErros(4);
                }
            }
        }
        scanner.close();
    }
}