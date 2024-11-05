package Model.src.Controller;

import Model.src.Model.*;
import Model.src.View.IMenus;
import Model.src.View.ITabuleiro;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;




public class ControllerModoTexto {

    private static boolean FinalJogo(Jogo.Status partidaStatus) {
        IMenus Menu = new IMenus();
        if (partidaStatus != Jogo.Status.ATIVO) {
            Menu.MenuFinaljogo(partidaStatus);
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

                                    if (FinalJogo(avaliacaoJogo)) {
                                        InterfaceTabuleiros.Tabuleirojogo(tabule);
                                        jogoAtivo = false;
                                    }
                                } catch (Exception e) {
                                    Menu.MenuErros(1);
                                    scanner.nextLine();
                                }
                            }
                        } catch (Exception e) {
                            Menu.MenuErros(2);
                            scanner.nextLine();
                        }
                        break;

                    case 2:
                        try {
                            Menu.MenuRegras(scanner);
                        } catch (Exception e) {
                            Menu.MenuErros(3);
                            scanner.nextLine();
                        }
                        break;

                    case 0:
                        Menu.MenuErros(0);
                        continuarMenu = false;
                        break;

                    default:
                        Menu.MenuErros(4);
                }
            }
        }
        scanner.close();
    }
}