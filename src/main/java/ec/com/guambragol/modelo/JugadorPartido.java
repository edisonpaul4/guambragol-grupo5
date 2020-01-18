/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "JugadorPartido")
@NamedQueries({
    @NamedQuery(name = "JugadorPartido.findAll", query = "SELECT j FROM JugadorPartido j"),
    @NamedQuery(name = "JugadorPartido.findByIdJugadorPartidfo", query = "SELECT j FROM JugadorPartido j WHERE j.idJugadorPartidfo = :idJugadorPartidfo")})
public class JugadorPartido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idJugadorPartidfo")
    private Integer idJugadorPartidfo;
    @JoinColumn(name = "idJugador", referencedColumnName = "idJugador")
    @ManyToOne
    private Jugador idJugador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJugadorEntra")
    private List<Cambios> cambiosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJugadorSale")
    private List<Cambios> cambiosList1;

    public JugadorPartido() {
    }

    public JugadorPartido(Integer idJugadorPartidfo) {
        this.idJugadorPartidfo = idJugadorPartidfo;
    }

    public Integer getIdJugadorPartidfo() {
        return idJugadorPartidfo;
    }

    public void setIdJugadorPartidfo(Integer idJugadorPartidfo) {
        this.idJugadorPartidfo = idJugadorPartidfo;
    }

    public Jugador getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Jugador idJugador) {
        this.idJugador = idJugador;
    }

    public List<Cambios> getCambiosList() {
        return cambiosList;
    }

    public void setCambiosList(List<Cambios> cambiosList) {
        this.cambiosList = cambiosList;
    }

    public List<Cambios> getCambiosList1() {
        return cambiosList1;
    }

    public void setCambiosList1(List<Cambios> cambiosList1) {
        this.cambiosList1 = cambiosList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJugadorPartidfo != null ? idJugadorPartidfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JugadorPartido)) {
            return false;
        }
        JugadorPartido other = (JugadorPartido) object;
        if ((this.idJugadorPartidfo == null && other.idJugadorPartidfo != null) || (this.idJugadorPartidfo != null && !this.idJugadorPartidfo.equals(other.idJugadorPartidfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.JugadorPartido[ idJugadorPartidfo=" + idJugadorPartidfo + " ]";
    }
    
}
