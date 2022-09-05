package com.conversorone.conversores.conversorcomprimento;

import com.conversorone.AbstractCalculadora;
import com.conversorone.JanelaConversor;
import com.conversorone.conversores.conversorcomprimento.calculadoras.CentimetroParaMetro;
import com.conversorone.conversores.conversorcomprimento.calculadoras.MetroParaCentimetro;
import com.conversorone.conversores.conversorcomprimento.calculadoras.MetroParaQuilometro;
import com.conversorone.conversores.conversorcomprimento.calculadoras.QuilometroParaMetro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comprimento {

    public static List<AbstractCalculadora> abstractCalculadoras = new ArrayList<>(
            Arrays.asList(
                    new CentimetroParaMetro(),
                    new MetroParaCentimetro(),
                    new QuilometroParaMetro(),
                    new MetroParaQuilometro()
            )
    );

    public static JanelaConversor janelaConversor = new JanelaConversor("Conversor de Comprimento", abstractCalculadoras);

}
