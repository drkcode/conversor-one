package com.conversorone.conversores.conversormassa.calculadoras;

import com.conversorone.Calculadora;

public class QuilogramaParaGrama extends Calculadora {

    public QuilogramaParaGrama() {
        inicializar();
    }

    @Override
    public void inicializar() {
        nomeDaCalculadora = "Quilograma para Grama";
    }

    @Override
    public String calcular(double input) {
        var resultado = input * 1000;
        return formatar(resultado, "gramas");
    }
}
