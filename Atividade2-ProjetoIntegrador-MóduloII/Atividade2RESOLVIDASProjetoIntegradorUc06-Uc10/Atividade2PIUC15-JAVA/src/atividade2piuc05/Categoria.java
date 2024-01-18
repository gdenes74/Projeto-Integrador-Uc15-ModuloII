
package atividade2piuc05;

import java.util.List;


public class Categoria implements AppDAO{
    // Atributos
    private int idCategoria;
    private String descricao;

    public Categoria(int idCategoria, String descricao) {
        this.idCategoria = idCategoria;
        this.descricao = descricao;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public void cadastrar() {
        // código para cadastrar a Categoria
    }

    @Override
    public String consultar() {
        //código para consultar a categoria
       return "Informações da Categoria";
    }

    @Override
    public String editar() {
        //código para editar a categoria
        return "Categoria editado";
    }

    @Override
    public int remover() {
        // código para remover a Categoria
        return 1; // retorna 1 se a Categoria foi removido com sucesso
    }

    @Override
    public List<Object> listar() {
        return null; //listar as categorias
    }
}
  
  