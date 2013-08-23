/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testes;

import br.com.model.negocio.Marca;
import br.com.model.persistencia.dao.MarcaDAO;
import br.com.model.persistencia.MarcaDAOImpl;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class InsereMarca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Marca m = new Marca();
        m.setNome("testssse");
        
        MarcaDAO dao = new MarcaDAOImpl();
        dao.save(m);
        
//        em.getTransaction().begin();
//        em.persist(m);
//        em.getTransaction().commit();
//        em.close();
        
    }
}
