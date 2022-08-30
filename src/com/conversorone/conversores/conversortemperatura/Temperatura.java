package com.conversorone.conversores.conversortemperatura;

import com.conversorone.Calculadora;
import com.conversorone.Conversor;
import com.conversorone.conversores.conversortemperatura.calculadoras.CelsiusParaFahrenheit;
import com.conversorone.conversores.conversortemperatura.calculadoras.FahrenheitParaCelsius;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temperatura {

    public static List<Calculadora> calculdoras = new ArrayList<>(
            Arrays.asList(
                    new CelsiusParaFahrenheit(),
                    new FahrenheitParaCelsius()
            )
    );

    public static Conversor conversor = new Conversor("Conversor de Temperatura", calculdoras);

}
