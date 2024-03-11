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
@Table(name = "estructura_programatica_view")
@NamedQueries({
    @NamedQuery(name = "EstructuraProgramaticaView.findAll", query = "SELECT e FROM EstructuraProgramaticaView e"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdEp", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idEp = :idEp"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdDetalleEp", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idDetalleEp = :idDetalleEp"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFecha", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdEnte", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idEnte = :idEnte"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByAbrev", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.abrev = :abrev"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdEje", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idEje = :idEje"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByClaveEje", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.claveEje = :claveEje"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByEje", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.eje = :eje"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdPrograma", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idPrograma = :idPrograma"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByClavePrograma", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.clavePrograma = :clavePrograma"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPrograma", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.programa = :programa"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdSubprograma", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idSubprograma = :idSubprograma"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByClaveSubprograma", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.claveSubprograma = :claveSubprograma"),
    @NamedQuery(name = "EstructuraProgramaticaView.findBySubprograma", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.subprograma = :subprograma"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFuncion", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.funcion = :funcion"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdCapitulo", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idCapitulo = :idCapitulo"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByClaveCapitulo", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.claveCapitulo = :claveCapitulo"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByNombreCapitulo", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.nombreCapitulo = :nombreCapitulo"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdConcepto", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idConcepto = :idConcepto"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByClaveConcepto", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.claveConcepto = :claveConcepto"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByConcepto", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.concepto = :concepto"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdPartidaGenerica", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idPartidaGenerica = :idPartidaGenerica"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByClavePgenerica", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.clavePgenerica = :clavePgenerica"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPartidaGenerica", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.partidaGenerica = :partidaGenerica"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdPartidaEspecifica", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idPartidaEspecifica = :idPartidaEspecifica"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByClavePespecifica", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.clavePespecifica = :clavePespecifica"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPartidaEspecifica", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.partidaEspecifica = :partidaEspecifica"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdBien", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idBien = :idBien"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByClaveBien", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.claveBien = :claveBien"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByBien", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.bien = :bien"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByUm", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.um = :um"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idConvenido = :idConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTipoConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.tipoConvenido = :tipoConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspFConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspFConvenido = :faspFConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspMConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspMConvenido = :faspMConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspSConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspSConvenido = :faspSConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApEConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apEConvenido = :apEConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApMConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apMConvenido = :apMConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApSConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apSConvenido = :apSConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTotalConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.totalConvenido = :totalConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByCantConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.cantConvenido = :cantConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPersConvenido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.persConvenido = :persConvenido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idBaja = :idBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTipoBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.tipoBaja = :tipoBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspFBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspFBaja = :faspFBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspMBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspMBaja = :faspMBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspSBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspSBaja = :faspSBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApEBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apEBaja = :apEBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApMBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apMBaja = :apMBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApSBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apSBaja = :apSBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTotalBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.totalBaja = :totalBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByCantBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.cantBaja = :cantBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPersBaja", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.persBaja = :persBaja"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idAlta = :idAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTipoAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.tipoAlta = :tipoAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspFAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspFAlta = :faspFAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspMAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspMAlta = :faspMAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspSAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspSAlta = :faspSAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApEAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apEAlta = :apEAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApMAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apMAlta = :apMAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApSAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apSAlta = :apSAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTotalAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.totalAlta = :totalAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByCantAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.cantAlta = :cantAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPersAlta", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.persAlta = :persAlta"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idModificado = :idModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspFModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspFModificado = :faspFModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspMModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspMModificado = :faspMModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspSModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspSModificado = :faspSModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApEModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apEModificado = :apEModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApMModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apMModificado = :apMModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApSModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apSModificado = :apSModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTotalModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.totalModificado = :totalModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTipoModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.tipoModificado = :tipoModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByCantModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.cantModificado = :cantModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPersModificado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.persModificado = :persModificado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idComprometido = :idComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspFComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspFComprometido = :faspFComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspMComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspMComprometido = :faspMComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspSComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspSComprometido = :faspSComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApEComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apEComprometido = :apEComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApMComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apMComprometido = :apMComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApSComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apSComprometido = :apSComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTotalComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.totalComprometido = :totalComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTipoComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.tipoComprometido = :tipoComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByCantComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.cantComprometido = :cantComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPersComprometido", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.persComprometido = :persComprometido"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idDevengado = :idDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspFDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspFDevengado = :faspFDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspMDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspMDevengado = :faspMDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspSDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspSDevengado = :faspSDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApEDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apEDevengado = :apEDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApMDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apMDevengado = :apMDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApSDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apSDevengado = :apSDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTotalDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.totalDevengado = :totalDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTipoDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.tipoDevengado = :tipoDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByCantDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.cantDevengado = :cantDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPersDevengado", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.persDevengado = :persDevengado"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByIdDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.idDisponible = :idDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspFDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspFDisponible = :faspFDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspMDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspMDisponible = :faspMDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByFaspSDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.faspSDisponible = :faspSDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApEDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apEDisponible = :apEDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApMDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apMDisponible = :apMDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByApSDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.apSDisponible = :apSDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTotalDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.totalDisponible = :totalDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByTipoDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.tipoDisponible = :tipoDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByCantDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.cantDisponible = :cantDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByPersDisponible", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.persDisponible = :persDisponible"),
    @NamedQuery(name = "EstructuraProgramaticaView.findByRlcf", query = "SELECT e FROM EstructuraProgramaticaView e WHERE e.rlcf = :rlcf")})
public class EstructuraProgramaticaView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EP")
    private int idEp;
    @Basic(optional = false)
    @Column(name = "ID_DETALLE_EP")
    private int idDetalleEp;
    @Column(name = "fecha")
    private Short fecha;
    @Basic(optional = false)
    @Column(name = "ID_ENTE")
    private String idEnte;
    @Basic(optional = false)
    @Column(name = "ABREV")
    private String abrev;
    @Basic(optional = false)
    @Column(name = "ID_EJE")
    private int idEje;
    @Basic(optional = false)
    @Column(name = "clave_eje")
    private String claveEje;
    @Basic(optional = false)
    @Column(name = "EJE")
    private String eje;
    @Basic(optional = false)
    @Column(name = "ID_PROGRAMA")
    private int idPrograma;
    @Basic(optional = false)
    @Column(name = "clave_programa")
    private String clavePrograma;
    @Basic(optional = false)
    @Column(name = "PROGRAMA")
    private String programa;
    @Basic(optional = false)
    @Column(name = "ID_SUBPROGRAMA")
    private int idSubprograma;
    @Basic(optional = false)
    @Column(name = "clave_subprograma")
    private String claveSubprograma;
    @Basic(optional = false)
    @Column(name = "SUBPROGRAMA")
    private String subprograma;
    @Column(name = "FUNCION")
    private String funcion;
    @Basic(optional = false)
    @Column(name = "ID_CAPITULO")
    private int idCapitulo;
    @Column(name = "clave_capitulo")
    private String claveCapitulo;
    @Basic(optional = false)
    @Column(name = "nombre_capitulo")
    private String nombreCapitulo;
    @Basic(optional = false)
    @Column(name = "ID_CONCEPTO")
    private int idConcepto;
    @Column(name = "clave_concepto")
    private String claveConcepto;
    @Basic(optional = false)
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "ID_PARTIDA_GENERICA")
    private Integer idPartidaGenerica;
    @Column(name = "clave_pgenerica")
    private String clavePgenerica;
    @Basic(optional = false)
    @Column(name = "PARTIDA_GENERICA")
    private String partidaGenerica;
    @Column(name = "ID_PARTIDA_ESPECIFICA")
    private Integer idPartidaEspecifica;
    @Column(name = "clave_pespecifica")
    private String clavePespecifica;
    @Basic(optional = false)
    @Column(name = "PARTIDA_ESPECIFICA")
    private String partidaEspecifica;
    @Basic(optional = false)
    @Column(name = "ID_BIEN")
    private int idBien;
    @Column(name = "CLAVE_BIEN")
    private String claveBien;
    @Column(name = "BIEN")
    private String bien;
    @Column(name = "UM")
    private String um;
    @Basic(optional = false)
    @Column(name = "ID_CONVENIDO")
    private int idConvenido;
    @Basic(optional = false)
    @Column(name = "TIPO_CONVENIDO")
    private int tipoConvenido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FASP_F_CONVENIDO")
    private BigDecimal faspFConvenido;
    @Basic(optional = false)
    @Column(name = "FASP_M_CONVENIDO")
    private BigDecimal faspMConvenido;
    @Column(name = "FASP_S_CONVENIDO")
    private BigDecimal faspSConvenido;
    @Basic(optional = false)
    @Column(name = "AP_E_CONVENIDO")
    private BigDecimal apEConvenido;
    @Basic(optional = false)
    @Column(name = "AP_M_CONVENIDO")
    private BigDecimal apMConvenido;
    @Column(name = "AP_S_CONVENIDO")
    private BigDecimal apSConvenido;
    @Column(name = "TOTAL__CONVENIDO")
    private BigDecimal totalConvenido;
    @Column(name = "CANT_CONVENIDO")
    private Integer cantConvenido;
    @Column(name = "PERS_CONVENIDO")
    private Integer persConvenido;
    @Basic(optional = false)
    @Column(name = "ID_BAJA")
    private int idBaja;
    @Basic(optional = false)
    @Column(name = "TIPO_BAJA")
    private int tipoBaja;
    @Basic(optional = false)
    @Column(name = "FASP_F_BAJA")
    private BigDecimal faspFBaja;
    @Basic(optional = false)
    @Column(name = "FASP_M_BAJA")
    private BigDecimal faspMBaja;
    @Column(name = "FASP_S_BAJA")
    private BigDecimal faspSBaja;
    @Basic(optional = false)
    @Column(name = "AP_E_BAJA")
    private BigDecimal apEBaja;
    @Basic(optional = false)
    @Column(name = "AP_M_BAJA")
    private BigDecimal apMBaja;
    @Column(name = "AP_S_BAJA")
    private BigDecimal apSBaja;
    @Column(name = "TOTAL_BAJA")
    private BigDecimal totalBaja;
    @Column(name = "CANT_BAJA")
    private Integer cantBaja;
    @Column(name = "PERS_BAJA")
    private Integer persBaja;
    @Basic(optional = false)
    @Column(name = "ID_ALTA")
    private int idAlta;
    @Basic(optional = false)
    @Column(name = "TIPO_ALTA")
    private int tipoAlta;
    @Basic(optional = false)
    @Column(name = "FASP_F_ALTA")
    private BigDecimal faspFAlta;
    @Basic(optional = false)
    @Column(name = "FASP_M_ALTA")
    private BigDecimal faspMAlta;
    @Column(name = "FASP_S_ALTA")
    private BigDecimal faspSAlta;
    @Basic(optional = false)
    @Column(name = "AP_E_ALTA")
    private BigDecimal apEAlta;
    @Basic(optional = false)
    @Column(name = "AP_M_ALTA")
    private BigDecimal apMAlta;
    @Column(name = "AP_S__ALTA")
    private BigDecimal apSAlta;
    @Column(name = "TOTAL_ALTA")
    private BigDecimal totalAlta;
    @Column(name = "CANT_ALTA")
    private Integer cantAlta;
    @Column(name = "PERS_ALTA")
    private Integer persAlta;
    @Basic(optional = false)
    @Column(name = "ID_MODIFICADO")
    private int idModificado;
    @Basic(optional = false)
    @Column(name = "FASP_F_MODIFICADO")
    private BigDecimal faspFModificado;
    @Basic(optional = false)
    @Column(name = "FASP_M_MODIFICADO")
    private BigDecimal faspMModificado;
    @Column(name = "FASP_S_MODIFICADO")
    private BigDecimal faspSModificado;
    @Basic(optional = false)
    @Column(name = "AP_E_MODIFICADO")
    private BigDecimal apEModificado;
    @Basic(optional = false)
    @Column(name = "AP_M_MODIFICADO")
    private BigDecimal apMModificado;
    @Column(name = "AP_S_MODIFICADO")
    private BigDecimal apSModificado;
    @Column(name = "TOTAL_MODIFICADO")
    private BigDecimal totalModificado;
    @Basic(optional = false)
    @Column(name = "TIPO_MODIFICADO")
    private int tipoModificado;
    @Column(name = "CANT_MODIFICADO")
    private Integer cantModificado;
    @Column(name = "PERS_MODIFICADO")
    private Integer persModificado;
    @Basic(optional = false)
    @Column(name = "ID__COMPROMETIDO")
    private int idComprometido;
    @Basic(optional = false)
    @Column(name = "FASP_F_COMPROMETIDO")
    private BigDecimal faspFComprometido;
    @Basic(optional = false)
    @Column(name = "FASP_M_COMPROMETIDO")
    private BigDecimal faspMComprometido;
    @Column(name = "FASP_S_COMPROMETIDO")
    private BigDecimal faspSComprometido;
    @Basic(optional = false)
    @Column(name = "AP_E_COMPROMETIDO")
    private BigDecimal apEComprometido;
    @Basic(optional = false)
    @Column(name = "AP_M__COMPROMETIDO")
    private BigDecimal apMComprometido;
    @Column(name = "AP_S_COMPROMETIDO")
    private BigDecimal apSComprometido;
    @Column(name = "TOTAL_COMPROMETIDO")
    private BigDecimal totalComprometido;
    @Basic(optional = false)
    @Column(name = "TIPO_COMPROMETIDO")
    private int tipoComprometido;
    @Column(name = "CANT_COMPROMETIDO")
    private Integer cantComprometido;
    @Column(name = "PERS_COMPROMETIDO")
    private Integer persComprometido;
    @Basic(optional = false)
    @Column(name = "ID_DEVENGADO")
    private int idDevengado;
    @Basic(optional = false)
    @Column(name = "FASP_F_DEVENGADO")
    private BigDecimal faspFDevengado;
    @Basic(optional = false)
    @Column(name = "FASP_M_DEVENGADO")
    private BigDecimal faspMDevengado;
    @Column(name = "FASP_S_DEVENGADO")
    private BigDecimal faspSDevengado;
    @Basic(optional = false)
    @Column(name = "AP_E_DEVENGADO")
    private BigDecimal apEDevengado;
    @Basic(optional = false)
    @Column(name = "AP_M_DEVENGADO")
    private BigDecimal apMDevengado;
    @Column(name = "AP_S_DEVENGADO")
    private BigDecimal apSDevengado;
    @Column(name = "TOTAL_DEVENGADO")
    private BigDecimal totalDevengado;
    @Basic(optional = false)
    @Column(name = "TIPO_DEVENGADO")
    private int tipoDevengado;
    @Column(name = "CANT_DEVENGADO")
    private Integer cantDevengado;
    @Column(name = "PERS_DEVENGADO")
    private Integer persDevengado;
    @Basic(optional = false)
    @Column(name = "ID__DISPONIBLE")
    private int idDisponible;
    @Basic(optional = false)
    @Column(name = "FASP_F_DISPONIBLE")
    private BigDecimal faspFDisponible;
    @Basic(optional = false)
    @Column(name = "FASP_M_DISPONIBLE")
    private BigDecimal faspMDisponible;
    @Column(name = "FASP_S_DISPONIBLE")
    private BigDecimal faspSDisponible;
    @Basic(optional = false)
    @Column(name = "AP_E_DISPONIBLE")
    private BigDecimal apEDisponible;
    @Basic(optional = false)
    @Column(name = "AP_M_DISPONIBLE")
    private BigDecimal apMDisponible;
    @Column(name = "AP_S_DISPONIBLE")
    private BigDecimal apSDisponible;
    @Column(name = "TOTAL_DISPONIBLE")
    private BigDecimal totalDisponible;
    @Basic(optional = false)
    @Column(name = "TIPO_DISPONIBLE")
    private int tipoDisponible;
    @Column(name = "CANT_DISPONIBLE")
    private Integer cantDisponible;
    @Column(name = "PERS_DISPONIBLE")
    private Integer persDisponible;
    @Column(name = "RLCF")
    private String rlcf;

    public EstructuraProgramaticaView() {
    }

    public int getIdEp() {
        return idEp;
    }

    public void setIdEp(int idEp) {
        this.idEp = idEp;
    }

    public int getIdDetalleEp() {
        return idDetalleEp;
    }

    public void setIdDetalleEp(int idDetalleEp) {
        this.idDetalleEp = idDetalleEp;
    }

    public Short getFecha() {
        return fecha;
    }

    public void setFecha(Short fecha) {
        this.fecha = fecha;
    }

    public String getIdEnte() {
        return idEnte;
    }

    public void setIdEnte(String idEnte) {
        this.idEnte = idEnte;
    }

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public int getIdEje() {
        return idEje;
    }

    public void setIdEje(int idEje) {
        this.idEje = idEje;
    }

    public String getClaveEje() {
        return claveEje;
    }

    public void setClaveEje(String claveEje) {
        this.claveEje = claveEje;
    }

    public String getEje() {
        return eje;
    }

    public void setEje(String eje) {
        this.eje = eje;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getClavePrograma() {
        return clavePrograma;
    }

    public void setClavePrograma(String clavePrograma) {
        this.clavePrograma = clavePrograma;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getIdSubprograma() {
        return idSubprograma;
    }

    public void setIdSubprograma(int idSubprograma) {
        this.idSubprograma = idSubprograma;
    }

    public String getClaveSubprograma() {
        return claveSubprograma;
    }

    public void setClaveSubprograma(String claveSubprograma) {
        this.claveSubprograma = claveSubprograma;
    }

    public String getSubprograma() {
        return subprograma;
    }

    public void setSubprograma(String subprograma) {
        this.subprograma = subprograma;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public int getIdCapitulo() {
        return idCapitulo;
    }

    public void setIdCapitulo(int idCapitulo) {
        this.idCapitulo = idCapitulo;
    }

    public String getClaveCapitulo() {
        return claveCapitulo;
    }

    public void setClaveCapitulo(String claveCapitulo) {
        this.claveCapitulo = claveCapitulo;
    }

    public String getNombreCapitulo() {
        return nombreCapitulo;
    }

    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }

    public int getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getClaveConcepto() {
        return claveConcepto;
    }

    public void setClaveConcepto(String claveConcepto) {
        this.claveConcepto = claveConcepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getIdPartidaGenerica() {
        return idPartidaGenerica;
    }

    public void setIdPartidaGenerica(Integer idPartidaGenerica) {
        this.idPartidaGenerica = idPartidaGenerica;
    }

    public String getClavePgenerica() {
        return clavePgenerica;
    }

    public void setClavePgenerica(String clavePgenerica) {
        this.clavePgenerica = clavePgenerica;
    }

    public String getPartidaGenerica() {
        return partidaGenerica;
    }

    public void setPartidaGenerica(String partidaGenerica) {
        this.partidaGenerica = partidaGenerica;
    }

    public Integer getIdPartidaEspecifica() {
        return idPartidaEspecifica;
    }

    public void setIdPartidaEspecifica(Integer idPartidaEspecifica) {
        this.idPartidaEspecifica = idPartidaEspecifica;
    }

    public String getClavePespecifica() {
        return clavePespecifica;
    }

    public void setClavePespecifica(String clavePespecifica) {
        this.clavePespecifica = clavePespecifica;
    }

    public String getPartidaEspecifica() {
        return partidaEspecifica;
    }

    public void setPartidaEspecifica(String partidaEspecifica) {
        this.partidaEspecifica = partidaEspecifica;
    }

    public int getIdBien() {
        return idBien;
    }

    public void setIdBien(int idBien) {
        this.idBien = idBien;
    }

    public String getClaveBien() {
        return claveBien;
    }

    public void setClaveBien(String claveBien) {
        this.claveBien = claveBien;
    }

    public String getBien() {
        return bien;
    }

    public void setBien(String bien) {
        this.bien = bien;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public int getIdConvenido() {
        return idConvenido;
    }

    public void setIdConvenido(int idConvenido) {
        this.idConvenido = idConvenido;
    }

    public int getTipoConvenido() {
        return tipoConvenido;
    }

    public void setTipoConvenido(int tipoConvenido) {
        this.tipoConvenido = tipoConvenido;
    }

    public BigDecimal getFaspFConvenido() {
        return faspFConvenido;
    }

    public void setFaspFConvenido(BigDecimal faspFConvenido) {
        this.faspFConvenido = faspFConvenido;
    }

    public BigDecimal getFaspMConvenido() {
        return faspMConvenido;
    }

    public void setFaspMConvenido(BigDecimal faspMConvenido) {
        this.faspMConvenido = faspMConvenido;
    }

    public BigDecimal getFaspSConvenido() {
        return faspSConvenido;
    }

    public void setFaspSConvenido(BigDecimal faspSConvenido) {
        this.faspSConvenido = faspSConvenido;
    }

    public BigDecimal getApEConvenido() {
        return apEConvenido;
    }

    public void setApEConvenido(BigDecimal apEConvenido) {
        this.apEConvenido = apEConvenido;
    }

    public BigDecimal getApMConvenido() {
        return apMConvenido;
    }

    public void setApMConvenido(BigDecimal apMConvenido) {
        this.apMConvenido = apMConvenido;
    }

    public BigDecimal getApSConvenido() {
        return apSConvenido;
    }

    public void setApSConvenido(BigDecimal apSConvenido) {
        this.apSConvenido = apSConvenido;
    }

    public BigDecimal getTotalConvenido() {
        return totalConvenido;
    }

    public void setTotalConvenido(BigDecimal totalConvenido) {
        this.totalConvenido = totalConvenido;
    }

    public Integer getCantConvenido() {
        return cantConvenido;
    }

    public void setCantConvenido(Integer cantConvenido) {
        this.cantConvenido = cantConvenido;
    }

    public Integer getPersConvenido() {
        return persConvenido;
    }

    public void setPersConvenido(Integer persConvenido) {
        this.persConvenido = persConvenido;
    }

    public int getIdBaja() {
        return idBaja;
    }

    public void setIdBaja(int idBaja) {
        this.idBaja = idBaja;
    }

    public int getTipoBaja() {
        return tipoBaja;
    }

    public void setTipoBaja(int tipoBaja) {
        this.tipoBaja = tipoBaja;
    }

    public BigDecimal getFaspFBaja() {
        return faspFBaja;
    }

    public void setFaspFBaja(BigDecimal faspFBaja) {
        this.faspFBaja = faspFBaja;
    }

    public BigDecimal getFaspMBaja() {
        return faspMBaja;
    }

    public void setFaspMBaja(BigDecimal faspMBaja) {
        this.faspMBaja = faspMBaja;
    }

    public BigDecimal getFaspSBaja() {
        return faspSBaja;
    }

    public void setFaspSBaja(BigDecimal faspSBaja) {
        this.faspSBaja = faspSBaja;
    }

    public BigDecimal getApEBaja() {
        return apEBaja;
    }

    public void setApEBaja(BigDecimal apEBaja) {
        this.apEBaja = apEBaja;
    }

    public BigDecimal getApMBaja() {
        return apMBaja;
    }

    public void setApMBaja(BigDecimal apMBaja) {
        this.apMBaja = apMBaja;
    }

    public BigDecimal getApSBaja() {
        return apSBaja;
    }

    public void setApSBaja(BigDecimal apSBaja) {
        this.apSBaja = apSBaja;
    }

    public BigDecimal getTotalBaja() {
        return totalBaja;
    }

    public void setTotalBaja(BigDecimal totalBaja) {
        this.totalBaja = totalBaja;
    }

    public Integer getCantBaja() {
        return cantBaja;
    }

    public void setCantBaja(Integer cantBaja) {
        this.cantBaja = cantBaja;
    }

    public Integer getPersBaja() {
        return persBaja;
    }

    public void setPersBaja(Integer persBaja) {
        this.persBaja = persBaja;
    }

    public int getIdAlta() {
        return idAlta;
    }

    public void setIdAlta(int idAlta) {
        this.idAlta = idAlta;
    }

    public int getTipoAlta() {
        return tipoAlta;
    }

    public void setTipoAlta(int tipoAlta) {
        this.tipoAlta = tipoAlta;
    }

    public BigDecimal getFaspFAlta() {
        return faspFAlta;
    }

    public void setFaspFAlta(BigDecimal faspFAlta) {
        this.faspFAlta = faspFAlta;
    }

    public BigDecimal getFaspMAlta() {
        return faspMAlta;
    }

    public void setFaspMAlta(BigDecimal faspMAlta) {
        this.faspMAlta = faspMAlta;
    }

    public BigDecimal getFaspSAlta() {
        return faspSAlta;
    }

    public void setFaspSAlta(BigDecimal faspSAlta) {
        this.faspSAlta = faspSAlta;
    }

    public BigDecimal getApEAlta() {
        return apEAlta;
    }

    public void setApEAlta(BigDecimal apEAlta) {
        this.apEAlta = apEAlta;
    }

    public BigDecimal getApMAlta() {
        return apMAlta;
    }

    public void setApMAlta(BigDecimal apMAlta) {
        this.apMAlta = apMAlta;
    }

    public BigDecimal getApSAlta() {
        return apSAlta;
    }

    public void setApSAlta(BigDecimal apSAlta) {
        this.apSAlta = apSAlta;
    }

    public BigDecimal getTotalAlta() {
        return totalAlta;
    }

    public void setTotalAlta(BigDecimal totalAlta) {
        this.totalAlta = totalAlta;
    }

    public Integer getCantAlta() {
        return cantAlta;
    }

    public void setCantAlta(Integer cantAlta) {
        this.cantAlta = cantAlta;
    }

    public Integer getPersAlta() {
        return persAlta;
    }

    public void setPersAlta(Integer persAlta) {
        this.persAlta = persAlta;
    }

    public int getIdModificado() {
        return idModificado;
    }

    public void setIdModificado(int idModificado) {
        this.idModificado = idModificado;
    }

    public BigDecimal getFaspFModificado() {
        return faspFModificado;
    }

    public void setFaspFModificado(BigDecimal faspFModificado) {
        this.faspFModificado = faspFModificado;
    }

    public BigDecimal getFaspMModificado() {
        return faspMModificado;
    }

    public void setFaspMModificado(BigDecimal faspMModificado) {
        this.faspMModificado = faspMModificado;
    }

    public BigDecimal getFaspSModificado() {
        return faspSModificado;
    }

    public void setFaspSModificado(BigDecimal faspSModificado) {
        this.faspSModificado = faspSModificado;
    }

    public BigDecimal getApEModificado() {
        return apEModificado;
    }

    public void setApEModificado(BigDecimal apEModificado) {
        this.apEModificado = apEModificado;
    }

    public BigDecimal getApMModificado() {
        return apMModificado;
    }

    public void setApMModificado(BigDecimal apMModificado) {
        this.apMModificado = apMModificado;
    }

    public BigDecimal getApSModificado() {
        return apSModificado;
    }

    public void setApSModificado(BigDecimal apSModificado) {
        this.apSModificado = apSModificado;
    }

    public BigDecimal getTotalModificado() {
        return totalModificado;
    }

    public void setTotalModificado(BigDecimal totalModificado) {
        this.totalModificado = totalModificado;
    }

    public int getTipoModificado() {
        return tipoModificado;
    }

    public void setTipoModificado(int tipoModificado) {
        this.tipoModificado = tipoModificado;
    }

    public Integer getCantModificado() {
        return cantModificado;
    }

    public void setCantModificado(Integer cantModificado) {
        this.cantModificado = cantModificado;
    }

    public Integer getPersModificado() {
        return persModificado;
    }

    public void setPersModificado(Integer persModificado) {
        this.persModificado = persModificado;
    }

    public int getIdComprometido() {
        return idComprometido;
    }

    public void setIdComprometido(int idComprometido) {
        this.idComprometido = idComprometido;
    }

    public BigDecimal getFaspFComprometido() {
        return faspFComprometido;
    }

    public void setFaspFComprometido(BigDecimal faspFComprometido) {
        this.faspFComprometido = faspFComprometido;
    }

    public BigDecimal getFaspMComprometido() {
        return faspMComprometido;
    }

    public void setFaspMComprometido(BigDecimal faspMComprometido) {
        this.faspMComprometido = faspMComprometido;
    }

    public BigDecimal getFaspSComprometido() {
        return faspSComprometido;
    }

    public void setFaspSComprometido(BigDecimal faspSComprometido) {
        this.faspSComprometido = faspSComprometido;
    }

    public BigDecimal getApEComprometido() {
        return apEComprometido;
    }

    public void setApEComprometido(BigDecimal apEComprometido) {
        this.apEComprometido = apEComprometido;
    }

    public BigDecimal getApMComprometido() {
        return apMComprometido;
    }

    public void setApMComprometido(BigDecimal apMComprometido) {
        this.apMComprometido = apMComprometido;
    }

    public BigDecimal getApSComprometido() {
        return apSComprometido;
    }

    public void setApSComprometido(BigDecimal apSComprometido) {
        this.apSComprometido = apSComprometido;
    }

    public BigDecimal getTotalComprometido() {
        return totalComprometido;
    }

    public void setTotalComprometido(BigDecimal totalComprometido) {
        this.totalComprometido = totalComprometido;
    }

    public int getTipoComprometido() {
        return tipoComprometido;
    }

    public void setTipoComprometido(int tipoComprometido) {
        this.tipoComprometido = tipoComprometido;
    }

    public Integer getCantComprometido() {
        return cantComprometido;
    }

    public void setCantComprometido(Integer cantComprometido) {
        this.cantComprometido = cantComprometido;
    }

    public Integer getPersComprometido() {
        return persComprometido;
    }

    public void setPersComprometido(Integer persComprometido) {
        this.persComprometido = persComprometido;
    }

    public int getIdDevengado() {
        return idDevengado;
    }

    public void setIdDevengado(int idDevengado) {
        this.idDevengado = idDevengado;
    }

    public BigDecimal getFaspFDevengado() {
        return faspFDevengado;
    }

    public void setFaspFDevengado(BigDecimal faspFDevengado) {
        this.faspFDevengado = faspFDevengado;
    }

    public BigDecimal getFaspMDevengado() {
        return faspMDevengado;
    }

    public void setFaspMDevengado(BigDecimal faspMDevengado) {
        this.faspMDevengado = faspMDevengado;
    }

    public BigDecimal getFaspSDevengado() {
        return faspSDevengado;
    }

    public void setFaspSDevengado(BigDecimal faspSDevengado) {
        this.faspSDevengado = faspSDevengado;
    }

    public BigDecimal getApEDevengado() {
        return apEDevengado;
    }

    public void setApEDevengado(BigDecimal apEDevengado) {
        this.apEDevengado = apEDevengado;
    }

    public BigDecimal getApMDevengado() {
        return apMDevengado;
    }

    public void setApMDevengado(BigDecimal apMDevengado) {
        this.apMDevengado = apMDevengado;
    }

    public BigDecimal getApSDevengado() {
        return apSDevengado;
    }

    public void setApSDevengado(BigDecimal apSDevengado) {
        this.apSDevengado = apSDevengado;
    }

    public BigDecimal getTotalDevengado() {
        return totalDevengado;
    }

    public void setTotalDevengado(BigDecimal totalDevengado) {
        this.totalDevengado = totalDevengado;
    }

    public int getTipoDevengado() {
        return tipoDevengado;
    }

    public void setTipoDevengado(int tipoDevengado) {
        this.tipoDevengado = tipoDevengado;
    }

    public Integer getCantDevengado() {
        return cantDevengado;
    }

    public void setCantDevengado(Integer cantDevengado) {
        this.cantDevengado = cantDevengado;
    }

    public Integer getPersDevengado() {
        return persDevengado;
    }

    public void setPersDevengado(Integer persDevengado) {
        this.persDevengado = persDevengado;
    }

    public int getIdDisponible() {
        return idDisponible;
    }

    public void setIdDisponible(int idDisponible) {
        this.idDisponible = idDisponible;
    }

    public BigDecimal getFaspFDisponible() {
        return faspFDisponible;
    }

    public void setFaspFDisponible(BigDecimal faspFDisponible) {
        this.faspFDisponible = faspFDisponible;
    }

    public BigDecimal getFaspMDisponible() {
        return faspMDisponible;
    }

    public void setFaspMDisponible(BigDecimal faspMDisponible) {
        this.faspMDisponible = faspMDisponible;
    }

    public BigDecimal getFaspSDisponible() {
        return faspSDisponible;
    }

    public void setFaspSDisponible(BigDecimal faspSDisponible) {
        this.faspSDisponible = faspSDisponible;
    }

    public BigDecimal getApEDisponible() {
        return apEDisponible;
    }

    public void setApEDisponible(BigDecimal apEDisponible) {
        this.apEDisponible = apEDisponible;
    }

    public BigDecimal getApMDisponible() {
        return apMDisponible;
    }

    public void setApMDisponible(BigDecimal apMDisponible) {
        this.apMDisponible = apMDisponible;
    }

    public BigDecimal getApSDisponible() {
        return apSDisponible;
    }

    public void setApSDisponible(BigDecimal apSDisponible) {
        this.apSDisponible = apSDisponible;
    }

    public BigDecimal getTotalDisponible() {
        return totalDisponible;
    }

    public void setTotalDisponible(BigDecimal totalDisponible) {
        this.totalDisponible = totalDisponible;
    }

    public int getTipoDisponible() {
        return tipoDisponible;
    }

    public void setTipoDisponible(int tipoDisponible) {
        this.tipoDisponible = tipoDisponible;
    }

    public Integer getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(Integer cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public Integer getPersDisponible() {
        return persDisponible;
    }

    public void setPersDisponible(Integer persDisponible) {
        this.persDisponible = persDisponible;
    }

    public String getRlcf() {
        return rlcf;
    }

    public void setRlcf(String rlcf) {
        this.rlcf = rlcf;
    }
    
}
