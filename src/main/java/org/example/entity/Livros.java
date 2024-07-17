package org.example.entity;

public class Livros {

    private String titulo;
    private String anoPub;
    private String genero;
    private int qtdDisponivel;

    public Livros(String titulo, String anoPub, String genero, int qtdDisponivel) {
        this.titulo = titulo;
        this.anoPub = anoPub;
        this.genero = genero;
        this.qtdDisponivel = qtdDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(String anoPub) {
        this.anoPub = anoPub;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }
}
