package dao;
import model.Funcionario;

import java.sql.*;
import java.time.LocalDate;

public class FuncionarioDAO {

    public static Funcionario adicionarFuncionario(Funcionario funcionario){

        String sql = """
                INSERT INTO funcionario (id_usuario, data_admissao, salario)
                VALUES (?, ?, ?)
                RETURNING id_funcionario;
                """;

        try(
                Connection cnn = ConexaoBanco.getConexao();
                PreparedStatement statement = cnn.prepareStatement(sql);
                ){
            statement.setInt(1, funcionario.getUsuario().getIdUsuario());
            statement.setDate(2, Date.valueOf(funcionario.getDataAdmissao()));
            statement.setBigDecimal(3, funcionario.getSalario());

            try(ResultSet resultado = statement.executeQuery()){

                if(!resultado.next()){
                    throw new SQLException(
                            "O banco não retornou os dados do funcionário criado"
                    );
                }

                funcionario.setIdFuncionario(resultado.getInt("id_funcionario"));

            }

            System.out.println("Funcionario Adicionado com Sucesso");

            return funcionario;

        } catch(SQLException erro) {

            throw new RuntimeException(
                    "Erro ao adicionar funcionario no banco", erro
            );
        }


    }
}
