package com.conversorone.conversores.conversorcomprimento.calculadoras;

import com.conversorone.AbstractCalculadora;

public class CentimetroParaMetro extends AbstractCalculadora {
    @Override
    public void inicializar() {
        nomeDaCalculadora = "Centimetro para metros";
    }

    @Override
    public String calcular(double input) {
        var resultado = input / 100;
        return formatar(String.format("%.1f", resultado), "metros");
    }
}
