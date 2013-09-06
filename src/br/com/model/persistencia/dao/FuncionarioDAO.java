

package br.com.model.persistencia.dao;

import br.com.model.negocio.Funcionario;
import br.com.model.negocio.Funcionario;
import java.util.List;

/**
 *
 * @author Rosicléia Frasson
 */
public interface FuncionarioDAO extends DAO<Funcionario, Integer>{
      
    List<Funcionario> getByNome (String nome);
    Funcionario getFuncionarioByNome(String nome);
    Funcionario getFuncionarioByNomeTelefone(String nome, String telefone);
   
   
}
