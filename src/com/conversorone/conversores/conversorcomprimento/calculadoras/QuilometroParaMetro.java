package com.conversorone.conversores.conversorcomprimento.calculadoras;

import com.conversorone.AbstractCalculadora;

public class QuilometroParaMetro extends AbstractCalculadora {


    @Override
    public void inicializar() {
        nome = "Quilometro para Metro";
    }

    @Override
    public String calcular(double input) {
        var resultado = input * 1000;
        return formatar(String.valueOf(resultado), "metros");
    }

}
