package com.conversorone.conversores.conversorcomprimento.calculadoras;

import com.conversorone.Calculadora;

public class MetroParaCentimetro extends Calculadora {

    public MetroParaCentimetro() {
        inicializar();
    }

    @Override
    public void inicializar() {
        nomeDaCalculadora = "Metro para centrimetro";
    }

    @Override
    public String calcular(double input) {
        var resultado = input * 100;
        return  formatar(resultado, "centimetros");
    }

}
