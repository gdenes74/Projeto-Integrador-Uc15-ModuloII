package atividade1piuc05;

import java.util.List;

public class ItensOrcamento implements AppDAO {

    private int idItensOrcamento;
    private int quantidadeItensOrcamento;
    private Produto produto;
    private Orcamento orcamento;

    public ItensOrcamento(int idItensOrcamento, int quantidadeItensOrcamento, Produto produto, Orcamento orcamento) {
        this.idItensOrcamento = idItensOrcamento;
        this.quantidadeItensOrcamento = quantidadeItensOrcamento;
        this.produto = produto;
        this.orcamento = orcamento;
    }
    public int getIdItensOrcamento() {
        return idItensOrcamento;
    }

    public void setIdItensOrcamento(int idItensOrcamento) {
        this.idItensOrcamento = idItensOrcamento;
    }

    public int getQuantidadeItensOrcamento() {
        return quantidadeItensOrcamento;
    }

    public void setQuantidadeItensOrcamento(int quantidadeItensOrcamento) {
        this.quantidadeItensOrcamento = quantidadeItensOrcamento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
   
    

    @Override
    public void cadastrar() {
         // código para cadastrar ItensOrcamento
    }

    @Override
    public String consultar() {
          // código para consultar ItensOrcamento
        return "Informações ItensOrcamento";
    }

    @Override
    public String editar() {
         // código para editar ItensOrcamento
        return "ItensOrcamento editado";
    }

    @Override
    public int remover() {
        // código para remover ItensOrcamento
        return 1; // retorna 1 se o ItensOrcamento foi removido com sucesso
    }

    @Override
    public List<Object> listar() {
        return null;
    }

    
}
