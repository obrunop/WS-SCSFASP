package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "dictamenes_solicitud")
@NamedQueries({
    @NamedQuery(name = "DictamenesSolicitud.findAll", query = "SELECT d FROM DictamenesSolicitud d"),
    @NamedQuery(name = "DictamenesSolicitud.findByDsp", query = "SELECT d FROM DictamenesSolicitud d WHERE d.dictamenesSolicitudPK.dsp = :dsp"),
    @NamedQuery(name = "DictamenesSolicitud.findByFkSolicitudId", query = "SELECT d FROM DictamenesSolicitud d WHERE d.dictamenesSolicitudPK.fkSolicitudId = :fkSolicitudId"),
    @NamedQuery(name = "DictamenesSolicitud.findByFkNoTramite", query = "SELECT d FROM DictamenesSolicitud d WHERE d.fkNoTramite = :fkNoTramite")})
public class DictamenesSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DictamenesSolicitudPK dictamenesSolicitudPK;
    @Column(name = "fk_no_tramite")
    private String fkNoTramite;
    @JoinColumn(name = "fk_solicitud_id", referencedColumnName = "solicitud_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SolicitudesRecursos solicitudesRecursos;

    public DictamenesSolicitud() {
    }

    public DictamenesSolicitud(DictamenesSolicitudPK dictamenesSolicitudPK) {
        this.dictamenesSolicitudPK = dictamenesSolicitudPK;
    }

    public DictamenesSolicitud(String dsp, int fkSolicitudId) {
        this.dictamenesSolicitudPK = new DictamenesSolicitudPK(dsp, fkSolicitudId);
    }

    public DictamenesSolicitudPK getDictamenesSolicitudPK() {
        return dictamenesSolicitudPK;
    }

    public void setDictamenesSolicitudPK(DictamenesSolicitudPK dictamenesSolicitudPK) {
        this.dictamenesSolicitudPK = dictamenesSolicitudPK;
    }

    public String getFkNoTramite() {
        return fkNoTramite;
    }

    public void setFkNoTramite(String fkNoTramite) {
        this.fkNoTramite = fkNoTramite;
    }

    public SolicitudesRecursos getSolicitudesRecursos() {
        return solicitudesRecursos;
    }

    public void setSolicitudesRecursos(SolicitudesRecursos solicitudesRecursos) {
        this.solicitudesRecursos = solicitudesRecursos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dictamenesSolicitudPK != null ? dictamenesSolicitudPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DictamenesSolicitud)) {
            return false;
        }
        DictamenesSolicitud other = (DictamenesSolicitud) object;
        if ((this.dictamenesSolicitudPK == null && other.dictamenesSolicitudPK != null) || (this.dictamenesSolicitudPK != null && !this.dictamenesSolicitudPK.equals(other.dictamenesSolicitudPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.DictamenesSolicitud[ dictamenesSolicitudPK=" + dictamenesSolicitudPK + " ]";
    }
    
}
