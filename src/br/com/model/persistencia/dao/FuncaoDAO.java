

package br.com.model.persistencia.dao;

import br.com.model.negocio.Funcao;
import br.com.model.negocio.Funcionario;
import java.util.List;

/**
 *
 * @author Rosicléia Frasson
 */
public interface FuncaoDAO extends DAO<Funcao, Integer>{
      //Asinatura dos metodos
    List<Funcao> getByNome (String nome);
   // Funcao getFuncaoByNome(String nome);
    Funcao getFuncaoByNome(String nome);
}
