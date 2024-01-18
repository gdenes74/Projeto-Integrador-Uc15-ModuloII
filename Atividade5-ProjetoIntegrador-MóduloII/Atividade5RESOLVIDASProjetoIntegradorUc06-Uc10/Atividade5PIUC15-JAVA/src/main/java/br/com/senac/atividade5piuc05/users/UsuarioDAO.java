package br.com.senac.atividade5piuc05.users;

import br.com.senac.atividade5piuc05.persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class UsuarioDAO {

    public Usuario validaLogin(String login, String password) {
        Usuario user = null;
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Usuario> consulta = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :loginPar AND u.senha = :senhaPar", Usuario.class);
            consulta.setParameter("loginPar", login);
            consulta.setParameter("senhaPar", Criptografia.getMD5(password)); // Aplica criptografia na senha

            user = consulta.getSingleResult();
        } catch (Exception e) {
            System.out.println("Erro na validação: " + e.getMessage());
        } finally {
            em.close(); // Fecha o EntityManager
        }

        return user;
    }

    public void cadastrar(Usuario u) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Usuario> listar(String filtroDescricao) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Usuario> usuarios = null;
        try {
            String textoQuery = "SELECT c FROM Clientes c WHERE (:Nome_cliente is null OR c.Nome_cliente LIKE :Nome_cliente)";

            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("Nome_cliente", filtroDescricao.isEmpty() ? null : "%" + filtroDescricao + "%");

            usuarios = consulta.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
        return usuarios;
    }

    public Usuario obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void atualizar(Usuario u) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Usuario u = em.find(Usuario.class, id);
            if (u != null) {
                em.getTransaction().begin();
                em.remove(u);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

}
