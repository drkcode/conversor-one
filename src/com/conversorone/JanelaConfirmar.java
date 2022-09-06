package com.conversorone;

import javax.swing.*;

public class JanelaConfirmar {
    private int opcaoSelecionada;

    public JanelaConfirmar(String mensagem) {
        opcaoSelecionada = JOptionPane.showConfirmDialog(null,
                mensagem,
                "Conversor One",
                JOptionPane.YES_NO_OPTION);
    }


    public int getOpcaoSelecionada() {
        return opcaoSelecionada;
    }
}
