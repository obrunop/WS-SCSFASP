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
public class PedidoSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidoSolicitudPK pedidoSolicitudPK;
    @Basic(optional = false)
    @Column(name = "fk_no_tramite")
    private String fkNoTramite;
    @JoinColumn(name = "fk_solicitud_id", referencedColumnName = "solicitud_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SolicitudRecurso solicitudRecurso;

    public PedidoSolicitud() {
    }

    public PedidoSolicitud(PedidoSolicitudPK pedidoSolicitudPK) {
        this.pedidoSolicitudPK = pedidoSolicitudPK;
    }

    public PedidoSolicitud(PedidoSolicitudPK pedidoSolicitudPK, String fkNoTramite) {
        this.pedidoSolicitudPK = pedidoSolicitudPK;
        this.fkNoTramite = fkNoTramite;
    }

    public PedidoSolicitud(String pedido, int fkSolicitudId) {
        this.pedidoSolicitudPK = new PedidoSolicitudPK(pedido, fkSolicitudId);
    }

    public PedidoSolicitudPK getPedidosSolicitudesPK() {
        return pedidoSolicitudPK;
    }

    public void setPedidosSolicitudesPK(PedidoSolicitudPK pedidoSolicitudPK) {
        this.pedidoSolicitudPK = pedidoSolicitudPK;
    }

    public String getFkNoTramite() {
        return fkNoTramite;
    }

    public void setFkNoTramite(String fkNoTramite) {
        this.fkNoTramite = fkNoTramite;
    }

    public SolicitudRecurso getSolicitudesRecursos() {
        return solicitudRecurso;
    }

    public void setSolicitudesRecursos(SolicitudRecurso solicitudRecurso) {
        this.solicitudRecurso = solicitudRecurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoSolicitudPK != null ? pedidoSolicitudPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoSolicitud)) {
            return false;
        }
        PedidoSolicitud other = (PedidoSolicitud) object;
        if ((this.pedidoSolicitudPK == null && other.pedidoSolicitudPK != null) || (this.pedidoSolicitudPK != null && !this.pedidoSolicitudPK.equals(other.pedidoSolicitudPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.PedidosSolicitudes[ pedidosSolicitudesPK=" + pedidoSolicitudPK + " ]";
    }
    
}
