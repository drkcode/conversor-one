package com.conversorone.conversores.conversortemperatura.calculadoras;

import com.conversorone.AbstractCalculadora;


public class CelsiusParaFahrenheit extends AbstractCalculadora {

    public void inicializar ()  {
        nome = "Celsius para Fahrenheit";
    }

    @Override
    public String calcular(double input) {
        var resultado = input * 1.8 + 32;
        return formatar(String.valueOf(resultado), "graus ºF");
    }

}
