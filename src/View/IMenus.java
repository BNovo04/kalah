package Model.src.View;

import Model.src.Model.Jogo;
import Model.src.Model.NumeroJogador;

import java.util.Scanner;

public class IMenus {
    public static void MenuPrincipal() {
        System.out.println("\n" +
                "██╗  ██╗ █████╗ ██╗      █████╗ ██╗  ██╗\n" +
                "██║ ██╔╝██╔══██╗██║     ██╔══██╗██║  ██║\n" +
                "█████╔╝ ███████║██║     ███████║███████║\n" +
                "██╔═██╗ ██╔══██║██║     ██╔══██║██╔══██║\n" +
                "██║  ██╗██║  ██║███████╗██║  ██║██║  ██║\n" +
                "╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝" );
        System.out.println("------------------");
        System.out.println("1. Começar o Jogo");
        System.out.println("2. Ver Regras");
        System.out.println("0. Sair");
        System.out.println("------------------");
        System.out.print("Por Favor selecionar uma opção (0-2): " + "\n");
    }

    public static void MenuJogadas(NumeroJogador Jogador) {
        if (Jogador == NumeroJogador.UM){
            System.out.println("------------------");
            System.out.println("Jogador " + Jogador + ":");
            System.out.println("Escolha uma casa para mover suas sementes:");
            System.out.println("1. Casa (00)");
            System.out.println("2. Casa (01)");
            System.out.println("3. Casa (02)");
            System.out.println("4. Casa (03)");
            System.out.println("5. Casa (04)");
            System.out.println("6. Casa (05)");
            System.out.println("------------------");
            System.out.print("Digite o número da casa (1-6): " + "\n");
        } else {
            System.out.println("------------------");
            System.out.println("Jogador " + Jogador + ":");
            System.out.println("Escolha uma casa para mover suas sementes:");
            System.out.println("1. Casa (06)");
            System.out.println("2. Casa (07)");
            System.out.println("3. Casa (08)");
            System.out.println("4. Casa (09)");
            System.out.println("5. Casa (10)");
            System.out.println("6. Casa (11)");
            System.out.println("------------------");
            System.out.print("Digite o número da casa (1-6): " + "\n");
        }
    }

    public static void MenuRegras(Scanner scanner){
        int sair = -1;
        while (sair != 0) {
            try {
                System.out.println("------------------");
                System.out.println("1- Para iniciar o jogo distribui-se sementes em cada casa, sendo assim cada casa\n" +
                        "devera conter 4 peças. Os armazéns deverão estar vazios no início do jogo.\n");
                System.out.println("2- Os jogadores fazem suas jogadas alternadamente, procurando sempre acumular sementes em seu\n" +
                        "armazém\n");
                System.out.println("3- Cada jogador, na sua vez, pega todas as sementes em uma das casas do seu lado do tabuleiro,\n" +
                        "colocando-as uma a uma em cada casa seguinte. A direção deverá ser da esquerda para a\n" +
                        "direita.\n");
                System.out.println("4- Um jogador não deverá colocar sementes no armazém do adversário.\n");
                System.out.println("5- Se a última semente colocada cair no armazém do jogador ele tem direito a jogar de novo. Essa\n" +
                        "regra pode se repetir várias vezes numa mesma jogada, basta que a última semente colocada caia \n" +
                        "no armazém várias vezes seguidas.\n");
                System.out.println("6- Se a última semente colocada pelo jogador cair numa casa vazio, do seu lado do tabuleiro, o\n" +
                        "jogador “captura” todas as sementes do adversário que estiverem na casa diretamente oposto ao\n" +
                        "seu e coloca-as no seu armazém. Neste caso o jogador não ganhará outra jogada neste momento.\n");
                System.out.println("7- O jogo termina quando um dos jogadores, na sua vez, não tiver nenhuma semente para\n" +
                        "movimentar. Os jogadores comparam seus armazéns para determinarem quem tem mais sementes e,\n" +
                        "consequentemente, o vencedor.\n");
                System.out.println("0. Voltar");
                System.out.println("------------------");
                System.out.print("Deseja voltar?(0): ");
                sair = scanner.nextInt();

                switch (sair) {
                    case 0:
                        System.out.println("Voltando para o Menu Principal.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Opção inválida.");
                scanner.nextLine();
            }

        }
    }

    public void MenuFinaljogo(Jogo.Status partidaStatus){
        if (partidaStatus == Jogo.Status.JOGADOR_UM_VENCEU ){
            System.out.println("O jogador UM ganhou o Jogo!" );
        } else if (partidaStatus == Jogo.Status.JOGADOR_DOIS_VENCEU) {
            System.out.println("O jogador DOIS ganhou o Jogo!" );
        } else if (partidaStatus == Jogo.Status.EMPATE){
            System.out.println("O Jogo terminou em um Empate" );
        }
    }

    public void MenuRotorno(int valor){
        switch (valor){
            case 1:
                System.out.println("Gostaria de voltar para o Menu Principal?");
                break;
            case 2:
                System.out.println("Retornando para o Menu Principal....");
                break;
            case 0:
                System.out.println("Saindo...");
                break;
        }
    }

    public void MenuErros(int cases){
        switch (cases) {
            case 1:
                System.out.println("Erro ao realizar a jogada. Tente novamente.");
                break;
            case 2:
                System.out.println("Erro ao iniciar o tabuleiro. Tente novamente.");
                break;
            case 3:
                System.out.println("Erro. Tente novamente.");
                break;
            case 4:
                System.out.println("Opção inválida.");
                break;
        }
    }

}
