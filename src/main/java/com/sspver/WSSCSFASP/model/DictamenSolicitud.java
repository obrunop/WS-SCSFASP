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
public class DictamenSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DictamenSolicitudPK dictamenSolicitudPK;
    @Column(name = "fk_no_tramite")
    private String fkNoTramite;
    @JoinColumn(name = "fk_solicitud_id", referencedColumnName = "solicitud_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SolicitudRecurso solicitudRecurso;

    public DictamenSolicitud() {
    }

    public DictamenSolicitud(DictamenSolicitudPK dictamenSolicitudPK) {
        this.dictamenSolicitudPK = dictamenSolicitudPK;
    }

    public DictamenSolicitud(String dsp, int fkSolicitudId) {
        this.dictamenSolicitudPK = new DictamenSolicitudPK(dsp, fkSolicitudId);
    }

    public DictamenSolicitudPK getDictamenesSolicitudPK() {
        return dictamenSolicitudPK;
    }

    public void setDictamenesSolicitudPK(DictamenSolicitudPK dictamenSolicitudPK) {
        this.dictamenSolicitudPK = dictamenSolicitudPK;
    }

    public String getFkNoTramite() {
        return fkNoTramite;
    }

    public void setFkNoTramite(String fkNoTramite) {
        this.fkNoTramite = fkNoTramite;
    }

    public SolicitudRecurso getSolicitudesRecursos() {
        return solicitudRecurso;
    }

    public void setSolicitudesRecursos(SolicitudRecurso solicitudRecurso) {
        this.solicitudRecurso = solicitudRecurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dictamenSolicitudPK != null ? dictamenSolicitudPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DictamenSolicitud)) {
            return false;
        }
        DictamenSolicitud other = (DictamenSolicitud) object;
        if ((this.dictamenSolicitudPK == null && other.dictamenSolicitudPK != null) || (this.dictamenSolicitudPK != null && !this.dictamenSolicitudPK.equals(other.dictamenSolicitudPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.DictamenesSolicitud[ dictamenesSolicitudPK=" + dictamenSolicitudPK + " ]";
    }
    
}
