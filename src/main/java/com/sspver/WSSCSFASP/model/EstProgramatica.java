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
import java.util.Collection;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "est_programatica")
@NamedQueries({
    @NamedQuery(name = "EstProgramatica.findAll", query = "SELECT e FROM EstProgramatica e"),
    @NamedQuery(name = "EstProgramatica.findByEstructuraId", query = "SELECT e FROM EstProgramatica e WHERE e.estructuraId = :estructuraId"),
    @NamedQuery(name = "EstProgramatica.findByFecha", query = "SELECT e FROM EstProgramatica e WHERE e.fecha = :fecha")})
public class EstProgramatica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "estructura_id")
    private Integer estructuraId;
    @Column(name = "fecha")
    private Short fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkEstructura")
    private Collection<DetallesEstructuras> detallesEstructurasCollection;
    @JoinColumn(name = "fk_entidad", referencedColumnName = "entidad_id")
    @ManyToOne
    private Entidades fkEntidad;

    public EstProgramatica() {
    }

    public EstProgramatica(Integer estructuraId) {
        this.estructuraId = estructuraId;
    }

    public Integer getEstructuraId() {
        return estructuraId;
    }

    public void setEstructuraId(Integer estructuraId) {
        this.estructuraId = estructuraId;
    }

    public Short getFecha() {
        return fecha;
    }

    public void setFecha(Short fecha) {
        this.fecha = fecha;
    }

    public Collection<DetallesEstructuras> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetallesEstructuras> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
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
        hash += (estructuraId != null ? estructuraId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstProgramatica)) {
            return false;
        }
        EstProgramatica other = (EstProgramatica) object;
        if ((this.estructuraId == null && other.estructuraId != null) || (this.estructuraId != null && !this.estructuraId.equals(other.estructuraId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.EstProgramatica[ estructuraId=" + estructuraId + " ]";
    }
    
}
