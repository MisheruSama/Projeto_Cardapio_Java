package com.NossaCafeteria.Cardapio;

public class Salgados extends Produto {
    
    //atributos
    String tipo;

    public Salgados(String nome, double preco, String tipo){
        super(nome, preco);
        this.tipo=tipo;
    }

    //getterSetters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
