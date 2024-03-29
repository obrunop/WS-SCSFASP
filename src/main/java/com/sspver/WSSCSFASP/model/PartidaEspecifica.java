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
@Table(name = "partidas_especificas")
@NamedQueries({
    @NamedQuery(name = "PartidasEspecificas.findAll", query = "SELECT p FROM PartidasEspecificas p"),
    @NamedQuery(name = "PartidasEspecificas.findByPespecificaId", query = "SELECT p FROM PartidasEspecificas p WHERE p.pespecificaId = :pespecificaId"),
    @NamedQuery(name = "PartidasEspecificas.findByClavePespecifica", query = "SELECT p FROM PartidasEspecificas p WHERE p.clavePespecifica = :clavePespecifica"),
    @NamedQuery(name = "PartidasEspecificas.findByNombrePespecifica", query = "SELECT p FROM PartidasEspecificas p WHERE p.nombrePespecifica = :nombrePespecifica"),
    @NamedQuery(name = "PartidasEspecificas.findByAnioCreacion", query = "SELECT p FROM PartidasEspecificas p WHERE p.anioCreacion = :anioCreacion")})
public class PartidaEspecifica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pespecifica_id")
    private Integer pespecificaId;
    @Column(name = "clave_pespecifica")
    private String clavePespecifica;
    @Basic(optional = false)
    @Column(name = "nombre_pespecifica")
    private String nombrePespecifica;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @JoinColumn(name = "fk_pgenerica", referencedColumnName = "pgenerica_id")
    @ManyToOne
    private PartidaGenerica fkPgenerica;
    @OneToMany(mappedBy = "fkPespecifica")
    private Collection<DetalleEstructura> detallesEstructurasCollection;
    @OneToMany(mappedBy = "fkPespecifica")
    private Collection<Bien> bienesCollection;

    public PartidaEspecifica() {
    }

    public PartidaEspecifica(Integer pespecificaId) {
        this.pespecificaId = pespecificaId;
    }

    public PartidaEspecifica(Integer pespecificaId, String nombrePespecifica) {
        this.pespecificaId = pespecificaId;
        this.nombrePespecifica = nombrePespecifica;
    }

    public Integer getPespecificaId() {
        return pespecificaId;
    }

    public void setPespecificaId(Integer pespecificaId) {
        this.pespecificaId = pespecificaId;
    }

    public String getClavePespecifica() {
        return clavePespecifica;
    }

    public void setClavePespecifica(String clavePespecifica) {
        this.clavePespecifica = clavePespecifica;
    }

    public String getNombrePespecifica() {
        return nombrePespecifica;
    }

    public void setNombrePespecifica(String nombrePespecifica) {
        this.nombrePespecifica = nombrePespecifica;
    }

    public Short getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Short anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public PartidaGenerica getFkPgenerica() {
        return fkPgenerica;
    }

    public void setFkPgenerica(PartidaGenerica fkPgenerica) {
        this.fkPgenerica = fkPgenerica;
    }

    public Collection<DetalleEstructura> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetalleEstructura> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    public Collection<Bien> getBienesCollection() {
        return bienesCollection;
    }

    public void setBienesCollection(Collection<Bien> bienesCollection) {
        this.bienesCollection = bienesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pespecificaId != null ? pespecificaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartidaEspecifica)) {
            return false;
        }
        PartidaEspecifica other = (PartidaEspecifica) object;
        if ((this.pespecificaId == null && other.pespecificaId != null) || (this.pespecificaId != null && !this.pespecificaId.equals(other.pespecificaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.PartidasEspecificas[ pespecificaId=" + pespecificaId + " ]";
    }
    
}
