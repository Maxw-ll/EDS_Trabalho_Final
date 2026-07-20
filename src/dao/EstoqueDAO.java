package dao;
import model.Estoque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstoqueDAO {

    public static void adicionarEstoque(Estoque estoque){
        String sql = """
                INSERT INTO estoque (id_modelo, quantidade_disponivel)
                VALUES (?, ?)
                """;
        try(
                Connection cnn = ConexaoBanco.getConexao();
                PreparedStatement statement = cnn.prepareStatement(sql);
        ){
            statement.setInt(1, estoque.getModelo().getIdModelo());
            statement.setInt(2, estoque.getQuantidadeDisponivel());


            int linhas_afetadas = statement.executeUpdate();
            if(linhas_afetadas == 0){
                throw new SQLException("Nenhum estoque adicionado");
            }
            System.out.println("Estoque adicionado com sucesso");

        } catch (SQLException erro){
            throw new RuntimeException("Erro ao inserir estoque.", erro);
        }
    }
}
