package org.Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private long id;
    private String nome;
    private String cpf;
    private List<Ingresso> listIngresso;

    public Cliente() {
        this.id = 0;
        this.nome = "";
        this.cpf = "";
        this.listIngresso = new ArrayList<>();
    }

    public Cliente(long id, String nome, String cpf, List<Ingresso> listIngresso) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.listIngresso = listIngresso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Ingresso> getListIngresso() {
        return listIngresso;
    }

    public void setListIngresso(List<Ingresso> listIngresso) {
        this.listIngresso = listIngresso;
    }
}
