package br.com.senac.atividade5piuc05.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private String login;
    private String senha;
    private String tipo;
    private Integer id_permissoes;

    // a classe ComboItem
    public class ComboItem {

        private Integer id_permissoes;
        private String texto;

        public ComboItem(Integer id_permissoes, String texto) {
            this.id_permissoes = id_permissoes;
            this.texto = texto;
        }

        public ComboItem(int i, String gerente_geral) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public ComboItem(int i, String gerente_geral) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public ComboItem(int i, String gerente) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public ComboItem(int i, String usuário) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Integer getId_permissoes() {
            return id_permissoes;
        }

        public String getTexto() {
            return texto;
        }

        @Override
        public String toString() {
            return texto;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getId_permissoes() {
        return id_permissoes;
    }

    public void setId_permissoes(Integer id_permissoes) {
        this.id_permissoes = id_permissoes;
    }

}
