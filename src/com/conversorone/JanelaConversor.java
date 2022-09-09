package com.conversorone;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

public class JanelaConversor {

    private final String subTitulo;
    private final List<AbstractCalculadora> calculadoras;
    private String calculadoraSelecionada;
    private AbstractCalculadora calculadora;

    public JanelaConversor(String subTitulo, List<AbstractCalculadora> calculadoras) {
        this.subTitulo = subTitulo;
        this.calculadoras = calculadoras;
    }

    public void inicializar() {
        var label = new JLabel(subTitulo);
        label.setFont(new Font(null, Font.PLAIN, 20));
        label.setBorder(new EmptyBorder(10, 20, 10, 20));

        String[] listaDeOpcoes = calculadoras.stream()
                .map(AbstractCalculadora::getNome)
                .toArray(String[]::new);

        var valorDoInput = JOptionPane.showInputDialog(
                null,
                label,
                "Conversor ONE",
                JOptionPane.PLAIN_MESSAGE,
                null,
                listaDeOpcoes,
                listaDeOpcoes[0]);

        if (valorDoInput == null) return;

        calculadora = calculadoras.stream()
                .filter(calculadora -> calculadora.getNome().equals(valorDoInput))
                .findFirst()
                .orElseThrow();

        calculadoraSelecionada = (String) valorDoInput;
        new JanelaCalculadora(calculadoraSelecionada, calculadora).inicializar();
    }

    public String getSubTitulo() {
        return subTitulo;
    }
}
