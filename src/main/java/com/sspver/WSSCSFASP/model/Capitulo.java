package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "capitulos")
@NamedQueries({
    @NamedQuery(name = "Capitulos.findAll", query = "SELECT c FROM Capitulos c"),
    @NamedQuery(name = "Capitulos.findByCapituloId", query = "SELECT c FROM Capitulos c WHERE c.capituloId = :capituloId"),
    @NamedQuery(name = "Capitulos.findByClaveCapitulo", query = "SELECT c FROM Capitulos c WHERE c.claveCapitulo = :claveCapitulo"),
    @NamedQuery(name = "Capitulos.findByNombreCapitulo", query = "SELECT c FROM Capitulos c WHERE c.nombreCapitulo = :nombreCapitulo"),
    @NamedQuery(name = "Capitulos.findByAnioCreacion", query = "SELECT c FROM Capitulos c WHERE c.anioCreacion = :anioCreacion")})
public class Capitulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "capitulo_id")
    private Integer capituloId;
    @Column(name = "clave_capitulo")
    private String claveCapitulo;
    @Basic(optional = false)
    @Column(name = "nombre_capitulo")
    private String nombreCapitulo;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkCapitulo")
    private Collection<DetalleEstructura> detallesEstructurasCollection;
    @OneToMany(mappedBy = "fkCapitulo")
    private Collection<Concepto> conceptosCollection;

    public Capitulo() {
    }

    public Capitulo(Integer capituloId) {
        this.capituloId = capituloId;
    }

    public Capitulo(Integer capituloId, String nombreCapitulo) {
        this.capituloId = capituloId;
        this.nombreCapitulo = nombreCapitulo;
    }

    public Integer getCapituloId() {
        return capituloId;
    }

    public void setCapituloId(Integer capituloId) {
        this.capituloId = capituloId;
    }

    public String getClaveCapitulo() {
        return claveCapitulo;
    }

    public void setClaveCapitulo(String claveCapitulo) {
        this.claveCapitulo = claveCapitulo;
    }

    public String getNombreCapitulo() {
        return nombreCapitulo;
    }

    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
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

    public Collection<Concepto> getConceptosCollection() {
        return conceptosCollection;
    }

    public void setConceptosCollection(Collection<Concepto> conceptosCollection) {
        this.conceptosCollection = conceptosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (capituloId != null ? capituloId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Capitulo)) {
            return false;
        }
        Capitulo other = (Capitulo) object;
        if ((this.capituloId == null && other.capituloId != null) || (this.capituloId != null && !this.capituloId.equals(other.capituloId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Capitulos[ capituloId=" + capituloId + " ]";
    }
    
}
