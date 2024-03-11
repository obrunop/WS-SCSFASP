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
public class Telefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelefonoPK telefonoPK;
    @OneToMany(mappedBy = "telefonos")
    private Collection<Usuario> usuariosCollection;
    @JoinColumn(name = "fk_oficina", referencedColumnName = "oficina_id")
    @ManyToOne
    private Oficina fkOficina;

    public Telefono() {
    }

    public Telefono(TelefonoPK telefonoPK) {
        this.telefonoPK = telefonoPK;
    }

    public Telefono(String numeroTelefono, String extensionTelefono) {
        this.telefonoPK = new TelefonoPK(numeroTelefono, extensionTelefono);
    }

    public TelefonoPK getTelefonosPK() {
        return telefonoPK;
    }

    public void setTelefonosPK(TelefonoPK telefonoPK) {
        this.telefonoPK = telefonoPK;
    }

    public Collection<Usuario> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuario> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    public Oficina getFkOficina() {
        return fkOficina;
    }

    public void setFkOficina(Oficina fkOficina) {
        this.fkOficina = fkOficina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefonoPK != null ? telefonoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.telefonoPK == null && other.telefonoPK != null) || (this.telefonoPK != null && !this.telefonoPK.equals(other.telefonoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Telefonos[ telefonosPK=" + telefonoPK + " ]";
    }
    
}
