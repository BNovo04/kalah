package Model.src.Controller;

import Model.src.Model.*;
import Model.src.View.IMenus;
import Model.src.View.ITabuleiro;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;




public class ControllerModoTexto {
    public static void Tabuleiros() {
        ITabuleiro InterfaceTabuleiros = new ITabuleiro();
        int s = 4;
        int sa = 40;
        InterfaceTabuleiros.TabuleiroInicial();
        InterfaceTabuleiros.Tabuleirojogo(s, sa);
    }

    public static void Menus() {
        ITabuleiro InterfaceTabuleiros = new ITabuleiro();
        IMenus Menu = new IMenus();

        Tabuleiro Tabuleiro = new Tabuleiro();

        Jogo Iniciar = new Jogo();
        Jogo partida = Iniciar.criarTabuleiro(Tabuleiro.criar(4,6));

        Jogador j = null;
        NumeroJogador Jn;
        Jogo.Status a;

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        int Jogada = -1;

        while (opcao != 0) {
            try {
            Menu.MenuPrincipal();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    try {
                        do {
                            InterfaceTabuleiros.TabuleiroInicial();
                            j = partida.getJogadorAtivo();
                            Jn = partida.getJogadorNumAtivo(j);
                            Menu.MenuJogadas();
                            Jogada = scanner.nextInt();

                            partida.selecionar(Jn, Jogada);
                            a = partida.declararVencedor();

                        } while (a != Jogo.Status.ATIVO);
                        break;
                    } catch (Exception e) {
                        System.out.println("Erro. Tente novamente.");
                        scanner.nextLine();
                    }
                case 2:
                    try {
                        Menu.MenuRegras(scanner);
                        break;
                    } catch (Exception e) {
                        System.out.println("Erro. Tente novamente.");
                        scanner.nextLine();
                    }
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            }catch (Exception e) {
                System.out.println("Opção inválida.");
                scanner.nextLine();
            }
        }scanner.close();
    }
}