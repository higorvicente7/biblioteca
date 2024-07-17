package org.example.entity;

public class Autores {

    private String nomeAutor;
    private String paisOrigem;
    private String dataNasc;
    private String biografia;

    public Autores(String nomeAutor, String paisOrigem, String dataNasc, String biografia) {
        this.nomeAutor = nomeAutor;
        this.paisOrigem = paisOrigem;
        this.dataNasc = dataNasc;
        this.biografia = biografia;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
