package com.conversorone.conversores.conversortemperatura;

import com.conversorone.AbstractCalculadora;
import com.conversorone.JanelaConversor;
import com.conversorone.conversores.conversortemperatura.calculadoras.CelsiusParaFahrenheit;
import com.conversorone.conversores.conversortemperatura.calculadoras.FahrenheitParaCelsius;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temperatura {

    public static List<AbstractCalculadora> calculdoras = new ArrayList<>(
            Arrays.asList(
                    new CelsiusParaFahrenheit(),
                    new FahrenheitParaCelsius()
            )
    );

    public static JanelaConversor janelaConversor = new JanelaConversor("Conversor de Temperatura", calculdoras);

}
