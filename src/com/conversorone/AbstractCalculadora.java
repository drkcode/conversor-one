package com.conversorone;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class AbstractCalculadora {

    protected String nome;

    public AbstractCalculadora(){
        inicializar();
    }

    public abstract String calcular(double input);

    public abstract void inicializar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String formatar(double resultado, String pais) {
        Locale locale = new Locale("pt", pais);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(resultado);
    }

    public String formatar(String resultado, String nomeDaUnidade){
        return String.format("%s %s", resultado, nomeDaUnidade);
    }
}
