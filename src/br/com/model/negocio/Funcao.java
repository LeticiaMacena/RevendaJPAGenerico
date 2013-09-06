

package br.com.model.negocio;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Rosicléia Frasson
 */
@Entity
public class Funcao implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    

    @Override
    public String toString() {
        return   nome ;
    }

    public Funcao() {
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
}