package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "pedidos_solicitudes")
@NamedQueries({
    @NamedQuery(name = "PedidosSolicitudes.findAll", query = "SELECT p FROM PedidosSolicitudes p"),
    @NamedQuery(name = "PedidosSolicitudes.findByPedido", query = "SELECT p FROM PedidosSolicitudes p WHERE p.pedidosSolicitudesPK.pedido = :pedido"),
    @NamedQuery(name = "PedidosSolicitudes.findByFkSolicitudId", query = "SELECT p FROM PedidosSolicitudes p WHERE p.pedidosSolicitudesPK.fkSolicitudId = :fkSolicitudId"),
    @NamedQuery(name = "PedidosSolicitudes.findByFkNoTramite", query = "SELECT p FROM PedidosSolicitudes p WHERE p.fkNoTramite = :fkNoTramite")})
public class PedidosSolicitudes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidosSolicitudesPK pedidosSolicitudesPK;
    @Basic(optional = false)
    @Column(name = "fk_no_tramite")
    private String fkNoTramite;
    @JoinColumn(name = "fk_solicitud_id", referencedColumnName = "solicitud_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SolicitudesRecursos solicitudesRecursos;

    public PedidosSolicitudes() {
    }

    public PedidosSolicitudes(PedidosSolicitudesPK pedidosSolicitudesPK) {
        this.pedidosSolicitudesPK = pedidosSolicitudesPK;
    }

    public PedidosSolicitudes(PedidosSolicitudesPK pedidosSolicitudesPK, String fkNoTramite) {
        this.pedidosSolicitudesPK = pedidosSolicitudesPK;
        this.fkNoTramite = fkNoTramite;
    }

    public PedidosSolicitudes(String pedido, int fkSolicitudId) {
        this.pedidosSolicitudesPK = new PedidosSolicitudesPK(pedido, fkSolicitudId);
    }

    public PedidosSolicitudesPK getPedidosSolicitudesPK() {
        return pedidosSolicitudesPK;
    }

    public void setPedidosSolicitudesPK(PedidosSolicitudesPK pedidosSolicitudesPK) {
        this.pedidosSolicitudesPK = pedidosSolicitudesPK;
    }

    public String getFkNoTramite() {
        return fkNoTramite;
    }

    public void setFkNoTramite(String fkNoTramite) {
        this.fkNoTramite = fkNoTramite;
    }

    public SolicitudesRecursos getSolicitudesRecursos() {
        return solicitudesRecursos;
    }

    public void setSolicitudesRecursos(SolicitudesRecursos solicitudesRecursos) {
        this.solicitudesRecursos = solicitudesRecursos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidosSolicitudesPK != null ? pedidosSolicitudesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidosSolicitudes)) {
            return false;
        }
        PedidosSolicitudes other = (PedidosSolicitudes) object;
        if ((this.pedidosSolicitudesPK == null && other.pedidosSolicitudesPK != null) || (this.pedidosSolicitudesPK != null && !this.pedidosSolicitudesPK.equals(other.pedidosSolicitudesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.PedidosSolicitudes[ pedidosSolicitudesPK=" + pedidosSolicitudesPK + " ]";
    }
    
}
