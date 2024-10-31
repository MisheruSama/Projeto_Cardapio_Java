package com.NossaCafeteria.Cardapio;



public class Acai{
    private int tamanho;
    private double preco;

    public Acai(){};
    
    public Acai(int tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco=preco;
    }

    public int gettamanho() {
        return tamanho;
    }

    public void settamanho(int tamanho) {
        this.tamanho=tamanho;
    }
    
    public double getpreco(){
        return preco;
    }
    public void setpreco(double preco){
        this.preco=preco;
    }
}