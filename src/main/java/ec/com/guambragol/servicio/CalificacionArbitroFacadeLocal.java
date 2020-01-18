/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.CalificacionArbitro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface CalificacionArbitroFacadeLocal {

    void create(CalificacionArbitro calificacionArbitro);

    void edit(CalificacionArbitro calificacionArbitro);

    void remove(CalificacionArbitro calificacionArbitro);

    CalificacionArbitro find(Object id);

    List<CalificacionArbitro> findAll();

    List<CalificacionArbitro> findRange(int[] range);

    int count();
    
}
