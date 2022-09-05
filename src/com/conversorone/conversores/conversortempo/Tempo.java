package com.conversorone.conversores.conversortempo;

import com.conversorone.AbstractCalculadora;
import com.conversorone.JanelaConversor;
import com.conversorone.conversores.conversortempo.calculadoras.MilisegundoParaSegundo;
import com.conversorone.conversores.conversortempo.calculadoras.SegundoParaMilissegundo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tempo {

    public static List<AbstractCalculadora> calculdoras = new ArrayList<>(
            Arrays.asList(
               new MilisegundoParaSegundo(),
               new SegundoParaMilissegundo()
            )
    );

    public static JanelaConversor janelaConversor = new JanelaConversor("Conversor de Tempo", calculdoras);

}
