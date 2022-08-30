package com.conversorone.conversores.conversormassa.calculadoras;

import com.conversorone.Calculadora;

public class GramaParaQuilograma extends Calculadora {

    public GramaParaQuilograma() {
        inicializar();
    }

    @Override
    public void inicializar() {
        nomeDaCalculadora = "Grama para Quilograma";
    }

    @Override
    public String calcular(double input) {
        var resultado = input / 1000;
        return formatar(resultado, "quilogramas");
    }
}
