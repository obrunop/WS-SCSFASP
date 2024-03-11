package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author obrunop
 */
@Embeddable
public class DictamenSolicitudPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "dsp")
    private String dsp;
    @Basic(optional = false)
    @Column(name = "fk_solicitud_id")
    private int fkSolicitudId;

    public DictamenSolicitudPK() {
    }

    public DictamenSolicitudPK(String dsp, int fkSolicitudId) {
        this.dsp = dsp;
        this.fkSolicitudId = fkSolicitudId;
    }

    public String getDsp() {
        return dsp;
    }

    public void setDsp(String dsp) {
        this.dsp = dsp;
    }

    public int getFkSolicitudId() {
        return fkSolicitudId;
    }

    public void setFkSolicitudId(int fkSolicitudId) {
        this.fkSolicitudId = fkSolicitudId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dsp != null ? dsp.hashCode() : 0);
        hash += (int) fkSolicitudId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DictamenSolicitudPK)) {
            return false;
        }
        DictamenSolicitudPK other = (DictamenSolicitudPK) object;
        if ((this.dsp == null && other.dsp != null) || (this.dsp != null && !this.dsp.equals(other.dsp))) {
            return false;
        }
        if (this.fkSolicitudId != other.fkSolicitudId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.DictamenesSolicitudPK[ dsp=" + dsp + ", fkSolicitudId=" + fkSolicitudId + " ]";
    }
    
}
