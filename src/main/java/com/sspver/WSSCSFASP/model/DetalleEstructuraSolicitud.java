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
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "detalle_estructura_solicitud")
@NamedQueries({
    @NamedQuery(name = "DetalleEstructuraSolicitud.findAll", query = "SELECT d FROM DetalleEstructuraSolicitud d"),
    @NamedQuery(name = "DetalleEstructuraSolicitud.findByDetalleId", query = "SELECT d FROM DetalleEstructuraSolicitud d WHERE d.detalleId = :detalleId"),
    @NamedQuery(name = "DetalleEstructuraSolicitud.findByMeta", query = "SELECT d FROM DetalleEstructuraSolicitud d WHERE d.meta = :meta"),
    @NamedQuery(name = "DetalleEstructuraSolicitud.findByMontoParcial", query = "SELECT d FROM DetalleEstructuraSolicitud d WHERE d.montoParcial = :montoParcial"),
    @NamedQuery(name = "DetalleEstructuraSolicitud.findByFkDetalleEp", query = "SELECT d FROM DetalleEstructuraSolicitud d WHERE d.fkDetalleEp = :fkDetalleEp"),
    @NamedQuery(name = "DetalleEstructuraSolicitud.findByDescripcion", query = "SELECT d FROM DetalleEstructuraSolicitud d WHERE d.descripcion = :descripcion")})
public class DetalleEstructuraSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "detalle_id")
    private Integer detalleId;
    @Basic(optional = false)
    @Column(name = "meta")
    private int meta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "monto_parcial")
    private BigDecimal montoParcial;
    @Column(name = "fk_detalle_ep")
    private Integer fkDetalleEp;
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "fk_solicitud", referencedColumnName = "solicitud_id")
    @ManyToOne
    private SolicitudRecurso fkSolicitud;

    public DetalleEstructuraSolicitud() {
    }

    public DetalleEstructuraSolicitud(Integer detalleId) {
        this.detalleId = detalleId;
    }

    public DetalleEstructuraSolicitud(Integer detalleId, int meta, BigDecimal montoParcial) {
        this.detalleId = detalleId;
        this.meta = meta;
        this.montoParcial = montoParcial;
    }

    public Integer getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Integer detalleId) {
        this.detalleId = detalleId;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public BigDecimal getMontoParcial() {
        return montoParcial;
    }

    public void setMontoParcial(BigDecimal montoParcial) {
        this.montoParcial = montoParcial;
    }

    public Integer getFkDetalleEp() {
        return fkDetalleEp;
    }

    public void setFkDetalleEp(Integer fkDetalleEp) {
        this.fkDetalleEp = fkDetalleEp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public SolicitudRecurso getFkSolicitud() {
        return fkSolicitud;
    }

    public void setFkSolicitud(SolicitudRecurso fkSolicitud) {
        this.fkSolicitud = fkSolicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleId != null ? detalleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleEstructuraSolicitud)) {
            return false;
        }
        DetalleEstructuraSolicitud other = (DetalleEstructuraSolicitud) object;
        if ((this.detalleId == null && other.detalleId != null) || (this.detalleId != null && !this.detalleId.equals(other.detalleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.DetalleEstructuraSolicitud[ detalleId=" + detalleId + " ]";
    }
    
}
