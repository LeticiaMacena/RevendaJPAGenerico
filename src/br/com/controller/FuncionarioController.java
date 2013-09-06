

package br.com.controller;

import br.com.model.negocio.Funcionario;
import br.com.model.persistencia.FuncionarioDAOImpl;
import br.com.model.persistencia.dao.FuncionarioDAO;
import java.util.List;




/**
 *
 * @author Rosicléia Frasson
 */
public class FuncionarioController {
    
    
     public boolean salvar(Funcionario funcionario) {
        FuncionarioDAO dao = new FuncionarioDAOImpl();
        return dao.save(funcionario);
    }

    public boolean excluir(int id) {
        FuncionarioDAO dao = new FuncionarioDAOImpl();
        return dao.remove(Funcionario.class, id);
    } 
    
    public List<Funcionario> listarFuncionario() {
        FuncionarioDAO dao = new FuncionarioDAOImpl();
        return dao.getAll(Funcionario.class);
    }
    
    public Funcionario listarFuncionarioById (int id){
        FuncionarioDAO dao = new FuncionarioDAOImpl();
        return dao.getById(Funcionario.class, id);
    }
    
   public List<Funcionario> listarFuncionarioByNome (String nome){
        FuncionarioDAO dao = new FuncionarioDAOImpl();
        return dao.getByNome(nome);
    }
   public Funcionario listaFuncionarioByNomeTelefone(String nome, String telefone){
       FuncionarioDAO dao = new FuncionarioDAOImpl();
       return dao.getFuncionarioByNomeTelefone(nome, telefone);
   }
      

}
