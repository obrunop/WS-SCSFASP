package com.sspver.WSSCSFASP.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "telefonos")
@NamedQueries({
    @NamedQuery(name = "Telefonos.findAll", query = "SELECT t FROM Telefonos t"),
    @NamedQuery(name = "Telefonos.findByNumeroTelefono", query = "SELECT t FROM Telefonos t WHERE t.telefonosPK.numeroTelefono = :numeroTelefono"),
    @NamedQuery(name = "Telefonos.findByExtensionTelefono", query = "SELECT t FROM Telefonos t WHERE t.telefonosPK.extensionTelefono = :extensionTelefono")})
public class Telefonos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelefonosPK telefonosPK;
    @OneToMany(mappedBy = "telefonos")
    private Collection<Usuarios> usuariosCollection;
    @JoinColumn(name = "fk_oficina", referencedColumnName = "oficina_id")
    @ManyToOne
    private Oficinas fkOficina;

    public Telefonos() {
    }

    public Telefonos(TelefonosPK telefonosPK) {
        this.telefonosPK = telefonosPK;
    }

    public Telefonos(String numeroTelefono, String extensionTelefono) {
        this.telefonosPK = new TelefonosPK(numeroTelefono, extensionTelefono);
    }

    public TelefonosPK getTelefonosPK() {
        return telefonosPK;
    }

    public void setTelefonosPK(TelefonosPK telefonosPK) {
        this.telefonosPK = telefonosPK;
    }

    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    public Oficinas getFkOficina() {
        return fkOficina;
    }

    public void setFkOficina(Oficinas fkOficina) {
        this.fkOficina = fkOficina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefonosPK != null ? telefonosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefonos)) {
            return false;
        }
        Telefonos other = (Telefonos) object;
        if ((this.telefonosPK == null && other.telefonosPK != null) || (this.telefonosPK != null && !this.telefonosPK.equals(other.telefonosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Telefonos[ telefonosPK=" + telefonosPK + " ]";
    }
    
}
