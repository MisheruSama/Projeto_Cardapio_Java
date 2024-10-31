package com.NossaCafeteria.Cardapio;

public class Tapioca {
    private String sabor;
    private double preco;
 
    public Tapioca (String sabor, double preco) {
       this.sabor=sabor;
       this.preco = preco;
    }
 
    public String getsabor() {
       return sabor;
    }
 
    public double getPreco() {
       return preco;
    }
    public void setsabor(String sabor){
      this.sabor=sabor;
    }
    public void setPreco(double preco){
      this.preco=preco;
    }
 }
 