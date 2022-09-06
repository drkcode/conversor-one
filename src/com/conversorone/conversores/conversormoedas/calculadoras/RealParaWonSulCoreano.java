package com.conversorone.conversores.conversormoedas.calculadoras;

import com.conversorone.AbstractCalculadora;
import com.conversorone.utils.Cotacao;
import com.conversorone.utils.CotacaoVO;

import javax.swing.*;


public class RealParaWonSulCoreano extends AbstractCalculadora {
    CotacaoVO cotacaoVO;

    public void inicializar ()  {
        try {
            cotacaoVO = new Cotacao("BRL", "KRW").get();
            nomeDaCalculadora = cotacaoVO.getName();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Algo deu errado.");
        }

    }

    @Override
    public String calcular(double input) {
        Double total = cotacaoVO.getBid() * input;
        return formatar(String.format("%.2f", total), "won sul coreano");
    }
}
