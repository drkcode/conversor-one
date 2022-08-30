package com.conversorone.conversores.conversorcomprimento.calculadoras;

import com.conversorone.Calculadora;

public class CentimetroParaMetro extends Calculadora {

    public CentimetroParaMetro() {
        inicializar();
    }

    @Override
    public void inicializar() {
        nomeDaCalculadora = "Centimetro para metros";
    }

    @Override
    public String calcular(double input) {
        var resultado = input / 100;
        return formatar(resultado, "metros");
    }
}
