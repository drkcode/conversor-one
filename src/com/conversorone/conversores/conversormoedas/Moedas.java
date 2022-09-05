package com.conversorone.conversores.conversormoedas;

import com.conversorone.AbstractCalculadora;
import com.conversorone.JanelaConversor;
import com.conversorone.conversores.conversormoedas.calculadoras.DolarParaReal;
import com.conversorone.conversores.conversormoedas.calculadoras.RealParaDolar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Moedas {

    public static List<AbstractCalculadora> abstractCalculadoras = new ArrayList<>(
            Arrays.asList(
                    new RealParaDolar(),
                    new DolarParaReal()
            )
    );

    public static JanelaConversor janelaConversor = new JanelaConversor("Conversor de Moeda", abstractCalculadoras);

}
