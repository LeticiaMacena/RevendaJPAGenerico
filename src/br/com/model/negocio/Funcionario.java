package br.com.model.negocio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Rosicléia Frasson
 */
@Entity
public class Funcionario implements Comparable<Funcionario>, Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNacimento;
    private String login;
    private boolean permisao;
    private String sexo;
    private String senha;
 
    
    @ManyToOne
    @JoinColumn(name = "idfuncao", referencedColumnName = "id")
    private Funcao funcao;

    public Funcionario() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Date  dataNacimento) {
        this.dataNacimento = dataNacimento;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean getPermisao() {
        return permisao;
    }

    public void setPermisao(boolean permisao) {
        this.permisao = permisao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    
    @Override
    public int compareTo(Funcionario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}

