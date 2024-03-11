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
@Table(name = "programas")
@NamedQueries({
    @NamedQuery(name = "Programas.findAll", query = "SELECT p FROM Programas p"),
    @NamedQuery(name = "Programas.findByProgramaId", query = "SELECT p FROM Programas p WHERE p.programaId = :programaId"),
    @NamedQuery(name = "Programas.findByClavePrograma", query = "SELECT p FROM Programas p WHERE p.clavePrograma = :clavePrograma"),
    @NamedQuery(name = "Programas.findByNombrePrograma", query = "SELECT p FROM Programas p WHERE p.nombrePrograma = :nombrePrograma"),
    @NamedQuery(name = "Programas.findByAnioCreacion", query = "SELECT p FROM Programas p WHERE p.anioCreacion = :anioCreacion")})
public class Programa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "programa_id")
    private Integer programaId;
    @Basic(optional = false)
    @Column(name = "clave_programa")
    private String clavePrograma;
    @Basic(optional = false)
    @Column(name = "nombre_programa")
    private String nombrePrograma;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkPrograma")
    private Collection<Subprograma> subprogramasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkPrograma")
    private Collection<DetalleEstructura> detallesEstructurasCollection;
    @JoinColumn(name = "fk_eje", referencedColumnName = "eje_id")
    @ManyToOne
    private Eje fkEje;

    public Programa() {
    }

    public Programa(Integer programaId) {
        this.programaId = programaId;
    }

    public Programa(Integer programaId, String clavePrograma, String nombrePrograma) {
        this.programaId = programaId;
        this.clavePrograma = clavePrograma;
        this.nombrePrograma = nombrePrograma;
    }

    public Integer getProgramaId() {
        return programaId;
    }

    public void setProgramaId(Integer programaId) {
        this.programaId = programaId;
    }

    public String getClavePrograma() {
        return clavePrograma;
    }

    public void setClavePrograma(String clavePrograma) {
        this.clavePrograma = clavePrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public Short getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Short anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Collection<Subprograma> getSubprogramasCollection() {
        return subprogramasCollection;
    }

    public void setSubprogramasCollection(Collection<Subprograma> subprogramasCollection) {
        this.subprogramasCollection = subprogramasCollection;
    }

    public Collection<DetalleEstructura> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetalleEstructura> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    public Eje getFkEje() {
        return fkEje;
    }

    public void setFkEje(Eje fkEje) {
        this.fkEje = fkEje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programaId != null ? programaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programa)) {
            return false;
        }
        Programa other = (Programa) object;
        if ((this.programaId == null && other.programaId != null) || (this.programaId != null && !this.programaId.equals(other.programaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Programas[ programaId=" + programaId + " ]";
    }
    
}
