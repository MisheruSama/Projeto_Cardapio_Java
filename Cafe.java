package com.NossaCafeteria.Cardapio;

public class Cafe extends Produto{
    private String tipo;
    
    public Cafe(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void SetTipo(String tipo){
        this.tipo=tipo;
    }

    
}



