package com.vitoroliveira.rvlistafilmes.model;

public class FilmItem {
    private String nome;
    private String ano;
    private String descricao;
    private int Img;

    public FilmItem(String nome, String ano, String descricao, int img) {
        this.nome = nome;
        this.ano = ano;
        this.descricao = descricao;
        Img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }
}
