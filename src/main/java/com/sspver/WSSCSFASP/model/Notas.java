package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "notas")
@NamedQueries({
    @NamedQuery(name = "Notas.findAll", query = "SELECT n FROM Notas n"),
    @NamedQuery(name = "Notas.findByNotaId", query = "SELECT n FROM Notas n WHERE n.notaId = :notaId"),
    @NamedQuery(name = "Notas.findByDescripcion", query = "SELECT n FROM Notas n WHERE n.descripcion = :descripcion")})
public class Notas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nota_id")
    private Integer notaId;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToMany(mappedBy = "notasCollection")
    private Collection<DetallesEstructuras> detallesEstructurasCollection;
    @JoinColumn(name = "fk_solicitud", referencedColumnName = "solicitud_id")
    @ManyToOne
    private SolicitudesRecursos fkSolicitud;

    public Notas() {
    }

    public Notas(Integer notaId) {
        this.notaId = notaId;
    }

    public Notas(Integer notaId, String descripcion) {
        this.notaId = notaId;
        this.descripcion = descripcion;
    }

    public Integer getNotaId() {
        return notaId;
    }

    public void setNotaId(Integer notaId) {
        this.notaId = notaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<DetallesEstructuras> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetallesEstructuras> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    public SolicitudesRecursos getFkSolicitud() {
        return fkSolicitud;
    }

    public void setFkSolicitud(SolicitudesRecursos fkSolicitud) {
        this.fkSolicitud = fkSolicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notaId != null ? notaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notas)) {
            return false;
        }
        Notas other = (Notas) object;
        if ((this.notaId == null && other.notaId != null) || (this.notaId != null && !this.notaId.equals(other.notaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Notas[ notaId=" + notaId + " ]";
    }
    
}
