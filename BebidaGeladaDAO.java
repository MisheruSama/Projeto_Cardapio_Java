package com.NossaCafeteria.Cardapio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BebidaGeladaDAO extends Conexao{
    public List<BebidaGelada> ObterTodasBebidas() throws Exception{
        List<BebidaGelada> Bebidas = new ArrayList<>();
        String sql = "SELECT NOME, PRECO, TIPO FROM BEBIDA_GELADA";
        try(PreparedStatement statement = getConnection().prepareStatement(sql)){
            try(ResultSet resultBebidas = statement.executeQuery()){
                while(resultBebidas.next()){
                    Bebidas.add(new BebidaGelada(resultBebidas.getString("NOME"),
                    resultBebidas.getDouble("PRECO"),
                    resultBebidas.getString("TIPO")));
                }
            }
            closeConnection(statement);
        }catch(Exception e){
            System.err.println("Erro ao obter todas as Bebidas Geladas");
        }
        return Bebidas;
    }

}
