

package br.com.model.persistencia;

import br.com.model.persistencia.dao.DAO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author Rosicléia Frasson
 */
public abstract class DAOImpl<T, I extends Serializable> implements DAO<T, I>{
    
    private ConnectionFactory conexao;
    
    public T save (T entity){
        T saved = null;
        
        getEntityManager().getTransaction().begin();
        saved = getEntityManager().merge(entity);
        getEntityManager().getTransaction().commit();
        return saved;
    }
    
    public void remove (T entity){
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(entity);
        getEntityManager().getTransaction().commit();
    }
    
    public T getById(Class<T> classe, I pk){
        try{
            return getEntityManager().find(classe, pk);
            
        }catch (NoResultException e){
            return null;
        }
    }
    
    public List<T> getAll (Class<T> classe){
        return getEntityManager().createQuery("select o from " + classe.getSimpleName() + " o").getResultList();
    }
    
    public EntityManager getEntityManager(){
        if ( conexao == null){
            conexao = new ConnectionFactory();
        }
        return conexao.getEntityManager();
    }
    

}
