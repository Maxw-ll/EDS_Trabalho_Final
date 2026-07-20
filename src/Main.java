import dao.*;
import model.*;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Perfil mika_perf = new Perfil(2, "VENDEDOR");

        Usuario mika = new Usuario(mika_perf, "Mikaell", "12345678442",
                "mika@gmail.com", "Mika123", "(98) 979028922",
                LocalDate.of(2000, 1, 1), "Rua Dois",
                "12", "CO", "Saint Luiz", "Mara", "65000000");
        UsuarioDAO.adicionar(mika);

        Funcionario func_mika = new Funcionario(mika, new BigDecimal("2525.63"), LocalDate.now());

        FuncionarioDAO.adicionarFuncionario(func_mika);
        */


        /*
        Modelo corsa = new Modelo("Corsa Wind", "Chevrolet", 2010);

        ModeloDAO.adicionarModelo(corsa);
        */

        /*

        Modelo uno = new Modelo("Uno", "FIAT", 2009);
        uno.setIdModelo(1);
        //ModeloDAO.adicionarModelo(uno);

        Estoque estoque_uno = new Estoque(uno, 1);
        EstoqueDAO.adicionarEstoque(estoque_uno);
         */

        Modelo uno = new Modelo("Uno", "FIAT", 2009);
        uno.setIdModelo(1);
        Veiculo veiculo = new Veiculo(uno, "647fbamkm7", "KM264NJ", "Roxo", new BigDecimal("12333.45"), 10000, 2011);

        VeiculoDAO.adicionarVeiculo(veiculo);

        System.out.println(veiculo.getIdVeiculo());

        }
    }

