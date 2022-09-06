package com.conversorone.conversores.conversormoedas.calculadoras;

import com.conversorone.AbstractCalculadora;
import com.conversorone.utils.Cotacao;
import com.conversorone.utils.CotacaoVO;

import javax.swing.*;


public class WonSulCoreanoParaReal extends AbstractCalculadora {
    CotacaoVO cotacaoVO;

    public void inicializar ()  {
        try {
            cotacaoVO = new Cotacao("BRL", "KRW").get();
            nomeDaCalculadora = "Won Sul-Coreano/Real Brasileiro";
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Algo deu errado.");
        }

    }

    @Override
    public String calcular(double input) {
        Double total = input / cotacaoVO.getBid();
        return formatar(String.format("%.2f", total), "reais");
    }
}
