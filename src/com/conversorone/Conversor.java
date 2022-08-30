package com.conversorone;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;
import java.util.Objects;

public class Conversor {

    private final String subTitulo;
    private Object valorDoInput;
    private final List<Calculadora> calculadoras;
    private Calculadora calculadora;

    public Conversor (String subTitulo, List<Calculadora> calculadoras) {
        this.subTitulo = subTitulo;
        this.calculadoras = calculadoras;
    }

    public void inicializar() {
        var label = new JLabel(subTitulo);
        label.setFont(new Font(null, Font.PLAIN, 20));
        label.setBorder(new EmptyBorder(10, 20,10, 20));

        String[] listaDeOpcoes = calculadoras.stream()
                .map(Calculadora::getNomeDaCalculadora)
                .toArray(String[]::new);

        valorDoInput = JOptionPane.showInputDialog(
                null,
                label,
                "Conversor ONE",
                JOptionPane.PLAIN_MESSAGE,
                null,
                listaDeOpcoes,
                listaDeOpcoes[0]);

        if(valorDoInput != null) {
            calculadora = calculadoras.stream()
                    .filter(calc -> calc.getNomeDaCalculadora().equals(valorDoInput))
                    .findFirst()
                    .orElseThrow();

            inicializerForm();
        };

    }

    private void inicializerForm() {
        FormConversor form = new FormConversor((String) valorDoInput, calculadora);
        form.inicializar();
    }

    public String getSubTitulo() {
        return subTitulo;
    }

}
