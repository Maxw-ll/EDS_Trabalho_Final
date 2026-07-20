package model;

public class Modelo {

    private Integer idModelo;
    private String nomeModelo;
    private String marca;
    private Integer anoModelo;

    public Modelo(String nomeModelo, String marca, Integer anoModelo){
        this.nomeModelo = nomeModelo;
        this.marca = marca;
        this.anoModelo = anoModelo;
    };

    //region Gets e Sets
    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }
    //endregion
}
