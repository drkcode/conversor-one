package com.conversorone.conversores.conversorcomprimento.calculadoras;

import com.conversorone.AbstractCalculadora;

public class MetroParaCentimetro extends AbstractCalculadora {

    @Override
    public void inicializar() {
        nomeDaCalculadora = "Metro para centrimetro";
    }

    @Override
    public String calcular(double input) {
        var resultado = input * 100;
        return  formatar(String.valueOf((int) resultado), "centimetros");
    }

}
