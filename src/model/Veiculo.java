package model;
import java.math.BigDecimal;


public class Veiculo {

    private Integer idVeiculo;
    private Modelo modelo;
    private Venda venda;
    private String chassi;
    private String placa;
    private String cor;
    private BigDecimal preco;
    private Integer quilometragem;
    private String status;

    public Veiculo(Modelo modelo, String chassi, String placa, String cor, BigDecimal preco, Integer quilometragem, Integer anoFabricacao) {
        this.modelo = modelo;
        this.chassi = chassi;
        this.placa = placa;
        this.cor = cor;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.anoFabricacao = anoFabricacao;
    }

    //region Gets e Sets
    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    private Integer anoFabricacao;

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    //endregion

}
