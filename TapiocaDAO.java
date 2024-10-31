package com.NossaCafeteria.Cardapio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TapiocaDAO extends Conexao{
    public List<Tapioca> obterTodasTapiocas() throws Exception{
        List<Tapioca> tapiocas = new ArrayList<>();
        String sql = "SELECT SABOR, PRECO FROM TAPIOCA";
        try(PreparedStatement statement = getConnection().prepareStatement(sql)){
        try(ResultSet resultTapioca = statement.executeQuery()){
            while(resultTapioca.next()){
                tapiocas.add(new Tapioca(resultTapioca.getString("SABOR"),
                resultTapioca.getDouble("PRECO")));
            }
        }
        closeConnection(statement);
        }catch(Exception e){
            System.err.println("Erro ao obter todas as Tapiocas");
        }
        return tapiocas;
        }
   
}
