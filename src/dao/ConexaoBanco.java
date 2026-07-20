package dao;
import java.awt.desktop.SystemEventListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.Console;
public class ConexaoBanco {

    private static final String PORTA = "5432";
    private static final String NOME_BANCO = "banco_oracle";
    private  String url;
    private String usuario;
    private String senha;

    public void ConexaoBanco(){};

    public void configurarConexao(Scanner scanner) {
        System.out.println("Digite o IP da máquina do banco: ");
        String ip = scanner.nextLine().trim();

        if (ip.isEmpty()) {
            ip = "localhost";
        }

        System.out.println("Digite o usario do Postgresql: ");
        usuario = scanner.nextLine().trim();

        Console console = System.console();
        if(console != null){
            char[] senhaDigitada = console.readPassword("Digite a senha: ");
            senha = new String(senhaDigitada);

        } else {
            System.out.println("Digite a senha: ");
            senha = scanner.nextLine().trim();
        }


        url = "jdbc:postgresql://" + ip + ":" + PORTA + "/" + NOME_BANCO;

    }

    public Connection getConexao() throws SQLException{
        return DriverManager.getConnection(url, usuario, senha);
    }

}
