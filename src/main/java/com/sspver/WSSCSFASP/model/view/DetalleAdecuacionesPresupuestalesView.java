package com.sspver.WSSCSFASP.model.view;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "detalle_adecuaciones_presupuestales_view")
@NamedQueries({
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findAll", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAdecuacionDetalleId", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.adecuacionDetalleId = :adecuacionDetalleId"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByDetalleEpBajaId", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.detalleEpBajaId = :detalleEpBajaId"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByDetalleEpAltaId", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.detalleEpAltaId = :detalleEpAltaId"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByOficioAdecuacionId", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.oficioAdecuacionId = :oficioAdecuacionId"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByNumeroOficio", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.numeroOficio = :numeroOficio"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByEstado", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.estado = :estado"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFechaRegistro", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFechaAplicacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fechaAplicacion = :fechaAplicacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByMontoAdecuacionId", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.montoAdecuacionId = :montoAdecuacionId"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspFederalAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspFederalAdecuacion = :faspFederalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspMunicipalAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspMunicipalAdecuacion = :faspMunicipalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspSubtotalAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspSubtotalAdecuacion = :faspSubtotalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionEstatalAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionEstatalAdecuacion = :aportacionEstatalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionMunicipalAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionMunicipalAdecuacion = :aportacionMunicipalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionSubtotalAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionSubtotalAdecuacion = :aportacionSubtotalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTotalPresupuestoAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.totalPresupuestoAdecuacion = :totalPresupuestoAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByCantidadAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.cantidadAdecuacion = :cantidadAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByPersonasAdecuacion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.personasAdecuacion = :personasAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspFederalBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspFederalBaja = :faspFederalBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspMunicipalBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspMunicipalBaja = :faspMunicipalBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspSubtotalBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspSubtotalBaja = :faspSubtotalBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionEstatalBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionEstatalBaja = :aportacionEstatalBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionMunicipalBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionMunicipalBaja = :aportacionMunicipalBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionSubtotalBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionSubtotalBaja = :aportacionSubtotalBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTotalPresupuestoBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.totalPresupuestoBaja = :totalPresupuestoBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTipoBajaId", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.tipoBajaId = :tipoBajaId"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByCantidadBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.cantidadBaja = :cantidadBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByPersonasBaja", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.personasBaja = :personasBaja"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspFederalMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspFederalMb = :faspFederalMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspMunicipalMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspMunicipalMb = :faspMunicipalMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspSubtotalMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspSubtotalMb = :faspSubtotalMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionEstatalMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionEstatalMb = :aportacionEstatalMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionMunicipalMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionMunicipalMb = :aportacionMunicipalMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionSubtotalMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionSubtotalMb = :aportacionSubtotalMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTotalPresupuestoMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.totalPresupuestoMb = :totalPresupuestoMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTipoMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.tipoMb = :tipoMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByCantidadMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.cantidadMb = :cantidadMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByPersonasMb", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.personasMb = :personasMb"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspFederalAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspFederalAlta = :faspFederalAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspMunicipalAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspMunicipalAlta = :faspMunicipalAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspSubtotalAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspSubtotalAlta = :faspSubtotalAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionEstatalAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionEstatalAlta = :aportacionEstatalAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionMunicipalAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionMunicipalAlta = :aportacionMunicipalAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionSubtotalAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionSubtotalAlta = :aportacionSubtotalAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTotalPresupuestoAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.totalPresupuestoAlta = :totalPresupuestoAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTipoAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.tipoAlta = :tipoAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByCantidadAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.cantidadAlta = :cantidadAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByPersonasAlta", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.personasAlta = :personasAlta"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspFederalMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspFederalMa = :faspFederalMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspMunicipalMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspMunicipalMa = :faspMunicipalMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFaspSubtotalMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.faspSubtotalMa = :faspSubtotalMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionEstatalMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionEstatalMa = :aportacionEstatalMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionMunicipalMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionMunicipalMa = :aportacionMunicipalMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByAportacionSubtotalMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.aportacionSubtotalMa = :aportacionSubtotalMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTotalPresupuestoMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.totalPresupuestoMa = :totalPresupuestoMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByTipoMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.tipoMa = :tipoMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByCantidadMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.cantidadMa = :cantidadMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByPersonasMa", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.personasMa = :personasMa"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkEstructura", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkEstructura = :fkEstructura"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkEje", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkEje = :fkEje"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkPrograma", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkPrograma = :fkPrograma"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkSubprograma", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkSubprograma = :fkSubprograma"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByClaveSubprograma", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.claveSubprograma = :claveSubprograma"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkFuncion", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkFuncion = :fkFuncion"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkCapitulo", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkCapitulo = :fkCapitulo"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkConcepto", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkConcepto = :fkConcepto"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkPgenerica", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkPgenerica = :fkPgenerica"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkPespecifica", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkPespecifica = :fkPespecifica"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkBien", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkBien = :fkBien"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkRLCF", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkRLCF = :fkRLCF"),
    @NamedQuery(name = "DetalleAdecuacionesPresupuestalesView.findByFkClaveBien", query = "SELECT d FROM DetalleAdecuacionesPresupuestalesView d WHERE d.fkClaveBien = :fkClaveBien")})
public class DetalleAdecuacionesPresupuestalesView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "adecuacion_detalle_id")
    private int adecuacionDetalleId;
    @Basic(optional = false)
    @Column(name = "detalle_ep_baja_id")
    private int detalleEpBajaId;
    @Basic(optional = false)
    @Column(name = "detalle_ep_alta_id")
    private int detalleEpAltaId;
    @Basic(optional = false)
    @Column(name = "oficio_adecuacion_id")
    private int oficioAdecuacionId;
    @Basic(optional = false)
    @Column(name = "numero_oficio")
    private String numeroOficio;
    @Column(name = "estado")
    private Short estado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "fecha_aplicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAplicacion;
    @Basic(optional = false)
    @Column(name = "monto_adecuacion_id")
    private int montoAdecuacionId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "fasp_federal_adecuacion")
    private BigDecimal faspFederalAdecuacion;
    @Basic(optional = false)
    @Column(name = "fasp_municipal_adecuacion")
    private BigDecimal faspMunicipalAdecuacion;
    @Column(name = "fasp_subtotal_adecuacion")
    private BigDecimal faspSubtotalAdecuacion;
    @Basic(optional = false)
    @Column(name = "aportacion_estatal_adecuacion")
    private BigDecimal aportacionEstatalAdecuacion;
    @Basic(optional = false)
    @Column(name = "aportacion_municipal_adecuacion")
    private BigDecimal aportacionMunicipalAdecuacion;
    @Column(name = "aportacion_subtotal_adecuacion")
    private BigDecimal aportacionSubtotalAdecuacion;
    @Column(name = "total_presupuesto_adecuacion")
    private BigDecimal totalPresupuestoAdecuacion;
    @Basic(optional = false)
    @Column(name = "cantidad_adecuacion")
    private int cantidadAdecuacion;
    @Basic(optional = false)
    @Column(name = "personas_adecuacion")
    private int personasAdecuacion;
    @Basic(optional = false)
    @Column(name = "fasp_federal_baja")
    private BigDecimal faspFederalBaja;
    @Basic(optional = false)
    @Column(name = "fasp_municipal_baja")
    private BigDecimal faspMunicipalBaja;
    @Column(name = "fasp_subtotal_baja")
    private BigDecimal faspSubtotalBaja;
    @Basic(optional = false)
    @Column(name = "aportacion_estatal_baja")
    private BigDecimal aportacionEstatalBaja;
    @Basic(optional = false)
    @Column(name = "aportacion_municipal_baja")
    private BigDecimal aportacionMunicipalBaja;
    @Column(name = "aportacion_subtotal_baja")
    private BigDecimal aportacionSubtotalBaja;
    @Column(name = "total_presupuesto_baja")
    private BigDecimal totalPresupuestoBaja;
    @Basic(optional = false)
    @Column(name = "tipo_baja_id")
    private int tipoBajaId;
    @Column(name = "cantidad_baja")
    private Integer cantidadBaja;
    @Column(name = "personas_baja")
    private Integer personasBaja;
    @Basic(optional = false)
    @Column(name = "fasp_federal_mb")
    private BigDecimal faspFederalMb;
    @Basic(optional = false)
    @Column(name = "fasp_municipal_mb")
    private BigDecimal faspMunicipalMb;
    @Column(name = "fasp_subtotal_mb")
    private BigDecimal faspSubtotalMb;
    @Basic(optional = false)
    @Column(name = "aportacion_estatal_mb")
    private BigDecimal aportacionEstatalMb;
    @Basic(optional = false)
    @Column(name = "aportacion_municipal_mb")
    private BigDecimal aportacionMunicipalMb;
    @Column(name = "aportacion_subtotal_mb")
    private BigDecimal aportacionSubtotalMb;
    @Column(name = "total_presupuesto_mb")
    private BigDecimal totalPresupuestoMb;
    @Basic(optional = false)
    @Column(name = "tipo_mb")
    private int tipoMb;
    @Column(name = "cantidad_mb")
    private Integer cantidadMb;
    @Column(name = "personas_mb")
    private Integer personasMb;
    @Basic(optional = false)
    @Column(name = "fasp_federal_alta")
    private BigDecimal faspFederalAlta;
    @Basic(optional = false)
    @Column(name = "fasp_municipal_alta")
    private BigDecimal faspMunicipalAlta;
    @Column(name = "fasp_subtotal_alta")
    private BigDecimal faspSubtotalAlta;
    @Basic(optional = false)
    @Column(name = "aportacion_estatal_alta")
    private BigDecimal aportacionEstatalAlta;
    @Basic(optional = false)
    @Column(name = "aportacion_municipal_alta")
    private BigDecimal aportacionMunicipalAlta;
    @Column(name = "aportacion_subtotal_alta")
    private BigDecimal aportacionSubtotalAlta;
    @Column(name = "total_presupuesto_alta")
    private BigDecimal totalPresupuestoAlta;
    @Basic(optional = false)
    @Column(name = "tipo_alta")
    private int tipoAlta;
    @Column(name = "cantidad_alta")
    private Integer cantidadAlta;
    @Column(name = "personas_alta")
    private Integer personasAlta;
    @Basic(optional = false)
    @Column(name = "fasp_federal_ma")
    private BigDecimal faspFederalMa;
    @Basic(optional = false)
    @Column(name = "fasp_municipal_ma")
    private BigDecimal faspMunicipalMa;
    @Column(name = "fasp_subtotal_ma")
    private BigDecimal faspSubtotalMa;
    @Basic(optional = false)
    @Column(name = "aportacion_estatal_ma")
    private BigDecimal aportacionEstatalMa;
    @Basic(optional = false)
    @Column(name = "aportacion_municipal_ma")
    private BigDecimal aportacionMunicipalMa;
    @Column(name = "aportacion_subtotal_ma")
    private BigDecimal aportacionSubtotalMa;
    @Column(name = "total_presupuesto_ma")
    private BigDecimal totalPresupuestoMa;
    @Basic(optional = false)
    @Column(name = "tipo_ma")
    private int tipoMa;
    @Column(name = "cantidad_ma")
    private Integer cantidadMa;
    @Column(name = "personas_ma")
    private Integer personasMa;
    @Basic(optional = false)
    @Column(name = "fk_estructura")
    private int fkEstructura;
    @Basic(optional = false)
    @Column(name = "fk_eje")
    private int fkEje;
    @Basic(optional = false)
    @Column(name = "fk_programa")
    private int fkPrograma;
    @Basic(optional = false)
    @Column(name = "fk_subprograma")
    private int fkSubprograma;
    @Basic(optional = false)
    @Column(name = "clave_subprograma")
    private String claveSubprograma;
    @Column(name = "fk_funcion")
    private String fkFuncion;
    @Basic(optional = false)
    @Column(name = "fk_capitulo")
    private int fkCapitulo;
    @Basic(optional = false)
    @Column(name = "fk_concepto")
    private int fkConcepto;
    @Column(name = "fk_pgenerica")
    private Integer fkPgenerica;
    @Column(name = "fk_pespecifica")
    private Integer fkPespecifica;
    @Basic(optional = false)
    @Column(name = "fk_bien")
    private int fkBien;
    @Basic(optional = false)
    @Column(name = "fk_RLCF")
    private int fkRLCF;
    @Column(name = "fk_clave_bien")
    private String fkClaveBien;

    public DetalleAdecuacionesPresupuestalesView() {
    }

    public int getAdecuacionDetalleId() {
        return adecuacionDetalleId;
    }

    public void setAdecuacionDetalleId(int adecuacionDetalleId) {
        this.adecuacionDetalleId = adecuacionDetalleId;
    }

    public int getDetalleEpBajaId() {
        return detalleEpBajaId;
    }

    public void setDetalleEpBajaId(int detalleEpBajaId) {
        this.detalleEpBajaId = detalleEpBajaId;
    }

    public int getDetalleEpAltaId() {
        return detalleEpAltaId;
    }

    public void setDetalleEpAltaId(int detalleEpAltaId) {
        this.detalleEpAltaId = detalleEpAltaId;
    }

    public int getOficioAdecuacionId() {
        return oficioAdecuacionId;
    }

    public void setOficioAdecuacionId(int oficioAdecuacionId) {
        this.oficioAdecuacionId = oficioAdecuacionId;
    }

    public String getNumeroOficio() {
        return numeroOficio;
    }

    public void setNumeroOficio(String numeroOficio) {
        this.numeroOficio = numeroOficio;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public int getMontoAdecuacionId() {
        return montoAdecuacionId;
    }

    public void setMontoAdecuacionId(int montoAdecuacionId) {
        this.montoAdecuacionId = montoAdecuacionId;
    }

    public BigDecimal getFaspFederalAdecuacion() {
        return faspFederalAdecuacion;
    }

    public void setFaspFederalAdecuacion(BigDecimal faspFederalAdecuacion) {
        this.faspFederalAdecuacion = faspFederalAdecuacion;
    }

    public BigDecimal getFaspMunicipalAdecuacion() {
        return faspMunicipalAdecuacion;
    }

    public void setFaspMunicipalAdecuacion(BigDecimal faspMunicipalAdecuacion) {
        this.faspMunicipalAdecuacion = faspMunicipalAdecuacion;
    }

    public BigDecimal getFaspSubtotalAdecuacion() {
        return faspSubtotalAdecuacion;
    }

    public void setFaspSubtotalAdecuacion(BigDecimal faspSubtotalAdecuacion) {
        this.faspSubtotalAdecuacion = faspSubtotalAdecuacion;
    }

    public BigDecimal getAportacionEstatalAdecuacion() {
        return aportacionEstatalAdecuacion;
    }

    public void setAportacionEstatalAdecuacion(BigDecimal aportacionEstatalAdecuacion) {
        this.aportacionEstatalAdecuacion = aportacionEstatalAdecuacion;
    }

    public BigDecimal getAportacionMunicipalAdecuacion() {
        return aportacionMunicipalAdecuacion;
    }

    public void setAportacionMunicipalAdecuacion(BigDecimal aportacionMunicipalAdecuacion) {
        this.aportacionMunicipalAdecuacion = aportacionMunicipalAdecuacion;
    }

    public BigDecimal getAportacionSubtotalAdecuacion() {
        return aportacionSubtotalAdecuacion;
    }

    public void setAportacionSubtotalAdecuacion(BigDecimal aportacionSubtotalAdecuacion) {
        this.aportacionSubtotalAdecuacion = aportacionSubtotalAdecuacion;
    }

    public BigDecimal getTotalPresupuestoAdecuacion() {
        return totalPresupuestoAdecuacion;
    }

    public void setTotalPresupuestoAdecuacion(BigDecimal totalPresupuestoAdecuacion) {
        this.totalPresupuestoAdecuacion = totalPresupuestoAdecuacion;
    }

    public int getCantidadAdecuacion() {
        return cantidadAdecuacion;
    }

    public void setCantidadAdecuacion(int cantidadAdecuacion) {
        this.cantidadAdecuacion = cantidadAdecuacion;
    }

    public int getPersonasAdecuacion() {
        return personasAdecuacion;
    }

    public void setPersonasAdecuacion(int personasAdecuacion) {
        this.personasAdecuacion = personasAdecuacion;
    }

    public BigDecimal getFaspFederalBaja() {
        return faspFederalBaja;
    }

    public void setFaspFederalBaja(BigDecimal faspFederalBaja) {
        this.faspFederalBaja = faspFederalBaja;
    }

    public BigDecimal getFaspMunicipalBaja() {
        return faspMunicipalBaja;
    }

    public void setFaspMunicipalBaja(BigDecimal faspMunicipalBaja) {
        this.faspMunicipalBaja = faspMunicipalBaja;
    }

    public BigDecimal getFaspSubtotalBaja() {
        return faspSubtotalBaja;
    }

    public void setFaspSubtotalBaja(BigDecimal faspSubtotalBaja) {
        this.faspSubtotalBaja = faspSubtotalBaja;
    }

    public BigDecimal getAportacionEstatalBaja() {
        return aportacionEstatalBaja;
    }

    public void setAportacionEstatalBaja(BigDecimal aportacionEstatalBaja) {
        this.aportacionEstatalBaja = aportacionEstatalBaja;
    }

    public BigDecimal getAportacionMunicipalBaja() {
        return aportacionMunicipalBaja;
    }

    public void setAportacionMunicipalBaja(BigDecimal aportacionMunicipalBaja) {
        this.aportacionMunicipalBaja = aportacionMunicipalBaja;
    }

    public BigDecimal getAportacionSubtotalBaja() {
        return aportacionSubtotalBaja;
    }

    public void setAportacionSubtotalBaja(BigDecimal aportacionSubtotalBaja) {
        this.aportacionSubtotalBaja = aportacionSubtotalBaja;
    }

    public BigDecimal getTotalPresupuestoBaja() {
        return totalPresupuestoBaja;
    }

    public void setTotalPresupuestoBaja(BigDecimal totalPresupuestoBaja) {
        this.totalPresupuestoBaja = totalPresupuestoBaja;
    }

    public int getTipoBajaId() {
        return tipoBajaId;
    }

    public void setTipoBajaId(int tipoBajaId) {
        this.tipoBajaId = tipoBajaId;
    }

    public Integer getCantidadBaja() {
        return cantidadBaja;
    }

    public void setCantidadBaja(Integer cantidadBaja) {
        this.cantidadBaja = cantidadBaja;
    }

    public Integer getPersonasBaja() {
        return personasBaja;
    }

    public void setPersonasBaja(Integer personasBaja) {
        this.personasBaja = personasBaja;
    }

    public BigDecimal getFaspFederalMb() {
        return faspFederalMb;
    }

    public void setFaspFederalMb(BigDecimal faspFederalMb) {
        this.faspFederalMb = faspFederalMb;
    }

    public BigDecimal getFaspMunicipalMb() {
        return faspMunicipalMb;
    }

    public void setFaspMunicipalMb(BigDecimal faspMunicipalMb) {
        this.faspMunicipalMb = faspMunicipalMb;
    }

    public BigDecimal getFaspSubtotalMb() {
        return faspSubtotalMb;
    }

    public void setFaspSubtotalMb(BigDecimal faspSubtotalMb) {
        this.faspSubtotalMb = faspSubtotalMb;
    }

    public BigDecimal getAportacionEstatalMb() {
        return aportacionEstatalMb;
    }

    public void setAportacionEstatalMb(BigDecimal aportacionEstatalMb) {
        this.aportacionEstatalMb = aportacionEstatalMb;
    }

    public BigDecimal getAportacionMunicipalMb() {
        return aportacionMunicipalMb;
    }

    public void setAportacionMunicipalMb(BigDecimal aportacionMunicipalMb) {
        this.aportacionMunicipalMb = aportacionMunicipalMb;
    }

    public BigDecimal getAportacionSubtotalMb() {
        return aportacionSubtotalMb;
    }

    public void setAportacionSubtotalMb(BigDecimal aportacionSubtotalMb) {
        this.aportacionSubtotalMb = aportacionSubtotalMb;
    }

    public BigDecimal getTotalPresupuestoMb() {
        return totalPresupuestoMb;
    }

    public void setTotalPresupuestoMb(BigDecimal totalPresupuestoMb) {
        this.totalPresupuestoMb = totalPresupuestoMb;
    }

    public int getTipoMb() {
        return tipoMb;
    }

    public void setTipoMb(int tipoMb) {
        this.tipoMb = tipoMb;
    }

    public Integer getCantidadMb() {
        return cantidadMb;
    }

    public void setCantidadMb(Integer cantidadMb) {
        this.cantidadMb = cantidadMb;
    }

    public Integer getPersonasMb() {
        return personasMb;
    }

    public void setPersonasMb(Integer personasMb) {
        this.personasMb = personasMb;
    }

    public BigDecimal getFaspFederalAlta() {
        return faspFederalAlta;
    }

    public void setFaspFederalAlta(BigDecimal faspFederalAlta) {
        this.faspFederalAlta = faspFederalAlta;
    }

    public BigDecimal getFaspMunicipalAlta() {
        return faspMunicipalAlta;
    }

    public void setFaspMunicipalAlta(BigDecimal faspMunicipalAlta) {
        this.faspMunicipalAlta = faspMunicipalAlta;
    }

    public BigDecimal getFaspSubtotalAlta() {
        return faspSubtotalAlta;
    }

    public void setFaspSubtotalAlta(BigDecimal faspSubtotalAlta) {
        this.faspSubtotalAlta = faspSubtotalAlta;
    }

    public BigDecimal getAportacionEstatalAlta() {
        return aportacionEstatalAlta;
    }

    public void setAportacionEstatalAlta(BigDecimal aportacionEstatalAlta) {
        this.aportacionEstatalAlta = aportacionEstatalAlta;
    }

    public BigDecimal getAportacionMunicipalAlta() {
        return aportacionMunicipalAlta;
    }

    public void setAportacionMunicipalAlta(BigDecimal aportacionMunicipalAlta) {
        this.aportacionMunicipalAlta = aportacionMunicipalAlta;
    }

    public BigDecimal getAportacionSubtotalAlta() {
        return aportacionSubtotalAlta;
    }

    public void setAportacionSubtotalAlta(BigDecimal aportacionSubtotalAlta) {
        this.aportacionSubtotalAlta = aportacionSubtotalAlta;
    }

    public BigDecimal getTotalPresupuestoAlta() {
        return totalPresupuestoAlta;
    }

    public void setTotalPresupuestoAlta(BigDecimal totalPresupuestoAlta) {
        this.totalPresupuestoAlta = totalPresupuestoAlta;
    }

    public int getTipoAlta() {
        return tipoAlta;
    }

    public void setTipoAlta(int tipoAlta) {
        this.tipoAlta = tipoAlta;
    }

    public Integer getCantidadAlta() {
        return cantidadAlta;
    }

    public void setCantidadAlta(Integer cantidadAlta) {
        this.cantidadAlta = cantidadAlta;
    }

    public Integer getPersonasAlta() {
        return personasAlta;
    }

    public void setPersonasAlta(Integer personasAlta) {
        this.personasAlta = personasAlta;
    }

    public BigDecimal getFaspFederalMa() {
        return faspFederalMa;
    }

    public void setFaspFederalMa(BigDecimal faspFederalMa) {
        this.faspFederalMa = faspFederalMa;
    }

    public BigDecimal getFaspMunicipalMa() {
        return faspMunicipalMa;
    }

    public void setFaspMunicipalMa(BigDecimal faspMunicipalMa) {
        this.faspMunicipalMa = faspMunicipalMa;
    }

    public BigDecimal getFaspSubtotalMa() {
        return faspSubtotalMa;
    }

    public void setFaspSubtotalMa(BigDecimal faspSubtotalMa) {
        this.faspSubtotalMa = faspSubtotalMa;
    }

    public BigDecimal getAportacionEstatalMa() {
        return aportacionEstatalMa;
    }

    public void setAportacionEstatalMa(BigDecimal aportacionEstatalMa) {
        this.aportacionEstatalMa = aportacionEstatalMa;
    }

    public BigDecimal getAportacionMunicipalMa() {
        return aportacionMunicipalMa;
    }

    public void setAportacionMunicipalMa(BigDecimal aportacionMunicipalMa) {
        this.aportacionMunicipalMa = aportacionMunicipalMa;
    }

    public BigDecimal getAportacionSubtotalMa() {
        return aportacionSubtotalMa;
    }

    public void setAportacionSubtotalMa(BigDecimal aportacionSubtotalMa) {
        this.aportacionSubtotalMa = aportacionSubtotalMa;
    }

    public BigDecimal getTotalPresupuestoMa() {
        return totalPresupuestoMa;
    }

    public void setTotalPresupuestoMa(BigDecimal totalPresupuestoMa) {
        this.totalPresupuestoMa = totalPresupuestoMa;
    }

    public int getTipoMa() {
        return tipoMa;
    }

    public void setTipoMa(int tipoMa) {
        this.tipoMa = tipoMa;
    }

    public Integer getCantidadMa() {
        return cantidadMa;
    }

    public void setCantidadMa(Integer cantidadMa) {
        this.cantidadMa = cantidadMa;
    }

    public Integer getPersonasMa() {
        return personasMa;
    }

    public void setPersonasMa(Integer personasMa) {
        this.personasMa = personasMa;
    }

    public int getFkEstructura() {
        return fkEstructura;
    }

    public void setFkEstructura(int fkEstructura) {
        this.fkEstructura = fkEstructura;
    }

    public int getFkEje() {
        return fkEje;
    }

    public void setFkEje(int fkEje) {
        this.fkEje = fkEje;
    }

    public int getFkPrograma() {
        return fkPrograma;
    }

    public void setFkPrograma(int fkPrograma) {
        this.fkPrograma = fkPrograma;
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

    public String getFkFuncion() {
        return fkFuncion;
    }

    public void setFkFuncion(String fkFuncion) {
        this.fkFuncion = fkFuncion;
    }

    public int getFkCapitulo() {
        return fkCapitulo;
    }

    public void setFkCapitulo(int fkCapitulo) {
        this.fkCapitulo = fkCapitulo;
    }

    public int getFkConcepto() {
        return fkConcepto;
    }

    public void setFkConcepto(int fkConcepto) {
        this.fkConcepto = fkConcepto;
    }

    public Integer getFkPgenerica() {
        return fkPgenerica;
    }

    public void setFkPgenerica(Integer fkPgenerica) {
        this.fkPgenerica = fkPgenerica;
    }

    public Integer getFkPespecifica() {
        return fkPespecifica;
    }

    public void setFkPespecifica(Integer fkPespecifica) {
        this.fkPespecifica = fkPespecifica;
    }

    public int getFkBien() {
        return fkBien;
    }

    public void setFkBien(int fkBien) {
        this.fkBien = fkBien;
    }

    public int getFkRLCF() {
        return fkRLCF;
    }

    public void setFkRLCF(int fkRLCF) {
        this.fkRLCF = fkRLCF;
    }

    public String getFkClaveBien() {
        return fkClaveBien;
    }

    public void setFkClaveBien(String fkClaveBien) {
        this.fkClaveBien = fkClaveBien;
    }
    
}
