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
@Table(name = "honorarios")
@NamedQueries({
    @NamedQuery(name = "Honorarios.findAll", query = "SELECT h FROM Honorarios h"),
    @NamedQuery(name = "Honorarios.findByHonorariosId", query = "SELECT h FROM Honorarios h WHERE h.honorariosId = :honorariosId"),
    @NamedQuery(name = "Honorarios.findByConcepto", query = "SELECT h FROM Honorarios h WHERE h.concepto = :concepto")})
public class Honorario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "honorarios_id")
    private Integer honorariosId;
    @Column(name = "concepto")
    private String concepto;
    @OneToMany(mappedBy = "fkHonorario")
    private Collection<SolicitudHonorariO> solicitudesHonorariosCollection;

    public Honorario() {
    }

    public Honorario(Integer honorariosId) {
        this.honorariosId = honorariosId;
    }

    public Integer getHonorariosId() {
        return honorariosId;
    }

    public void setHonorariosId(Integer honorariosId) {
        this.honorariosId = honorariosId;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Collection<SolicitudHonorariO> getSolicitudesHonorariosCollection() {
        return solicitudesHonorariosCollection;
    }

    public void setSolicitudesHonorariosCollection(Collection<SolicitudHonorariO> solicitudesHonorariosCollection) {
        this.solicitudesHonorariosCollection = solicitudesHonorariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (honorariosId != null ? honorariosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Honorario)) {
            return false;
        }
        Honorario other = (Honorario) object;
        if ((this.honorariosId == null && other.honorariosId != null) || (this.honorariosId != null && !this.honorariosId.equals(other.honorariosId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Honorarios[ honorariosId=" + honorariosId + " ]";
    }
    
}
