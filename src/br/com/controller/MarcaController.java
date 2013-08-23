

package br.com.controller;

import br.com.model.negocio.Marca;
import br.com.model.persistencia.MarcaDAOImpl;
import br.com.model.persistencia.dao.MarcaDAO;
import java.util.List;




/**
 *
 * @author Rosicléia Frasson
 */
public class MarcaController {
    
    
     public void salvar(Marca marca) {
        MarcaDAO dao = new MarcaDAOImpl();
        dao.save(marca);

    }



    public void excluir(Marca m) {
        MarcaDAO dao = new MarcaDAOImpl();
        dao.remove(m);

    }
    
    public List<Marca> listarMarca() {
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.getAll(Marca.class);
    }
    
    public Marca listarMarcaById (int id){
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.getById(Marca.class, id);
    }
    
   public List<Marca> listarMarcasByNome (String nome){
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.getByNome(nome);
    }
     
   public Marca listarMarcaByNome (String nome){
       MarcaDAO dao = new MarcaDAOImpl();
       return dao.getMarcaByNome(nome);
   }
        

}
