package br.com.model.persistencia;

import br.com.model.negocio.Funcao;
import br.com.model.persistencia.dao.FuncaoDAO;
import br.com.model.negocio.Funcao;
import br.com.model.negocio.Funcionario;
import br.com.model.persistencia.dao.FuncaoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 *
 * @author Rosicléia Frasson
 */
public class FuncaoDAOImpl extends DAOImpl<Funcao, Integer> implements FuncaoDAO {

   
       public List<Funcao> getByNome (String nome){
        return getEntityManager().createQuery("select m from Funcao m where m.nome like '%" + nome + "%'").getResultList();
    }
     
      public Funcao getFuncaoByNome(String nome) {
        Query q = getEntityManager().createQuery("select m from Funcao m where m.nome like '" + nome + "'", Funcao.class);
        List<Funcao> funcoes = q.getResultList();
        Funcao ma = new Funcao();
        for (Funcao m : funcoes) {
            ma = m;
        }
        return ma;

    }
 
   
}

  