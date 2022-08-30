package com.conversorone.conversores.conversormassa;

import com.conversorone.Calculadora;
import com.conversorone.Conversor;
import com.conversorone.conversores.conversormassa.calculadoras.GramaParaQuilograma;
import com.conversorone.conversores.conversormassa.calculadoras.QuilogramaParaGrama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Massa {
    public static List<Calculadora> calculadoras = new ArrayList<>(
            Arrays.asList(
                 new GramaParaQuilograma(),
                 new QuilogramaParaGrama()
            )
    );

    public static Conversor conversor = new Conversor("Conversor de Massa", calculadoras);
}
