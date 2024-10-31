package com.NossaCafeteria.Cardapio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DocesDAO extends Conexao{
    public List<Doces> obterTodosDoces() throws Exception{
        List<Doces> Doces = new ArrayList<>();
        String sql = "SELECT NOME, PRECO, TIPO FROM DOCES";
        try(PreparedStatement statement = getConnection().prepareStatement(sql)){
        try(ResultSet resultDoces = statement.executeQuery()){
            while(resultDoces.next()){
                Doces.add(new Doces(resultDoces.getString("NOME"),
                resultDoces.getDouble("PRECO")));
            }
        }
        closeConnection(statement);
        } catch (Exception e) {
            System.err.println("Erro ao obter todos os Doces");
        }
        return Doces;
    }

}
