package atividade2piuc05;

import java.util.List;

public class Cliente implements AppDAO {

    private int idCliente;
    private String nomeCliente;
    private String cpf;
    private String cnpj;
    private String endereco;
    private String dataNascimento;
    private String telefone;
    private String email;

    public Cliente(int idCliente, String nomeCliente, String cpf, String cnpj, String endereco, String dataNascimento, String telefone, String email) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void cadastrar() {
        // código para cadastrar Cliente    }
    }

    @Override
    public String consultar() {
        // código para consultar Cliente
        return "Informações do Cliente";
    }

    @Override
    public String editar() {
        // código para editar Cliente
        return "Cliente editado";
    }

    @Override
    public int remover() {
        // código para remover Cliente
        return 1; // retorna 1 se o Cliente foi removido com sucesso
    }

    @Override
    public List<Object> listar() {
        return null; // listar os clientes
    }

}
