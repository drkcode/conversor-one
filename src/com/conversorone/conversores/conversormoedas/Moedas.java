package com.conversorone.conversores.conversormoedas;

import com.conversorone.AbstractCalculadora;
import com.conversorone.JanelaConversor;
import com.conversorone.conversores.conversormoedas.calculadoras.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Moedas {

    public static List<AbstractCalculadora> abstractCalculadoras = new ArrayList<>(
            Arrays.asList(
                    new RealParaDolar(),
                    new RealParaLibra(),
                    new RealParaEuro(),
                    new RealParaWonSulCoreano(),
                    new RealParaPesoArgentino(),
                    new RealParaPesoChileno(),
                    new DolarParaReal(),
                    new LibraParaReal(),
                    new EuroParaReal(),
                    new WonSulCoreanoParaReal(),
                    new PesoArgentinoParaReal(),
                    new PesoChilenoParaReal()
            )
    );

    public static JanelaConversor janelaConversor = new JanelaConversor("Conversor de Moeda", abstractCalculadoras);

}
