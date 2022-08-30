package com.conversorone.conversores.conversortemperatura.calculadoras;

import com.conversorone.Calculadora;
import com.conversorone.utils.CotacaoDTO;


public class FahrenheitParaCelsius extends Calculadora {

    CotacaoDTO cotacaoDTO;

    public FahrenheitParaCelsius() {
        inicializar();
    }

    public void inicializar ()  {
        nomeDaCalculadora = "Fahrenheit para Celsius";

    }

    @Override
    public String calcular(double input) {
        var resultado = (input - 32) * (5/9);
        return formatar(resultado, "ºC");
    }

}
