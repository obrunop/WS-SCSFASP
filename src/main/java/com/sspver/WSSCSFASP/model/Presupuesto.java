package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
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
import java.math.BigDecimal;
import java.util.Collection;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "presupuestos")
@NamedQueries({
    @NamedQuery(name = "Presupuestos.findAll", query = "SELECT p FROM Presupuestos p"),
    @NamedQuery(name = "Presupuestos.findByPresupuestoId", query = "SELECT p FROM Presupuestos p WHERE p.presupuestoId = :presupuestoId"),
    @NamedQuery(name = "Presupuestos.findByFaspFederal", query = "SELECT p FROM Presupuestos p WHERE p.faspFederal = :faspFederal"),
    @NamedQuery(name = "Presupuestos.findByFaspMunicipal", query = "SELECT p FROM Presupuestos p WHERE p.faspMunicipal = :faspMunicipal"),
    @NamedQuery(name = "Presupuestos.findByFaspSubtotal", query = "SELECT p FROM Presupuestos p WHERE p.faspSubtotal = :faspSubtotal"),
    @NamedQuery(name = "Presupuestos.findByAportacionEstatal", query = "SELECT p FROM Presupuestos p WHERE p.aportacionEstatal = :aportacionEstatal"),
    @NamedQuery(name = "Presupuestos.findByAportacionMunicipal", query = "SELECT p FROM Presupuestos p WHERE p.aportacionMunicipal = :aportacionMunicipal"),
    @NamedQuery(name = "Presupuestos.findByAportacionSubtotal", query = "SELECT p FROM Presupuestos p WHERE p.aportacionSubtotal = :aportacionSubtotal"),
    @NamedQuery(name = "Presupuestos.findByTotalPresupuesto", query = "SELECT p FROM Presupuestos p WHERE p.totalPresupuesto = :totalPresupuesto"),
    @NamedQuery(name = "Presupuestos.findByCantidadFed", query = "SELECT p FROM Presupuestos p WHERE p.cantidadFed = :cantidadFed"),
    @NamedQuery(name = "Presupuestos.findByPersonaFed", query = "SELECT p FROM Presupuestos p WHERE p.personaFed = :personaFed"),
    @NamedQuery(name = "Presupuestos.findByCantidadMpal", query = "SELECT p FROM Presupuestos p WHERE p.cantidadMpal = :cantidadMpal"),
    @NamedQuery(name = "Presupuestos.findByPersonaMpal", query = "SELECT p FROM Presupuestos p WHERE p.personaMpal = :personaMpal"),
    @NamedQuery(name = "Presupuestos.findByCantidadEst", query = "SELECT p FROM Presupuestos p WHERE p.cantidadEst = :cantidadEst"),
    @NamedQuery(name = "Presupuestos.findByPersonaEst", query = "SELECT p FROM Presupuestos p WHERE p.personaEst = :personaEst"),
    @NamedQuery(name = "Presupuestos.findByCantidadTotal", query = "SELECT p FROM Presupuestos p WHERE p.cantidadTotal = :cantidadTotal"),
    @NamedQuery(name = "Presupuestos.findByPersonaTotal", query = "SELECT p FROM Presupuestos p WHERE p.personaTotal = :personaTotal")})
public class Presupuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "presupuesto_id")
    private Integer presupuestoId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkPresupuestoId")
    private Collection<HistorialPresupuesto> historialPresupuestosCollection;
    @JoinColumn(name = "fk_detalle_ep", referencedColumnName = "detalle_id")
    @ManyToOne(optional = false)
    private DetalleEstructura fkDetalleEp;
    @JoinColumn(name = "fk_tipo", referencedColumnName = "tipo_id")
    @ManyToOne(optional = false)
    private TipoPresupuesto fkTipo;

    public Presupuesto() {
    }

    public Presupuesto(Integer presupuestoId) {
        this.presupuestoId = presupuestoId;
    }

    public Presupuesto(Integer presupuestoId, BigDecimal faspFederal, BigDecimal faspMunicipal, BigDecimal aportacionEstatal, BigDecimal aportacionMunicipal) {
        this.presupuestoId = presupuestoId;
        this.faspFederal = faspFederal;
        this.faspMunicipal = faspMunicipal;
        this.aportacionEstatal = aportacionEstatal;
        this.aportacionMunicipal = aportacionMunicipal;
    }

    public Integer getPresupuestoId() {
        return presupuestoId;
    }

    public void setPresupuestoId(Integer presupuestoId) {
        this.presupuestoId = presupuestoId;
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

    public Collection<HistorialPresupuesto> getHistorialPresupuestosCollection() {
        return historialPresupuestosCollection;
    }

    public void setHistorialPresupuestosCollection(Collection<HistorialPresupuesto> historialPresupuestosCollection) {
        this.historialPresupuestosCollection = historialPresupuestosCollection;
    }

    public DetalleEstructura getFkDetalleEp() {
        return fkDetalleEp;
    }

    public void setFkDetalleEp(DetalleEstructura fkDetalleEp) {
        this.fkDetalleEp = fkDetalleEp;
    }

    public TipoPresupuesto getFkTipo() {
        return fkTipo;
    }

    public void setFkTipo(TipoPresupuesto fkTipo) {
        this.fkTipo = fkTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (presupuestoId != null ? presupuestoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presupuesto)) {
            return false;
        }
        Presupuesto other = (Presupuesto) object;
        if ((this.presupuestoId == null && other.presupuestoId != null) || (this.presupuestoId != null && !this.presupuestoId.equals(other.presupuestoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Presupuestos[ presupuestoId=" + presupuestoId + " ]";
    }
    
}
