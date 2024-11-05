package Model.src.View;

import Model.src.Model.Armazem;
import Model.src.Model.Cava;
import Model.src.Model.Tabuleiro;

import java.util.LinkedList;
import java.util.List;

public class ITabuleiro {

    public static Boolean ValorCava(List<Cava> Cava){
        Boolean cava_maior = false;
        int i = 0;
        while (i < Cava.size()){
            int sememtesCava = Cava.get(i).contar();
            if(sememtesCava >= 10 && sememtesCava <= 48){
                cava_maior = true;
                return cava_maior;
            }else if (sememtesCava >= 0 && sememtesCava <= 9){
                cava_maior = false;
            }
            i++;
        }
        return cava_maior;
    }

    public static Boolean ValorArmazem(List<Armazem> Armazem){
        Boolean armazem_maior = false;
        int i = 0;
            while (i < Armazem.size()){
                int sememtesArmazem = Armazem.get(i).contar();
                if(sememtesArmazem >= 10 && sememtesArmazem <= 48){
                    armazem_maior = true;
                    return armazem_maior;
                } else if (sememtesArmazem >= 0 && sememtesArmazem <= 9){
                    armazem_maior = false;
                }
                i++;
            }
        return armazem_maior;
    }

    static String formatNumber(int num) {
        int width = 2;
        return String.format("%-" + width + "d", num); // Left-align numbers within a fixed width
    }

    public static void Tabuleirojogo(Tabuleiro tabuleiro) {
        List<Cava> Cava = tabuleiro.getCavas();
        List<Armazem> Armazem = tabuleiro.getArmazens();
        boolean cava = ValorCava(Cava);
        boolean armazem = ValorArmazem(Armazem);

        if (cava == false && armazem == false) {

            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                                ▐\n" +
                    "▌     ▓▓▓▓           ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓             ▓▓▓▓     ▐\n" +
                    "▌   ▓▓    ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓    ▓▓   ▐\n" +
                    "▌  ▓        ▓      ▓  " + formatNumber(Cava.get(11).contar())  +"  ▓  ▓  " + formatNumber(Cava.get(10).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(9).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(8).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(7).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(6).contar())  + "  ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓        ▓  ▐\n" +
                    "▌ ▓          ▓       ▓11▓      ▓10▓      ▓09▓      ▓08▓      ▓07▓      ▓06▓         ▓          ▓ ▐\n" +
                    "▌ ▓    " + formatNumber(Armazem.get(1).contar())  + "    ▓                                                                      ▓    " + formatNumber(Armazem.get(0).contar()) + "    ▓ ▐\n" +
                    "▌ ▓          ▓       ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓         ▓          ▓ ▐\n" +
                    "▌  ▓        ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓        ▓  ▐\n" +
                    "▌  ▓        ▓      ▓  " + formatNumber(Cava.get(0).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(1).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(2).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(3).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(4).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(5).contar())  + "  ▓        ▓        ▓  ▐\n" +
                    "▌   ▓▓    ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓    ▓▓   ▐\n" +
                    "▌     ▓J2▓           ▓00▓      ▓01▓      ▓02▓      ▓03▓      ▓04▓      ▓05▓             ▓J1▓     ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

        } else {

            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                                ▐\n" +
                    "▌     ▓▓▓▓           ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓             ▓▓▓▓     ▐\n" +
                    "▌   ▓▓    ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓    ▓▓   ▐\n" +
                    "▌  ▓        ▓      ▓  " + formatNumber(Cava.get(11).contar()) +"  ▓  ▓  " + formatNumber(Cava.get(10).contar()) + "  ▓  ▓  " + formatNumber(Cava.get(9).contar()) + "  ▓  ▓  " + formatNumber(Cava.get(8).contar()) + "  ▓  ▓  "+ formatNumber(Cava.get(7).contar()) +"  ▓  ▓  " + formatNumber(Cava.get(6).contar()) + "  ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓        ▓  ▐\n" +
                    "▌ ▓          ▓       ▓11▓      ▓10▓      ▓09▓      ▓08▓      ▓07▓      ▓06▓         ▓          ▓ ▐\n" +
                    "▌ ▓    " + formatNumber(Armazem.get(1).contar())  + "    ▓                                                                      ▓    " + formatNumber(Armazem.get(0).contar())  + "    ▓ ▐\n" +
                    "▌ ▓          ▓        ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓        ▓          ▓ ▐\n" +
                    "▌  ▓        ▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓  " + formatNumber(Cava.get(0).contar())  + "  ▓  ▓  " + formatNumber(Cava.get(1).contar()) + "  ▓  ▓  " + formatNumber(Cava.get(2).contar()) + "  ▓  ▓  " + formatNumber(Cava.get(3).contar()) + "  ▓  ▓  " + formatNumber(Cava.get(4).contar()) + "  ▓  ▓  " + formatNumber(Cava.get(5).contar()) + "  ▓       ▓        ▓  ▐\n" +
                    "▌   ▓▓    ▓▓         ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓▓    ▓▓   ▐\n" +
                    "▌     ▓J2▓            ▓00▓      ▓01▓      ▓02▓      ▓03▓      ▓04▓      ▓05▓            ▓J1▓     ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

        }
    }
}


