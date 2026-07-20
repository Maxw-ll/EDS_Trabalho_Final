package model;

public class Estoque {

    private Modelo modelo;
    private Integer quantidadeDisponivel;

    public Estoque(Modelo modelo, Integer quantidadeDisponivel){
        this.modelo = modelo;
        this.quantidadeDisponivel = quantidadeDisponivel;
    };

    //region Gets e Sets

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    //endregion
}
