package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
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
@Table(name = "tipo_presupuesto")
@NamedQueries({
    @NamedQuery(name = "TipoPresupuesto.findAll", query = "SELECT t FROM TipoPresupuesto t"),
    @NamedQuery(name = "TipoPresupuesto.findByTipoId", query = "SELECT t FROM TipoPresupuesto t WHERE t.tipoId = :tipoId"),
    @NamedQuery(name = "TipoPresupuesto.findByNombreTipo", query = "SELECT t FROM TipoPresupuesto t WHERE t.nombreTipo = :nombreTipo")})
public class TipoPresupuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tipo_id")
    private Integer tipoId;
    @Basic(optional = false)
    @Column(name = "nombre_tipo")
    private String nombreTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkTipo")
    private Collection<Presupuesto> presupuestosCollection;

    public TipoPresupuesto() {
    }

    public TipoPresupuesto(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public TipoPresupuesto(Integer tipoId, String nombreTipo) {
        this.tipoId = tipoId;
        this.nombreTipo = nombreTipo;
    }

    public Integer getTipoId() {
        return tipoId;
    }

    public void setTipoId(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Collection<Presupuesto> getPresupuestosCollection() {
        return presupuestosCollection;
    }

    public void setPresupuestosCollection(Collection<Presupuesto> presupuestosCollection) {
        this.presupuestosCollection = presupuestosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoId != null ? tipoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPresupuesto)) {
            return false;
        }
        TipoPresupuesto other = (TipoPresupuesto) object;
        if ((this.tipoId == null && other.tipoId != null) || (this.tipoId != null && !this.tipoId.equals(other.tipoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.TipoPresupuesto[ tipoId=" + tipoId + " ]";
    }
    
}
