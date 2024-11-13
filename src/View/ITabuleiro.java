package Model.src.View;

import Model.src.Model.Armazem;
import Model.src.Model.Casa;
import Model.src.Model.Tabuleiro;

import java.util.List;

public class ITabuleiro {

    public Boolean valorCasa(List<Casa> Casa){
        Boolean casa_maior = false;
        int i = 0;
        while (i < Casa.size()){
            int sememtesCasa = Casa.get(i).contar();
            if(sememtesCasa >= 10 && sememtesCasa <= 48){
                casa_maior = true;
                return casa_maior;
            }else if (sememtesCasa >= 0 && sememtesCasa <= 9){
                casa_maior = false;
            }
            i++;
        }
        return casa_maior;
    }

    public Boolean valorArmazem(List<Armazem> Armazem){
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

    static String formatacaoNumero(int num) {
        int tamanho = 2;
        return String.format("%-" + tamanho + "d", num);
    }

    public void tabuleiroJogo(Tabuleiro tabuleiro) {
        List<Casa> Casa = tabuleiro.getCasas();
        List<Armazem> Armazem = tabuleiro.getArmazens();
        boolean cava = valorCasa(Casa);
        boolean armazem = valorArmazem(Armazem);

        if (cava == false && armazem == false) {

            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                                ▐\n" +
                    "▌     ▓▓▓▓           ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓             ▓▓▓▓     ▐\n" +
                    "▌   ▓▓    ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓    ▓▓   ▐\n" +
                    "▌  ▓        ▓      ▓  " + formatacaoNumero(Casa.get(11).contar())  +"  ▓  ▓  " + formatacaoNumero(Casa.get(10).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(9).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(8).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(7).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(6).contar())  + "  ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓        ▓  ▐\n" +
                    "▌ ▓          ▓       ▓11▓      ▓10▓      ▓09▓      ▓08▓      ▓07▓      ▓06▓         ▓          ▓ ▐\n" +
                    "▌ ▓    " + formatacaoNumero(Armazem.get(1).contar())  + "    ▓                                                                      ▓    " + formatacaoNumero(Armazem.get(0).contar()) + "    ▓ ▐\n" +
                    "▌ ▓          ▓       ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓         ▓          ▓ ▐\n" +
                    "▌  ▓        ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓        ▓  ▐\n" +
                    "▌  ▓        ▓      ▓  " + formatacaoNumero(Casa.get(0).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(1).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(2).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(3).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(4).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(5).contar())  + "  ▓        ▓        ▓  ▐\n" +
                    "▌   ▓▓    ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓    ▓▓   ▐\n" +
                    "▌     ▓J2▓           ▓00▓      ▓01▓      ▓02▓      ▓03▓      ▓04▓      ▓05▓             ▓J1▓     ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

        } else {

            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "▌                                                                                                ▐\n" +
                    "▌     ▓▓▓▓           ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓             ▓▓▓▓     ▐\n" +
                    "▌   ▓▓    ▓▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓          ▓▓    ▓▓   ▐\n" +
                    "▌  ▓        ▓      ▓  " + formatacaoNumero(Casa.get(11).contar()) +"  ▓  ▓  " + formatacaoNumero(Casa.get(10).contar()) + "  ▓  ▓  " + formatacaoNumero(Casa.get(9).contar()) + "  ▓  ▓  " + formatacaoNumero(Casa.get(8).contar()) + "  ▓  ▓  "+ formatacaoNumero(Casa.get(7).contar()) +"  ▓  ▓  " + formatacaoNumero(Casa.get(6).contar()) + "  ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓        ▓  ▐\n" +
                    "▌ ▓          ▓       ▓11▓      ▓10▓      ▓09▓      ▓08▓      ▓07▓      ▓06▓         ▓          ▓ ▐\n" +
                    "▌ ▓    " + formatacaoNumero(Armazem.get(1).contar())  + "    ▓                                                                      ▓    " + formatacaoNumero(Armazem.get(0).contar())  + "    ▓ ▐\n" +
                    "▌ ▓          ▓        ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓      ▓▓▓▓        ▓          ▓ ▐\n" +
                    "▌  ▓        ▓        ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓        ▓        ▓  ▐\n" +
                    "▌  ▓        ▓       ▓  " + formatacaoNumero(Casa.get(0).contar())  + "  ▓  ▓  " + formatacaoNumero(Casa.get(1).contar()) + "  ▓  ▓  " + formatacaoNumero(Casa.get(2).contar()) + "  ▓  ▓  " + formatacaoNumero(Casa.get(3).contar()) + "  ▓  ▓  " + formatacaoNumero(Casa.get(4).contar()) + "  ▓  ▓  " + formatacaoNumero(Casa.get(5).contar()) + "  ▓       ▓        ▓  ▐\n" +
                    "▌   ▓▓    ▓▓         ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓    ▓         ▓▓    ▓▓   ▐\n" +
                    "▌     ▓J2▓            ▓00▓      ▓01▓      ▓02▓      ▓03▓      ▓04▓      ▓05▓            ▓J1▓     ▐\n" +
                    "▌                                                                                                ▐\n" +
                    "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

        }
    }
}


