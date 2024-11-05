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
        Jogo partida = Iniciar.criarTabuleiro(Tabuleiro.criar());

        Jogador j = null;
        NumeroJogador Jn;
        Jogo.Status a;

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        int Jogada = -1;

        while (opcao != 0) {
            Menu.MenuPrincipal();
            opcao = scanner.nextInt();
            boolean continuarMenu = true; // Control variable for the main menu loop
            while (continuarMenu) {
                switch (opcao) {
                    case 1:
                        try {
                            InterfaceTabuleiros.TabuleiroInicial();
                            boolean jogoAtivo = true; // Variable to control the game loop
                            while (jogoAtivo) {
                                try {
                                    j = partida.getJogadorAtivo();
                                    Jn = partida.getJogadorNumAtivo(j);
                                    Menu.MenuJogadas(Jn);

                                    Jogada = scanner.nextInt();
                                    partida.selecionar(Jn, Jogada);
                                    a = partida.declararVencedor();

                                    // Check if the game is still active
                                    if (a == Jogo.Status.ATIVO) {
                                        continue; // Keep the loop going if the game is active
                                    } else {
                                        jogoAtivo = false; // End the loop if there's a winner
                                        System.out.println("O jogo terminou!"); // Notify players
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao realizar a jogada. Tente novamente.");
                                    scanner.nextLine(); // Clear the scanner buffer
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao iniciar o tabuleiro. Tente novamente.");
                            scanner.nextLine(); // Clear the scanner buffer
                        }
                        break;

                    case 2:
                        try {
                            Menu.MenuRegras(scanner);
                        } catch (Exception e) {
                            System.out.println("Erro. Tente novamente.");
                            scanner.nextLine(); // Clear the scanner buffer
                        }
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        continuarMenu = false; // Exit the main menu loop
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            }

// Close the scanner outside of the menu loop
            scanner.close();

        }
    }
}