package org.Model;

public class Pagamento {
    private long id;
    private String metodoPagamento;
    private double valorIngresso;
    private double valorPagamento;

    public Pagamento() {
        this.id = 0;
        this.metodoPagamento = "";
        this.valorIngresso = 0;
        this.valorPagamento = 0;
    }

    public Pagamento(long id, String metodoPagamento, double valorIngresso, double valorPagamento) {
        this.id = id;
        this.metodoPagamento = metodoPagamento;
        this.valorIngresso = valorIngresso;
        this.valorPagamento = valorPagamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
}
