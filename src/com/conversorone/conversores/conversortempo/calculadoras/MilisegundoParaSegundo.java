package com.conversorone.conversores.conversortempo.calculadoras;

import com.conversorone.AbstractCalculadora;

public class MilisegundoParaSegundo extends AbstractCalculadora {

    @Override
    public void inicializar() {
        nome = "Milisegundo para segundo";
    }

    @Override
    public String calcular(double input) {
        var resultado = input / 1000;
        return formatar(String.format("%.1f", resultado), "segundo(s)");
    }
}
