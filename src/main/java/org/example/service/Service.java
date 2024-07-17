package org.example.service;

import org.example.config.ConnectionFactory;
import org.example.entity.record.Livros;

import java.sql.Connection;

public class Service {

    private ConnectionFactory connection;

    public Service() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarLivro(Livros livros){
        Connection conn = connection.recoverConnection();
        new Dao(conn).salvar(livros);
    }
}
