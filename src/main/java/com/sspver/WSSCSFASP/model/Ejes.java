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
@Table(name = "ejes")
@NamedQueries({
    @NamedQuery(name = "Ejes.findAll", query = "SELECT e FROM Ejes e"),
    @NamedQuery(name = "Ejes.findByEjeId", query = "SELECT e FROM Ejes e WHERE e.ejeId = :ejeId"),
    @NamedQuery(name = "Ejes.findByClaveEje", query = "SELECT e FROM Ejes e WHERE e.claveEje = :claveEje"),
    @NamedQuery(name = "Ejes.findByNombreEje", query = "SELECT e FROM Ejes e WHERE e.nombreEje = :nombreEje"),
    @NamedQuery(name = "Ejes.findByAnioCreacion", query = "SELECT e FROM Ejes e WHERE e.anioCreacion = :anioCreacion")})
public class Ejes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "eje_id")
    private Integer ejeId;
    @Basic(optional = false)
    @Column(name = "clave_eje")
    private String claveEje;
    @Basic(optional = false)
    @Column(name = "nombre_eje")
    private String nombreEje;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkEje")
    private Collection<DetallesEstructuras> detallesEstructurasCollection;
    @OneToMany(mappedBy = "fkEje")
    private Collection<Programas> programasCollection;

    public Ejes() {
    }

    public Ejes(Integer ejeId) {
        this.ejeId = ejeId;
    }

    public Ejes(Integer ejeId, String claveEje, String nombreEje) {
        this.ejeId = ejeId;
        this.claveEje = claveEje;
        this.nombreEje = nombreEje;
    }

    public Integer getEjeId() {
        return ejeId;
    }

    public void setEjeId(Integer ejeId) {
        this.ejeId = ejeId;
    }

    public String getClaveEje() {
        return claveEje;
    }

    public void setClaveEje(String claveEje) {
        this.claveEje = claveEje;
    }

    public String getNombreEje() {
        return nombreEje;
    }

    public void setNombreEje(String nombreEje) {
        this.nombreEje = nombreEje;
    }

    public Short getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Short anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Collection<DetallesEstructuras> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetallesEstructuras> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    public Collection<Programas> getProgramasCollection() {
        return programasCollection;
    }

    public void setProgramasCollection(Collection<Programas> programasCollection) {
        this.programasCollection = programasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ejeId != null ? ejeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejes)) {
            return false;
        }
        Ejes other = (Ejes) object;
        if ((this.ejeId == null && other.ejeId != null) || (this.ejeId != null && !this.ejeId.equals(other.ejeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Ejes[ ejeId=" + ejeId + " ]";
    }
    
}
