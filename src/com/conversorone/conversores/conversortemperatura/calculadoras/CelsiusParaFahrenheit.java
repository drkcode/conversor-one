package com.conversorone.conversores.conversortemperatura.calculadoras;

import com.conversorone.Calculadora;
import com.conversorone.utils.Cotacao;
import com.conversorone.utils.CotacaoDTO;

import javax.swing.*;


public class CelsiusParaFahrenheit extends Calculadora {

    CotacaoDTO cotacaoDTO;

    public CelsiusParaFahrenheit() {
        inicializar();
    }

    public void inicializar ()  {
        nomeDaCalculadora = "Celsius para Fahrenheit";

    }

    @Override
    public String calcular(double input) {
        var resultado = input * 1.8 + 32;
        return formatar(resultado, "ºF");
    }

}
