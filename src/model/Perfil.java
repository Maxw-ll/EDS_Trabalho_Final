package model;

public class Perfil {
    private Integer idPerfil;
    private String nomePerfil;

    public Perfil(){}
    public Perfil(Integer idPerfil, String nomePerfil){
        this.idPerfil = idPerfil;
        this.nomePerfil = nomePerfil;
    }

    //GETS ANS SETS
    public String getNomePerfil() {
        return nomePerfil;
    }
    public Integer getIdPerfil() {
        return idPerfil;
    }
    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    @Override
    public String toString(){
        return nomePerfil;
    }
}
