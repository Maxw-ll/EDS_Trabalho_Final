package model;

import dao.VeiculoDAO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Venda {

    private Integer idVenda;
    private Usuario usuarioComprador;
    private Funcionario funcionarioResponsavel;
    private LocalDate dataVenda;
    private BigDecimal valorTotal;

    public Venda(Usuario usuarioComprador, Funcionario funcionarioResponsavel,  BigDecimal valorTotal) {
        this.usuarioComprador = usuarioComprador;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.valorTotal = valorTotal;
    }


    //region Gets e Sets

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    //endregion
}
