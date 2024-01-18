package atividade1piuc05;

import java.util.List;

public class Produto implements AppDAO {

    private int idProduto;
    private String nomeProduto;
    private int quantidadeProduto;
    private String descricao;
    private double valorUnitarioProduto;

    public Produto(int idProduto, String nomeProduto, int quantidadeProduto, String descricao, double valorUnitarioProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.descricao = descricao;
        this.valorUnitarioProduto = valorUnitarioProduto;

    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(double valorUnitarioLocacao) {
        this.valorUnitarioProduto = valorUnitarioLocacao;
    }


    @Override
    public void cadastrar() {
    }

    @Override
    public String consultar() {
        return "Informações do produto";
    }

    @Override
    public String editar() {
        return "Produto editado";
    }

    @Override
    public int remover() {
// código para remover o produto
        return 1; // retorna 1 se o produto foi removido com sucesso
    }

    @Override
    public List<Object> listar() {
        return null; // listar produtos

    }
}
