package com.conversorone.conversores.conversortemperatura.calculadoras;

import com.conversorone.AbstractCalculadora;
import com.conversorone.utils.CotacaoVO;


public class CelsiusParaFahrenheit extends AbstractCalculadora {

    CotacaoVO cotacaoVO;

    public void inicializar ()  {
        nomeDaCalculadora = "Celsius para Fahrenheit";
    }

    @Override
    public String calcular(double input) {
        var resultado = input * 1.8 + 32;
        return formatar(String.valueOf(resultado), "graus ºF");
    }

}
