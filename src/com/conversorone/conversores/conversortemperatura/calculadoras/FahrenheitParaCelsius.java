package com.conversorone.conversores.conversortemperatura.calculadoras;

import com.conversorone.AbstractCalculadora;

public class FahrenheitParaCelsius extends AbstractCalculadora {

    public void inicializar ()  {
        nome = "Fahrenheit para Celsius";
    }

    @Override
    public String calcular(double input) {
        var resultado = (input - 32) * (5/9);
        return formatar(String.valueOf(resultado), "graus ºC");
    }

}
