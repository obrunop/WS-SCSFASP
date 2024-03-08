package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "entidades")
@NamedQueries({
    @NamedQuery(name = "Entidades.findAll", query = "SELECT e FROM Entidades e"),
    @NamedQuery(name = "Entidades.findByEntidadId", query = "SELECT e FROM Entidades e WHERE e.entidadId = :entidadId"),
    @NamedQuery(name = "Entidades.findByNombreEntidad", query = "SELECT e FROM Entidades e WHERE e.nombreEntidad = :nombreEntidad"),
    @NamedQuery(name = "Entidades.findByAbreviatura", query = "SELECT e FROM Entidades e WHERE e.abreviatura = :abreviatura"),
    @NamedQuery(name = "Entidades.findByClaveE", query = "SELECT e FROM Entidades e WHERE e.claveE = :claveE"),
    @NamedQuery(name = "Entidades.findByClaveI", query = "SELECT e FROM Entidades e WHERE e.claveI = :claveI")})
public class Entidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "entidad_id")
    private String entidadId;
    @Basic(optional = false)
    @Column(name = "nombre_entidad")
    private String nombreEntidad;
    @Basic(optional = false)
    @Column(name = "abreviatura")
    private String abreviatura;
    @Column(name = "clave_e")
    private String claveE;
    @Column(name = "clave_i")
    private String claveI;
    @OneToMany(mappedBy = "fkEntidad")
    private Collection<ClavesEntidades> clavesEntidadesCollection;
    @OneToMany(mappedBy = "fkEntidad")
    private Collection<SolicitudesRecursos> solicitudesRecursosCollection;
    @OneToMany(mappedBy = "fkEntidad")
    private Collection<Cuentas> cuentasCollection;
    @OneToMany(mappedBy = "fkEntidad")
    private Collection<Oficinas> oficinasCollection;
    @OneToMany(mappedBy = "fkEntidad")
    private Collection<EstProgramatica> estProgramaticaCollection;
    @OneToMany(mappedBy = "fkEntidad")
    private Collection<Firmas> firmasCollection;

    public Entidades() {
    }

    public Entidades(String entidadId) {
        this.entidadId = entidadId;
    }

    public Entidades(String entidadId, String nombreEntidad, String abreviatura) {
        this.entidadId = entidadId;
        this.nombreEntidad = nombreEntidad;
        this.abreviatura = abreviatura;
    }

    public String getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(String entidadId) {
        this.entidadId = entidadId;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
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

    public Collection<ClavesEntidades> getClavesEntidadesCollection() {
        return clavesEntidadesCollection;
    }

    public void setClavesEntidadesCollection(Collection<ClavesEntidades> clavesEntidadesCollection) {
        this.clavesEntidadesCollection = clavesEntidadesCollection;
    }

    public Collection<SolicitudesRecursos> getSolicitudesRecursosCollection() {
        return solicitudesRecursosCollection;
    }

    public void setSolicitudesRecursosCollection(Collection<SolicitudesRecursos> solicitudesRecursosCollection) {
        this.solicitudesRecursosCollection = solicitudesRecursosCollection;
    }

    public Collection<Cuentas> getCuentasCollection() {
        return cuentasCollection;
    }

    public void setCuentasCollection(Collection<Cuentas> cuentasCollection) {
        this.cuentasCollection = cuentasCollection;
    }

    public Collection<Oficinas> getOficinasCollection() {
        return oficinasCollection;
    }

    public void setOficinasCollection(Collection<Oficinas> oficinasCollection) {
        this.oficinasCollection = oficinasCollection;
    }

    public Collection<EstProgramatica> getEstProgramaticaCollection() {
        return estProgramaticaCollection;
    }

    public void setEstProgramaticaCollection(Collection<EstProgramatica> estProgramaticaCollection) {
        this.estProgramaticaCollection = estProgramaticaCollection;
    }

    public Collection<Firmas> getFirmasCollection() {
        return firmasCollection;
    }

    public void setFirmasCollection(Collection<Firmas> firmasCollection) {
        this.firmasCollection = firmasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entidadId != null ? entidadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entidades)) {
            return false;
        }
        Entidades other = (Entidades) object;
        if ((this.entidadId == null && other.entidadId != null) || (this.entidadId != null && !this.entidadId.equals(other.entidadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Entidades[ entidadId=" + entidadId + " ]";
    }
    
}
