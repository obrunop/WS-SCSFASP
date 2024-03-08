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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "partidas_genericas")
@NamedQueries({
    @NamedQuery(name = "PartidasGenericas.findAll", query = "SELECT p FROM PartidasGenericas p"),
    @NamedQuery(name = "PartidasGenericas.findByPgenericaId", query = "SELECT p FROM PartidasGenericas p WHERE p.pgenericaId = :pgenericaId"),
    @NamedQuery(name = "PartidasGenericas.findByClavePgenerica", query = "SELECT p FROM PartidasGenericas p WHERE p.clavePgenerica = :clavePgenerica"),
    @NamedQuery(name = "PartidasGenericas.findByNombrePgenerica", query = "SELECT p FROM PartidasGenericas p WHERE p.nombrePgenerica = :nombrePgenerica"),
    @NamedQuery(name = "PartidasGenericas.findByAnioCreacion", query = "SELECT p FROM PartidasGenericas p WHERE p.anioCreacion = :anioCreacion")})
public class PartidasGenericas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pgenerica_id")
    private Integer pgenericaId;
    @Column(name = "clave_pgenerica")
    private String clavePgenerica;
    @Basic(optional = false)
    @Column(name = "nombre_pgenerica")
    private String nombrePgenerica;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @OneToMany(mappedBy = "fkPgenerica")
    private Collection<PartidasEspecificas> partidasEspecificasCollection;
    @OneToMany(mappedBy = "fkPgenerica")
    private Collection<DetallesEstructuras> detallesEstructurasCollection;
    @JoinColumn(name = "fk_concepto", referencedColumnName = "concepto_id")
    @ManyToOne
    private Conceptos fkConcepto;
    @OneToMany(mappedBy = "fkPgenerica")
    private Collection<Bienes> bienesCollection;

    public PartidasGenericas() {
    }

    public PartidasGenericas(Integer pgenericaId) {
        this.pgenericaId = pgenericaId;
    }

    public PartidasGenericas(Integer pgenericaId, String nombrePgenerica) {
        this.pgenericaId = pgenericaId;
        this.nombrePgenerica = nombrePgenerica;
    }

    public Integer getPgenericaId() {
        return pgenericaId;
    }

    public void setPgenericaId(Integer pgenericaId) {
        this.pgenericaId = pgenericaId;
    }

    public String getClavePgenerica() {
        return clavePgenerica;
    }

    public void setClavePgenerica(String clavePgenerica) {
        this.clavePgenerica = clavePgenerica;
    }

    public String getNombrePgenerica() {
        return nombrePgenerica;
    }

    public void setNombrePgenerica(String nombrePgenerica) {
        this.nombrePgenerica = nombrePgenerica;
    }

    public Short getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Short anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Collection<PartidasEspecificas> getPartidasEspecificasCollection() {
        return partidasEspecificasCollection;
    }

    public void setPartidasEspecificasCollection(Collection<PartidasEspecificas> partidasEspecificasCollection) {
        this.partidasEspecificasCollection = partidasEspecificasCollection;
    }

    public Collection<DetallesEstructuras> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetallesEstructuras> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    public Conceptos getFkConcepto() {
        return fkConcepto;
    }

    public void setFkConcepto(Conceptos fkConcepto) {
        this.fkConcepto = fkConcepto;
    }

    public Collection<Bienes> getBienesCollection() {
        return bienesCollection;
    }

    public void setBienesCollection(Collection<Bienes> bienesCollection) {
        this.bienesCollection = bienesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pgenericaId != null ? pgenericaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartidasGenericas)) {
            return false;
        }
        PartidasGenericas other = (PartidasGenericas) object;
        if ((this.pgenericaId == null && other.pgenericaId != null) || (this.pgenericaId != null && !this.pgenericaId.equals(other.pgenericaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.PartidasGenericas[ pgenericaId=" + pgenericaId + " ]";
    }
    
}
