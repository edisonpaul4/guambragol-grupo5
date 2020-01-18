/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.InformeVocal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface InformeVocalFacadeLocal {

    void create(InformeVocal informeVocal);

    void edit(InformeVocal informeVocal);

    void remove(InformeVocal informeVocal);

    InformeVocal find(Object id);

    List<InformeVocal> findAll();

    List<InformeVocal> findRange(int[] range);

    int count();
    
}
