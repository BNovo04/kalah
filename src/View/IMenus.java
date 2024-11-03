package Model.src.View;

public class IMenus {
    public static void displayMenu() {
        System.out.println("\n" +
                "██╗  ██╗ █████╗ ██╗      █████╗ ██╗  ██╗\n" +
                "██║ ██╔╝██╔══██╗██║     ██╔══██╗██║  ██║\n" +
                "█████╔╝ ███████║██║     ███████║███████║\n" +
                "██╔═██╗ ██╔══██║██║     ██╔══██║██╔══██║\n" +
                "██║  ██╗██║  ██║███████╗██║  ██║██║  ██║\n" +
                "╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝\n" +
                "                                        \n");
        System.out.println("------------------");
        System.out.println("1. Começar o Jogo");
        System.out.println("2. Ver Regras");
        System.out.println("3. Sair");
        System.out.println("------------------");
        System.out.print("Por Favor selecionar uma opção (1-3): " + "\n");
    }

}
