package Model.src.Controller;

import Model.src.Model.*;
import Model.src.View.IMenus;
import Model.src.View.ITabuleiro;
import java.util.Scanner;


public class ControllerModoTexto {
    public static void Tabuleiros() {
        ITabuleiro InterfaceTabuleiros = new ITabuleiro();
        int s = 40;
        InterfaceTabuleiros.TabuleiroInicial();
        InterfaceTabuleiros.Tabuleirojogo(s);
    }

    public static void Menus() {
        ITabuleiro InterfaceTabuleiros = new ITabuleiro();
        IMenus Menu = new IMenus();
        Jogo Iniciar = new Jogo();
        Tabuleiro Tabuleiro = new Tabuleiro();

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        int Jogada = -1;
        int Cava = -1;

        while (opcao != 0) {
            try {
            Menu.MenuPrincipal();

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    try {
                        InterfaceTabuleiros.TabuleiroInicial();
                        //Iniciar.criarTabuleiro(Tabuleiro);
                        Menu.MenuJogadas();
                        Jogada = scanner.nextInt();
                        Menu.MenuCavas();
                        Cava = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Erro. Tente novamente.");
                    }
                case 2:
                    try {
                        Menu.MenuRegras(scanner);
                        break;
                    } catch (Exception e) {
                        System.out.println("Erro. Tente novamente.");
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