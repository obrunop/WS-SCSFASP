package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "subprogramas")
@NamedQueries({
    @NamedQuery(name = "Subprogramas.findAll", query = "SELECT s FROM Subprogramas s"),
    @NamedQuery(name = "Subprogramas.findBySubprogramaId", query = "SELECT s FROM Subprogramas s WHERE s.subprogramaId = :subprogramaId"),
    @NamedQuery(name = "Subprogramas.findByClaveSubprograma", query = "SELECT s FROM Subprogramas s WHERE s.claveSubprograma = :claveSubprograma"),
    @NamedQuery(name = "Subprogramas.findByNombreSubprograma", query = "SELECT s FROM Subprogramas s WHERE s.nombreSubprograma = :nombreSubprograma"),
    @NamedQuery(name = "Subprogramas.findByAnioCreacion", query = "SELECT s FROM Subprogramas s WHERE s.anioCreacion = :anioCreacion")})
public class Subprograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subprograma_id")
    private Integer subprogramaId;
    @Basic(optional = false)
    @Column(name = "clave_subprograma")
    private String claveSubprograma;
    @Basic(optional = false)
    @Column(name = "nombre_subprograma")
    private String nombreSubprograma;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @JoinColumn(name = "fk_programa", referencedColumnName = "programa_id")
    @ManyToOne(optional = false)
    private Programa fkPrograma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkSubprograma")
    private Collection<DetalleEstructura> detallesEstructurasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkSubprograma")
    private Collection<Funcion> funcionesCollection;

    public Subprograma() {
    }

    public Subprograma(Integer subprogramaId) {
        this.subprogramaId = subprogramaId;
    }

    public Subprograma(Integer subprogramaId, String claveSubprograma, String nombreSubprograma) {
        this.subprogramaId = subprogramaId;
        this.claveSubprograma = claveSubprograma;
        this.nombreSubprograma = nombreSubprograma;
    }

    public Integer getSubprogramaId() {
        return subprogramaId;
    }

    public void setSubprogramaId(Integer subprogramaId) {
        this.subprogramaId = subprogramaId;
    }

    public String getClaveSubprograma() {
        return claveSubprograma;
    }

    public void setClaveSubprograma(String claveSubprograma) {
        this.claveSubprograma = claveSubprograma;
    }

    public String getNombreSubprograma() {
        return nombreSubprograma;
    }

    public void setNombreSubprograma(String nombreSubprograma) {
        this.nombreSubprograma = nombreSubprograma;
    }

    public Short getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Short anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Programa getFkPrograma() {
        return fkPrograma;
    }

    public void setFkPrograma(Programa fkPrograma) {
        this.fkPrograma = fkPrograma;
    }

    public Collection<DetalleEstructura> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetalleEstructura> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    public Collection<Funcion> getFuncionesCollection() {
        return funcionesCollection;
    }

    public void setFuncionesCollection(Collection<Funcion> funcionesCollection) {
        this.funcionesCollection = funcionesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subprogramaId != null ? subprogramaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subprograma)) {
            return false;
        }
        Subprograma other = (Subprograma) object;
        if ((this.subprogramaId == null && other.subprogramaId != null) || (this.subprogramaId != null && !this.subprogramaId.equals(other.subprogramaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Subprogramas[ subprogramaId=" + subprogramaId + " ]";
    }
    
}
