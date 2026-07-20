package dao;

import dao.ConexaoBanco;
import model.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class UsuarioDAO {

    public static Usuario adicionar(Usuario usuario) {
        //DELETE
        String sql = """
                INSERT INTO usuario(
                id_perfil, nome_usuario, cpf, email, senha_hash, telefone, data_nascimento, logradouro, 
                numero, bairro, cidade, estado, cep)
                VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)
                RETURNING id_usuario, data_criacao, ativo;
                """;

        try (
                Connection cnn = ConexaoBanco.getConexao();
                PreparedStatement statement = cnn.prepareStatement(sql);
        ) {
            statement.setInt(
                    1,
                    usuario.getPerfil().getIdPerfil()
            );

            statement.setString(
                    2,
                    usuario.getNomeUsuario()
            );

            statement.setString(
                    3,
                    usuario.getCpf()
            );

            statement.setString(
                    4,
                    usuario.getEmail()
            );

            statement.setString(
                    5,
                    usuario.getSenhaHash()
            );

            statement.setString(
                    6,
                    usuario.getTelefone()
            );

            statement.setDate(
                    7,
                    Date.valueOf(usuario.getDataNascimento())
            );

            statement.setString(
                    8,
                    usuario.getLogradouro()
            );

            statement.setString(
                    9,
                    usuario.getNumero()
            );

            statement.setString(
                    10,
                    usuario.getBairro()
            );

            statement.setString(
                    11,
                    usuario.getCidade()
            );

            statement.setString(
                    12,
                    usuario.getEstado()
            );

            statement.setString(
                    13,
                    usuario.getCep()
            );

            try (ResultSet resultado = statement.executeQuery()) {

                if (!resultado.next()) {
                    throw new SQLException(
                            "O banco não retornou os dados do usuário criado."
                    );
                }

                usuario.setIdUsuario(
                        resultado.getInt("id_usuario")
                );

                usuario.setDataCriacao(
                        resultado
                                .getTimestamp("data_criacao")
                                .toLocalDateTime()
                );

                usuario.setAtivo(
                        resultado.getBoolean("ativo")
                );
            }

            System.out.println("Usuario Adicionado com Sucesso");

            return usuario;
        } catch (SQLException erro) {
            throw new RuntimeException(
                    "Erro ao adicionar usuário no banco.",
                    erro
            );
        }
    }
}
