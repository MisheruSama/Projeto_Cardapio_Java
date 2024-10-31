package com.NossaCafeteria.Cardapio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public abstract class Conexao{
    protected Connection getConnection() throws Exception{
      Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/cardapio", "root", "Misheru010@");
    }
    protected void closeConnection(PreparedStatement statement)throws Exception{
       statement.close();
    }
}



