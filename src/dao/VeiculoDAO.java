package dao;
import model.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VeiculoDAO {

    public static Veiculo adicionarVeiculo(Veiculo veiculo){


        String sql = """
                INSERT INTO veiculo (id_modelo, chassi, placa, cor, ano_fabricacao, preco, quilometragem)
                VALUES (?,?,?,?,?,?,?)
                RETURNING id_veiculo
                """;

        try(
                Connection cnn = ConexaoBanco.getConexao();
                PreparedStatement statement = cnn.prepareStatement(sql);
                ){
            statement.setInt(1, veiculo.getModelo().getIdModelo());
            statement.setString(2, veiculo.getChassi());
            statement.setString(3, veiculo.getPlaca());
            statement.setString(4, veiculo.getCor());
            statement.setInt(5, veiculo.getAnoFabricacao());
            statement.setBigDecimal(6, veiculo.getPreco());
            statement.setInt(7, veiculo.getQuilometragem());

            try (ResultSet resultado = statement.executeQuery()){

                if(!resultado.next()){
                    throw new SQLException("Banco não retornou os dados do funcionário criado");
                }

                veiculo.setIdVeiculo(resultado.getInt("id_veiculo"));
            }

            System.out.println("Veículo Adicionado com Sucesso");
            return veiculo;


        }catch(SQLException erro){
            throw new RuntimeException("Erro ao adicionar veículo", erro);
        }

    }
}
