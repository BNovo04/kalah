package Model.src.View;

public class ITabuleiro {
    public static void TabuleiroInicial() {
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                "▌                                                                                        ▐\n" +
                "▌                                                                                        ▐\n" +
                "▌     ▓▓▓           ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓             ▓▓▓     ▐\n" +
                "▌   ▓▓   ▓▓        ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓          ▓▓   ▓▓   ▐\n" +
                "▌  ▓       ▓      ▓  4  ▓  ▓  4  ▓  ▓  4  ▓  ▓  4  ▓  ▓  4  ▓  ▓  4  ▓        ▓       ▓  ▐\n" +
                "▌  ▓       ▓       ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓         ▓       ▓  ▐\n" +
                "▌ ▓         ▓       ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓         ▓         ▓ ▐\n" +
                "▌ ▓         ▓                                                                ▓         ▓ ▐\n" +
                "▌ ▓    0    ▓                                                                ▓    0    ▓ ▐\n" +
                "▌ ▓         ▓                                                                ▓         ▓ ▐\n" +
                "▌ ▓         ▓        ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓        ▓         ▓ ▐\n" +
                "▌  ▓       ▓        ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓        ▓       ▓  ▐\n" +
                "▌  ▓       ▓       ▓  4  ▓  ▓  4  ▓  ▓  4  ▓  ▓  4  ▓  ▓  4  ▓  ▓  4  ▓       ▓       ▓  ▐\n" +
                "▌   ▓▓   ▓▓         ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓         ▓▓   ▓▓   ▐\n" +
                "▌     ▓▓▓            ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓            ▓▓▓     ▐\n" +
                "▌                                                                                        ▐\n" +
                "▌                                                                                        ▐\n" +
                "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");


    }
    public static void Tabuleirojogo(int S) {
        if (S >= 0 && S <= 9) {
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                        ▐\n" +
                    "▌                                                                                        ▐\n" +
                    "▌     ▓▓▓           ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓             ▓▓▓     ▐\n" +
                    "▌   ▓▓   ▓▓        ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓          ▓▓   ▓▓   ▐\n" +
                    "▌  ▓       ▓      ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓        ▓       ▓  ▐\n" +
                    "▌  ▓       ▓       ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓         ▓       ▓  ▐\n" +
                    "▌ ▓         ▓       ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓         ▓         ▓ ▐\n" +
                    "▌ ▓         ▓                                                                ▓         ▓ ▐\n" +
                    "▌ ▓    " + S + "    ▓                                                                ▓    " + S + "    ▓ ▐\n" +
                    "▌ ▓         ▓                                                                ▓         ▓ ▐\n" +
                    "▌ ▓         ▓        ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓        ▓         ▓ ▐\n" +
                    "▌  ▓       ▓        ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓        ▓       ▓  ▐\n" +
                    "▌  ▓       ▓       ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓       ▓       ▓  ▐\n" +
                    "▌   ▓▓   ▓▓         ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓         ▓▓   ▓▓   ▐\n" +
                    "▌     ▓▓▓            ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓            ▓▓▓     ▐\n" +
                    "▌                                                                                        ▐\n" +
                    "▌                                                                                        ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        } else if (S >= 10 && S <= 48){
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                                ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▌     ▓▓▓▓           ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓             ▓▓▓▓     ▐\n" +
                    "▌   ▓▓    ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓    ▓▓   ▐\n" +
                    "▌  ▓        ▓      ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓        ▓  ▐\n" +
                    "▌ ▓          ▓       ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓         ▓          ▓ ▐\n" +
                    "▌ ▓          ▓                                                                      ▓          ▓ ▐\n" +
                    "▌ ▓    " + S + "    ▓                                                                      ▓    " + S + "    ▓ ▐\n" +
                    "▌ ▓          ▓                                                                      ▓          ▓ ▐\n" +
                    "▌ ▓          ▓        ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓        ▓          ▓ ▐\n" +
                    "▌  ▓        ▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓  ▓  " + S + "  ▓       ▓        ▓  ▐\n" +
                    "▌   ▓▓    ▓▓         ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓▓    ▓▓   ▐\n" +
                    "▌     ▓▓▓▓            ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓            ▓▓▓▓     ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        }
    }
}

