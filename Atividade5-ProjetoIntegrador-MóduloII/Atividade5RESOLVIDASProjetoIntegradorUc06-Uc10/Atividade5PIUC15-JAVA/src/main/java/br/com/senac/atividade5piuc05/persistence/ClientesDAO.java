package br.com.senac.atividade5piuc05.persistence;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ClientesDAO {

    public void cadastrar(Clientes c) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Clientes> listar(String filtroDescricao) {
    EntityManager em = JPAUtil.getEntityManager();
    List<Clientes> clientes = null;
    try {
        String textoQuery = "SELECT c FROM Clientes c WHERE (:Nome_cliente is null OR c.Nome_cliente LIKE :Nome_cliente)";

        Query consulta = em.createQuery(textoQuery);
        consulta.setParameter("Nome_cliente", filtroDescricao.isEmpty() ? null : "%" + filtroDescricao + "%");

        clientes = consulta.getResultList();
    } finally {
        JPAUtil.closeEntityManager();
    }
    return clientes;
}


    public Clientes obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Clientes.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public void atualizar(Clientes c) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(c);
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
            Clientes c = em.find(Clientes.class, id);
            if (c != null) {
                em.getTransaction().begin();
                em.remove(c);
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