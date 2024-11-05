package Model.src.Controller;

import Model.src.Model.*;
import Model.src.View.IMenus;
import Model.src.View.ITabuleiro;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;




public class ControllerModoTexto {

    private static boolean isGameOver(Jogo.Status partidaStatus) {
        if (partidaStatus != Jogo.Status.ATIVO) {
            System.out.println("O jogo terminou!" + partidaStatus);
            return true;
        }
        return false;
    }

    public static void Menus() {
        ITabuleiro InterfaceTabuleiros = new ITabuleiro();
        IMenus Menu = new IMenus();

        Tabuleiro TabuleiroJogo = new Tabuleiro();
        Tabuleiro tabule = TabuleiroJogo.criar();
        Jogo Iniciar = new Jogo();
        Jogo partida = Iniciar.criarTabuleiro(tabule);
        boolean jogoAtivo = true;

        Jogador jogador;
        NumeroJogador jogadorNumero;
        Jogo.Status avaliacaoJogo;

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        int jogada;

        while (opcao != 0) {
            Menu.MenuPrincipal();
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

                                    InterfaceTabuleiros.Tabuleirojogo(tabule);
                                    Menu.MenuJogadas(jogadorNumero);

                                    jogada = scanner.nextInt();

                                    Jogo.Resultado resultado = partida.selecionar(jogadorNumero, jogada);
                                    tabule = resultado.tabuleiro();
                                    avaliacaoJogo = resultado.status();

                                    if (isGameOver(avaliacaoJogo)) {
                                        InterfaceTabuleiros.Tabuleirojogo(tabule);
                                        jogoAtivo = false;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao realizar a jogada. Tente novamente.");
                                    scanner.nextLine();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao iniciar o tabuleiro. Tente novamente.");
                            scanner.nextLine();
                        }
                        break;

                    case 2:
                        try {
                            Menu.MenuRegras(scanner);
                        } catch (Exception e) {
                            System.out.println("Erro. Tente novamente.");
                            scanner.nextLine();
                        }
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        continuarMenu = false;
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
        scanner.close();
    }
}