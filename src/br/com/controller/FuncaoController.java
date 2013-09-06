

package br.com.controller;

import br.com.model.negocio.Funcao;
import br.com.model.negocio.Funcionario;

import br.com.model.persistencia.FuncaoDAOImpl;
import br.com.model.persistencia.dao.FuncaoDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class FuncaoController {
    
    
     public boolean salvar(Funcao funcao) {
        FuncaoDAO dao = new FuncaoDAOImpl();
       return dao.save(funcao);

    }

    public boolean excluir(int id) {
        FuncaoDAO dao = new FuncaoDAOImpl();
        return dao.remove(Funcao.class, id);

    }
    
    public List<Funcao> listarFuncao() {
        FuncaoDAO dao = new FuncaoDAOImpl();
        return dao.getAll(Funcao.class);
    }
    
    public Funcao listarFuncaoById (int id){
        FuncaoDAO dao = new FuncaoDAOImpl();
        return dao.getById(Funcao.class, id);
    }
    
   public List<Funcao> listarFuncaoByNome (String nome){
        FuncaoDAO dao = new FuncaoDAOImpl();
        return dao.getByNome(nome);
    }       
   public Funcao listaFuncaoByNome (String nome){
       FuncaoDAO dao = new FuncaoDAOImpl();
       return dao.getFuncaoByNome(nome);
   }
        

}
