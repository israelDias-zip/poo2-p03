package org.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {
    private long id;
    private LocalDateTime horarioSessao;
    private Date dataSessao;
    private Enum status;
    private List<Ingresso> listIngresso;


    public Sessao() {
        this.id = 0;
        this.horarioSessao = LocalDateTime.now();
        this.dataSessao = new Date();
        this.status = null;
        this.listIngresso = new ArrayList<>();
    }

    public Sessao(long id, LocalDateTime horarioSessao, Date dataSessao, Enum status, List<Ingresso> listIngresso) {
        this.id = id;
        this.horarioSessao = horarioSessao;
        this.dataSessao = dataSessao;
        this.status = status;
        this.listIngresso = listIngresso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getHorarioSessao() {
        return horarioSessao;
    }

    public void setHorarioSessao(LocalDateTime horarioSessao) {
        this.horarioSessao = horarioSessao;
    }

    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public List<Ingresso> getListIngresso() {
        return listIngresso;
    }

    public void setListIngresso(List<Ingresso> listIngresso) {
        this.listIngresso = listIngresso;
    }
}
