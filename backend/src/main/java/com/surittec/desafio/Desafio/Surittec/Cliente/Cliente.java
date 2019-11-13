package com.surittec.desafio.Desafio.Surittec.Cliente;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name="clientes")
@EntityListeners(AuditingEntityListener.class)
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name="nome", nullable = false)
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Somente são permitidos letras, espaços e números")
    private String nome;

    @Column(name="cpf", nullable = false)
    private String CPF;

    @OneToOne(mappedBy = "cliente", cascade = {CascadeType.ALL})
    @JsonManagedReference
    private ClienteEndereco endereco;


    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.ALL})
    @JsonManagedReference
    private List<ClienteTelefone> telefones;

    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.ALL})
    @JsonManagedReference
    private List<ClienteEmail> emails;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @JsonIgnore
    public ClienteEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(ClienteEndereco endereco) {
        this.endereco = endereco;
    }

    public List<ClienteTelefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<ClienteTelefone> telefones) {
        this.telefones = telefones;
    }

    public List<ClienteEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<ClienteEmail> emails) {
        this.emails = emails;
    }
}
