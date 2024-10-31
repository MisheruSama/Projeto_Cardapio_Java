package com.NossaCafeteria.Cardapio;

public class Sanduiche extends Produto{
    private String descricao;

    public Sanduiche(){};

    public Sanduiche(String nome, double preco, String descricao){
        super(nome, preco);
        this.descricao=descricao;
    }
    public String getdescricao(){
        return descricao;
    }
    public void setdescricao(String descricao){
        this.descricao=descricao;
    }
    
}
