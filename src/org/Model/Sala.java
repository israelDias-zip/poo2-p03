package org.Model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private long id;
    private String numero;
    private int capacidadeSala;
    private List<Sessao> listSessao;

    public Sala() {
        this.id = 0;
        this.numero = "00";
        this.capacidadeSala = 0;
        this.listSessao = new ArrayList<>();
    }

    public Sala(long id, String numero, int capacidadeSala, List<Sessao> listSessao) {
        this.id = id;
        this.numero = numero;
        this.capacidadeSala = capacidadeSala;
        this.listSessao = listSessao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidadeSala() {
        return capacidadeSala;
    }

    public void setCapacidadeSala(int capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }

    public List<Sessao> getListSessao() {
        return listSessao;
    }

    public void setListSessao(List<Sessao> listSessao) {
        this.listSessao = listSessao;
    }
}
