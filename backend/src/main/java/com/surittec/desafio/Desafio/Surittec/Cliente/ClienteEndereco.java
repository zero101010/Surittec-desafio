package com.surittec.desafio.Desafio.Surittec.Cliente;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="cliente_endereco")
@EntityListeners(AuditingEntityListener.class)
public class ClienteEndereco {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name="cep", nullable = false)
    private String cep;

    @Column(name="logradouro", nullable = false)
    private String logradouro;

    @Column(name="bairro", nullable = false)
    private String bairro;

    @Column(name="cidade", nullable = false)
    private String cidade;

    @Column(name="uf", nullable = false)
    private String uf;

    @OneToOne()
    private Cliente cliente;

    public long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
