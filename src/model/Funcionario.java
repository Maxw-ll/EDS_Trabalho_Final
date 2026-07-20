package model;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private Usuario usuario;
    private Integer idFuncionario;
    private BigDecimal salario;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;

    public Funcionario(Usuario usuario, BigDecimal salario, LocalDate dataAdmissao){
        this.usuario = usuario;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    };


    //region Gets e Sets
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    //endregion

}
