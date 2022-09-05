package com.conversorone;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

public class JanelaConversor {

    private final String subTitulo;
    private final List<AbstractCalculadora> abstractCalculadoras;
    private Object valorDoInput;
    private AbstractCalculadora abstractCalculadora;

    public JanelaConversor(String subTitulo, List<AbstractCalculadora> abstractCalculadoras) {
        this.subTitulo = subTitulo;
        this.abstractCalculadoras = abstractCalculadoras;
    }

    public void inicializar() {
        var label = new JLabel(subTitulo);
        label.setFont(new Font(null, Font.PLAIN, 20));
        label.setBorder(new EmptyBorder(10, 20, 10, 20));

        String[] listaDeOpcoes = abstractCalculadoras.stream()
                .map(AbstractCalculadora::getNomeDaCalculadora)
                .toArray(String[]::new);

        valorDoInput = JOptionPane.showInputDialog(
                null,
                label,
                "Conversor ONE",
                JOptionPane.PLAIN_MESSAGE,
                null,
                listaDeOpcoes,
                listaDeOpcoes[0]);

        if (valorDoInput != null) {
            abstractCalculadora = abstractCalculadoras.stream()
                    .filter(calc -> calc.getNomeDaCalculadora().equals(valorDoInput))
                    .findFirst()
                    .orElseThrow();

            inicializerForm();
        }

    }

    private void inicializerForm() {
        JanelaFormConversor form = new JanelaFormConversor((String) valorDoInput, abstractCalculadora);
        form.inicializar();
    }

    public String getSubTitulo() {
        return subTitulo;
    }

}
