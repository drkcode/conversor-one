package com.conversorone;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JanelaResultado {

    private String resultado;

    public JanelaResultado(String resultado) {
        this.resultado = resultado;
    }

    public void inicializar() {
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

        var opcaoSelecionada = new JanelaConfirmar("Deseja realizar uma nova conversão?").getOpcaoSelecionada();

        if(opcaoSelecionada != 0) return;

        Application.start();
    }
}
