

package br.com.controller;

import br.com.model.negocio.Automovel;
import br.com.model.persistencia.AutomovelDAO;
import br.com.model.persistencia.AutomovelDAOJDBC;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class AutomovelController {
    
    
     public void cadastrar(Automovel automovel) {
        AutomovelDAO dao = new AutomovelDAOJDBC();
        dao.inserir(automovel);

    }

    public void atualizar(Automovel automovel) {
        AutomovelDAO dao = new AutomovelDAOJDBC();
        dao.atualizar(automovel);

    }

    public void excluir(int id) {
        AutomovelDAO dao = new AutomovelDAOJDBC();
        dao.remover(id);

    }
    
    public List<Automovel> listarAutomovel() {
        AutomovelDAO dao = new AutomovelDAOJDBC();
        return dao.getAutomovels();
    }
    
    public Automovel listarAutomovelById (int id){
        AutomovelDAO dao = new AutomovelDAOJDBC();
        return dao.getAutomovelsById(id);
    }
    
   public List<Automovel> listarAutomovelByAno (String ano){
        AutomovelDAO dao = new AutomovelDAOJDBC();
        return dao.getAutomovelsByAno(ano);
    }
   
   public Automovel listarAutomovelByAnoPreco(int anoFabricacao, int anoModelo, String observacoes){
       AutomovelDAO dao = new AutomovelDAOJDBC();
       return dao.getAutomovelByAnoPreco(anoFabricacao, anoModelo, observacoes);
   }
        
        

}
