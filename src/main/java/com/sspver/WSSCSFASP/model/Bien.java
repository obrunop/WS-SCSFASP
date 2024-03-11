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
@Table(name = "bienes")
@NamedQueries({
    @NamedQuery(name = "Bienes.findAll", query = "SELECT b FROM Bienes b"),
    @NamedQuery(name = "Bienes.findByBienId", query = "SELECT b FROM Bienes b WHERE b.bienId = :bienId"),
    @NamedQuery(name = "Bienes.findByClaveBien", query = "SELECT b FROM Bienes b WHERE b.claveBien = :claveBien"),
    @NamedQuery(name = "Bienes.findByNombreBien", query = "SELECT b FROM Bienes b WHERE b.nombreBien = :nombreBien"),
    @NamedQuery(name = "Bienes.findByAnioCreacion", query = "SELECT b FROM Bienes b WHERE b.anioCreacion = :anioCreacion")})
public class Bien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bien_id")
    private Integer bienId;
    @Basic(optional = false)
    @Column(name = "clave_bien")
    private String claveBien;
    @Column(name = "nombre_bien")
    private String nombreBien;
    @Column(name = "anio_creacion")
    private Short anioCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkBien")
    private Collection<DetalleEstructura> detallesEstructurasCollection;
    @JoinColumn(name = "fk_pespecifica", referencedColumnName = "pespecifica_id")
    @ManyToOne
    private PartidaEspecifica fkPespecifica;
    @JoinColumn(name = "fk_pgenerica", referencedColumnName = "pgenerica_id")
    @ManyToOne
    private PartidaGenerica fkPgenerica;
    @JoinColumn(name = "fk_UM", referencedColumnName = "UM_id")
    @ManyToOne
    private UnidadMedida fkUM;

    public Bien() {
    }

    public Bien(Integer bienId) {
        this.bienId = bienId;
    }

    public Bien(Integer bienId, String claveBien) {
        this.bienId = bienId;
        this.claveBien = claveBien;
    }

    public Integer getBienId() {
        return bienId;
    }

    public void setBienId(Integer bienId) {
        this.bienId = bienId;
    }

    public String getClaveBien() {
        return claveBien;
    }

    public void setClaveBien(String claveBien) {
        this.claveBien = claveBien;
    }

    public String getNombreBien() {
        return nombreBien;
    }

    public void setNombreBien(String nombreBien) {
        this.nombreBien = nombreBien;
    }

    public Short getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Short anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Collection<DetalleEstructura> getDetallesEstructurasCollection() {
        return detallesEstructurasCollection;
    }

    public void setDetallesEstructurasCollection(Collection<DetalleEstructura> detallesEstructurasCollection) {
        this.detallesEstructurasCollection = detallesEstructurasCollection;
    }

    public PartidaEspecifica getFkPespecifica() {
        return fkPespecifica;
    }

    public void setFkPespecifica(PartidaEspecifica fkPespecifica) {
        this.fkPespecifica = fkPespecifica;
    }

    public PartidaGenerica getFkPgenerica() {
        return fkPgenerica;
    }

    public void setFkPgenerica(PartidaGenerica fkPgenerica) {
        this.fkPgenerica = fkPgenerica;
    }

    public UnidadMedida getFkUM() {
        return fkUM;
    }

    public void setFkUM(UnidadMedida fkUM) {
        this.fkUM = fkUM;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bienId != null ? bienId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bien)) {
            return false;
        }
        Bien other = (Bien) object;
        if ((this.bienId == null && other.bienId != null) || (this.bienId != null && !this.bienId.equals(other.bienId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Bienes[ bienId=" + bienId + " ]";
    }
    
}
