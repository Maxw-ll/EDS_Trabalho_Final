
import dao.ConexaoBanco;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ConexaoBanco cnn = new ConexaoBanco();
        Scanner scn = new Scanner(System.in);

        cnn.configurarConexao(scn);
        try (Connection coneccao = cnn.getConexao()) {

            System.out.println(
                    "Conexão realizada com sucesso!"
            );

        } catch (SQLException erro) {

            System.out.println(
                    "Não foi possível conectar ao banco."
            );

            System.out.println(
                    "Motivo: " + erro.getMessage()
            );


        }
    }
}