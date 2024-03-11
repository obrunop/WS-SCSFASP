package com.sspver.WSSCSFASP.model.view;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author obrunop
 */
@Entity
@Table(name = "oficinas_view")
@NamedQueries({
    @NamedQuery(name = "OficinasView.findAll", query = "SELECT o FROM OficinasView o"),
    @NamedQuery(name = "OficinasView.findByOficinaId", query = "SELECT o FROM OficinasView o WHERE o.oficinaId = :oficinaId"),
    @NamedQuery(name = "OficinasView.findByNombreOficina", query = "SELECT o FROM OficinasView o WHERE o.nombreOficina = :nombreOficina"),
    @NamedQuery(name = "OficinasView.findByNumeroTelefono", query = "SELECT o FROM OficinasView o WHERE o.numeroTelefono = :numeroTelefono"),
    @NamedQuery(name = "OficinasView.findByExtensionTelefono", query = "SELECT o FROM OficinasView o WHERE o.extensionTelefono = :extensionTelefono")})
public class OficinView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "oficina_id")
    private int oficinaId;
    @Basic(optional = false)
    @Column(name = "nombre_oficina")
    private String nombreOficina;
    @Basic(optional = false)
    @Column(name = "numero_telefono")
    private String numeroTelefono;
    @Basic(optional = false)
    @Column(name = "extension_telefono")
    private String extensionTelefono;

    public OficinView() {
    }

    public int getOficinaId() {
        return oficinaId;
    }

    public void setOficinaId(int oficinaId) {
        this.oficinaId = oficinaId;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getExtensionTelefono() {
        return extensionTelefono;
    }

    public void setExtensionTelefono(String extensionTelefono) {
        this.extensionTelefono = extensionTelefono;
    }
    
}
