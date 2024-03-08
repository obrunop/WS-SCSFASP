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
import java.util.Date;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "usuarios_view")
@NamedQueries({
    @NamedQuery(name = "UsuariosView.findAll", query = "SELECT u FROM UsuariosView u"),
    @NamedQuery(name = "UsuariosView.findByUsuarioId", query = "SELECT u FROM UsuariosView u WHERE u.usuarioId = :usuarioId"),
    @NamedQuery(name = "UsuariosView.findByNombreResponsable", query = "SELECT u FROM UsuariosView u WHERE u.nombreResponsable = :nombreResponsable"),
    @NamedQuery(name = "UsuariosView.findByUsuario", query = "SELECT u FROM UsuariosView u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "UsuariosView.findByActivo", query = "SELECT u FROM UsuariosView u WHERE u.activo = :activo"),
    @NamedQuery(name = "UsuariosView.findByUltimaConexion", query = "SELECT u FROM UsuariosView u WHERE u.ultimaConexion = :ultimaConexion"),
    @NamedQuery(name = "UsuariosView.findByNombreRol", query = "SELECT u FROM UsuariosView u WHERE u.nombreRol = :nombreRol"),
    @NamedQuery(name = "UsuariosView.findByNombreOficina", query = "SELECT u FROM UsuariosView u WHERE u.nombreOficina = :nombreOficina"),
    @NamedQuery(name = "UsuariosView.findByAbreviatura", query = "SELECT u FROM UsuariosView u WHERE u.abreviatura = :abreviatura"),
    @NamedQuery(name = "UsuariosView.findByFkNumeroTelefono", query = "SELECT u FROM UsuariosView u WHERE u.fkNumeroTelefono = :fkNumeroTelefono"),
    @NamedQuery(name = "UsuariosView.findByFkExtensionTelefono", query = "SELECT u FROM UsuariosView u WHERE u.fkExtensionTelefono = :fkExtensionTelefono")})
public class UsuariosView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "usuario_id")
    private int usuarioId;
    @Basic(optional = false)
    @Column(name = "nombre_responsable")
    private String nombreResponsable;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "activo")
    private short activo;
    @Column(name = "ultima_conexion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaConexion;
    @Basic(optional = false)
    @Column(name = "nombre_rol")
    private String nombreRol;
    @Basic(optional = false)
    @Column(name = "nombre_oficina")
    private String nombreOficina;
    @Basic(optional = false)
    @Column(name = "abreviatura")
    private String abreviatura;
    @Column(name = "fk_numero_telefono")
    private String fkNumeroTelefono;
    @Column(name = "fk_extension_telefono")
    private String fkExtensionTelefono;

    public UsuariosView() {
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
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

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getFkNumeroTelefono() {
        return fkNumeroTelefono;
    }

    public void setFkNumeroTelefono(String fkNumeroTelefono) {
        this.fkNumeroTelefono = fkNumeroTelefono;
    }

    public String getFkExtensionTelefono() {
        return fkExtensionTelefono;
    }

    public void setFkExtensionTelefono(String fkExtensionTelefono) {
        this.fkExtensionTelefono = fkExtensionTelefono;
    }
    
}
