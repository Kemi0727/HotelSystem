package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Responsável por criar a conexão
 * com o banco PostgreSQL.
 */
public class Conexao {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/hotel"; //url

    private static final String USER =
            "postgres"; // usuário

    private static final String PASSWORD =
            "123"; // senha
    /*
    jdbc = protocolo Java
    postgresql = banco utilizado
    localhost = computador local
    5432 = porta padrão do PostgreSQL
    hotel = nome do banco
     */
    public static Connection conectar() throws SQLException {

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}