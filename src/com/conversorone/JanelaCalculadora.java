package com.conversorone;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JanelaCalculadora {

    private final String subTitulo;

    private AbstractCalculadora calculadora;

    private String valorDoInput;

    private String resultado;

    public JanelaCalculadora(String subTitulo, AbstractCalculadora calculadora) {
        this.subTitulo = subTitulo;
        this.calculadora = calculadora;
    }

    public void inicializar() {
        var labelSubtitulo = new JLabel(subTitulo);
        var labelRotuloDoCampo = new JLabel("Valor para a conversão:");
        labelSubtitulo.setFont(new Font(null, Font.PLAIN, 20));
        labelSubtitulo.setBorder(new EmptyBorder(10, 0, 20, 0));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(labelSubtitulo);
        panel.add(labelRotuloDoCampo);

        valorDoInput = JOptionPane.showInputDialog(
                null,
                panel,
                "Conversor ONE",
                JOptionPane.PLAIN_MESSAGE
        );

        if (valorDoInput == null) return;

        calcular();
    }

    public void calcular() {
        try {
            resultado = String.valueOf(calculadora.calcular(Double.parseDouble(valorDoInput)));
            new JanelaResultado(resultado).inicializar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados incorretos. Informe apenas numeros");
            inicializar();
        }
    }

}
