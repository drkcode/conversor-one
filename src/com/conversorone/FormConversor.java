package com.conversorone;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FormConversor {

    private final String subTitulo;

    private Calculadora calculadora;

    private String valorDoInput;

    private String resultado;

    public FormConversor(String subTitulo, Calculadora calculadora) {
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

        calcular();
    }

    public void calcular() {
        resultado = calculadora.calcular(Double.parseDouble(valorDoInput)).toString();
        mostrarResultado();
    }

    public void mostrarResultado() {
        var labelSubtitulo = new JLabel("Resultado: ");
        labelSubtitulo.setFont(new Font(null, Font.BOLD, 15));
        labelSubtitulo.setBorder(new EmptyBorder(10, 0, 20, 0));

        var labelRotuloDoCampo = new JLabel(resultado);
        labelRotuloDoCampo.setFont(new Font(null, Font.PLAIN, 15));

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 0, 20, 0));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(labelSubtitulo);
        panel.add(labelRotuloDoCampo);
        JOptionPane.showMessageDialog(
                null,
                panel,
                "Conversor ONE",
                JOptionPane.PLAIN_MESSAGE);

        Application.start();
    }
}
