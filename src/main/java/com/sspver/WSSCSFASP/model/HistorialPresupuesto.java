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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "historial_presupuestos")
@NamedQueries({
    @NamedQuery(name = "HistorialPresupuestos.findAll", query = "SELECT h FROM HistorialPresupuestos h"),
    @NamedQuery(name = "HistorialPresupuestos.findByHistorialPtoId", query = "SELECT h FROM HistorialPresupuestos h WHERE h.historialPtoId = :historialPtoId"),
    @NamedQuery(name = "HistorialPresupuestos.findByFecha", query = "SELECT h FROM HistorialPresupuestos h WHERE h.fecha = :fecha"),
    @NamedQuery(name = "HistorialPresupuestos.findByFaspFederal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.faspFederal = :faspFederal"),
    @NamedQuery(name = "HistorialPresupuestos.findByFaspMunicipal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.faspMunicipal = :faspMunicipal"),
    @NamedQuery(name = "HistorialPresupuestos.findByFaspSubtotal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.faspSubtotal = :faspSubtotal"),
    @NamedQuery(name = "HistorialPresupuestos.findByAportacionEstatal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.aportacionEstatal = :aportacionEstatal"),
    @NamedQuery(name = "HistorialPresupuestos.findByAportacionMunicipal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.aportacionMunicipal = :aportacionMunicipal"),
    @NamedQuery(name = "HistorialPresupuestos.findByAportacionSubtotal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.aportacionSubtotal = :aportacionSubtotal"),
    @NamedQuery(name = "HistorialPresupuestos.findByTotalPresupuesto", query = "SELECT h FROM HistorialPresupuestos h WHERE h.totalPresupuesto = :totalPresupuesto"),
    @NamedQuery(name = "HistorialPresupuestos.findByCantidadFed", query = "SELECT h FROM HistorialPresupuestos h WHERE h.cantidadFed = :cantidadFed"),
    @NamedQuery(name = "HistorialPresupuestos.findByPersonaFed", query = "SELECT h FROM HistorialPresupuestos h WHERE h.personaFed = :personaFed"),
    @NamedQuery(name = "HistorialPresupuestos.findByCantidadMpal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.cantidadMpal = :cantidadMpal"),
    @NamedQuery(name = "HistorialPresupuestos.findByPersonaMpal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.personaMpal = :personaMpal"),
    @NamedQuery(name = "HistorialPresupuestos.findByCantidadEst", query = "SELECT h FROM HistorialPresupuestos h WHERE h.cantidadEst = :cantidadEst"),
    @NamedQuery(name = "HistorialPresupuestos.findByPersonaEst", query = "SELECT h FROM HistorialPresupuestos h WHERE h.personaEst = :personaEst"),
    @NamedQuery(name = "HistorialPresupuestos.findByCantidadTotal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.cantidadTotal = :cantidadTotal"),
    @NamedQuery(name = "HistorialPresupuestos.findByPersonaTotal", query = "SELECT h FROM HistorialPresupuestos h WHERE h.personaTotal = :personaTotal")})
public class HistorialPresupuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "historial_pto_id")
    private Integer historialPtoId;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "fasp_federal")
    private BigDecimal faspFederal;
    @Basic(optional = false)
    @Column(name = "fasp_municipal")
    private BigDecimal faspMunicipal;
    @Column(name = "fasp_subtotal")
    private BigDecimal faspSubtotal;
    @Basic(optional = false)
    @Column(name = "aportacion_estatal")
    private BigDecimal aportacionEstatal;
    @Basic(optional = false)
    @Column(name = "aportacion_municipal")
    private BigDecimal aportacionMunicipal;
    @Column(name = "aportacion_subtotal")
    private BigDecimal aportacionSubtotal;
    @Column(name = "total_presupuesto")
    private BigDecimal totalPresupuesto;
    @Column(name = "cantidad_fed")
    private Integer cantidadFed;
    @Column(name = "persona_fed")
    private Integer personaFed;
    @Column(name = "cantidad_mpal")
    private Integer cantidadMpal;
    @Column(name = "persona_mpal")
    private Integer personaMpal;
    @Column(name = "cantidad_est")
    private Integer cantidadEst;
    @Column(name = "persona_est")
    private Integer personaEst;
    @Column(name = "cantidad_total")
    private Integer cantidadTotal;
    @Column(name = "persona_total")
    private Integer personaTotal;
    @JoinColumn(name = "fk_presupuesto_id", referencedColumnName = "presupuesto_id")
    @ManyToOne(optional = false)
    private Presupuesto fkPresupuestoId;

    public HistorialPresupuesto() {
    }

    public HistorialPresupuesto(Integer historialPtoId) {
        this.historialPtoId = historialPtoId;
    }

    public HistorialPresupuesto(Integer historialPtoId, Date fecha, BigDecimal faspFederal, BigDecimal faspMunicipal, BigDecimal aportacionEstatal, BigDecimal aportacionMunicipal) {
        this.historialPtoId = historialPtoId;
        this.fecha = fecha;
        this.faspFederal = faspFederal;
        this.faspMunicipal = faspMunicipal;
        this.aportacionEstatal = aportacionEstatal;
        this.aportacionMunicipal = aportacionMunicipal;
    }

    public Integer getHistorialPtoId() {
        return historialPtoId;
    }

    public void setHistorialPtoId(Integer historialPtoId) {
        this.historialPtoId = historialPtoId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getFaspFederal() {
        return faspFederal;
    }

    public void setFaspFederal(BigDecimal faspFederal) {
        this.faspFederal = faspFederal;
    }

    public BigDecimal getFaspMunicipal() {
        return faspMunicipal;
    }

    public void setFaspMunicipal(BigDecimal faspMunicipal) {
        this.faspMunicipal = faspMunicipal;
    }

    public BigDecimal getFaspSubtotal() {
        return faspSubtotal;
    }

    public void setFaspSubtotal(BigDecimal faspSubtotal) {
        this.faspSubtotal = faspSubtotal;
    }

    public BigDecimal getAportacionEstatal() {
        return aportacionEstatal;
    }

    public void setAportacionEstatal(BigDecimal aportacionEstatal) {
        this.aportacionEstatal = aportacionEstatal;
    }

    public BigDecimal getAportacionMunicipal() {
        return aportacionMunicipal;
    }

    public void setAportacionMunicipal(BigDecimal aportacionMunicipal) {
        this.aportacionMunicipal = aportacionMunicipal;
    }

    public BigDecimal getAportacionSubtotal() {
        return aportacionSubtotal;
    }

    public void setAportacionSubtotal(BigDecimal aportacionSubtotal) {
        this.aportacionSubtotal = aportacionSubtotal;
    }

    public BigDecimal getTotalPresupuesto() {
        return totalPresupuesto;
    }

    public void setTotalPresupuesto(BigDecimal totalPresupuesto) {
        this.totalPresupuesto = totalPresupuesto;
    }

    public Integer getCantidadFed() {
        return cantidadFed;
    }

    public void setCantidadFed(Integer cantidadFed) {
        this.cantidadFed = cantidadFed;
    }

    public Integer getPersonaFed() {
        return personaFed;
    }

    public void setPersonaFed(Integer personaFed) {
        this.personaFed = personaFed;
    }

    public Integer getCantidadMpal() {
        return cantidadMpal;
    }

    public void setCantidadMpal(Integer cantidadMpal) {
        this.cantidadMpal = cantidadMpal;
    }

    public Integer getPersonaMpal() {
        return personaMpal;
    }

    public void setPersonaMpal(Integer personaMpal) {
        this.personaMpal = personaMpal;
    }

    public Integer getCantidadEst() {
        return cantidadEst;
    }

    public void setCantidadEst(Integer cantidadEst) {
        this.cantidadEst = cantidadEst;
    }

    public Integer getPersonaEst() {
        return personaEst;
    }

    public void setPersonaEst(Integer personaEst) {
        this.personaEst = personaEst;
    }

    public Integer getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Integer cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public Integer getPersonaTotal() {
        return personaTotal;
    }

    public void setPersonaTotal(Integer personaTotal) {
        this.personaTotal = personaTotal;
    }

    public Presupuesto getFkPresupuestoId() {
        return fkPresupuestoId;
    }

    public void setFkPresupuestoId(Presupuesto fkPresupuestoId) {
        this.fkPresupuestoId = fkPresupuestoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historialPtoId != null ? historialPtoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialPresupuesto)) {
            return false;
        }
        HistorialPresupuesto other = (HistorialPresupuesto) object;
        if ((this.historialPtoId == null && other.historialPtoId != null) || (this.historialPtoId != null && !this.historialPtoId.equals(other.historialPtoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.HistorialPresupuestos[ historialPtoId=" + historialPtoId + " ]";
    }
    
}
