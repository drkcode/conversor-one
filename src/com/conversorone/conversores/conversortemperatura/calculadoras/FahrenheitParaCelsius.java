package com.conversorone.conversores.conversortemperatura.calculadoras;

import com.conversorone.AbstractCalculadora;
import com.conversorone.utils.CotacaoVO;


public class FahrenheitParaCelsius extends AbstractCalculadora {
    CotacaoVO cotacaoVO;

    public void inicializar ()  {
        nomeDaCalculadora = "Fahrenheit para Celsius";
    }

    @Override
    public String calcular(double input) {
        var resultado = (input - 32) * (5/9);
        return formatar(String.valueOf(resultado), "graus ºC");
    }

}
