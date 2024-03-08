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
@Table(name = "claves_entidades")
@NamedQueries({
    @NamedQuery(name = "ClavesEntidades.findAll", query = "SELECT c FROM ClavesEntidades c"),
    @NamedQuery(name = "ClavesEntidades.findByClaveId", query = "SELECT c FROM ClavesEntidades c WHERE c.claveId = :claveId"),
    @NamedQuery(name = "ClavesEntidades.findByClaveE", query = "SELECT c FROM ClavesEntidades c WHERE c.claveE = :claveE"),
    @NamedQuery(name = "ClavesEntidades.findByClaveI", query = "SELECT c FROM ClavesEntidades c WHERE c.claveI = :claveI"),
    @NamedQuery(name = "ClavesEntidades.findByFecha", query = "SELECT c FROM ClavesEntidades c WHERE c.fecha = :fecha")})
public class ClavesEntidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "clave_id")
    private Integer claveId;
    @Basic(optional = false)
    @Column(name = "clave_e")
    private String claveE;
    @Basic(optional = false)
    @Column(name = "clave_i")
    private String claveI;
    @Column(name = "fecha")
    private Short fecha;
    @JoinColumn(name = "fk_entidad", referencedColumnName = "entidad_id")
    @ManyToOne
    private Entidades fkEntidad;

    public ClavesEntidades() {
    }

    public ClavesEntidades(Integer claveId) {
        this.claveId = claveId;
    }

    public ClavesEntidades(Integer claveId, String claveE, String claveI) {
        this.claveId = claveId;
        this.claveE = claveE;
        this.claveI = claveI;
    }

    public Integer getClaveId() {
        return claveId;
    }

    public void setClaveId(Integer claveId) {
        this.claveId = claveId;
    }

    public String getClaveE() {
        return claveE;
    }

    public void setClaveE(String claveE) {
        this.claveE = claveE;
    }

    public String getClaveI() {
        return claveI;
    }

    public void setClaveI(String claveI) {
        this.claveI = claveI;
    }

    public Short getFecha() {
        return fecha;
    }

    public void setFecha(Short fecha) {
        this.fecha = fecha;
    }

    public Entidades getFkEntidad() {
        return fkEntidad;
    }

    public void setFkEntidad(Entidades fkEntidad) {
        this.fkEntidad = fkEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claveId != null ? claveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClavesEntidades)) {
            return false;
        }
        ClavesEntidades other = (ClavesEntidades) object;
        if ((this.claveId == null && other.claveId != null) || (this.claveId != null && !this.claveId.equals(other.claveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.ClavesEntidades[ claveId=" + claveId + " ]";
    }
    
}
