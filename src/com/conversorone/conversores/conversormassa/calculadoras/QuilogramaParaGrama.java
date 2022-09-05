package com.conversorone.conversores.conversormassa.calculadoras;

import com.conversorone.AbstractCalculadora;

public class QuilogramaParaGrama extends AbstractCalculadora {

    @Override
    public void inicializar() {
        nomeDaCalculadora = "Quilograma para Grama";
    }

    @Override
    public String calcular(double input) {
        var resultado = (int) input * 1000;
        return formatar(String.valueOf(resultado), "gramas");
    }
}
