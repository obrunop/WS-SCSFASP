package com.sspver.WSSCSFASP.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByUsuarioId", query = "SELECT u FROM Usuarios u WHERE u.usuarioId = :usuarioId"),
    @NamedQuery(name = "Usuarios.findByNombreResponsable", query = "SELECT u FROM Usuarios u WHERE u.nombreResponsable = :nombreResponsable"),
    @NamedQuery(name = "Usuarios.findByUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuarios.findByClaveAcceso", query = "SELECT u FROM Usuarios u WHERE u.claveAcceso = :claveAcceso"),
    @NamedQuery(name = "Usuarios.findByActivo", query = "SELECT u FROM Usuarios u WHERE u.activo = :activo"),
    @NamedQuery(name = "Usuarios.findByToken", query = "SELECT u FROM Usuarios u WHERE u.token = :token"),
    @NamedQuery(name = "Usuarios.findByUltimaConexion", query = "SELECT u FROM Usuarios u WHERE u.ultimaConexion = :ultimaConexion")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usuario_id")
    private Integer usuarioId;
    @Basic(optional = false)
    @Column(name = "nombre_responsable")
    private String nombreResponsable;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "clave_acceso")
    private String claveAcceso;
    @Basic(optional = false)
    @Column(name = "activo")
    private short activo;
    @Column(name = "token")
    private String token;
    @Column(name = "ultima_conexion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaConexion;
    @JoinColumn(name = "fk_oficina", referencedColumnName = "oficina_id")
    @ManyToOne
    private Oficina fkOficina;
    @JoinColumn(name = "fk_rol", referencedColumnName = "rol_id")
    @ManyToOne
    private Rol fkRol;
    @JoinColumns({
        @JoinColumn(name = "fk_numero_telefono", referencedColumnName = "numero_telefono"),
        @JoinColumn(name = "fk_extension_telefono", referencedColumnName = "extension_telefono")})
    @ManyToOne
    private Telefono telefono;
    @OneToMany(mappedBy = "fkUsuarioCrea")
    private Collection<SolicitudRecurso> solicitudesRecursosCollection;
    @OneToMany(mappedBy = "fkUsuarioActualiza")
    private Collection<SolicitudRecurso> solicitudesRecursosCollection1;

    public Usuario() {
    }

    public Usuario(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario(Integer usuarioId, String nombreResponsable, String usuario, String claveAcceso, short activo) {
        this.usuarioId = usuarioId;
        this.nombreResponsable = nombreResponsable;
        this.usuario = usuario;
        this.claveAcceso = claveAcceso;
        this.activo = activo;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public Oficina getFkOficina() {
        return fkOficina;
    }

    public void setFkOficina(Oficina fkOficina) {
        this.fkOficina = fkOficina;
    }

    public Rol getFkRol() {
        return fkRol;
    }

    public void setFkRol(Rol fkRol) {
        this.fkRol = fkRol;
    }

    public Telefono getTelefonos() {
        return telefono;
    }

    public void setTelefonos(Telefono telefono) {
        this.telefono = telefono;
    }

    public Collection<SolicitudRecurso> getSolicitudesRecursosCollection() {
        return solicitudesRecursosCollection;
    }

    public void setSolicitudesRecursosCollection(Collection<SolicitudRecurso> solicitudesRecursosCollection) {
        this.solicitudesRecursosCollection = solicitudesRecursosCollection;
    }

    public Collection<SolicitudRecurso> getSolicitudesRecursosCollection1() {
        return solicitudesRecursosCollection1;
    }

    public void setSolicitudesRecursosCollection1(Collection<SolicitudRecurso> solicitudesRecursosCollection1) {
        this.solicitudesRecursosCollection1 = solicitudesRecursosCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sspver.WSSCSFASP.entities.Usuarios[ usuarioId=" + usuarioId + " ]";
    }
    
}
