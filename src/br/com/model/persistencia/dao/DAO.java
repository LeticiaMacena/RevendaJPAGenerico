/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public interface DAO <T, I extends Serializable> {
    //entidade. T colocar qualquer tipo de objeto
    public boolean save (T entity);
    //chave primaria
    public boolean remove (Class<T> classe, I pk);
    
    public T getById (Class<T> classe, I pk);
    
    public List<T> getAll (Class<T> classe);
    
    public EntityManager getEntityManager();
    
}
