package org.example.service;

import org.example.entity.record.Livros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {

    private Connection conn;

    public Dao(Connection connection) {
        this.conn = connection;
    }

    public void salvar(Livros dados){
        var livros = new org.example.entity.Livros(dados);

        String sql = "INSERT INTO livros ()"
                + "VALUES (?, ?, ?, ?, ?, ?, ? ,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql); //prepara a consulta no BD

            //define os valores
            ps.setInt(1, livros.getCodInep());
            ps.setString(2, livros.getLocalizacao());
            ps.setString(3, livros.getNomeEscola());
            ps.setString(4, livros.getEndereco());
            ps.setString(5, livros.getLogradouro());
            ps.setInt(6, livros.getCep());
            ps.setString(7, livros.getDiretorNome());
            ps.setString(8, livros.getSecretarioNome());

            ps.execute(); //executa a instrução
            ps.close(); //fecha o ps
            conn.close(); //fecha a conexão

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}


