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
@Table(name = "conceptos")
@NamedQueries({
    @NamedQuery(name = "Conceptos.findAll", query = "SELECT c FROM Conceptos c"),
    @NamedQuery(name = "Conceptos.findByConceptoId", query = "SELECT c FROM Conceptos c WHERE c.conceptoId = :conceptoId"),
    @NamedQuery(name = "Conceptos.findByClaveConcepto", query = "SELECT c FROM Conceptos c WHERE c.claveConcepto = :claveConcepto"),
    @NamedQuery(name = "Conceptos.findByNombreConcepto", query = "SELECT c FROM Conceptos c WHERE c.nombreConcepto = :nombreConcepto"),
    @NamedQuery(name = "Conceptos.findByAnioCreacion", query = "SELECT c FROM Conceptos c WHERE c.anioCreacion = :anioCreacion")})
public class Concepto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "concepto_id")
    private Integer conceptoId;
    @Column(name = "clave_concepto")
    private String claveConcepto;
    @Basic(optional = false)
    @Column(name = "nombre_concepto")
    private String nombreConcepto;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkConcepto")
    private Collection<DetalleEstructura> detallesEstructurasCollection;
    @OneToMany(mappedBy = "fkConcepto")
    private Collection<PartidaGenerica> partidasGenericasCollection;
    @JoinColumn(name = "fk_capitulo", referencedColumnName = "capitulo_id")
    @ManyToOne
    private Capitulos fkCapitulo;

    public Concepto() {
    }

    public Concepto(Integer conceptoId) {
        this.conceptoId = conceptoId;
    }

    public Concepto(Integer conceptoId, String nombreConcepto) {
        this.conceptoId = conceptoId;
        this.nombreConcepto = nombreConcepto;
    }

    public Integer getConceptoId() {
        return conceptoId;
    }

    public void setConceptoId(Integer conceptoId) {
        this.conceptoId = conceptoId;
    }

    public String getClaveConcepto() {
        return claveConcepto;
    }

    public void setClaveConcepto(String claveConcepto) {
        this.claveConcepto = claveConcepto;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
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

    public Collection<PartidaGenerica> getPartidasGenericasCollection() {
        return partidasGenericasCollection;
    }

    public void setPartidasGenericasCollection(Collection<PartidaGenerica> partidasGenericasCollection) {
        this.partidasGenericasCollection = partidasGenericasCollection;
    }

    public Capitulos getFkCapitulo() {
        return fkCapitulo;
    }

    public void setFkCapitulo(Capitulos fkCapitulo) {
        this.fkCapitulo = fkCapitulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conceptoId != null ? conceptoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Concepto)) {
            return false;
        }
        Concepto other = (Concepto) object;
        if ((this.conceptoId == null && other.conceptoId != null) || (this.conceptoId != null && !this.conceptoId.equals(other.conceptoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Conceptos[ conceptoId=" + conceptoId + " ]";
    }
    
}
