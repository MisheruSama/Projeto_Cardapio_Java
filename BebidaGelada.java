package com.NossaCafeteria.Cardapio;


public class BebidaGelada extends Produto{
    private String tipo;

    public BebidaGelada(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void settipo(String tipo){
        this.tipo=tipo;
    }


}


