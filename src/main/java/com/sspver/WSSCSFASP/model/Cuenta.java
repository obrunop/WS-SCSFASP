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
@Table(name = "cuentas")
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c"),
    @NamedQuery(name = "Cuentas.findByCuentaId", query = "SELECT c FROM Cuentas c WHERE c.cuentaId = :cuentaId"),
    @NamedQuery(name = "Cuentas.findByCuentaPartida", query = "SELECT c FROM Cuentas c WHERE c.cuentaPartida = :cuentaPartida"),
    @NamedQuery(name = "Cuentas.findByNombrePartida", query = "SELECT c FROM Cuentas c WHERE c.nombrePartida = :nombrePartida"),
    @NamedQuery(name = "Cuentas.findByFecha", query = "SELECT c FROM Cuentas c WHERE c.fecha = :fecha")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cuenta_id")
    private Integer cuentaId;
    @Basic(optional = false)
    @Column(name = "cuenta_partida")
    private String cuentaPartida;
    @Column(name = "nombre_partida")
    private String nombrePartida;
    @Column(name = "fecha")
    private Short fecha;
    @JoinColumn(name = "fk_entidad", referencedColumnName = "entidad_id")
    @ManyToOne
    private Entidad fkEntidad;

    public Cuenta() {
    }

    public Cuenta(Integer cuentaId) {
        this.cuentaId = cuentaId;
    }

    public Cuenta(Integer cuentaId, String cuentaPartida) {
        this.cuentaId = cuentaId;
        this.cuentaPartida = cuentaPartida;
    }

    public Integer getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(Integer cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getCuentaPartida() {
        return cuentaPartida;
    }

    public void setCuentaPartida(String cuentaPartida) {
        this.cuentaPartida = cuentaPartida;
    }

    public String getNombrePartida() {
        return nombrePartida;
    }

    public void setNombrePartida(String nombrePartida) {
        this.nombrePartida = nombrePartida;
    }

    public Short getFecha() {
        return fecha;
    }

    public void setFecha(Short fecha) {
        this.fecha = fecha;
    }

    public Entidad getFkEntidad() {
        return fkEntidad;
    }

    public void setFkEntidad(Entidad fkEntidad) {
        this.fkEntidad = fkEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuentaId != null ? cuentaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.cuentaId == null && other.cuentaId != null) || (this.cuentaId != null && !this.cuentaId.equals(other.cuentaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Cuentas[ cuentaId=" + cuentaId + " ]";
    }
    
}
