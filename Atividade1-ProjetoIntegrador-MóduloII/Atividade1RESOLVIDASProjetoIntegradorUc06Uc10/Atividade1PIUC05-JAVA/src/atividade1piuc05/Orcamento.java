package atividade1piuc05;

import java.util.Date;
import java.util.List;

public class Orcamento implements AppDAO {

    private int idOrcamento;
    private Date dataOperacao;
    private Date dataEvento;
    private double taxaDomingoFeriado;
    private double frete;
    private double desconto;
    private String observacoes;
    private int idCliente;

    public Orcamento(int idOrcamento, Date dataOperacao, Date dataEvento, double taxaDomingoFeriado, double frete, double desconto, String observacoes, int idCliente) {
        this.idOrcamento = idOrcamento;
        this.dataOperacao = dataOperacao;
        this.dataEvento = dataEvento;
        this.taxaDomingoFeriado = taxaDomingoFeriado;
        this.frete = frete;
        this.desconto = desconto;
        this.observacoes = observacoes;
        this.idCliente = idCliente;

    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public double getTaxaDomingoFeriado() {
        return taxaDomingoFeriado;
    }

    public void setTaxaDomingoFeriado(double taxaDomingoFeriado) {
        this.taxaDomingoFeriado = taxaDomingoFeriado;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public void cadastrar() {
        // código para cadastrar o Orcamento  
    }

    @Override
    public String consultar() {
        // código para consultar o Orcamento
        return "Informações do Orcamento";
    }

    @Override
    public String editar() {
        // código para editar o Orcamento
        return "Orcamento editado";
    }

    @Override
    public int remover() {
        // código para remover o Orcamento
        return 1; // retorna 1 se o Orcamento foi removido com sucesso
    }

    @Override
    public List<Object> listar() {
        // código para remover o Orcamento
        return null; // retorna lista do orcamento
    }

}
