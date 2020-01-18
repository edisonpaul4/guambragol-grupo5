/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "Cambios")
@NamedQueries({
    @NamedQuery(name = "Cambios.findAll", query = "SELECT c FROM Cambios c"),
    @NamedQuery(name = "Cambios.findByIdCambios", query = "SELECT c FROM Cambios c WHERE c.idCambios = :idCambios")})
public class Cambios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCambios")
    private Integer idCambios;
    @JoinColumn(name = "idJugadorEntra", referencedColumnName = "idJugadorPartidfo")
    @ManyToOne(optional = false)
    private JugadorPartido idJugadorEntra;
    @JoinColumn(name = "idJugadorSale", referencedColumnName = "idJugadorPartidfo")
    @ManyToOne(optional = false)
    private JugadorPartido idJugadorSale;

    public Cambios() {
    }

    public Cambios(Integer idCambios) {
        this.idCambios = idCambios;
    }

    public Integer getIdCambios() {
        return idCambios;
    }

    public void setIdCambios(Integer idCambios) {
        this.idCambios = idCambios;
    }

    public JugadorPartido getIdJugadorEntra() {
        return idJugadorEntra;
    }

    public void setIdJugadorEntra(JugadorPartido idJugadorEntra) {
        this.idJugadorEntra = idJugadorEntra;
    }

    public JugadorPartido getIdJugadorSale() {
        return idJugadorSale;
    }

    public void setIdJugadorSale(JugadorPartido idJugadorSale) {
        this.idJugadorSale = idJugadorSale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCambios != null ? idCambios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cambios)) {
            return false;
        }
        Cambios other = (Cambios) object;
        if ((this.idCambios == null && other.idCambios != null) || (this.idCambios != null && !this.idCambios.equals(other.idCambios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Cambios[ idCambios=" + idCambios + " ]";
    }
    
}
