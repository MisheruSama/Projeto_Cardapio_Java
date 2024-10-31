package com.NossaCafeteria.Cardapio;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class AcaiDAO extends Conexao{
    public List<Acai> obterAcais() throws Exception{
        List<Acai> Acais = new ArrayList<>();
        String sql = "SELECT TAMANHO, PRECO FROM ACAI";
        try(PreparedStatement statement = getConnection().prepareStatement(sql)){
            try(ResultSet resultAcai = statement.executeQuery()){
            while(resultAcai.next()){
                Acais.add(new Acai(resultAcai.getInt("TAMANHO"),
                resultAcai.getDouble("PRECO")));
            }
            }
        }catch(Exception e){
        }    
        return Acais;
    }
}
