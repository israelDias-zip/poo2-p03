package org.Model;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private long id;
    private String titulo;
    private int duracao;
    private String genero;
    private List<Sessao> listSessao;

    public Filme() {
        this.id = 0;
        this.titulo = "";
        this.duracao = 0;
        this.genero = "";
        this.listSessao = new ArrayList<>();
    }

    public Filme(long id, String titulo, int duracao, String genero, List<Sessao> listSessao) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.listSessao = listSessao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Sessao> getListSessao() {
        return listSessao;
    }

    public void setListSessao(List<Sessao> listSessao) {
        this.listSessao = listSessao;
    }
}
