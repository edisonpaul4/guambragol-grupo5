/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.InformeEquipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface InformeEquipoFacadeLocal {

    void create(InformeEquipo informeEquipo);

    void edit(InformeEquipo informeEquipo);

    void remove(InformeEquipo informeEquipo);

    InformeEquipo find(Object id);

    List<InformeEquipo> findAll();

    List<InformeEquipo> findRange(int[] range);

    int count();
    
}
