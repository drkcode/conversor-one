package com.conversorone;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class AbstractCalculadora {

    protected String nomeDaCalculadora;

    public AbstractCalculadora(){
        inicializar();
    }
    public abstract Object calcular(double input);

    public abstract void inicializar();

    public String getNomeDaCalculadora() {
        return nomeDaCalculadora;
    }

    public void setNomeDaCalculadora(String nomeDaCalculadora) {
        this.nomeDaCalculadora = nomeDaCalculadora;
    }

    public String formatarMoeda(double valor, String pais) {
        Locale locale = new Locale("pt", pais);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(valor);
    }

    public String formatar(String resultado, String nomeDaUnidade){
        return String.format("%s %s", resultado, nomeDaUnidade);
    }

}
