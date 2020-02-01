/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.SancionesPartidos;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author carlosballadares
 */
@Named("SancionesPartidosService")
@Stateless
public class SancionesPartidosFacade extends AbstractFacade<SancionesPartidos> implements SancionesPartidosFacadeLocal {

    @PersistenceContext(unitName = "guambrmaGolPU")
    private EntityManager em;
    
    private SancionesPartidos entity;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SancionesPartidosFacade() {
        super(SancionesPartidos.class);
        entity = new SancionesPartidos();
        
    }

    @Override
    public int count() {
        return super.count(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SancionesPartidos> findRange(int[] range) {
        return super.findRange(range); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SancionesPartidos> findAll() {
        return em.createNamedQuery("SancionesPartidos.findAll").getResultList();
    }

    @Override
    public SancionesPartidos find(Object id) {
        return super.find(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        em.remove(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit() {
        em.merge(entity);
    }

    @Override
    public void create() {
        em.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SancionesPartidos> findBySancionName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SancionesPartidos> findByPlayerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public List<String> getNombresSanciones() {
        return em.createQuery("SELECT S.nombreSancion FROM Sanciones s", String.class).getResultList();
    }
    
    public void editListener(RowEditEvent event) {
        SancionesPartidos sancionesPartidos = (SancionesPartidos) event.getObject();
        this.edit(sancionesPartidos);
    }

}
