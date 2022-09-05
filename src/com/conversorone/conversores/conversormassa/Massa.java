package com.conversorone.conversores.conversormassa;

import com.conversorone.AbstractCalculadora;
import com.conversorone.JanelaConversor;
import com.conversorone.conversores.conversormassa.calculadoras.GramaParaQuilograma;
import com.conversorone.conversores.conversormassa.calculadoras.QuilogramaParaGrama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Massa {
    public static List<AbstractCalculadora> abstractCalculadoras = new ArrayList<>(
            Arrays.asList(
                 new GramaParaQuilograma(),
                 new QuilogramaParaGrama()
            )
    );

    public static JanelaConversor janelaConversor = new JanelaConversor("Conversor de Massa", abstractCalculadoras);
}
