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
@Table(name = "estado_solicitudes")
@NamedQueries({
    @NamedQuery(name = "EstadoSolicitudes.findAll", query = "SELECT e FROM EstadoSolicitudes e"),
    @NamedQuery(name = "EstadoSolicitudes.findByEstadoId", query = "SELECT e FROM EstadoSolicitudes e WHERE e.estadoId = :estadoId"),
    @NamedQuery(name = "EstadoSolicitudes.findByTipoEstado", query = "SELECT e FROM EstadoSolicitudes e WHERE e.tipoEstado = :tipoEstado")})
public class EstadoSolicitudes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "estado_id")
    private Integer estadoId;
    @Basic(optional = false)
    @Column(name = "tipo_estado")
    private String tipoEstado;
    @OneToMany(mappedBy = "fkEstado")
    private Collection<SolicitudesRecursos> solicitudesRecursosCollection;

    public EstadoSolicitudes() {
    }

    public EstadoSolicitudes(Integer estadoId) {
        this.estadoId = estadoId;
    }

    public EstadoSolicitudes(Integer estadoId, String tipoEstado) {
        this.estadoId = estadoId;
        this.tipoEstado = tipoEstado;
    }

    public Integer getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Integer estadoId) {
        this.estadoId = estadoId;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public Collection<SolicitudesRecursos> getSolicitudesRecursosCollection() {
        return solicitudesRecursosCollection;
    }

    public void setSolicitudesRecursosCollection(Collection<SolicitudesRecursos> solicitudesRecursosCollection) {
        this.solicitudesRecursosCollection = solicitudesRecursosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoId != null ? estadoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoSolicitudes)) {
            return false;
        }
        EstadoSolicitudes other = (EstadoSolicitudes) object;
        if ((this.estadoId == null && other.estadoId != null) || (this.estadoId != null && !this.estadoId.equals(other.estadoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.EstadoSolicitudes[ estadoId=" + estadoId + " ]";
    }
    
}
