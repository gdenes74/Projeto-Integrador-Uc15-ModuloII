
package atividade2piuc05;

import java.util.List;


public interface AppDAO {
    public void cadastrar();
    public String consultar();
    public String editar();
    public int remover();
    public List<Object> listar() ;
}
