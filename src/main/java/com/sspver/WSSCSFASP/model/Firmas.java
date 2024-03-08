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
@Table(name = "firmas")
@NamedQueries({
    @NamedQuery(name = "Firmas.findAll", query = "SELECT f FROM Firmas f"),
    @NamedQuery(name = "Firmas.findByFirmaId", query = "SELECT f FROM Firmas f WHERE f.firmaId = :firmaId"),
    @NamedQuery(name = "Firmas.findByNombreTitular", query = "SELECT f FROM Firmas f WHERE f.nombreTitular = :nombreTitular"),
    @NamedQuery(name = "Firmas.findByPuesto", query = "SELECT f FROM Firmas f WHERE f.puesto = :puesto"),
    @NamedQuery(name = "Firmas.findByActivo", query = "SELECT f FROM Firmas f WHERE f.activo = :activo"),
    @NamedQuery(name = "Firmas.findByFecha", query = "SELECT f FROM Firmas f WHERE f.fecha = :fecha")})
public class Firmas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "firma_id")
    private Integer firmaId;
    @Basic(optional = false)
    @Column(name = "nombre_titular")
    private String nombreTitular;
    @Basic(optional = false)
    @Column(name = "puesto")
    private String puesto;
    @Column(name = "activo")
    private Short activo;
    @Column(name = "fecha")
    private Short fecha;
    @OneToMany(mappedBy = "fkFirmaSolicita")
    private Collection<SolicitudesRecursos> solicitudesRecursosCollection;
    @OneToMany(mappedBy = "fkfirmaVB")
    private Collection<SolicitudesRecursos> solicitudesRecursosCollection1;
    @OneToMany(mappedBy = "fkFirmaAutoriza")
    private Collection<SolicitudesRecursos> solicitudesRecursosCollection2;
    @JoinColumn(name = "fk_entidad", referencedColumnName = "entidad_id")
    @ManyToOne
    private Entidades fkEntidad;

    public Firmas() {
    }

    public Firmas(Integer firmaId) {
        this.firmaId = firmaId;
    }

    public Firmas(Integer firmaId, String nombreTitular, String puesto) {
        this.firmaId = firmaId;
        this.nombreTitular = nombreTitular;
        this.puesto = puesto;
    }

    public Integer getFirmaId() {
        return firmaId;
    }

    public void setFirmaId(Integer firmaId) {
        this.firmaId = firmaId;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public Short getFecha() {
        return fecha;
    }

    public void setFecha(Short fecha) {
        this.fecha = fecha;
    }

    public Collection<SolicitudesRecursos> getSolicitudesRecursosCollection() {
        return solicitudesRecursosCollection;
    }

    public void setSolicitudesRecursosCollection(Collection<SolicitudesRecursos> solicitudesRecursosCollection) {
        this.solicitudesRecursosCollection = solicitudesRecursosCollection;
    }

    public Collection<SolicitudesRecursos> getSolicitudesRecursosCollection1() {
        return solicitudesRecursosCollection1;
    }

    public void setSolicitudesRecursosCollection1(Collection<SolicitudesRecursos> solicitudesRecursosCollection1) {
        this.solicitudesRecursosCollection1 = solicitudesRecursosCollection1;
    }

    public Collection<SolicitudesRecursos> getSolicitudesRecursosCollection2() {
        return solicitudesRecursosCollection2;
    }

    public void setSolicitudesRecursosCollection2(Collection<SolicitudesRecursos> solicitudesRecursosCollection2) {
        this.solicitudesRecursosCollection2 = solicitudesRecursosCollection2;
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
        hash += (firmaId != null ? firmaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Firmas)) {
            return false;
        }
        Firmas other = (Firmas) object;
        if ((this.firmaId == null && other.firmaId != null) || (this.firmaId != null && !this.firmaId.equals(other.firmaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Firmas[ firmaId=" + firmaId + " ]";
    }
    
}
