package com.conversorone.conversores.conversormassa.calculadoras;

import com.conversorone.AbstractCalculadora;

public class GramaParaQuilograma extends AbstractCalculadora {

    @Override
    public void inicializar() {
        nome = "Grama para Quilograma";
    }

    @Override
    public String calcular(double input) {
        var resultado = input / 1000;
        return formatar(String.format("%.1f", resultado), "quilogramas");
    }
}
