package com.NossaCafeteria.Cardapio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SanduicheDAO extends Conexao{
 public List<Sanduiche> obterTodosSanduiches() throws Exception{
    List<Sanduiche> sanduiches = new ArrayList<>();
    String sql = "SELECT NOME, PRECO, DESCRICAO FROM SANDUICHES";
    try(PreparedStatement statement = getConnection().prepareStatement(sql)){
    try(ResultSet resultSanduiche = statement.executeQuery()){
        while(resultSanduiche.next()){
            sanduiches.add(new Sanduiche(resultSanduiche.getString("NOME"),
            resultSanduiche.getDouble("PRECO"),
            resultSanduiche.getString("DESCRICAO")));
        }
    }
    closeConnection(statement);
    }catch(Exception e){
        System.err.println("Erro ao obter todos os Sanduiches");
    }
    return sanduiches;
 }
}