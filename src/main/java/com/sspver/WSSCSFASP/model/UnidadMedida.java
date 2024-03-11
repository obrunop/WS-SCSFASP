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
@Table(name = "unidad_medida")
@NamedQueries({
    @NamedQuery(name = "UnidadMedida.findAll", query = "SELECT u FROM UnidadMedida u"),
    @NamedQuery(name = "UnidadMedida.findByUMid", query = "SELECT u FROM UnidadMedida u WHERE u.uMid = :uMid"),
    @NamedQuery(name = "UnidadMedida.findByNombreUM", query = "SELECT u FROM UnidadMedida u WHERE u.nombreUM = :nombreUM")})
public class UnidadMedida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UM_id")
    private Integer uMid;
    @Column(name = "nombre_UM")
    private String nombreUM;
    @OneToMany(mappedBy = "fkUM")
    private Collection<Bien> bienesCollection;

    public UnidadMedida() {
    }

    public UnidadMedida(Integer uMid) {
        this.uMid = uMid;
    }

    public Integer getUMid() {
        return uMid;
    }

    public void setUMid(Integer uMid) {
        this.uMid = uMid;
    }

    public String getNombreUM() {
        return nombreUM;
    }

    public void setNombreUM(String nombreUM) {
        this.nombreUM = nombreUM;
    }

    public Collection<Bien> getBienesCollection() {
        return bienesCollection;
    }

    public void setBienesCollection(Collection<Bien> bienesCollection) {
        this.bienesCollection = bienesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uMid != null ? uMid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadMedida)) {
            return false;
        }
        UnidadMedida other = (UnidadMedida) object;
        if ((this.uMid == null && other.uMid != null) || (this.uMid != null && !this.uMid.equals(other.uMid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.UnidadMedida[ uMid=" + uMid + " ]";
    }
    
}
