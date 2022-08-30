package com.conversorone.conversores.conversorcomprimento;

import com.conversorone.Calculadora;
import com.conversorone.Conversor;
import com.conversorone.conversores.conversorcomprimento.calculadoras.CentimetroParaMetro;
import com.conversorone.conversores.conversorcomprimento.calculadoras.MetroParaCentimetro;
import com.conversorone.conversores.conversorcomprimento.calculadoras.MetroParaQuilometro;
import com.conversorone.conversores.conversorcomprimento.calculadoras.QuilometroParaMetro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comprimento {

    public static List<Calculadora> calculadoras = new ArrayList<>(
            Arrays.asList(
                    new CentimetroParaMetro(),
                    new MetroParaCentimetro(),
                    new QuilometroParaMetro(),
                    new MetroParaQuilometro()
            )
    );

    public static Conversor conversor = new Conversor("Conversor de Comprimento", calculadoras);

}
