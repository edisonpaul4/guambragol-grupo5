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
import javax.validation.constraints.Size;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "InformeArbitro")
@NamedQueries({
    @NamedQuery(name = "InformeArbitro.findAll", query = "SELECT i FROM InformeArbitro i"),
    @NamedQuery(name = "InformeArbitro.findByIdInformeArbitro", query = "SELECT i FROM InformeArbitro i WHERE i.idInformeArbitro = :idInformeArbitro"),
    @NamedQuery(name = "InformeArbitro.findByDescripcion", query = "SELECT i FROM InformeArbitro i WHERE i.descripcion = :descripcion")})
public class InformeArbitro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInformeArbitro")
    private Integer idInformeArbitro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
    @JoinColumn(name = "idArbitro", referencedColumnName = "idArbitro")
    @ManyToOne(optional = false)
    private Arbitro idArbitro;
    @JoinColumn(name = "idInformeVocal", referencedColumnName = "idInformeVocal")
    @ManyToOne(optional = false)
    private InformeVocal idInformeVocal;

    public InformeArbitro() {
    }

    public InformeArbitro(Integer idInformeArbitro) {
        this.idInformeArbitro = idInformeArbitro;
    }

    public InformeArbitro(Integer idInformeArbitro, String descripcion) {
        this.idInformeArbitro = idInformeArbitro;
        this.descripcion = descripcion;
    }

    public Integer getIdInformeArbitro() {
        return idInformeArbitro;
    }

    public void setIdInformeArbitro(Integer idInformeArbitro) {
        this.idInformeArbitro = idInformeArbitro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Arbitro getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(Arbitro idArbitro) {
        this.idArbitro = idArbitro;
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
        hash += (idInformeArbitro != null ? idInformeArbitro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformeArbitro)) {
            return false;
        }
        InformeArbitro other = (InformeArbitro) object;
        if ((this.idInformeArbitro == null && other.idInformeArbitro != null) || (this.idInformeArbitro != null && !this.idInformeArbitro.equals(other.idInformeArbitro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.InformeArbitro[ idInformeArbitro=" + idInformeArbitro + " ]";
    }
    
}
