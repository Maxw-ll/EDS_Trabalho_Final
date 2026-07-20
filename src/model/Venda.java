package model;

import dao.VeiculoDAO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Venda {

    private Integer id_venda;
    private Usuario usuarioComprador;
    private Funcionario funcionarioResponsavel;
    private LocalDate dataVenda;
    private BigDecimal valor_total;

    public Venda(Usuario usuarioComprador, Funcionario funcionarioResponsavel, LocalDate dataVenda, BigDecimal valor_total) {
        this.usuarioComprador = usuarioComprador;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.dataVenda = dataVenda;
        this.valor_total = valor_total;
    }

    //region Gets e Sets
    public Integer getId_venda() {
        return id_venda;
    }

    public void setId_venda(Integer id_venda) {
        this.id_venda = id_venda;
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

    public BigDecimal getValor_total() {
        return valor_total;
    }

    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }
    //endregion


}
