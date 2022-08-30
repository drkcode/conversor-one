package com.conversorone.conversores.conversormoedas.calculadoras;

import com.conversorone.Calculadora;
import com.conversorone.utils.Cotacao;
import com.conversorone.utils.CotacaoDTO;

import javax.swing.*;


public class RealParaDolar extends Calculadora {

    CotacaoDTO cotacaoDTO;

    public RealParaDolar() {
        inicializar();
    }

    public void inicializar ()  {
        try {
            cotacaoDTO = new Cotacao("BRL", "USD").get();
            nomeDaCalculadora = cotacaoDTO.getName();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Algo deu errado.");
        }

    }

    @Override
    public String calcular(double input) {
        Double total = cotacaoDTO.getBid() * input;
        return formatar(total, "US");
    }
}
