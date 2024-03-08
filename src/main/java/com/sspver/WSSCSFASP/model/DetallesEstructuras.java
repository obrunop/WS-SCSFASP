package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "detalles_estructuras")
@NamedQueries({
    @NamedQuery(name = "DetallesEstructuras.findAll", query = "SELECT d FROM DetallesEstructuras d"),
    @NamedQuery(name = "DetallesEstructuras.findByDetalleId", query = "SELECT d FROM DetallesEstructuras d WHERE d.detalleId = :detalleId"),
    @NamedQuery(name = "DetallesEstructuras.findByClaveSubprograma", query = "SELECT d FROM DetallesEstructuras d WHERE d.claveSubprograma = :claveSubprograma"),
    @NamedQuery(name = "DetallesEstructuras.findByFkClaveBien", query = "SELECT d FROM DetallesEstructuras d WHERE d.fkClaveBien = :fkClaveBien")})
public class DetallesEstructuras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "detalle_id")
    private Integer detalleId;
    @Basic(optional = false)
    @Column(name = "clave_subprograma")
    private String claveSubprograma;
    @Column(name = "fk_clave_bien")
    private String fkClaveBien;
    @JoinTable(name = "detalle_notas_estructuras", joinColumns = {
        @JoinColumn(name = "fk_detalle_estructura", referencedColumnName = "detalle_id")}, inverseJoinColumns = {
        @JoinColumn(name = "fk_notas", referencedColumnName = "nota_id")})
    @ManyToMany
    private Collection<Notas> notasCollection;
    @JoinColumn(name = "fk_bien", referencedColumnName = "bien_id")
    @ManyToOne(optional = false)
    private Bienes fkBien;
    @JoinColumn(name = "fk_capitulo", referencedColumnName = "capitulo_id")
    @ManyToOne(optional = false)
    private Capitulos fkCapitulo;
    @JoinColumn(name = "fk_concepto", referencedColumnName = "concepto_id")
    @ManyToOne(optional = false)
    private Conceptos fkConcepto;
    @JoinColumn(name = "fk_eje", referencedColumnName = "eje_id")
    @ManyToOne(optional = false)
    private Ejes fkEje;
    @JoinColumn(name = "fk_estructura", referencedColumnName = "estructura_id")
    @ManyToOne(optional = false)
    private EstProgramatica fkEstructura;
    @JoinColumn(name = "fk_funcion", referencedColumnName = "funcion_id")
    @ManyToOne
    private Funciones fkFuncion;
    @JoinColumn(name = "fk_pespecifica", referencedColumnName = "pespecifica_id")
    @ManyToOne
    private PartidasEspecificas fkPespecifica;
    @JoinColumn(name = "fk_pgenerica", referencedColumnName = "pgenerica_id")
    @ManyToOne
    private PartidasGenericas fkPgenerica;
    @JoinColumn(name = "fk_programa", referencedColumnName = "programa_id")
    @ManyToOne(optional = false)
    private Programas fkPrograma;
    @JoinColumn(name = "fk_subprograma", referencedColumnName = "subprograma_id")
    @ManyToOne(optional = false)
    private Subprogramas fkSubprograma;
    @JoinColumn(name = "fk_RLCF", referencedColumnName = "RLCF_id")
    @ManyToOne(optional = false)
    private TipoFinanciamiento fkRLCF;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkDetalleEp")
    private Collection<Presupuestos> presupuestosCollection;
    @OneToMany(mappedBy = "fkDetalleEstructura")
    private Collection<MontosAdecuaciones> montosAdecuacionesCollection;

    public DetallesEstructuras() {
    }

    public DetallesEstructuras(Integer detalleId) {
        this.detalleId = detalleId;
    }

    public DetallesEstructuras(Integer detalleId, String claveSubprograma) {
        this.detalleId = detalleId;
        this.claveSubprograma = claveSubprograma;
    }

    public Integer getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Integer detalleId) {
        this.detalleId = detalleId;
    }

    public String getClaveSubprograma() {
        return claveSubprograma;
    }

    public void setClaveSubprograma(String claveSubprograma) {
        this.claveSubprograma = claveSubprograma;
    }

    public String getFkClaveBien() {
        return fkClaveBien;
    }

    public void setFkClaveBien(String fkClaveBien) {
        this.fkClaveBien = fkClaveBien;
    }

    public Collection<Notas> getNotasCollection() {
        return notasCollection;
    }

    public void setNotasCollection(Collection<Notas> notasCollection) {
        this.notasCollection = notasCollection;
    }

    public Bienes getFkBien() {
        return fkBien;
    }

    public void setFkBien(Bienes fkBien) {
        this.fkBien = fkBien;
    }

    public Capitulos getFkCapitulo() {
        return fkCapitulo;
    }

    public void setFkCapitulo(Capitulos fkCapitulo) {
        this.fkCapitulo = fkCapitulo;
    }

    public Conceptos getFkConcepto() {
        return fkConcepto;
    }

    public void setFkConcepto(Conceptos fkConcepto) {
        this.fkConcepto = fkConcepto;
    }

    public Ejes getFkEje() {
        return fkEje;
    }

    public void setFkEje(Ejes fkEje) {
        this.fkEje = fkEje;
    }

    public EstProgramatica getFkEstructura() {
        return fkEstructura;
    }

    public void setFkEstructura(EstProgramatica fkEstructura) {
        this.fkEstructura = fkEstructura;
    }

    public Funciones getFkFuncion() {
        return fkFuncion;
    }

    public void setFkFuncion(Funciones fkFuncion) {
        this.fkFuncion = fkFuncion;
    }

    public PartidasEspecificas getFkPespecifica() {
        return fkPespecifica;
    }

    public void setFkPespecifica(PartidasEspecificas fkPespecifica) {
        this.fkPespecifica = fkPespecifica;
    }

    public PartidasGenericas getFkPgenerica() {
        return fkPgenerica;
    }

    public void setFkPgenerica(PartidasGenericas fkPgenerica) {
        this.fkPgenerica = fkPgenerica;
    }

    public Programas getFkPrograma() {
        return fkPrograma;
    }

    public void setFkPrograma(Programas fkPrograma) {
        this.fkPrograma = fkPrograma;
    }

    public Subprogramas getFkSubprograma() {
        return fkSubprograma;
    }

    public void setFkSubprograma(Subprogramas fkSubprograma) {
        this.fkSubprograma = fkSubprograma;
    }

    public TipoFinanciamiento getFkRLCF() {
        return fkRLCF;
    }

    public void setFkRLCF(TipoFinanciamiento fkRLCF) {
        this.fkRLCF = fkRLCF;
    }

    public Collection<Presupuestos> getPresupuestosCollection() {
        return presupuestosCollection;
    }

    public void setPresupuestosCollection(Collection<Presupuestos> presupuestosCollection) {
        this.presupuestosCollection = presupuestosCollection;
    }

    public Collection<MontosAdecuaciones> getMontosAdecuacionesCollection() {
        return montosAdecuacionesCollection;
    }

    public void setMontosAdecuacionesCollection(Collection<MontosAdecuaciones> montosAdecuacionesCollection) {
        this.montosAdecuacionesCollection = montosAdecuacionesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleId != null ? detalleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesEstructuras)) {
            return false;
        }
        DetallesEstructuras other = (DetallesEstructuras) object;
        if ((this.detalleId == null && other.detalleId != null) || (this.detalleId != null && !this.detalleId.equals(other.detalleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.DetallesEstructuras[ detalleId=" + detalleId + " ]";
    }
    
}
