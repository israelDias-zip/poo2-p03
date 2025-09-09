package org.Model;

public class Ingresso {
    private long id;
    private Enum tipoIngresso;
    private String fileira;
    private int numCadeira;

    public Ingresso() {
        this.id = 0;
        this.tipoIngresso = null;
        this.fileira = null;
        this.numCadeira = 0;
    }

    public Ingresso(long id, Enum tipoIngresso, String fileira, int numCadeira) {
        this.id = id;
        this.tipoIngresso = tipoIngresso;
        this.fileira = fileira;
        this.numCadeira = numCadeira;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enum getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(Enum tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public int getNumCadeira() {
        return numCadeira;
    }

    public void setNumCadeira(int numCadeira) {
        this.numCadeira = numCadeira;
    }
}
