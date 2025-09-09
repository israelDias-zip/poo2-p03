package org.Model;

import java.util.List;
import java.util.ArrayList;

public class Cinema {
    private long id;
    private String nome;
    private char CNPJ;
    private String endereco;
    private List<Sala> listSala;

    public Cinema() {
        this.id = 0;
        this.nome = "";
        this.CNPJ = '0';
        this.endereco = "";
        this.listSala = new ArrayList<>();
    }

    public Cinema(long id, String nome, char CNPJ, String endereco, List<Sala> listSala) {
        this.id = id;
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.listSala = listSala;
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

    public char getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(char CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Sala> getListSala() {
        return listSala;
    }

    public void setListSala(List<Sala> listSala) {
        this.listSala = listSala;
    }
}
