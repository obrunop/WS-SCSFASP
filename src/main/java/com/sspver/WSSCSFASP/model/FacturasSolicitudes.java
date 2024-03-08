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

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "facturas_solicitudes")
@NamedQueries({
    @NamedQuery(name = "FacturasSolicitudes.findAll", query = "SELECT f FROM FacturasSolicitudes f"),
    @NamedQuery(name = "FacturasSolicitudes.findByFacturaSolicitudId", query = "SELECT f FROM FacturasSolicitudes f WHERE f.facturaSolicitudId = :facturaSolicitudId"),
    @NamedQuery(name = "FacturasSolicitudes.findByMontoParcial", query = "SELECT f FROM FacturasSolicitudes f WHERE f.montoParcial = :montoParcial")})
public class FacturasSolicitudes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "factura_solicitud_id")
    private Integer facturaSolicitudId;
    @Column(name = "monto_parcial")
    private String montoParcial;
    @JoinColumn(name = "fk_factura", referencedColumnName = "factura_id")
    @ManyToOne(optional = false)
    private Facturas fkFactura;
    @JoinColumn(name = "fk_solicitud", referencedColumnName = "solicitud_id")
    @ManyToOne(optional = false)
    private SolicitudesRecursos fkSolicitud;

    public FacturasSolicitudes() {
    }

    public FacturasSolicitudes(Integer facturaSolicitudId) {
        this.facturaSolicitudId = facturaSolicitudId;
    }

    public Integer getFacturaSolicitudId() {
        return facturaSolicitudId;
    }

    public void setFacturaSolicitudId(Integer facturaSolicitudId) {
        this.facturaSolicitudId = facturaSolicitudId;
    }

    public String getMontoParcial() {
        return montoParcial;
    }

    public void setMontoParcial(String montoParcial) {
        this.montoParcial = montoParcial;
    }

    public Facturas getFkFactura() {
        return fkFactura;
    }

    public void setFkFactura(Facturas fkFactura) {
        this.fkFactura = fkFactura;
    }

    public SolicitudesRecursos getFkSolicitud() {
        return fkSolicitud;
    }

    public void setFkSolicitud(SolicitudesRecursos fkSolicitud) {
        this.fkSolicitud = fkSolicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturaSolicitudId != null ? facturaSolicitudId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturasSolicitudes)) {
            return false;
        }
        FacturasSolicitudes other = (FacturasSolicitudes) object;
        if ((this.facturaSolicitudId == null && other.facturaSolicitudId != null) || (this.facturaSolicitudId != null && !this.facturaSolicitudId.equals(other.facturaSolicitudId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.FacturasSolicitudes[ facturaSolicitudId=" + facturaSolicitudId + " ]";
    }
    
}
