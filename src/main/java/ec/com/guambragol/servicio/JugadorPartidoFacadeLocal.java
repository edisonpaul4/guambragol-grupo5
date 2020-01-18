/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.JugadorPartido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface JugadorPartidoFacadeLocal {

    void create(JugadorPartido jugadorPartido);

    void edit(JugadorPartido jugadorPartido);

    void remove(JugadorPartido jugadorPartido);

    JugadorPartido find(Object id);

    List<JugadorPartido> findAll();

    List<JugadorPartido> findRange(int[] range);

    int count();
    
}
