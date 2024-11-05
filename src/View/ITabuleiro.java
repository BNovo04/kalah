package Model.src.View;

import Model.src.Model.Armazem;
import Model.src.Model.Cava;
import Model.src.Model.Tabuleiro;

import java.util.LinkedList;
import java.util.List;

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

    public static Boolean ValorCava(){
        Boolean cava_maior = false;
        Tabuleiro Tabuleiro = new Tabuleiro();
        List<Cava> Cava = Tabuleiro.getCavas();

        for (int i = 0; i > 12; i++){
            int sememtesCava = Cava.get(i).contar();
            if(sememtesCava >= 10 && sememtesCava <= 48){
                cava_maior = true;
                return cava_maior;
            } else if (sememtesCava >= 0 && sememtesCava <= 9){
                cava_maior = false;
                return cava_maior;
            }
        }
        return cava_maior;
    }

    public static Boolean ValorArmazem(){
        Boolean armazem_maior = false;
        Tabuleiro Tabuleiro = new Tabuleiro();
        List<Armazem> Armazem = Tabuleiro.getArmazens();

        for (int i = 0; i > 12; i++){
            int sememtesArmazem = Armazem.get(i).contar();
            if(sememtesArmazem >= 10 && sememtesArmazem <= 48){
                armazem_maior = true;
                return armazem_maior;
            } else if (sememtesArmazem >= 0 && sememtesArmazem <= 9){
                armazem_maior = false;
                return armazem_maior;
            }
        }
        return armazem_maior;
    }

    public static void Tabuleirojogo() {
        Tabuleiro Tabuleiro = new Tabuleiro();
        List<Cava> Cava = Tabuleiro.getCavas();
        List<Armazem> Armazem = Tabuleiro.getArmazens();
        boolean cava = ValorCava();
        boolean armazem = ValorArmazem();

        if (cava == false && armazem == false) {
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                        ▐\n" +
                    "▌                                                                                        ▐\n" +
                    "▌     ▓▓▓           ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓             ▓▓▓     ▐\n" +
                    "▌   ▓▓   ▓▓        ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓          ▓▓   ▓▓   ▐\n" +
                    "▌  ▓       ▓      ▓  " + Cava.get(11) + "  ▓  ▓  " + Cava.get(10) + "  ▓  ▓  " + Cava.get(9) + "  ▓  ▓  " + Cava.get(8) + "  ▓  ▓  " + Cava.get(7) + "  ▓  ▓  " + Cava.get(6) + "  ▓        ▓       ▓  ▐\n" +
                    "▌  ▓       ▓       ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓         ▓       ▓  ▐\n" +
                    "▌ ▓         ▓       ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓         ▓         ▓ ▐\n" +
                    "▌ ▓         ▓                                                                ▓         ▓ ▐\n" +
                    "▌ ▓    " + Armazem.get(1) + "    ▓                                                                ▓    " + Armazem.get(0) + "    ▓ ▐\n" +
                    "▌ ▓         ▓                                                                ▓         ▓ ▐\n" +
                    "▌ ▓         ▓        ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓        ▓         ▓ ▐\n" +
                    "▌  ▓       ▓        ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓        ▓       ▓  ▐\n" +
                    "▌  ▓       ▓       ▓  " + Cava.get(0) + "  ▓  ▓  " + Cava.get(1) + "  ▓  ▓  " + Cava.get(2) + "  ▓  ▓  " + Cava.get(3) + "  ▓  ▓  " + Cava.get(4) + "  ▓  ▓  " + Cava.get(5) + "  ▓       ▓       ▓  ▐\n" +
                    "▌   ▓▓   ▓▓         ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓         ▓▓   ▓▓   ▐\n" +
                    "▌     ▓▓▓            ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓            ▓▓▓     ▐\n" +
                    "▌                                                                                        ▐\n" +
                    "▌                                                                                        ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        } else if (cava == true && armazem == true){
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                                ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▌     ▓▓▓▓           ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓             ▓▓▓▓     ▐\n" +
                    "▌   ▓▓    ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓    ▓▓   ▐\n" +
                    "▌  ▓        ▓      ▓  " + Cava.get(11) + "  ▓  ▓  " + Cava.get(10) + "  ▓  ▓  " + Cava.get(9) + "  ▓  ▓  " + Cava.get(8) + "  ▓  ▓  " + Cava.get(7) + "  ▓  ▓  " + Cava.get(6) + "  ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓        ▓  ▐\n" +
                    "▌ ▓          ▓       ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓         ▓          ▓ ▐\n" +
                    "▌ ▓          ▓                                                                      ▓          ▓ ▐\n" +
                    "▌ ▓    " + Armazem.get(1) + "    ▓                                                                      ▓    " + Armazem.get(0) + "    ▓ ▐\n" +
                    "▌ ▓          ▓                                                                      ▓          ▓ ▐\n" +
                    "▌ ▓          ▓        ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓        ▓          ▓ ▐\n" +
                    "▌  ▓        ▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓  " + Cava.get(0) + "  ▓  ▓  " + Cava.get(1) + "  ▓  ▓  " + Cava.get(2) + "  ▓  ▓  " + Cava.get(3) + "  ▓  ▓  " + Cava.get(4) + "  ▓  ▓  " + Cava.get(5) + "  ▓       ▓        ▓  ▐\n" +
                    "▌   ▓▓    ▓▓         ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓▓    ▓▓   ▐\n" +
                    "▌     ▓▓▓▓            ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓            ▓▓▓▓     ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

        } else if (cava == false && armazem == true){
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                          ▐\n" +
                    "▌                                                                                          ▐\n" +
                    "▌     ▓▓▓▓           ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓             ▓▓▓▓     ▐\n" +
                    "▌   ▓▓    ▓▓        ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓          ▓▓    ▓▓   ▐\n" +
                    "▌  ▓        ▓      ▓  " + Cava.get(11) + "  ▓  ▓  " + Cava.get(10) + "  ▓  ▓  " + Cava.get(9) + "  ▓  ▓  " + Cava.get(8) + "  ▓  ▓  " + Cava.get(7) + "  ▓  ▓  " + Cava.get(6) + "  ▓        ▓       ▓  ▐\n" +
                    "▌  ▓        ▓       ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓         ▓        ▓  ▐\n" +
                    "▌ ▓          ▓       ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓         ▓          ▓ ▐\n" +
                    "▌ ▓          ▓                                                                ▓          ▓ ▐\n" +
                    "▌ ▓    " + Armazem.get(1) + "    ▓                                                                ▓    " + Armazem.get(0) + "    ▓ ▐\n" +
                    "▌ ▓          ▓                                                                ▓          ▓ ▐\n" +
                    "▌ ▓          ▓        ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓        ▓          ▓ ▐\n" +
                    "▌  ▓        ▓        ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓  " + Cava.get(0) + "  ▓  ▓  " + Cava.get(1) + "  ▓  ▓  " + Cava.get(2) + "  ▓  ▓  " + Cava.get(3) + "  ▓  ▓  " + Cava.get(4) + "  ▓  ▓  " + Cava.get(5) + "  ▓       ▓       ▓  ▐\n" +
                    "▌   ▓▓    ▓▓         ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓    ▓   ▓         ▓▓    ▓▓   ▐\n" +
                    "▌     ▓▓▓▓            ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓      ▓▓▓            ▓▓▓▓     ▐\n" +
                    "▌                                                                                          ▐\n" +
                    "▌                                                                                          ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

        } else if (cava == true && armazem == false){
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                              ▐\n" +
                    "▌                                                                                              ▐\n" +
                    "▌     ▓▓▓           ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓             ▓▓▓     ▐\n" +
                    "▌   ▓▓   ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓   ▓▓   ▐\n" +
                    "▌  ▓       ▓      ▓  " + Cava.get(11) + "  ▓  ▓  " + Cava.get(10) + "  ▓  ▓  " + Cava.get(9) + "  ▓  ▓  " + Cava.get(8) + "  ▓  ▓  " + Cava.get(7) + "  ▓  ▓  " + Cava.get(6) + "  ▓        ▓        ▓  ▐\n" +
                    "▌  ▓       ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓       ▓  ▐\n" +
                    "▌ ▓         ▓       ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓         ▓         ▓ ▐\n" +
                    "▌ ▓         ▓                                                                      ▓         ▓ ▐\n" +
                    "▌ ▓    " + Armazem.get(1) + "    ▓                                                                      ▓    " + Armazem.get(0) + "    ▓ ▐\n" +
                    "▌ ▓         ▓                                                                      ▓         ▓ ▐\n" +
                    "▌ ▓         ▓        ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓        ▓         ▓ ▐\n" +
                    "▌  ▓       ▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓        ▓       ▓  ▐\n" +
                    "▌  ▓       ▓       ▓  " + Cava.get(0) + "  ▓  ▓  " + Cava.get(1) + "  ▓  ▓  " + Cava.get(2) + "  ▓  ▓  " + Cava.get(3) + "  ▓  ▓  " + Cava.get(4) + "  ▓  ▓  " + Cava.get(5) + "  ▓       ▓        ▓  ▐\n" +
                    "▌   ▓▓   ▓▓         ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓▓   ▓▓   ▐\n" +
                    "▌     ▓▓▓            ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓            ▓▓▓     ▐\n" +
                    "▌                                                                                              ▐\n" +
                    "▌                                                                                              ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

        }
    }
}


