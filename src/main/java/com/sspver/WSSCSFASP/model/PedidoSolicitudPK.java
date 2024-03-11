package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author obrunop
 */
@Embeddable
public class PedidoSolicitudPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "pedido")
    private String pedido;
    @Basic(optional = false)
    @Column(name = "fk_solicitud_id")
    private int fkSolicitudId;

    public PedidoSolicitudPK() {
    }

    public PedidoSolicitudPK(String pedido, int fkSolicitudId) {
        this.pedido = pedido;
        this.fkSolicitudId = fkSolicitudId;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getFkSolicitudId() {
        return fkSolicitudId;
    }

    public void setFkSolicitudId(int fkSolicitudId) {
        this.fkSolicitudId = fkSolicitudId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedido != null ? pedido.hashCode() : 0);
        hash += (int) fkSolicitudId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoSolicitudPK)) {
            return false;
        }
        PedidoSolicitudPK other = (PedidoSolicitudPK) object;
        if ((this.pedido == null && other.pedido != null) || (this.pedido != null && !this.pedido.equals(other.pedido))) {
            return false;
        }
        if (this.fkSolicitudId != other.fkSolicitudId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.PedidosSolicitudesPK[ pedido=" + pedido + ", fkSolicitudId=" + fkSolicitudId + " ]";
    }
    
}
