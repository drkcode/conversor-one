package com.conversorone.conversores.conversormoedas;

import com.conversorone.Calculadora;
import com.conversorone.Conversor;
import com.conversorone.conversores.conversormoedas.calculadoras.DolarParaReal;
import com.conversorone.conversores.conversormoedas.calculadoras.RealParaDolar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Moedas {

    public static List<Calculadora> calculadoras = new ArrayList<>(
            Arrays.asList(
                    new RealParaDolar(),
                    new DolarParaReal()
            )
    );

    public static Conversor conversor = new Conversor("Conversor de Moeda", calculadoras);

}
