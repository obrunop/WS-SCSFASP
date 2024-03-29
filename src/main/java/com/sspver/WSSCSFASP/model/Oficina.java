package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "oficinas")
@NamedQueries({
    @NamedQuery(name = "Oficinas.findAll", query = "SELECT o FROM Oficinas o"),
    @NamedQuery(name = "Oficinas.findByOficinaId", query = "SELECT o FROM Oficinas o WHERE o.oficinaId = :oficinaId"),
    @NamedQuery(name = "Oficinas.findByNombreOficina", query = "SELECT o FROM Oficinas o WHERE o.nombreOficina = :nombreOficina")})
public class Oficina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "oficina_id")
    private Integer oficinaId;
    @Basic(optional = false)
    @Column(name = "nombre_oficina")
    private String nombreOficina;
    @OneToMany(mappedBy = "fkOficina")
    private Collection<Usuario> usuariosCollection;
    @OneToMany(mappedBy = "fkOficina")
    private Collection<Telefono> telefonosCollection;
    @JoinColumn(name = "fk_entidad", referencedColumnName = "entidad_id")
    @ManyToOne
    private Entidad fkEntidad;

    public Oficina() {
    }

    public Oficina(Integer oficinaId) {
        this.oficinaId = oficinaId;
    }

    public Oficina(Integer oficinaId, String nombreOficina) {
        this.oficinaId = oficinaId;
        this.nombreOficina = nombreOficina;
    }

    public Integer getOficinaId() {
        return oficinaId;
    }

    public void setOficinaId(Integer oficinaId) {
        this.oficinaId = oficinaId;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

    public Collection<Usuario> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuario> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    public Collection<Telefono> getTelefonosCollection() {
        return telefonosCollection;
    }

    public void setTelefonosCollection(Collection<Telefono> telefonosCollection) {
        this.telefonosCollection = telefonosCollection;
    }

    public Entidad getFkEntidad() {
        return fkEntidad;
    }

    public void setFkEntidad(Entidad fkEntidad) {
        this.fkEntidad = fkEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oficinaId != null ? oficinaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oficina)) {
            return false;
        }
        Oficina other = (Oficina) object;
        if ((this.oficinaId == null && other.oficinaId != null) || (this.oficinaId != null && !this.oficinaId.equals(other.oficinaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Oficinas[ oficinaId=" + oficinaId + " ]";
    }
    
}
