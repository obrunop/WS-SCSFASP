package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "funciones")
@NamedQueries({
    @NamedQuery(name = "Funciones.findAll", query = "SELECT f FROM Funciones f"),
    @NamedQuery(name = "Funciones.findByFuncionId", query = "SELECT f FROM Funciones f WHERE f.funcionId = :funcionId"),
    @NamedQuery(name = "Funciones.findByNombreFuncion", query = "SELECT f FROM Funciones f WHERE f.nombreFuncion = :nombreFuncion"),
    @NamedQuery(name = "Funciones.findByAnioCreacion", query = "SELECT f FROM Funciones f WHERE f.anioCreacion = :anioCreacion")})
public class Funcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "funcion_id")
    private String funcionId;
    @Basic(optional = false)
    @Column(name = "nombre_funcion")
    private String nombreFuncion;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @OneToMany(mappedBy = "fkFuncion")
    private Collection<DetalleEstructura> detallesEstructurasCollection;
    @JoinColumn(name = "fk_subprograma", referencedColumnName = "subprograma_id")
    @ManyToOne(optional = false)
    private Subprograma fkSubprograma;

    public Funcion() {
    }

    public Funcion(String funcionId) {
        this.funcionId = funcionId;
    }

    public Funcion(String funcionId, String nombreFuncion) {
        this.funcionId = funcionId;
        this.nombreFuncion = nombreFuncion;
    }

    public String getFuncionId() {
        return funcionId;
    }

    public void setFuncionId(String funcionId) {
        this.funcionId = funcionId;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public Short getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Short anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Collection<DetalleEstructura> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetalleEstructura> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    public Subprograma getFkSubprograma() {
        return fkSubprograma;
    }

    public void setFkSubprograma(Subprograma fkSubprograma) {
        this.fkSubprograma = fkSubprograma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (funcionId != null ? funcionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcion)) {
            return false;
        }
        Funcion other = (Funcion) object;
        if ((this.funcionId == null && other.funcionId != null) || (this.funcionId != null && !this.funcionId.equals(other.funcionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Funciones[ funcionId=" + funcionId + " ]";
    }
    
}
