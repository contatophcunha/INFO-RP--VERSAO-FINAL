/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author PH Cunha
 */
public class ModuloConexao {

    //METODO RESPONSAVEL POR ESTABELECER A CONEXAO COM O BANCO DE DADOS
    public static Connection conector() {
        java.sql.Connection conexao = null;

        // a linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";

        //armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";

        //estabelecendo conexao com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro
            //System.out.println("BANCO DE DADOS DESCONECTADO");
            return null;
        }

    }
}
