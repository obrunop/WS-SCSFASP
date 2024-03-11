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
public class TelefonoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "numero_telefono")
    private String numeroTelefono;
    @Basic(optional = false)
    @Column(name = "extension_telefono")
    private String extensionTelefono;

    public TelefonoPK() {
    }

    public TelefonoPK(String numeroTelefono, String extensionTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.extensionTelefono = extensionTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getExtensionTelefono() {
        return extensionTelefono;
    }

    public void setExtensionTelefono(String extensionTelefono) {
        this.extensionTelefono = extensionTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroTelefono != null ? numeroTelefono.hashCode() : 0);
        hash += (extensionTelefono != null ? extensionTelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoPK)) {
            return false;
        }
        TelefonoPK other = (TelefonoPK) object;
        if ((this.numeroTelefono == null && other.numeroTelefono != null) || (this.numeroTelefono != null && !this.numeroTelefono.equals(other.numeroTelefono))) {
            return false;
        }
        if ((this.extensionTelefono == null && other.extensionTelefono != null) || (this.extensionTelefono != null && !this.extensionTelefono.equals(other.extensionTelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.TelefonosPK[ numeroTelefono=" + numeroTelefono + ", extensionTelefono=" + extensionTelefono + " ]";
    }
    
}
