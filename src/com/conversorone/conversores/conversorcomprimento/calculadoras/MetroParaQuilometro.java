package com.conversorone.conversores.conversorcomprimento.calculadoras;

import com.conversorone.Calculadora;

public class MetroParaQuilometro extends Calculadora {

    public MetroParaQuilometro() {
        inicializar();
    }

    @Override
    public void inicializar() {
        nomeDaCalculadora = "Metro para Quilometro";
    }

    @Override
    public Object calcular(double input) {
        var resultado = input / 1000;
        return formatar(resultado, "quilometros");
    }

}
