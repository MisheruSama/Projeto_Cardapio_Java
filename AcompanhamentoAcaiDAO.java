package com.NossaCafeteria.Cardapio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class AcompanhamentoAcaiDAO extends Conexao{
    public List<AcompanhamentoAcai> obterTodosAcompanhamentos() throws Exception{
        List<AcompanhamentoAcai> Acompanhamentos = new ArrayList<>();
        String sql = "SELECT NOME, PRECO FROM ACOMPANHAMENTOS_ACAI";
        try(PreparedStatement statement = getConnection().prepareStatement(sql)){
            try(ResultSet resultAcompanhamentos = statement.executeQuery()){
                while(resultAcompanhamentos.next()){
                    Acompanhamentos.add(new AcompanhamentoAcai(resultAcompanhamentos.getNString("NOME"),
                resultAcompanhamentos.getDouble("PRECO")));
                }
            }
            closeConnection(statement);
        }catch(Exception e){
            System.err.println("Erro ao obter todos os Acompanhamentos");
        }
        return Acompanhamentos;
    }
}
