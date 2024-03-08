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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "adecuacion_presupuestal")
@NamedQueries({
    @NamedQuery(name = "AdecuacionPresupuestal.findAll", query = "SELECT a FROM AdecuacionPresupuestal a"),
    @NamedQuery(name = "AdecuacionPresupuestal.findByAdecuacionId", query = "SELECT a FROM AdecuacionPresupuestal a WHERE a.adecuacionId = :adecuacionId"),
    @NamedQuery(name = "AdecuacionPresupuestal.findByNumeroOficio", query = "SELECT a FROM AdecuacionPresupuestal a WHERE a.numeroOficio = :numeroOficio"),
    @NamedQuery(name = "AdecuacionPresupuestal.findByEstado", query = "SELECT a FROM AdecuacionPresupuestal a WHERE a.estado = :estado"),
    @NamedQuery(name = "AdecuacionPresupuestal.findByFechaRegistro", query = "SELECT a FROM AdecuacionPresupuestal a WHERE a.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "AdecuacionPresupuestal.findByFechaAplicacion", query = "SELECT a FROM AdecuacionPresupuestal a WHERE a.fechaAplicacion = :fechaAplicacion")})
public class AdecuacionPresupuestal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adecuacion_id")
    private Integer adecuacionId;
    @Basic(optional = false)
    @Column(name = "numero_oficio")
    private String numeroOficio;
    @Column(name = "estado")
    private Short estado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "fecha_aplicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAplicacion;
    @OneToMany(mappedBy = "fkAdecuacionPresupuestal")
    private Collection<MontosAdecuaciones> montosAdecuacionesCollection;

    public AdecuacionPresupuestal() {
    }

    public AdecuacionPresupuestal(Integer adecuacionId) {
        this.adecuacionId = adecuacionId;
    }

    public AdecuacionPresupuestal(Integer adecuacionId, String numeroOficio) {
        this.adecuacionId = adecuacionId;
        this.numeroOficio = numeroOficio;
    }

    public Integer getAdecuacionId() {
        return adecuacionId;
    }

    public void setAdecuacionId(Integer adecuacionId) {
        this.adecuacionId = adecuacionId;
    }

    public String getNumeroOficio() {
        return numeroOficio;
    }

    public void setNumeroOficio(String numeroOficio) {
        this.numeroOficio = numeroOficio;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public Collection<MontosAdecuaciones> getMontosAdecuacionesCollection() {
        return montosAdecuacionesCollection;
    }

    public void setMontosAdecuacionesCollection(Collection<MontosAdecuaciones> montosAdecuacionesCollection) {
        this.montosAdecuacionesCollection = montosAdecuacionesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adecuacionId != null ? adecuacionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdecuacionPresupuestal)) {
            return false;
        }
        AdecuacionPresupuestal other = (AdecuacionPresupuestal) object;
        if ((this.adecuacionId == null && other.adecuacionId != null) || (this.adecuacionId != null && !this.adecuacionId.equals(other.adecuacionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.AdecuacionPresupuestal[ adecuacionId=" + adecuacionId + " ]";
    }
    
}
