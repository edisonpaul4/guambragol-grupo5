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
import javax.validation.constraints.NotNull;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "informeEquipo")
@NamedQueries({
    @NamedQuery(name = "InformeEquipo.findAll", query = "SELECT i FROM InformeEquipo i"),
    @NamedQuery(name = "InformeEquipo.findByIdinformeEquipo", query = "SELECT i FROM InformeEquipo i WHERE i.idinformeEquipo = :idinformeEquipo"),
    @NamedQuery(name = "InformeEquipo.findByBalon", query = "SELECT i FROM InformeEquipo i WHERE i.balon = :balon"),
    @NamedQuery(name = "InformeEquipo.findByCinta", query = "SELECT i FROM InformeEquipo i WHERE i.cinta = :cinta")})
public class InformeEquipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinformeEquipo")
    private Integer idinformeEquipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Balon")
    private short balon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cinta")
    private short cinta;
    @JoinColumn(name = "idInformeVocal", referencedColumnName = "idInformeVocal")
    @ManyToOne(optional = false)
    private InformeVocal idInformeVocal;

    public InformeEquipo() {
    }

    public InformeEquipo(Integer idinformeEquipo) {
        this.idinformeEquipo = idinformeEquipo;
    }

    public InformeEquipo(Integer idinformeEquipo, short balon, short cinta) {
        this.idinformeEquipo = idinformeEquipo;
        this.balon = balon;
        this.cinta = cinta;
    }

    public Integer getIdinformeEquipo() {
        return idinformeEquipo;
    }

    public void setIdinformeEquipo(Integer idinformeEquipo) {
        this.idinformeEquipo = idinformeEquipo;
    }

    public short getBalon() {
        return balon;
    }

    public void setBalon(short balon) {
        this.balon = balon;
    }

    public short getCinta() {
        return cinta;
    }

    public void setCinta(short cinta) {
        this.cinta = cinta;
    }

    public InformeVocal getIdInformeVocal() {
        return idInformeVocal;
    }

    public void setIdInformeVocal(InformeVocal idInformeVocal) {
        this.idInformeVocal = idInformeVocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinformeEquipo != null ? idinformeEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformeEquipo)) {
            return false;
        }
        InformeEquipo other = (InformeEquipo) object;
        if ((this.idinformeEquipo == null && other.idinformeEquipo != null) || (this.idinformeEquipo != null && !this.idinformeEquipo.equals(other.idinformeEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.InformeEquipo[ idinformeEquipo=" + idinformeEquipo + " ]";
    }
    
}
