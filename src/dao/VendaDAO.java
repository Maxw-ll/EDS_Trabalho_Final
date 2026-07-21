package dao;
import model.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendaDAO {

    public static  Venda adicionarVenda(Venda venda){


        String sql = """
                INSERT INTO venda (id_usuario_comprador, id_funcionario_responsavel, valor_total)
                VALUES(?,?,?)
                RETURNING id_venda;
                """;

        try(
                Connection cnn = ConexaoBanco.getConexao();
                PreparedStatement statement = cnn.prepareStatement(sql);
                ){

            statement.setInt(1, venda.getUsuarioComprador().getIdUsuario());
            statement.setInt(2, venda.getFuncionarioResponsavel().getIdFuncionario());
            statement.setBigDecimal(3, venda.getValorTotal());

            try (ResultSet resultado = statement.executeQuery()){

                if(!resultado.next()){
                    throw new SQLException("Banco nao retornou os dados da venda");
                }

                venda.setIdVenda(resultado.getInt("id_venda"));
                System.out.println("Venda Inserida com Sucesso");
                return venda;

            }

        }catch(SQLException erro){
            throw new RuntimeException("Erro ao inserir Venda", erro);
        }
    }
}
