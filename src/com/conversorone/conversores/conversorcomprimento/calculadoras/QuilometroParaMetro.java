package com.conversorone.conversores.conversorcomprimento.calculadoras;

import com.conversorone.Calculadora;

public class QuilometroParaMetro extends Calculadora {

    public QuilometroParaMetro() {
        inicializar();
    }

    @Override
    public void inicializar() {
        nomeDaCalculadora = "Quilometro para Metro";
    }

    @Override
    public String calcular(double input) {
        var resultado = input * 1000;
        return formatar(resultado, "metros");
    }

}
