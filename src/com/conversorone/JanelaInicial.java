package com.conversorone;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class JanelaInicial {

    private final JanelaConversor[] listaDeConversores;

    private String opcaoSelecionada;

    public JanelaInicial(JanelaConversor[] listaDeConversores) {
        this.listaDeConversores = listaDeConversores;
    }

    public void inicializar() {
        var label = new JLabel("O que deseja converter?");
        label.setFont(new Font(null, Font.PLAIN, 20));
        label.setBorder(new EmptyBorder(10, 20,20, 20));

        String[] opcoes = Arrays.stream(listaDeConversores)
                .map(JanelaConversor::getSubTitulo).toArray(String[]::new);

        var valorDoInput = JOptionPane.showInputDialog(
                null,
                label,
                "Conversor ONE",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if(valorDoInput == null) return;
        opcaoSelecionada = (String) valorDoInput;
        inicializarConversor();
    }

    private void inicializarConversor() {
        try {
            JanelaConversor janelaConversor = Arrays.stream(listaDeConversores)
                    .filter(c -> c.getSubTitulo().equals(opcaoSelecionada)).findFirst().orElseThrow();

            janelaConversor.inicializar();
        } catch (NoSuchElementException e) {
            JOptionPane.showMessageDialog(null,
                    "Conversor não encontrado",
                    "Conversor ONE",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
