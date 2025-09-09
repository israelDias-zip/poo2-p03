package org.Model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
      private long id;
      private String nome;
      private String cpf;
      private List<Pagamento> listPagamentos;

    public Funcionario() {
        this.id = 0;
        this.nome = "";
        this.cpf = "";
        this.listPagamentos = new ArrayList<>();
    }

    public Funcionario(long id, String nome, String cpf, List<Pagamento> listPagamentos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.listPagamentos = listPagamentos;
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

    public List<Pagamento> getListPagamentos() {
        return listPagamentos;
    }

    public void setListPagamentos(List<Pagamento> listPagamentos) {
        this.listPagamentos = listPagamentos;
    }
}

