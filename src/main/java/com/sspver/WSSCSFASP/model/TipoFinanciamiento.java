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
@Table(name = "tipo_financiamiento")
@NamedQueries({
    @NamedQuery(name = "TipoFinanciamiento.findAll", query = "SELECT t FROM TipoFinanciamiento t"),
    @NamedQuery(name = "TipoFinanciamiento.findByRLCFid", query = "SELECT t FROM TipoFinanciamiento t WHERE t.rLCFid = :rLCFid"),
    @NamedQuery(name = "TipoFinanciamiento.findByNombreRlcf", query = "SELECT t FROM TipoFinanciamiento t WHERE t.nombreRlcf = :nombreRlcf")})
public class TipoFinanciamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RLCF_id")
    private Integer rLCFid;
    @Column(name = "nombre_rlcf")
    private String nombreRlcf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkRLCF")
    private Collection<DetallesEstructuras> detallesEstructurasCollection;

    public TipoFinanciamiento() {
    }

    public TipoFinanciamiento(Integer rLCFid) {
        this.rLCFid = rLCFid;
    }

    public Integer getRLCFid() {
        return rLCFid;
    }

    public void setRLCFid(Integer rLCFid) {
        this.rLCFid = rLCFid;
    }

    public String getNombreRlcf() {
        return nombreRlcf;
    }

    public void setNombreRlcf(String nombreRlcf) {
        this.nombreRlcf = nombreRlcf;
    }

    public Collection<DetallesEstructuras> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetallesEstructuras> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rLCFid != null ? rLCFid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoFinanciamiento)) {
            return false;
        }
        TipoFinanciamiento other = (TipoFinanciamiento) object;
        if ((this.rLCFid == null && other.rLCFid != null) || (this.rLCFid != null && !this.rLCFid.equals(other.rLCFid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.TipoFinanciamiento[ rLCFid=" + rLCFid + " ]";
    }
    
}
