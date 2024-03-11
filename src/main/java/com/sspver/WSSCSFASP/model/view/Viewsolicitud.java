package com.sspver.WSSCSFASP.model.view;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "View_solicitudes_")
@NamedQueries({
    @NamedQuery(name = "Viewsolicitudes.findAll", query = "SELECT v FROM Viewsolicitudes v"),
    @NamedQuery(name = "Viewsolicitudes.findBySolicitudId", query = "SELECT v FROM Viewsolicitudes v WHERE v.solicitudId = :solicitudId"),
    @NamedQuery(name = "Viewsolicitudes.findByFechaElaboracion", query = "SELECT v FROM Viewsolicitudes v WHERE v.fechaElaboracion = :fechaElaboracion"),
    @NamedQuery(name = "Viewsolicitudes.findByNoTramite", query = "SELECT v FROM Viewsolicitudes v WHERE v.noTramite = :noTramite"),
    @NamedQuery(name = "Viewsolicitudes.findBySonHonorarios", query = "SELECT v FROM Viewsolicitudes v WHERE v.sonHonorarios = :sonHonorarios"),
    @NamedQuery(name = "Viewsolicitudes.findByTipoPago", query = "SELECT v FROM Viewsolicitudes v WHERE v.tipoPago = :tipoPago"),
    @NamedQuery(name = "Viewsolicitudes.findByClaveProyecto", query = "SELECT v FROM Viewsolicitudes v WHERE v.claveProyecto = :claveProyecto"),
    @NamedQuery(name = "Viewsolicitudes.findByClabeBancaria", query = "SELECT v FROM Viewsolicitudes v WHERE v.clabeBancaria = :clabeBancaria"),
    @NamedQuery(name = "Viewsolicitudes.findByNombreBanco", query = "SELECT v FROM Viewsolicitudes v WHERE v.nombreBanco = :nombreBanco"),
    @NamedQuery(name = "Viewsolicitudes.findByDestinoEstatal", query = "SELECT v FROM Viewsolicitudes v WHERE v.destinoEstatal = :destinoEstatal"),
    @NamedQuery(name = "Viewsolicitudes.findByDestinoMunicipal", query = "SELECT v FROM Viewsolicitudes v WHERE v.destinoMunicipal = :destinoMunicipal"),
    @NamedQuery(name = "Viewsolicitudes.findByCuentaContable", query = "SELECT v FROM Viewsolicitudes v WHERE v.cuentaContable = :cuentaContable"),
    @NamedQuery(name = "Viewsolicitudes.findByMontoTotal", query = "SELECT v FROM Viewsolicitudes v WHERE v.montoTotal = :montoTotal"),
    @NamedQuery(name = "Viewsolicitudes.findByMontoLetra", query = "SELECT v FROM Viewsolicitudes v WHERE v.montoLetra = :montoLetra"),
    @NamedQuery(name = "Viewsolicitudes.findByEstadoDevengada", query = "SELECT v FROM Viewsolicitudes v WHERE v.estadoDevengada = :estadoDevengada"),
    @NamedQuery(name = "Viewsolicitudes.findByEstadoSolicitud", query = "SELECT v FROM Viewsolicitudes v WHERE v.estadoSolicitud = :estadoSolicitud"),
    @NamedQuery(name = "Viewsolicitudes.findByRfcBeneficiario", query = "SELECT v FROM Viewsolicitudes v WHERE v.rfcBeneficiario = :rfcBeneficiario"),
    @NamedQuery(name = "Viewsolicitudes.findByNombreBeneficiario", query = "SELECT v FROM Viewsolicitudes v WHERE v.nombreBeneficiario = :nombreBeneficiario"),
    @NamedQuery(name = "Viewsolicitudes.findByLicitacion", query = "SELECT v FROM Viewsolicitudes v WHERE v.licitacion = :licitacion"),
    @NamedQuery(name = "Viewsolicitudes.findByTipoLicitacion", query = "SELECT v FROM Viewsolicitudes v WHERE v.tipoLicitacion = :tipoLicitacion"),
    @NamedQuery(name = "Viewsolicitudes.findByContrato", query = "SELECT v FROM Viewsolicitudes v WHERE v.contrato = :contrato"),
    @NamedQuery(name = "Viewsolicitudes.findByPoliza", query = "SELECT v FROM Viewsolicitudes v WHERE v.poliza = :poliza"),
    @NamedQuery(name = "Viewsolicitudes.findByFechaActualizacion", query = "SELECT v FROM Viewsolicitudes v WHERE v.fechaActualizacion = :fechaActualizacion"),
    @NamedQuery(name = "Viewsolicitudes.findByObservaciones", query = "SELECT v FROM Viewsolicitudes v WHERE v.observaciones = :observaciones"),
    @NamedQuery(name = "Viewsolicitudes.findByFkUsuarioRealizo", query = "SELECT v FROM Viewsolicitudes v WHERE v.fkUsuarioRealizo = :fkUsuarioRealizo"),
    @NamedQuery(name = "Viewsolicitudes.findByUsuarioRealizo", query = "SELECT v FROM Viewsolicitudes v WHERE v.usuarioRealizo = :usuarioRealizo"),
    @NamedQuery(name = "Viewsolicitudes.findByFkUsuarioActualizo", query = "SELECT v FROM Viewsolicitudes v WHERE v.fkUsuarioActualizo = :fkUsuarioActualizo"),
    @NamedQuery(name = "Viewsolicitudes.findByUsuarioActualizo", query = "SELECT v FROM Viewsolicitudes v WHERE v.usuarioActualizo = :usuarioActualizo"),
    @NamedQuery(name = "Viewsolicitudes.findByFkSolicitante", query = "SELECT v FROM Viewsolicitudes v WHERE v.fkSolicitante = :fkSolicitante"),
    @NamedQuery(name = "Viewsolicitudes.findByFirmaSolicitante", query = "SELECT v FROM Viewsolicitudes v WHERE v.firmaSolicitante = :firmaSolicitante"),
    @NamedQuery(name = "Viewsolicitudes.findByPuestoSolicitante", query = "SELECT v FROM Viewsolicitudes v WHERE v.puestoSolicitante = :puestoSolicitante"),
    @NamedQuery(name = "Viewsolicitudes.findByTelefonoSolicitante", query = "SELECT v FROM Viewsolicitudes v WHERE v.telefonoSolicitante = :telefonoSolicitante"),
    @NamedQuery(name = "Viewsolicitudes.findByExtensionSolicitante", query = "SELECT v FROM Viewsolicitudes v WHERE v.extensionSolicitante = :extensionSolicitante"),
    @NamedQuery(name = "Viewsolicitudes.findByFkVb", query = "SELECT v FROM Viewsolicitudes v WHERE v.fkVb = :fkVb"),
    @NamedQuery(name = "Viewsolicitudes.findByFirmaVb", query = "SELECT v FROM Viewsolicitudes v WHERE v.firmaVb = :firmaVb"),
    @NamedQuery(name = "Viewsolicitudes.findByPuestoVb", query = "SELECT v FROM Viewsolicitudes v WHERE v.puestoVb = :puestoVb"),
    @NamedQuery(name = "Viewsolicitudes.findByFkAutoriza", query = "SELECT v FROM Viewsolicitudes v WHERE v.fkAutoriza = :fkAutoriza"),
    @NamedQuery(name = "Viewsolicitudes.findByFirmaAutoriza", query = "SELECT v FROM Viewsolicitudes v WHERE v.firmaAutoriza = :firmaAutoriza"),
    @NamedQuery(name = "Viewsolicitudes.findByPuestoAutoriza", query = "SELECT v FROM Viewsolicitudes v WHERE v.puestoAutoriza = :puestoAutoriza"),
    @NamedQuery(name = "Viewsolicitudes.findByFkEntidad", query = "SELECT v FROM Viewsolicitudes v WHERE v.fkEntidad = :fkEntidad"),
    @NamedQuery(name = "Viewsolicitudes.findByNombreEntidad", query = "SELECT v FROM Viewsolicitudes v WHERE v.nombreEntidad = :nombreEntidad"),
    @NamedQuery(name = "Viewsolicitudes.findByRpai", query = "SELECT v FROM Viewsolicitudes v WHERE v.rpai = :rpai"),
    @NamedQuery(name = "Viewsolicitudes.findByFkOficinaId", query = "SELECT v FROM Viewsolicitudes v WHERE v.fkOficinaId = :fkOficinaId"),
    @NamedQuery(name = "Viewsolicitudes.findByNombreOficina", query = "SELECT v FROM Viewsolicitudes v WHERE v.nombreOficina = :nombreOficina")})
public class Viewsolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "solicitud_id")
    private int solicitudId;
    @Basic(optional = false)
    @Column(name = "fecha_elaboracion")
    @Temporal(TemporalType.DATE)
    private Date fechaElaboracion;
    @Basic(optional = false)
    @Column(name = "no_tramite")
    private String noTramite;
    @Basic(optional = false)
    @Column(name = "son_honorarios")
    private short sonHonorarios;
    @Column(name = "tipo_pago")
    private String tipoPago;
    @Column(name = "clave_proyecto")
    private String claveProyecto;
    @Column(name = "CLABE_BANCARIA")
    private String clabeBancaria;
    @Column(name = "nombre_banco")
    private String nombreBanco;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "destino_estatal")
    private BigDecimal destinoEstatal;
    @Column(name = "destino_municipal")
    private BigDecimal destinoMunicipal;
    @Basic(optional = false)
    @Column(name = "cuenta_contable")
    private String cuentaContable;
    @Column(name = "monto_total")
    private BigDecimal montoTotal;
    @Column(name = "monto_letra")
    private String montoLetra;
    @Basic(optional = false)
    @Column(name = "ESTADO_DEVENGADA")
    private short estadoDevengada;
    @Basic(optional = false)
    @Column(name = "ESTADO_SOLICITUD")
    private String estadoSolicitud;
    @Column(name = "rfc_beneficiario")
    private String rfcBeneficiario;
    @Column(name = "nombre_beneficiario")
    private String nombreBeneficiario;
    @Column(name = "LICITACION")
    private String licitacion;
    @Column(name = "TIPO_LICITACION")
    private Integer tipoLicitacion;
    @Column(name = "CONTRATO")
    private String contrato;
    @Column(name = "POLIZA")
    private String poliza;
    @Column(name = "FECHA_ACTUALIZACION")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "FK_USUARIO_REALIZO")
    private Integer fkUsuarioRealizo;
    @Basic(optional = false)
    @Column(name = "USUARIO_REALIZO")
    private String usuarioRealizo;
    @Column(name = "FK_USUARIO_ACTUALIZO")
    private Integer fkUsuarioActualizo;
    @Basic(optional = false)
    @Column(name = "USUARIO_ACTUALIZO")
    private String usuarioActualizo;
    @Column(name = "FK_SOLICITANTE")
    private Integer fkSolicitante;
    @Basic(optional = false)
    @Column(name = "FIRMA_SOLICITANTE")
    private String firmaSolicitante;
    @Basic(optional = false)
    @Column(name = "PUESTO_SOLICITANTE")
    private String puestoSolicitante;
    @Column(name = "TELEFONO_SOLICITANTE")
    private String telefonoSolicitante;
    @Column(name = "EXTENSION_SOLICITANTE")
    private String extensionSolicitante;
    @Column(name = "FK_VB")
    private Integer fkVb;
    @Basic(optional = false)
    @Column(name = "FIRMA_VB")
    private String firmaVb;
    @Basic(optional = false)
    @Column(name = "PUESTO_VB")
    private String puestoVb;
    @Column(name = "FK_AUTORIZA")
    private Integer fkAutoriza;
    @Basic(optional = false)
    @Column(name = "FIRMA_AUTORIZA")
    private String firmaAutoriza;
    @Basic(optional = false)
    @Column(name = "PUESTO_AUTORIZA")
    private String puestoAutoriza;
    @Column(name = "fk_entidad")
    private String fkEntidad;
    @Basic(optional = false)
    @Column(name = "nombre_entidad")
    private String nombreEntidad;
    @Column(name = "RPAI")
    private String rpai;
    @Column(name = "FK_OFICINA_ID")
    private Integer fkOficinaId;
    @Basic(optional = false)
    @Column(name = "nombre_oficina")
    private String nombreOficina;

    public Viewsolicitud() {
    }

    public int getSolicitudId() {
        return solicitudId;
    }

    public void setSolicitudId(int solicitudId) {
        this.solicitudId = solicitudId;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getNoTramite() {
        return noTramite;
    }

    public void setNoTramite(String noTramite) {
        this.noTramite = noTramite;
    }

    public short getSonHonorarios() {
        return sonHonorarios;
    }

    public void setSonHonorarios(short sonHonorarios) {
        this.sonHonorarios = sonHonorarios;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getClaveProyecto() {
        return claveProyecto;
    }

    public void setClaveProyecto(String claveProyecto) {
        this.claveProyecto = claveProyecto;
    }

    public String getClabeBancaria() {
        return clabeBancaria;
    }

    public void setClabeBancaria(String clabeBancaria) {
        this.clabeBancaria = clabeBancaria;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public BigDecimal getDestinoEstatal() {
        return destinoEstatal;
    }

    public void setDestinoEstatal(BigDecimal destinoEstatal) {
        this.destinoEstatal = destinoEstatal;
    }

    public BigDecimal getDestinoMunicipal() {
        return destinoMunicipal;
    }

    public void setDestinoMunicipal(BigDecimal destinoMunicipal) {
        this.destinoMunicipal = destinoMunicipal;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMontoLetra() {
        return montoLetra;
    }

    public void setMontoLetra(String montoLetra) {
        this.montoLetra = montoLetra;
    }

    public short getEstadoDevengada() {
        return estadoDevengada;
    }

    public void setEstadoDevengada(short estadoDevengada) {
        this.estadoDevengada = estadoDevengada;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getRfcBeneficiario() {
        return rfcBeneficiario;
    }

    public void setRfcBeneficiario(String rfcBeneficiario) {
        this.rfcBeneficiario = rfcBeneficiario;
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getLicitacion() {
        return licitacion;
    }

    public void setLicitacion(String licitacion) {
        this.licitacion = licitacion;
    }

    public Integer getTipoLicitacion() {
        return tipoLicitacion;
    }

    public void setTipoLicitacion(Integer tipoLicitacion) {
        this.tipoLicitacion = tipoLicitacion;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getFkUsuarioRealizo() {
        return fkUsuarioRealizo;
    }

    public void setFkUsuarioRealizo(Integer fkUsuarioRealizo) {
        this.fkUsuarioRealizo = fkUsuarioRealizo;
    }

    public String getUsuarioRealizo() {
        return usuarioRealizo;
    }

    public void setUsuarioRealizo(String usuarioRealizo) {
        this.usuarioRealizo = usuarioRealizo;
    }

    public Integer getFkUsuarioActualizo() {
        return fkUsuarioActualizo;
    }

    public void setFkUsuarioActualizo(Integer fkUsuarioActualizo) {
        this.fkUsuarioActualizo = fkUsuarioActualizo;
    }

    public String getUsuarioActualizo() {
        return usuarioActualizo;
    }

    public void setUsuarioActualizo(String usuarioActualizo) {
        this.usuarioActualizo = usuarioActualizo;
    }

    public Integer getFkSolicitante() {
        return fkSolicitante;
    }

    public void setFkSolicitante(Integer fkSolicitante) {
        this.fkSolicitante = fkSolicitante;
    }

    public String getFirmaSolicitante() {
        return firmaSolicitante;
    }

    public void setFirmaSolicitante(String firmaSolicitante) {
        this.firmaSolicitante = firmaSolicitante;
    }

    public String getPuestoSolicitante() {
        return puestoSolicitante;
    }

    public void setPuestoSolicitante(String puestoSolicitante) {
        this.puestoSolicitante = puestoSolicitante;
    }

    public String getTelefonoSolicitante() {
        return telefonoSolicitante;
    }

    public void setTelefonoSolicitante(String telefonoSolicitante) {
        this.telefonoSolicitante = telefonoSolicitante;
    }

    public String getExtensionSolicitante() {
        return extensionSolicitante;
    }

    public void setExtensionSolicitante(String extensionSolicitante) {
        this.extensionSolicitante = extensionSolicitante;
    }

    public Integer getFkVb() {
        return fkVb;
    }

    public void setFkVb(Integer fkVb) {
        this.fkVb = fkVb;
    }

    public String getFirmaVb() {
        return firmaVb;
    }

    public void setFirmaVb(String firmaVb) {
        this.firmaVb = firmaVb;
    }

    public String getPuestoVb() {
        return puestoVb;
    }

    public void setPuestoVb(String puestoVb) {
        this.puestoVb = puestoVb;
    }

    public Integer getFkAutoriza() {
        return fkAutoriza;
    }

    public void setFkAutoriza(Integer fkAutoriza) {
        this.fkAutoriza = fkAutoriza;
    }

    public String getFirmaAutoriza() {
        return firmaAutoriza;
    }

    public void setFirmaAutoriza(String firmaAutoriza) {
        this.firmaAutoriza = firmaAutoriza;
    }

    public String getPuestoAutoriza() {
        return puestoAutoriza;
    }

    public void setPuestoAutoriza(String puestoAutoriza) {
        this.puestoAutoriza = puestoAutoriza;
    }

    public String getFkEntidad() {
        return fkEntidad;
    }

    public void setFkEntidad(String fkEntidad) {
        this.fkEntidad = fkEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getRpai() {
        return rpai;
    }

    public void setRpai(String rpai) {
        this.rpai = rpai;
    }

    public Integer getFkOficinaId() {
        return fkOficinaId;
    }

    public void setFkOficinaId(Integer fkOficinaId) {
        this.fkOficinaId = fkOficinaId;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }
    
}
