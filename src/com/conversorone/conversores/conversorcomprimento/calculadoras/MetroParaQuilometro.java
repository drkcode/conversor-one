package com.conversorone.conversores.conversorcomprimento.calculadoras;

import com.conversorone.AbstractCalculadora;

public class MetroParaQuilometro extends AbstractCalculadora {
    @Override
    public void inicializar() {
        nome = "Metro para Quilometro";
    }

    @Override
    public String calcular(double input) {
        var resultado = input / 1000;
        return formatar(String.valueOf(resultado), "quilometros");
    }

}
