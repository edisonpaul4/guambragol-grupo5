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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "InformeVocal")
@NamedQueries({
    @NamedQuery(name = "InformeVocal.findAll", query = "SELECT i FROM InformeVocal i"),
    @NamedQuery(name = "InformeVocal.findByIdInformeVocal", query = "SELECT i FROM InformeVocal i WHERE i.idInformeVocal = :idInformeVocal"),
    @NamedQuery(name = "InformeVocal.findByDescripcion", query = "SELECT i FROM InformeVocal i WHERE i.descripcion = :descripcion"),
    @NamedQuery(name = "InformeVocal.findByHora", query = "SELECT i FROM InformeVocal i WHERE i.hora = :hora"),
    @NamedQuery(name = "InformeVocal.findByNombreVocal", query = "SELECT i FROM InformeVocal i WHERE i.nombreVocal = :nombreVocal")})
public class InformeVocal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInformeVocal")
    private Integer idInformeVocal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora")
    private int hora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreVocal")
    private String nombreVocal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInformeVocal")
    private List<InformeEquipo> informeEquipoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInformeVocal")
    private List<InformeArbitro> informeArbitroList;
    @JoinColumn(name = "IdcalificacionArbitro", referencedColumnName = "idCalificacionArbitro")
    @ManyToOne(optional = false)
    private CalificacionArbitro idcalificacionArbitro;
    @JoinColumn(name = "idPartidos", referencedColumnName = "idPartidos")
    @ManyToOne(optional = false)
    private Partidos idPartidos;

    public InformeVocal() {
    }

    public InformeVocal(Integer idInformeVocal) {
        this.idInformeVocal = idInformeVocal;
    }

    public InformeVocal(Integer idInformeVocal, String descripcion, int hora, String nombreVocal) {
        this.idInformeVocal = idInformeVocal;
        this.descripcion = descripcion;
        this.hora = hora;
        this.nombreVocal = nombreVocal;
    }

    public Integer getIdInformeVocal() {
        return idInformeVocal;
    }

    public void setIdInformeVocal(Integer idInformeVocal) {
        this.idInformeVocal = idInformeVocal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getNombreVocal() {
        return nombreVocal;
    }

    public void setNombreVocal(String nombreVocal) {
        this.nombreVocal = nombreVocal;
    }

    public List<InformeEquipo> getInformeEquipoList() {
        return informeEquipoList;
    }

    public void setInformeEquipoList(List<InformeEquipo> informeEquipoList) {
        this.informeEquipoList = informeEquipoList;
    }

    public List<InformeArbitro> getInformeArbitroList() {
        return informeArbitroList;
    }

    public void setInformeArbitroList(List<InformeArbitro> informeArbitroList) {
        this.informeArbitroList = informeArbitroList;
    }

    public CalificacionArbitro getIdcalificacionArbitro() {
        return idcalificacionArbitro;
    }

    public void setIdcalificacionArbitro(CalificacionArbitro idcalificacionArbitro) {
        this.idcalificacionArbitro = idcalificacionArbitro;
    }

    public Partidos getIdPartidos() {
        return idPartidos;
    }

    public void setIdPartidos(Partidos idPartidos) {
        this.idPartidos = idPartidos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformeVocal != null ? idInformeVocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformeVocal)) {
            return false;
        }
        InformeVocal other = (InformeVocal) object;
        if ((this.idInformeVocal == null && other.idInformeVocal != null) || (this.idInformeVocal != null && !this.idInformeVocal.equals(other.idInformeVocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.InformeVocal[ idInformeVocal=" + idInformeVocal + " ]";
    }
    
}
