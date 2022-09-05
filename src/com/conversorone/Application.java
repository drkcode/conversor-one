package com.conversorone;

import com.conversorone.conversores.conversorcomprimento.Comprimento;
import com.conversorone.conversores.conversormassa.Massa;
import com.conversorone.conversores.conversormoedas.Moedas;
import com.conversorone.conversores.conversortemperatura.Temperatura;
import com.conversorone.conversores.conversortempo.Tempo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Application {

    public static JanelaConversor[] listaDeConversores = {
            Moedas.janelaConversor,
            Comprimento.janelaConversor,
            Temperatura.janelaConversor,
            Massa.janelaConversor,
            Tempo.janelaConversor
    };

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        UIManager.put("OptionPane.border", new EmptyBorder(10, 30, 10, 30));
        var menuPrincipal = new JanelaInicial(listaDeConversores);
        menuPrincipal.inicializar();
    }

}
