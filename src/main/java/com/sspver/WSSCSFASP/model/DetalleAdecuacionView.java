package com.sspver.WSSCSFASP.model;

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
@Table(name = "detalle_adecuacion_view")
@NamedQueries({
    @NamedQuery(name = "DetalleAdecuacionView.findAll", query = "SELECT d FROM DetalleAdecuacionView d"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAdecuacionDetalleId", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.adecuacionDetalleId = :adecuacionDetalleId"),
    @NamedQuery(name = "DetalleAdecuacionView.findByOficioAdecuacionId", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.oficioAdecuacionId = :oficioAdecuacionId"),
    @NamedQuery(name = "DetalleAdecuacionView.findByNumeroOficio", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.numeroOficio = :numeroOficio"),
    @NamedQuery(name = "DetalleAdecuacionView.findByEstado", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.estado = :estado"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFechaRegistro", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFechaAplicacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.fechaAplicacion = :fechaAplicacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByMontoAdecuacionId", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.montoAdecuacionId = :montoAdecuacionId"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspFederalAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspFederalAdecuacion = :faspFederalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspMunicipalAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspMunicipalAdecuacion = :faspMunicipalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspSubtotalAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspSubtotalAdecuacion = :faspSubtotalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionEstatalAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionEstatalAdecuacion = :aportacionEstatalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionMunicipalAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionMunicipalAdecuacion = :aportacionMunicipalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionSubtotalAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionSubtotalAdecuacion = :aportacionSubtotalAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTotalPresupuestoAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.totalPresupuestoAdecuacion = :totalPresupuestoAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByCantidadAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.cantidadAdecuacion = :cantidadAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPersonasAdecuacion", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.personasAdecuacion = :personasAdecuacion"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPtoBajaId", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.ptoBajaId = :ptoBajaId"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspFederalBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspFederalBaja = :faspFederalBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspMunicipalBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspMunicipalBaja = :faspMunicipalBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspSubtotalBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspSubtotalBaja = :faspSubtotalBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionEstatalBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionEstatalBaja = :aportacionEstatalBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionMunicipalBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionMunicipalBaja = :aportacionMunicipalBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionSubtotalBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionSubtotalBaja = :aportacionSubtotalBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTotalPresupuestoBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.totalPresupuestoBaja = :totalPresupuestoBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTipoBajaId", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.tipoBajaId = :tipoBajaId"),
    @NamedQuery(name = "DetalleAdecuacionView.findByCantidadBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.cantidadBaja = :cantidadBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPersonasBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.personasBaja = :personasBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPtomodBajaid", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.ptomodBajaid = :ptomodBajaid"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspFederalMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspFederalMb = :faspFederalMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspMunicipalMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspMunicipalMb = :faspMunicipalMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspSubtotalMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspSubtotalMb = :faspSubtotalMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionEstatalMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionEstatalMb = :aportacionEstatalMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionMunicipalMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionMunicipalMb = :aportacionMunicipalMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionSubtotalMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionSubtotalMb = :aportacionSubtotalMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTotalPresupuestoMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.totalPresupuestoMb = :totalPresupuestoMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTipoMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.tipoMb = :tipoMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByCantidadMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.cantidadMb = :cantidadMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPersonasMb", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.personasMb = :personasMb"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPtoAltaId", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.ptoAltaId = :ptoAltaId"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspFederalAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspFederalAlta = :faspFederalAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspMunicipalAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspMunicipalAlta = :faspMunicipalAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspSubtotalAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspSubtotalAlta = :faspSubtotalAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionEstatalAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionEstatalAlta = :aportacionEstatalAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionMunicipalAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionMunicipalAlta = :aportacionMunicipalAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionSubtotalAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionSubtotalAlta = :aportacionSubtotalAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTotalPresupuestoAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.totalPresupuestoAlta = :totalPresupuestoAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTipoAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.tipoAlta = :tipoAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByCantidadAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.cantidadAlta = :cantidadAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPersonasAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.personasAlta = :personasAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPtomodAltaid", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.ptomodAltaid = :ptomodAltaid"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspFederalMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspFederalMa = :faspFederalMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspMunicipalMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspMunicipalMa = :faspMunicipalMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFaspSubtotalMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.faspSubtotalMa = :faspSubtotalMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionEstatalMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionEstatalMa = :aportacionEstatalMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionMunicipalMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionMunicipalMa = :aportacionMunicipalMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByAportacionSubtotalMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.aportacionSubtotalMa = :aportacionSubtotalMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTotalPresupuestoMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.totalPresupuestoMa = :totalPresupuestoMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByTipoMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.tipoMa = :tipoMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByCantidadMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.cantidadMa = :cantidadMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPersonasMa", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.personasMa = :personasMa"),
    @NamedQuery(name = "DetalleAdecuacionView.findByDetalleEpBajaId", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.detalleEpBajaId = :detalleEpBajaId"),
    @NamedQuery(name = "DetalleAdecuacionView.findByEstructuraBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.estructuraBaja = :estructuraBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByEjeBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.ejeBaja = :ejeBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByProgramaBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.programaBaja = :programaBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findBySubprogramaBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.subprogramaBaja = :subprogramaBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByClaveSubprogramaBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.claveSubprogramaBaja = :claveSubprogramaBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFuncionBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.funcionBaja = :funcionBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByCapituloBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.capituloBaja = :capituloBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByConceptoBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.conceptoBaja = :conceptoBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPgenericaBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.pgenericaBaja = :pgenericaBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPespecificaBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.pespecificaBaja = :pespecificaBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByBienBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.bienBaja = :bienBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByClaveBienBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.claveBienBaja = :claveBienBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByRlcfBaja", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.rlcfBaja = :rlcfBaja"),
    @NamedQuery(name = "DetalleAdecuacionView.findByDetalleEpAltaId", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.detalleEpAltaId = :detalleEpAltaId"),
    @NamedQuery(name = "DetalleAdecuacionView.findByEstructuraAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.estructuraAlta = :estructuraAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByEjeAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.ejeAlta = :ejeAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByProgramaAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.programaAlta = :programaAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findBySubprogramaAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.subprogramaAlta = :subprogramaAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByClaveSubprogramaAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.claveSubprogramaAlta = :claveSubprogramaAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByFuncionAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.funcionAlta = :funcionAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByCapituloAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.capituloAlta = :capituloAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByConceptoAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.conceptoAlta = :conceptoAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPgenericaAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.pgenericaAlta = :pgenericaAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByPespecificaAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.pespecificaAlta = :pespecificaAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByBienAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.bienAlta = :bienAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByClaveBienAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.claveBienAlta = :claveBienAlta"),
    @NamedQuery(name = "DetalleAdecuacionView.findByRlcfAlta", query = "SELECT d FROM DetalleAdecuacionView d WHERE d.rlcfAlta = :rlcfAlta")})
public class DetalleAdecuacionView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "adecuacion_detalle_id")
    private int adecuacionDetalleId;
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
    @Column(name = "pto_baja_id")
    private int ptoBajaId;
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
    @Column(name = "pto_modBaja_id")
    private int ptomodBajaid;
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
    @Column(name = "pto_alta_id")
    private int ptoAltaId;
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
    @Column(name = "pto_modAlta_id")
    private int ptomodAltaid;
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
    @Column(name = "detalle_ep_baja_id")
    private int detalleEpBajaId;
    @Basic(optional = false)
    @Column(name = "estructura_baja")
    private int estructuraBaja;
    @Basic(optional = false)
    @Column(name = "eje_baja")
    private int ejeBaja;
    @Basic(optional = false)
    @Column(name = "programa_baja")
    private int programaBaja;
    @Basic(optional = false)
    @Column(name = "subprograma_baja")
    private int subprogramaBaja;
    @Basic(optional = false)
    @Column(name = "clave_subprograma_baja")
    private String claveSubprogramaBaja;
    @Column(name = "funcion_baja")
    private String funcionBaja;
    @Basic(optional = false)
    @Column(name = "capitulo_baja")
    private int capituloBaja;
    @Basic(optional = false)
    @Column(name = "concepto_baja")
    private int conceptoBaja;
    @Column(name = "pgenerica_baja")
    private Integer pgenericaBaja;
    @Column(name = "pespecifica_baja")
    private Integer pespecificaBaja;
    @Basic(optional = false)
    @Column(name = "bien_baja")
    private int bienBaja;
    @Column(name = "clave_bien_baja")
    private String claveBienBaja;
    @Basic(optional = false)
    @Column(name = "rlcf_baja")
    private int rlcfBaja;
    @Basic(optional = false)
    @Column(name = "detalle_ep_alta_id")
    private int detalleEpAltaId;
    @Basic(optional = false)
    @Column(name = "estructura_alta")
    private int estructuraAlta;
    @Basic(optional = false)
    @Column(name = "eje_alta")
    private int ejeAlta;
    @Basic(optional = false)
    @Column(name = "programa_alta")
    private int programaAlta;
    @Basic(optional = false)
    @Column(name = "subprograma_alta")
    private int subprogramaAlta;
    @Basic(optional = false)
    @Column(name = "clave_subprograma_alta")
    private String claveSubprogramaAlta;
    @Column(name = "funcion_alta")
    private String funcionAlta;
    @Basic(optional = false)
    @Column(name = "capitulo_alta")
    private int capituloAlta;
    @Basic(optional = false)
    @Column(name = "concepto_alta")
    private int conceptoAlta;
    @Column(name = "pgenerica_alta")
    private Integer pgenericaAlta;
    @Column(name = "pespecifica_alta")
    private Integer pespecificaAlta;
    @Basic(optional = false)
    @Column(name = "bien_alta")
    private int bienAlta;
    @Column(name = "clave_bien_alta")
    private String claveBienAlta;
    @Basic(optional = false)
    @Column(name = "rlcf_alta")
    private int rlcfAlta;

    public DetalleAdecuacionView() {
    }

    public int getAdecuacionDetalleId() {
        return adecuacionDetalleId;
    }

    public void setAdecuacionDetalleId(int adecuacionDetalleId) {
        this.adecuacionDetalleId = adecuacionDetalleId;
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

    public int getPtoBajaId() {
        return ptoBajaId;
    }

    public void setPtoBajaId(int ptoBajaId) {
        this.ptoBajaId = ptoBajaId;
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

    public int getPtomodBajaid() {
        return ptomodBajaid;
    }

    public void setPtomodBajaid(int ptomodBajaid) {
        this.ptomodBajaid = ptomodBajaid;
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

    public int getPtoAltaId() {
        return ptoAltaId;
    }

    public void setPtoAltaId(int ptoAltaId) {
        this.ptoAltaId = ptoAltaId;
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

    public int getPtomodAltaid() {
        return ptomodAltaid;
    }

    public void setPtomodAltaid(int ptomodAltaid) {
        this.ptomodAltaid = ptomodAltaid;
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

    public int getDetalleEpBajaId() {
        return detalleEpBajaId;
    }

    public void setDetalleEpBajaId(int detalleEpBajaId) {
        this.detalleEpBajaId = detalleEpBajaId;
    }

    public int getEstructuraBaja() {
        return estructuraBaja;
    }

    public void setEstructuraBaja(int estructuraBaja) {
        this.estructuraBaja = estructuraBaja;
    }

    public int getEjeBaja() {
        return ejeBaja;
    }

    public void setEjeBaja(int ejeBaja) {
        this.ejeBaja = ejeBaja;
    }

    public int getProgramaBaja() {
        return programaBaja;
    }

    public void setProgramaBaja(int programaBaja) {
        this.programaBaja = programaBaja;
    }

    public int getSubprogramaBaja() {
        return subprogramaBaja;
    }

    public void setSubprogramaBaja(int subprogramaBaja) {
        this.subprogramaBaja = subprogramaBaja;
    }

    public String getClaveSubprogramaBaja() {
        return claveSubprogramaBaja;
    }

    public void setClaveSubprogramaBaja(String claveSubprogramaBaja) {
        this.claveSubprogramaBaja = claveSubprogramaBaja;
    }

    public String getFuncionBaja() {
        return funcionBaja;
    }

    public void setFuncionBaja(String funcionBaja) {
        this.funcionBaja = funcionBaja;
    }

    public int getCapituloBaja() {
        return capituloBaja;
    }

    public void setCapituloBaja(int capituloBaja) {
        this.capituloBaja = capituloBaja;
    }

    public int getConceptoBaja() {
        return conceptoBaja;
    }

    public void setConceptoBaja(int conceptoBaja) {
        this.conceptoBaja = conceptoBaja;
    }

    public Integer getPgenericaBaja() {
        return pgenericaBaja;
    }

    public void setPgenericaBaja(Integer pgenericaBaja) {
        this.pgenericaBaja = pgenericaBaja;
    }

    public Integer getPespecificaBaja() {
        return pespecificaBaja;
    }

    public void setPespecificaBaja(Integer pespecificaBaja) {
        this.pespecificaBaja = pespecificaBaja;
    }

    public int getBienBaja() {
        return bienBaja;
    }

    public void setBienBaja(int bienBaja) {
        this.bienBaja = bienBaja;
    }

    public String getClaveBienBaja() {
        return claveBienBaja;
    }

    public void setClaveBienBaja(String claveBienBaja) {
        this.claveBienBaja = claveBienBaja;
    }

    public int getRlcfBaja() {
        return rlcfBaja;
    }

    public void setRlcfBaja(int rlcfBaja) {
        this.rlcfBaja = rlcfBaja;
    }

    public int getDetalleEpAltaId() {
        return detalleEpAltaId;
    }

    public void setDetalleEpAltaId(int detalleEpAltaId) {
        this.detalleEpAltaId = detalleEpAltaId;
    }

    public int getEstructuraAlta() {
        return estructuraAlta;
    }

    public void setEstructuraAlta(int estructuraAlta) {
        this.estructuraAlta = estructuraAlta;
    }

    public int getEjeAlta() {
        return ejeAlta;
    }

    public void setEjeAlta(int ejeAlta) {
        this.ejeAlta = ejeAlta;
    }

    public int getProgramaAlta() {
        return programaAlta;
    }

    public void setProgramaAlta(int programaAlta) {
        this.programaAlta = programaAlta;
    }

    public int getSubprogramaAlta() {
        return subprogramaAlta;
    }

    public void setSubprogramaAlta(int subprogramaAlta) {
        this.subprogramaAlta = subprogramaAlta;
    }

    public String getClaveSubprogramaAlta() {
        return claveSubprogramaAlta;
    }

    public void setClaveSubprogramaAlta(String claveSubprogramaAlta) {
        this.claveSubprogramaAlta = claveSubprogramaAlta;
    }

    public String getFuncionAlta() {
        return funcionAlta;
    }

    public void setFuncionAlta(String funcionAlta) {
        this.funcionAlta = funcionAlta;
    }

    public int getCapituloAlta() {
        return capituloAlta;
    }

    public void setCapituloAlta(int capituloAlta) {
        this.capituloAlta = capituloAlta;
    }

    public int getConceptoAlta() {
        return conceptoAlta;
    }

    public void setConceptoAlta(int conceptoAlta) {
        this.conceptoAlta = conceptoAlta;
    }

    public Integer getPgenericaAlta() {
        return pgenericaAlta;
    }

    public void setPgenericaAlta(Integer pgenericaAlta) {
        this.pgenericaAlta = pgenericaAlta;
    }

    public Integer getPespecificaAlta() {
        return pespecificaAlta;
    }

    public void setPespecificaAlta(Integer pespecificaAlta) {
        this.pespecificaAlta = pespecificaAlta;
    }

    public int getBienAlta() {
        return bienAlta;
    }

    public void setBienAlta(int bienAlta) {
        this.bienAlta = bienAlta;
    }

    public String getClaveBienAlta() {
        return claveBienAlta;
    }

    public void setClaveBienAlta(String claveBienAlta) {
        this.claveBienAlta = claveBienAlta;
    }

    public int getRlcfAlta() {
        return rlcfAlta;
    }

    public void setRlcfAlta(int rlcfAlta) {
        this.rlcfAlta = rlcfAlta;
    }
    
}