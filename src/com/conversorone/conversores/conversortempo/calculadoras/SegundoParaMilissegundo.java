package com.conversorone.conversores.conversortempo.calculadoras;

import com.conversorone.AbstractCalculadora;

public class SegundoParaMilissegundo extends AbstractCalculadora {

    @Override
    public void inicializar() {
        nome = "Segundo para Milissegundo";
    }

    @Override
    public String calcular(double input) {
        var resultado = input * 1000;
        return formatar(String.format("%.0f", resultado), "milissegundos");
    }
}
