/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.DetalleFechaCampeonato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface DetalleFechaCampeonatoFacadeLocal {

    void create(DetalleFechaCampeonato detalleFechaCampeonato);

    void edit(DetalleFechaCampeonato detalleFechaCampeonato);

    void remove(DetalleFechaCampeonato detalleFechaCampeonato);

    DetalleFechaCampeonato find(Object id);

    List<DetalleFechaCampeonato> findAll();

    List<DetalleFechaCampeonato> findRange(int[] range);

    int count();
    
}
