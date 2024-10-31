package com.NossaCafeteria.Cardapio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public  class CafeDAO extends Conexao{
    public List<Cafe> obterTodosCafes() throws Exception{
        String sql = "SELECT NOME, PRECO, TIPO FROM CAFE";
        List<Cafe> Cafes = new ArrayList<>();
        try(PreparedStatement statement = getConnection().prepareStatement(sql)){
        try(ResultSet resultCafe = statement.executeQuery()){
            while(resultCafe.next()){
                Cafes.add(new Cafe(resultCafe.getString("NOME"),
                resultCafe.getDouble("PRECO"),
                resultCafe.getString("TIPO")));
            }
        }
        closeConnection(statement);
        }catch(Exception e){
            System.err.println("Erro ao obter todos os Cafés");
        }
        return Cafes;
    }

}
