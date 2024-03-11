package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
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
@Table(name = "tipo_adecuacion")
@NamedQueries({
    @NamedQuery(name = "TipoAdecuacion.findAll", query = "SELECT t FROM TipoAdecuacion t"),
    @NamedQuery(name = "TipoAdecuacion.findByTipoAdecuacionId", query = "SELECT t FROM TipoAdecuacion t WHERE t.tipoAdecuacionId = :tipoAdecuacionId"),
    @NamedQuery(name = "TipoAdecuacion.findByNombreAdecuacion", query = "SELECT t FROM TipoAdecuacion t WHERE t.nombreAdecuacion = :nombreAdecuacion")})
public class TipoAdecuacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tipo_adecuacion_id")
    private Integer tipoAdecuacionId;
    @Column(name = "nombre_adecuacion")
    private String nombreAdecuacion;
    @OneToMany(mappedBy = "fkTipoAdecuacion")
    private Collection<MontoAdecuacion> montosAdecuacionesCollection;

    public TipoAdecuacion() {
    }

    public TipoAdecuacion(Integer tipoAdecuacionId) {
        this.tipoAdecuacionId = tipoAdecuacionId;
    }

    public Integer getTipoAdecuacionId() {
        return tipoAdecuacionId;
    }

    public void setTipoAdecuacionId(Integer tipoAdecuacionId) {
        this.tipoAdecuacionId = tipoAdecuacionId;
    }

    public String getNombreAdecuacion() {
        return nombreAdecuacion;
    }

    public void setNombreAdecuacion(String nombreAdecuacion) {
        this.nombreAdecuacion = nombreAdecuacion;
    }

    public Collection<MontoAdecuacion> getMontosAdecuacionesCollection() {
        return montosAdecuacionesCollection;
    }

    public void setMontosAdecuacionesCollection(Collection<MontoAdecuacion> montosAdecuacionesCollection) {
        this.montosAdecuacionesCollection = montosAdecuacionesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoAdecuacionId != null ? tipoAdecuacionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAdecuacion)) {
            return false;
        }
        TipoAdecuacion other = (TipoAdecuacion) object;
        if ((this.tipoAdecuacionId == null && other.tipoAdecuacionId != null) || (this.tipoAdecuacionId != null && !this.tipoAdecuacionId.equals(other.tipoAdecuacionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.TipoAdecuacion[ tipoAdecuacionId=" + tipoAdecuacionId + " ]";
    }
    
}
