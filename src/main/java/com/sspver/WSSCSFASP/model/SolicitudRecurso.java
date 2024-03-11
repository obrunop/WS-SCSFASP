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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "solicitudes_recursos")
@NamedQueries({
    @NamedQuery(name = "SolicitudesRecursos.findAll", query = "SELECT s FROM SolicitudesRecursos s"),
    @NamedQuery(name = "SolicitudesRecursos.findBySolicitudId", query = "SELECT s FROM SolicitudesRecursos s WHERE s.solicitudId = :solicitudId"),
    @NamedQuery(name = "SolicitudesRecursos.findByFechaElaboracion", query = "SELECT s FROM SolicitudesRecursos s WHERE s.fechaElaboracion = :fechaElaboracion"),
    @NamedQuery(name = "SolicitudesRecursos.findByNoTramite", query = "SELECT s FROM SolicitudesRecursos s WHERE s.noTramite = :noTramite"),
    @NamedQuery(name = "SolicitudesRecursos.findBySonHonorarios", query = "SELECT s FROM SolicitudesRecursos s WHERE s.sonHonorarios = :sonHonorarios"),
    @NamedQuery(name = "SolicitudesRecursos.findByTipoPago", query = "SELECT s FROM SolicitudesRecursos s WHERE s.tipoPago = :tipoPago"),
    @NamedQuery(name = "SolicitudesRecursos.findByClaveProyecto", query = "SELECT s FROM SolicitudesRecursos s WHERE s.claveProyecto = :claveProyecto"),
    @NamedQuery(name = "SolicitudesRecursos.findByClabeInterbancaria", query = "SELECT s FROM SolicitudesRecursos s WHERE s.clabeInterbancaria = :clabeInterbancaria"),
    @NamedQuery(name = "SolicitudesRecursos.findByNombreBanco", query = "SELECT s FROM SolicitudesRecursos s WHERE s.nombreBanco = :nombreBanco"),
    @NamedQuery(name = "SolicitudesRecursos.findByDestinoEstatal", query = "SELECT s FROM SolicitudesRecursos s WHERE s.destinoEstatal = :destinoEstatal"),
    @NamedQuery(name = "SolicitudesRecursos.findByDestinoMunicipal", query = "SELECT s FROM SolicitudesRecursos s WHERE s.destinoMunicipal = :destinoMunicipal"),
    @NamedQuery(name = "SolicitudesRecursos.findByCuentaContable", query = "SELECT s FROM SolicitudesRecursos s WHERE s.cuentaContable = :cuentaContable"),
    @NamedQuery(name = "SolicitudesRecursos.findByMontoTotal", query = "SELECT s FROM SolicitudesRecursos s WHERE s.montoTotal = :montoTotal"),
    @NamedQuery(name = "SolicitudesRecursos.findByMontoLetra", query = "SELECT s FROM SolicitudesRecursos s WHERE s.montoLetra = :montoLetra"),
    @NamedQuery(name = "SolicitudesRecursos.findByAplicada", query = "SELECT s FROM SolicitudesRecursos s WHERE s.aplicada = :aplicada"),
    @NamedQuery(name = "SolicitudesRecursos.findByRfcBeneficiario", query = "SELECT s FROM SolicitudesRecursos s WHERE s.rfcBeneficiario = :rfcBeneficiario"),
    @NamedQuery(name = "SolicitudesRecursos.findByNombreBeneficiario", query = "SELECT s FROM SolicitudesRecursos s WHERE s.nombreBeneficiario = :nombreBeneficiario"),
    @NamedQuery(name = "SolicitudesRecursos.findByFkLicitacion", query = "SELECT s FROM SolicitudesRecursos s WHERE s.fkLicitacion = :fkLicitacion"),
    @NamedQuery(name = "SolicitudesRecursos.findByFkTipoLicitacion", query = "SELECT s FROM SolicitudesRecursos s WHERE s.fkTipoLicitacion = :fkTipoLicitacion"),
    @NamedQuery(name = "SolicitudesRecursos.findByFkContrato", query = "SELECT s FROM SolicitudesRecursos s WHERE s.fkContrato = :fkContrato"),
    @NamedQuery(name = "SolicitudesRecursos.findByPolizaFianza", query = "SELECT s FROM SolicitudesRecursos s WHERE s.polizaFianza = :polizaFianza"),
    @NamedQuery(name = "SolicitudesRecursos.findByUltimaActualizacion", query = "SELECT s FROM SolicitudesRecursos s WHERE s.ultimaActualizacion = :ultimaActualizacion"),
    @NamedQuery(name = "SolicitudesRecursos.findByObservaciones", query = "SELECT s FROM SolicitudesRecursos s WHERE s.observaciones = :observaciones"),
    @NamedQuery(name = "SolicitudesRecursos.findByFkDetalle", query = "SELECT s FROM SolicitudesRecursos s WHERE s.fkDetalle = :fkDetalle"),
    @NamedQuery(name = "SolicitudesRecursos.findByFkRpai", query = "SELECT s FROM SolicitudesRecursos s WHERE s.fkRpai = :fkRpai")})
public class SolicitudRecurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "solicitud_id")
    private Integer solicitudId;
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
    @Column(name = "clabe_interbancaria")
    private String clabeInterbancaria;
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
    @Column(name = "aplicada")
    private short aplicada;
    @Column(name = "rfc_beneficiario")
    private String rfcBeneficiario;
    @Column(name = "nombre_beneficiario")
    private String nombreBeneficiario;
    @Column(name = "fk_licitacion")
    private String fkLicitacion;
    @Column(name = "fk_tipo_licitacion")
    private Integer fkTipoLicitacion;
    @Column(name = "fk_contrato")
    private String fkContrato;
    @Column(name = "poliza_fianza")
    private String polizaFianza;
    @Column(name = "ultima_actualizacion")
    @Temporal(TemporalType.DATE)
    private Date ultimaActualizacion;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "fk_detalle")
    private Integer fkDetalle;
    @Column(name = "fk_rpai")
    private String fkRpai;
    @OneToMany(mappedBy = "fkSolicitud")
    private Collection<Nota> notasCollection;
    @JoinColumn(name = "fk_entidad", referencedColumnName = "entidad_id")
    @ManyToOne
    private Entidad fkEntidad;
    @JoinColumn(name = "fk_estado", referencedColumnName = "estado_id")
    @ManyToOne
    private EstadoSolicitud fkEstado;
    @JoinColumn(name = "fk_firma_solicita", referencedColumnName = "firma_id")
    @ManyToOne
    private Firma fkFirmaSolicita;
    @JoinColumn(name = "fk_firma_VB", referencedColumnName = "firma_id")
    @ManyToOne
    private Firma fkfirmaVB;
    @JoinColumn(name = "fk_firma_autoriza", referencedColumnName = "firma_id")
    @ManyToOne
    private Firma fkFirmaAutoriza;
    @JoinColumn(name = "fk_usuario_crea", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuario fkUsuarioCrea;
    @JoinColumn(name = "fk_usuario_actualiza", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuario fkUsuarioActualiza;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudesRecursos")
    private Collection<PedidoSolicitud> pedidosSolicitudesCollection;
    @OneToMany(mappedBy = "fkSolicitud")
    private Collection<SolicitudHonorariO> solicitudesHonorariosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkSolicitud")
    private Collection<FacturaSolicitud> facturasSolicitudesCollection;
    @OneToMany(mappedBy = "fkSolicitud")
    private Collection<DetalleEstructuraSolicitud> detalleEstructuraSolicitudCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudesRecursos")
    private Collection<DictamenSolicitud> dictamenesSolicitudCollection;

    public SolicitudRecurso() {
    }

    public SolicitudRecurso(Integer solicitudId) {
        this.solicitudId = solicitudId;
    }

    public SolicitudRecurso(Integer solicitudId, Date fechaElaboracion, String noTramite, short sonHonorarios, String cuentaContable, short aplicada) {
        this.solicitudId = solicitudId;
        this.fechaElaboracion = fechaElaboracion;
        this.noTramite = noTramite;
        this.sonHonorarios = sonHonorarios;
        this.cuentaContable = cuentaContable;
        this.aplicada = aplicada;
    }

    public Integer getSolicitudId() {
        return solicitudId;
    }

    public void setSolicitudId(Integer solicitudId) {
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

    public String getClabeInterbancaria() {
        return clabeInterbancaria;
    }

    public void setClabeInterbancaria(String clabeInterbancaria) {
        this.clabeInterbancaria = clabeInterbancaria;
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

    public short getAplicada() {
        return aplicada;
    }

    public void setAplicada(short aplicada) {
        this.aplicada = aplicada;
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

    public String getFkLicitacion() {
        return fkLicitacion;
    }

    public void setFkLicitacion(String fkLicitacion) {
        this.fkLicitacion = fkLicitacion;
    }

    public Integer getFkTipoLicitacion() {
        return fkTipoLicitacion;
    }

    public void setFkTipoLicitacion(Integer fkTipoLicitacion) {
        this.fkTipoLicitacion = fkTipoLicitacion;
    }

    public String getFkContrato() {
        return fkContrato;
    }

    public void setFkContrato(String fkContrato) {
        this.fkContrato = fkContrato;
    }

    public String getPolizaFianza() {
        return polizaFianza;
    }

    public void setPolizaFianza(String polizaFianza) {
        this.polizaFianza = polizaFianza;
    }

    public Date getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(Date ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getFkDetalle() {
        return fkDetalle;
    }

    public void setFkDetalle(Integer fkDetalle) {
        this.fkDetalle = fkDetalle;
    }

    public String getFkRpai() {
        return fkRpai;
    }

    public void setFkRpai(String fkRpai) {
        this.fkRpai = fkRpai;
    }

    public Collection<Nota> getNotasCollection() {
        return notasCollection;
    }

    public void setNotasCollection(Collection<Nota> notasCollection) {
        this.notasCollection = notasCollection;
    }

    public Entidad getFkEntidad() {
        return fkEntidad;
    }

    public void setFkEntidad(Entidad fkEntidad) {
        this.fkEntidad = fkEntidad;
    }

    public EstadoSolicitud getFkEstado() {
        return fkEstado;
    }

    public void setFkEstado(EstadoSolicitud fkEstado) {
        this.fkEstado = fkEstado;
    }

    public Firma getFkFirmaSolicita() {
        return fkFirmaSolicita;
    }

    public void setFkFirmaSolicita(Firma fkFirmaSolicita) {
        this.fkFirmaSolicita = fkFirmaSolicita;
    }

    public Firma getFkfirmaVB() {
        return fkfirmaVB;
    }

    public void setFkfirmaVB(Firma fkfirmaVB) {
        this.fkfirmaVB = fkfirmaVB;
    }

    public Firma getFkFirmaAutoriza() {
        return fkFirmaAutoriza;
    }

    public void setFkFirmaAutoriza(Firma fkFirmaAutoriza) {
        this.fkFirmaAutoriza = fkFirmaAutoriza;
    }

    public Usuario getFkUsuarioCrea() {
        return fkUsuarioCrea;
    }

    public void setFkUsuarioCrea(Usuario fkUsuarioCrea) {
        this.fkUsuarioCrea = fkUsuarioCrea;
    }

    public Usuario getFkUsuarioActualiza() {
        return fkUsuarioActualiza;
    }

    public void setFkUsuarioActualiza(Usuario fkUsuarioActualiza) {
        this.fkUsuarioActualiza = fkUsuarioActualiza;
    }

    public Collection<PedidoSolicitud> getPedidosSolicitudesCollection() {
        return pedidosSolicitudesCollection;
    }

    public void setPedidosSolicitudesCollection(Collection<PedidoSolicitud> pedidosSolicitudesCollection) {
        this.pedidosSolicitudesCollection = pedidosSolicitudesCollection;
    }

    public Collection<SolicitudHonorariO> getSolicitudesHonorariosCollection() {
        return solicitudesHonorariosCollection;
    }

    public void setSolicitudesHonorariosCollection(Collection<SolicitudHonorariO> solicitudesHonorariosCollection) {
        this.solicitudesHonorariosCollection = solicitudesHonorariosCollection;
    }

    public Collection<FacturaSolicitud> getFacturasSolicitudesCollection() {
        return facturasSolicitudesCollection;
    }

    public void setFacturasSolicitudesCollection(Collection<FacturaSolicitud> facturasSolicitudesCollection) {
        this.facturasSolicitudesCollection = facturasSolicitudesCollection;
    }

    public Collection<DetalleEstructuraSolicitud> getDetalleEstructuraSolicitudCollection() {
        return detalleEstructuraSolicitudCollection;
    }

    public void setDetalleEstructuraSolicitudCollection(Collection<DetalleEstructuraSolicitud> detalleEstructuraSolicitudCollection) {
        this.detalleEstructuraSolicitudCollection = detalleEstructuraSolicitudCollection;
    }

    public Collection<DictamenSolicitud> getDictamenesSolicitudCollection() {
        return dictamenesSolicitudCollection;
    }

    public void setDictamenesSolicitudCollection(Collection<DictamenSolicitud> dictamenesSolicitudCollection) {
        this.dictamenesSolicitudCollection = dictamenesSolicitudCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solicitudId != null ? solicitudId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudRecurso)) {
            return false;
        }
        SolicitudRecurso other = (SolicitudRecurso) object;
        if ((this.solicitudId == null && other.solicitudId != null) || (this.solicitudId != null && !this.solicitudId.equals(other.solicitudId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.SolicitudesRecursos[ solicitudId=" + solicitudId + " ]";
    }
    
}
