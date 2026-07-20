package dao;

import model.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModeloDAO {


    public static Modelo adicionarModelo(Modelo modelo){

        String sql = """
                INSERT INTO modelo (nome_modelo, marca, ano_modelo)
                VALUES (?,?,?)
                RETURNING id_modelo;
                """;

        try(
                Connection cnn = ConexaoBanco.getConexao();
                PreparedStatement statement = cnn.prepareStatement(sql);
                ) {

            statement.setString(1, modelo.getNomeModelo());
            statement.setString(2, modelo.getMarca());
            statement.setInt(3, modelo.getAnoModelo());

            try(
                    ResultSet resultado = statement.executeQuery();
                    ){
                if(!resultado.next()){
                    throw new SQLException(
                      "O banco não retornou os dados do Modelo criado"
                    );
                }

                modelo.setIdModelo(resultado.getInt("id_modelo"));

            }

            System.out.println("Modelo Adicionado com sucesso");
            return modelo;

        } catch (
            SQLException erro
        ) {
            throw new RuntimeException(
              "Erro ao adicionar Modelo no Banco", erro
            );
        }

    }
}
