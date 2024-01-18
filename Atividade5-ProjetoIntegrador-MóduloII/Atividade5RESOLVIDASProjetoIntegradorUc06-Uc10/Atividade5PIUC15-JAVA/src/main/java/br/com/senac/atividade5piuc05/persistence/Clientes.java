package br.com.senac.atividade5piuc05.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Guilherme Denes
 */
@Entity
@Table(name="Clientes")
//anotando que essa classe vai utilizar no bancodados. @ = anotações
public class Clientes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private int id_Clientes;
    private String Nome_cliente;
    private String Cpf;
    private String Cnpj;
    @Column(name = "Endereço")
    private String Endereco;
    private LocalDate Data_nascimento;
    private String e_mail;
    private String Fone;

    public int getId_Clientes() {
        return id_Clientes;
    }

    public void setId_Clientes(int id_Clientes) {
        this.id_Clientes = id_Clientes;
    }

    public String getNome_cliente() {
        return Nome_cliente;
    }

    public void setNome_cliente(String Nome_cliente) {
        this.Nome_cliente = Nome_cliente;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereço(String Endereço) {
        this.Endereco = Endereço;
    }

    public LocalDate getData_nascimento() {
        return Data_nascimento;
    }

    public void setData_nascimento(LocalDate Data_nascimento) {
        this.Data_nascimento = Data_nascimento;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }
    
    

}
