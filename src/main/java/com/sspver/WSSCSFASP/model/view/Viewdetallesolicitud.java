package com.sspver.WSSCSFASP.model.view;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "View_detalle_solicitud")
@NamedQueries({
    @NamedQuery(name = "Viewdetallesolicitud.findAll", query = "SELECT v FROM Viewdetallesolicitud v"),
    @NamedQuery(name = "Viewdetallesolicitud.findByIdDetalleEpSolicitud", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.idDetalleEpSolicitud = :idDetalleEpSolicitud"),
    @NamedQuery(name = "Viewdetallesolicitud.findBySolicitudId", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.solicitudId = :solicitudId"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkDetalleEp", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkDetalleEp = :fkDetalleEp"),
    @NamedQuery(name = "Viewdetallesolicitud.findByMetaDetalle", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.metaDetalle = :metaDetalle"),
    @NamedQuery(name = "Viewdetallesolicitud.findByMontoDetalle", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.montoDetalle = :montoDetalle"),
    @NamedQuery(name = "Viewdetallesolicitud.findByDescripcionDetalle", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.descripcionDetalle = :descripcionDetalle"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkEstructura", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkEstructura = :fkEstructura"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFechaEstructura", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fechaEstructura = :fechaEstructura"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkEje", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkEje = :fkEje"),
    @NamedQuery(name = "Viewdetallesolicitud.findByNombreEje", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.nombreEje = :nombreEje"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkPrograma", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkPrograma = :fkPrograma"),
    @NamedQuery(name = "Viewdetallesolicitud.findByNombrePrograma", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.nombrePrograma = :nombrePrograma"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkSubprograma", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkSubprograma = :fkSubprograma"),
    @NamedQuery(name = "Viewdetallesolicitud.findByClaveSubprograma", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.claveSubprograma = :claveSubprograma"),
    @NamedQuery(name = "Viewdetallesolicitud.findByNombreSubprograma", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.nombreSubprograma = :nombreSubprograma"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkCapitulo", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkCapitulo = :fkCapitulo"),
    @NamedQuery(name = "Viewdetallesolicitud.findByNombreCapitulo", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.nombreCapitulo = :nombreCapitulo"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkConcepto", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkConcepto = :fkConcepto"),
    @NamedQuery(name = "Viewdetallesolicitud.findByNombreConcepto", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.nombreConcepto = :nombreConcepto"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkPgenerica", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkPgenerica = :fkPgenerica"),
    @NamedQuery(name = "Viewdetallesolicitud.findByNombreGenerica", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.nombreGenerica = :nombreGenerica"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkPespecifica", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkPespecifica = :fkPespecifica"),
    @NamedQuery(name = "Viewdetallesolicitud.findByNombreEspecifica", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.nombreEspecifica = :nombreEspecifica"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkBien", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkBien = :fkBien"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkClaveBien", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkClaveBien = :fkClaveBien"),
    @NamedQuery(name = "Viewdetallesolicitud.findByNombreBien", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.nombreBien = :nombreBien"),
    @NamedQuery(name = "Viewdetallesolicitud.findByFkUm", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.fkUm = :fkUm"),
    @NamedQuery(name = "Viewdetallesolicitud.findByUm", query = "SELECT v FROM Viewdetallesolicitud v WHERE v.um = :um")})
public class Viewdetallesolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETALLE_EP_SOLICITUD")
    private int idDetalleEpSolicitud;
    @Basic(optional = false)
    @Column(name = "SOLICITUD_ID")
    private int solicitudId;
    @Column(name = "FK_DETALLE_EP")
    private Integer fkDetalleEp;
    @Basic(optional = false)
    @Column(name = "META_DETALLE")
    private int metaDetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MONTO_DETALLE")
    private BigDecimal montoDetalle;
    @Column(name = "DESCRIPCION_DETALLE")
    private String descripcionDetalle;
    @Basic(optional = false)
    @Column(name = "FK_ESTRUCTURA")
    private int fkEstructura;
    @Column(name = "FECHA_ESTRUCTURA")
    private Short fechaEstructura;
    @Basic(optional = false)
    @Column(name = "FK_EJE")
    private int fkEje;
    @Basic(optional = false)
    @Column(name = "NOMBRE_EJE")
    private String nombreEje;
    @Basic(optional = false)
    @Column(name = "FK_PROGRAMA")
    private int fkPrograma;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PROGRAMA")
    private String nombrePrograma;
    @Basic(optional = false)
    @Column(name = "FK_SUBPROGRAMA")
    private int fkSubprograma;
    @Basic(optional = false)
    @Column(name = "CLAVE_SUBPROGRAMA")
    private String claveSubprograma;
    @Basic(optional = false)
    @Column(name = "NOMBRE_SUBPROGRAMA")
    private String nombreSubprograma;
    @Basic(optional = false)
    @Column(name = "FK_CAPITULO")
    private int fkCapitulo;
    @Basic(optional = false)
    @Column(name = "NOMBRE_CAPITULO")
    private String nombreCapitulo;
    @Basic(optional = false)
    @Column(name = "FK_CONCEPTO")
    private int fkConcepto;
    @Basic(optional = false)
    @Column(name = "NOMBRE_CONCEPTO")
    private String nombreConcepto;
    @Column(name = "FK_PGENERICA")
    private Integer fkPgenerica;
    @Basic(optional = false)
    @Column(name = "NOMBRE_GENERICA")
    private String nombreGenerica;
    @Column(name = "FK_PESPECIFICA")
    private Integer fkPespecifica;
    @Basic(optional = false)
    @Column(name = "NOMBRE_ESPECIFICA")
    private String nombreEspecifica;
    @Basic(optional = false)
    @Column(name = "FK_BIEN")
    private int fkBien;
    @Column(name = "FK_CLAVE_BIEN")
    private String fkClaveBien;
    @Column(name = "NOMBRE_BIEN")
    private String nombreBien;
    @Column(name = "FK_UM")
    private Integer fkUm;
    @Column(name = "UM")
    private String um;

    public Viewdetallesolicitud() {
    }

    public int getIdDetalleEpSolicitud() {
        return idDetalleEpSolicitud;
    }

    public void setIdDetalleEpSolicitud(int idDetalleEpSolicitud) {
        this.idDetalleEpSolicitud = idDetalleEpSolicitud;
    }

    public int getSolicitudId() {
        return solicitudId;
    }

    public void setSolicitudId(int solicitudId) {
        this.solicitudId = solicitudId;
    }

    public Integer getFkDetalleEp() {
        return fkDetalleEp;
    }

    public void setFkDetalleEp(Integer fkDetalleEp) {
        this.fkDetalleEp = fkDetalleEp;
    }

    public int getMetaDetalle() {
        return metaDetalle;
    }

    public void setMetaDetalle(int metaDetalle) {
        this.metaDetalle = metaDetalle;
    }

    public BigDecimal getMontoDetalle() {
        return montoDetalle;
    }

    public void setMontoDetalle(BigDecimal montoDetalle) {
        this.montoDetalle = montoDetalle;
    }

    public String getDescripcionDetalle() {
        return descripcionDetalle;
    }

    public void setDescripcionDetalle(String descripcionDetalle) {
        this.descripcionDetalle = descripcionDetalle;
    }

    public int getFkEstructura() {
        return fkEstructura;
    }

    public void setFkEstructura(int fkEstructura) {
        this.fkEstructura = fkEstructura;
    }

    public Short getFechaEstructura() {
        return fechaEstructura;
    }

    public void setFechaEstructura(Short fechaEstructura) {
        this.fechaEstructura = fechaEstructura;
    }

    public int getFkEje() {
        return fkEje;
    }

    public void setFkEje(int fkEje) {
        this.fkEje = fkEje;
    }

    public String getNombreEje() {
        return nombreEje;
    }

    public void setNombreEje(String nombreEje) {
        this.nombreEje = nombreEje;
    }

    public int getFkPrograma() {
        return fkPrograma;
    }

    public void setFkPrograma(int fkPrograma) {
        this.fkPrograma = fkPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public int getFkSubprograma() {
        return fkSubprograma;
    }

    public void setFkSubprograma(int fkSubprograma) {
        this.fkSubprograma = fkSubprograma;
    }

    public String getClaveSubprograma() {
        return claveSubprograma;
    }

    public void setClaveSubprograma(String claveSubprograma) {
        this.claveSubprograma = claveSubprograma;
    }

    public String getNombreSubprograma() {
        return nombreSubprograma;
    }

    public void setNombreSubprograma(String nombreSubprograma) {
        this.nombreSubprograma = nombreSubprograma;
    }

    public int getFkCapitulo() {
        return fkCapitulo;
    }

    public void setFkCapitulo(int fkCapitulo) {
        this.fkCapitulo = fkCapitulo;
    }

    public String getNombreCapitulo() {
        return nombreCapitulo;
    }

    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }

    public int getFkConcepto() {
        return fkConcepto;
    }

    public void setFkConcepto(int fkConcepto) {
        this.fkConcepto = fkConcepto;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public Integer getFkPgenerica() {
        return fkPgenerica;
    }

    public void setFkPgenerica(Integer fkPgenerica) {
        this.fkPgenerica = fkPgenerica;
    }

    public String getNombreGenerica() {
        return nombreGenerica;
    }

    public void setNombreGenerica(String nombreGenerica) {
        this.nombreGenerica = nombreGenerica;
    }

    public Integer getFkPespecifica() {
        return fkPespecifica;
    }

    public void setFkPespecifica(Integer fkPespecifica) {
        this.fkPespecifica = fkPespecifica;
    }

    public String getNombreEspecifica() {
        return nombreEspecifica;
    }

    public void setNombreEspecifica(String nombreEspecifica) {
        this.nombreEspecifica = nombreEspecifica;
    }

    public int getFkBien() {
        return fkBien;
    }

    public void setFkBien(int fkBien) {
        this.fkBien = fkBien;
    }

    public String getFkClaveBien() {
        return fkClaveBien;
    }

    public void setFkClaveBien(String fkClaveBien) {
        this.fkClaveBien = fkClaveBien;
    }

    public String getNombreBien() {
        return nombreBien;
    }

    public void setNombreBien(String nombreBien) {
        this.nombreBien = nombreBien;
    }

    public Integer getFkUm() {
        return fkUm;
    }

    public void setFkUm(Integer fkUm) {
        this.fkUm = fkUm;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }
    
}
