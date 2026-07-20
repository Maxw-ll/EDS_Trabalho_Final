package dao;
import model.Venda

import java.sql.Connection;
import java.sql.SQLException;

public class VendaDAO {

    public static  Venda adicionarVenda(Venda venda){


        String sql = """
                INSERT INTO venda (id_usuario_comprador, id_funcionario_comprador, valor_total)
                VALUES(?,?,?)
                RESULTING id_venda;
                """;

        try(
                Connection cnn = ConexaoBanco.getConexao();
                ){

        }catch(SQLException erro){
            throw new RuntimeException("Erro ao inserir Venda", erro);
        }
    }
}
