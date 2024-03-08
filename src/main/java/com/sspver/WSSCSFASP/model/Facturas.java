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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "facturas")
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f"),
    @NamedQuery(name = "Facturas.findByFacturaId", query = "SELECT f FROM Facturas f WHERE f.facturaId = :facturaId"),
    @NamedQuery(name = "Facturas.findBySerie", query = "SELECT f FROM Facturas f WHERE f.serie = :serie"),
    @NamedQuery(name = "Facturas.findByFolio", query = "SELECT f FROM Facturas f WHERE f.folio = :folio"),
    @NamedQuery(name = "Facturas.findByFechaFactura", query = "SELECT f FROM Facturas f WHERE f.fechaFactura = :fechaFactura"),
    @NamedQuery(name = "Facturas.findByNumeroPlaca", query = "SELECT f FROM Facturas f WHERE f.numeroPlaca = :numeroPlaca"),
    @NamedQuery(name = "Facturas.findByMonto", query = "SELECT f FROM Facturas f WHERE f.monto = :monto"),
    @NamedQuery(name = "Facturas.findByConcepto", query = "SELECT f FROM Facturas f WHERE f.concepto = :concepto"),
    @NamedQuery(name = "Facturas.findByRfcProveedor", query = "SELECT f FROM Facturas f WHERE f.rfcProveedor = :rfcProveedor")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "factura_id")
    private Integer facturaId;
    @Column(name = "serie")
    private String serie;
    @Column(name = "folio")
    private String folio;
    @Basic(optional = false)
    @Column(name = "fecha_factura")
    @Temporal(TemporalType.DATE)
    private Date fechaFactura;
    @Column(name = "numero_placa")
    private String numeroPlaca;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "monto")
    private BigDecimal monto;
    @Basic(optional = false)
    @Column(name = "concepto")
    private String concepto;
    @Basic(optional = false)
    @Column(name = "rfc_proveedor")
    private String rfcProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkFactura")
    private Collection<FacturasSolicitudes> facturasSolicitudesCollection;

    public Facturas() {
    }

    public Facturas(Integer facturaId) {
        this.facturaId = facturaId;
    }

    public Facturas(Integer facturaId, Date fechaFactura, BigDecimal monto, String concepto, String rfcProveedor) {
        this.facturaId = facturaId;
        this.fechaFactura = fechaFactura;
        this.monto = monto;
        this.concepto = concepto;
        this.rfcProveedor = rfcProveedor;
    }

    public Integer getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Integer facturaId) {
        this.facturaId = facturaId;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getRfcProveedor() {
        return rfcProveedor;
    }

    public void setRfcProveedor(String rfcProveedor) {
        this.rfcProveedor = rfcProveedor;
    }

    public Collection<FacturasSolicitudes> getFacturasSolicitudesCollection() {
        return facturasSolicitudesCollection;
    }

    public void setFacturasSolicitudesCollection(Collection<FacturasSolicitudes> facturasSolicitudesCollection) {
        this.facturasSolicitudesCollection = facturasSolicitudesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturaId != null ? facturaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.facturaId == null && other.facturaId != null) || (this.facturaId != null && !this.facturaId.equals(other.facturaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Facturas[ facturaId=" + facturaId + " ]";
    }
    
}
