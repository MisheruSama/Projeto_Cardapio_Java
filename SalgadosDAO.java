package com.NossaCafeteria.Cardapio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SalgadosDAO extends Conexao{
   public List<Salgados> obterTodosSalgados() throws Exception{
    List<Salgados> Salgado = new ArrayList<>();
    String sql = "SELECT NOME, PRECO, TIPO FROM SALGADOS";
    try(PreparedStatement statement = getConnection().prepareStatement(sql)){
    try(ResultSet resultSalgado = statement.executeQuery()){
        while(resultSalgado.next()){
            Salgado.add(new Salgados(resultSalgado.getString("NOME"),
            resultSalgado.getDouble("PRECO"),
            resultSalgado.getString("TIPO")));
        }
    }
    closeConnection(statement);
    }catch(Exception e){
        System.err.println("Erro ao obter todos os Salgados");
    } 
    return Salgado;
   }
}
