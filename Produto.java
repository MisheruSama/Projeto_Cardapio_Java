package com.NossaCafeteria.Cardapio;



public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(){}

    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    public String getnome(){
        return nome;
    }
    public double getpreco(){
        return preco;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public void setpreco(double preco){
        this.preco=preco;
    }

}
