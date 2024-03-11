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
@Table(name = "montos_adecuaciones")
@NamedQueries({
    @NamedQuery(name = "MontosAdecuaciones.findAll", query = "SELECT m FROM MontosAdecuaciones m"),
    @NamedQuery(name = "MontosAdecuaciones.findByHistorialId", query = "SELECT m FROM MontosAdecuaciones m WHERE m.historialId = :historialId"),
    @NamedQuery(name = "MontosAdecuaciones.findByFaspFederal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.faspFederal = :faspFederal"),
    @NamedQuery(name = "MontosAdecuaciones.findByFaspMunicipal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.faspMunicipal = :faspMunicipal"),
    @NamedQuery(name = "MontosAdecuaciones.findByFaspSubtotal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.faspSubtotal = :faspSubtotal"),
    @NamedQuery(name = "MontosAdecuaciones.findByAportacionEstatal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.aportacionEstatal = :aportacionEstatal"),
    @NamedQuery(name = "MontosAdecuaciones.findByAportacionMunicipal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.aportacionMunicipal = :aportacionMunicipal"),
    @NamedQuery(name = "MontosAdecuaciones.findByAportacionSubtotal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.aportacionSubtotal = :aportacionSubtotal"),
    @NamedQuery(name = "MontosAdecuaciones.findByTotalPresupuesto", query = "SELECT m FROM MontosAdecuaciones m WHERE m.totalPresupuesto = :totalPresupuesto"),
    @NamedQuery(name = "MontosAdecuaciones.findByCantidadFed", query = "SELECT m FROM MontosAdecuaciones m WHERE m.cantidadFed = :cantidadFed"),
    @NamedQuery(name = "MontosAdecuaciones.findByPersonaFed", query = "SELECT m FROM MontosAdecuaciones m WHERE m.personaFed = :personaFed"),
    @NamedQuery(name = "MontosAdecuaciones.findByCantidadMpal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.cantidadMpal = :cantidadMpal"),
    @NamedQuery(name = "MontosAdecuaciones.findByPersonaMpal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.personaMpal = :personaMpal"),
    @NamedQuery(name = "MontosAdecuaciones.findByCantidadEst", query = "SELECT m FROM MontosAdecuaciones m WHERE m.cantidadEst = :cantidadEst"),
    @NamedQuery(name = "MontosAdecuaciones.findByPersonaEst", query = "SELECT m FROM MontosAdecuaciones m WHERE m.personaEst = :personaEst"),
    @NamedQuery(name = "MontosAdecuaciones.findByCantidadTotal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.cantidadTotal = :cantidadTotal"),
    @NamedQuery(name = "MontosAdecuaciones.findByPersonaTotal", query = "SELECT m FROM MontosAdecuaciones m WHERE m.personaTotal = :personaTotal")})
public class MontoAdecuacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "historial_id")
    private Integer historialId;
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
    @Basic(optional = false)
    @Column(name = "cantidad_fed")
    private int cantidadFed;
    @Basic(optional = false)
    @Column(name = "persona_fed")
    private int personaFed;
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
    @JoinColumn(name = "fk_adecuacion_presupuestal", referencedColumnName = "adecuacion_id")
    @ManyToOne
    private AdecuacionPresupuestal fkAdecuacionPresupuestal;
    @JoinColumn(name = "fk_detalle_estructura", referencedColumnName = "detalle_id")
    @ManyToOne
    private DetalleEstructura fkDetalleEstructura;
    @JoinColumn(name = "fk_tipo_adecuacion", referencedColumnName = "tipo_adecuacion_id")
    @ManyToOne
    private TipoAdecuacion fkTipoAdecuacion;

    public MontoAdecuacion() {
    }

    public MontoAdecuacion(Integer historialId) {
        this.historialId = historialId;
    }

    public MontoAdecuacion(Integer historialId, BigDecimal faspFederal, BigDecimal faspMunicipal, BigDecimal aportacionEstatal, BigDecimal aportacionMunicipal, int cantidadFed, int personaFed) {
        this.historialId = historialId;
        this.faspFederal = faspFederal;
        this.faspMunicipal = faspMunicipal;
        this.aportacionEstatal = aportacionEstatal;
        this.aportacionMunicipal = aportacionMunicipal;
        this.cantidadFed = cantidadFed;
        this.personaFed = personaFed;
    }

    public Integer getHistorialId() {
        return historialId;
    }

    public void setHistorialId(Integer historialId) {
        this.historialId = historialId;
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

    public int getCantidadFed() {
        return cantidadFed;
    }

    public void setCantidadFed(int cantidadFed) {
        this.cantidadFed = cantidadFed;
    }

    public int getPersonaFed() {
        return personaFed;
    }

    public void setPersonaFed(int personaFed) {
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

    public AdecuacionPresupuestal getFkAdecuacionPresupuestal() {
        return fkAdecuacionPresupuestal;
    }

    public void setFkAdecuacionPresupuestal(AdecuacionPresupuestal fkAdecuacionPresupuestal) {
        this.fkAdecuacionPresupuestal = fkAdecuacionPresupuestal;
    }

    public DetalleEstructura getFkDetalleEstructura() {
        return fkDetalleEstructura;
    }

    public void setFkDetalleEstructura(DetalleEstructura fkDetalleEstructura) {
        this.fkDetalleEstructura = fkDetalleEstructura;
    }

    public TipoAdecuacion getFkTipoAdecuacion() {
        return fkTipoAdecuacion;
    }

    public void setFkTipoAdecuacion(TipoAdecuacion fkTipoAdecuacion) {
        this.fkTipoAdecuacion = fkTipoAdecuacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historialId != null ? historialId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MontoAdecuacion)) {
            return false;
        }
        MontoAdecuacion other = (MontoAdecuacion) object;
        if ((this.historialId == null && other.historialId != null) || (this.historialId != null && !this.historialId.equals(other.historialId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.MontosAdecuaciones[ historialId=" + historialId + " ]";
    }
    
}
