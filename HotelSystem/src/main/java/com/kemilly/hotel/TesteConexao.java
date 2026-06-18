package com.kemilly.hotel;

import com.kemilly.hotel.utils.Conexao;

/*
 * Classe utilizada para testar
 * a conexão com o banco.
 */
public class TesteConexao {

    public static void main(String[] args) {

        try {

            Conexao.conectar();

            System.out.println(
                    "Conexão realizada com sucesso!"
            );

        } catch (Exception e) {

            System.out.println(
                    "Erro ao conectar!"
            );

            e.printStackTrace();
        }
    }
}