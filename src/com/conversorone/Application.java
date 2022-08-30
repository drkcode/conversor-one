package com.conversorone;

import com.conversorone.conversores.conversorcomprimento.Comprimento;
import com.conversorone.conversores.conversormassa.Massa;
import com.conversorone.conversores.conversormoedas.Moedas;
import com.conversorone.conversores.conversortemperatura.Temperatura;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Application {


    public static Conversor[] listaDeConversores = {
            Moedas.conversor,
            Comprimento.conversor,
            Temperatura.conversor,
            Massa.conversor
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
