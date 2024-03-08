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
@Table(name = "solicitudes_honorarios")
@NamedQueries({
    @NamedQuery(name = "SolicitudesHonorarios.findAll", query = "SELECT s FROM SolicitudesHonorarios s"),
    @NamedQuery(name = "SolicitudesHonorarios.findBySolicitudHonorarioId", query = "SELECT s FROM SolicitudesHonorarios s WHERE s.solicitudHonorarioId = :solicitudHonorarioId"),
    @NamedQuery(name = "SolicitudesHonorarios.findByMontoParcial", query = "SELECT s FROM SolicitudesHonorarios s WHERE s.montoParcial = :montoParcial")})
public class SolicitudesHonorarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "solicitud_honorario_id")
    private Integer solicitudHonorarioId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto_parcial")
    private BigDecimal montoParcial;
    @JoinColumn(name = "fk_honorario", referencedColumnName = "honorarios_id")
    @ManyToOne
    private Honorarios fkHonorario;
    @JoinColumn(name = "fk_solicitud", referencedColumnName = "solicitud_id")
    @ManyToOne
    private SolicitudesRecursos fkSolicitud;

    public SolicitudesHonorarios() {
    }

    public SolicitudesHonorarios(Integer solicitudHonorarioId) {
        this.solicitudHonorarioId = solicitudHonorarioId;
    }

    public Integer getSolicitudHonorarioId() {
        return solicitudHonorarioId;
    }

    public void setSolicitudHonorarioId(Integer solicitudHonorarioId) {
        this.solicitudHonorarioId = solicitudHonorarioId;
    }

    public BigDecimal getMontoParcial() {
        return montoParcial;
    }

    public void setMontoParcial(BigDecimal montoParcial) {
        this.montoParcial = montoParcial;
    }

    public Honorarios getFkHonorario() {
        return fkHonorario;
    }

    public void setFkHonorario(Honorarios fkHonorario) {
        this.fkHonorario = fkHonorario;
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
        hash += (solicitudHonorarioId != null ? solicitudHonorarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudesHonorarios)) {
            return false;
        }
        SolicitudesHonorarios other = (SolicitudesHonorarios) object;
        if ((this.solicitudHonorarioId == null && other.solicitudHonorarioId != null) || (this.solicitudHonorarioId != null && !this.solicitudHonorarioId.equals(other.solicitudHonorarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.SolicitudesHonorarios[ solicitudHonorarioId=" + solicitudHonorarioId + " ]";
    }
    
}
