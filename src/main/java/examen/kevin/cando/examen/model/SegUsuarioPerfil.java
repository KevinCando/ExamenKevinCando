package examen.kevin.cando.examen.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_USUARIO_PERFIL")
public class SegUsuarioPerfil {
    @EmbeddedId
    private SegUsuarioPerfilPK pk;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;

    @Column(name = "ES_ACTIVO", nullable = false)
    private Boolean esActivo;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @ManyToOne
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", insertable = false, updatable = false)
    private SegUsuario segUsuario;

    @ManyToOne
    @JoinColumn(name = "COD_PERFIL", referencedColumnName = "COD_PERFIL", insertable = false, updatable = false)
    private SegPerfil segPerfil;

    public SegUsuarioPerfil() {
    }

    public SegUsuarioPerfil(SegUsuarioPerfilPK pk) {
        this.pk = pk;
    }

    public SegUsuarioPerfilPK getPk() {
        return pk;
    }

    public void setPk(SegUsuarioPerfilPK pk) {
        this.pk = pk;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getEsActivo() {
        return esActivo;
    }

    public void setEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SegUsuarioPerfil other = (SegUsuarioPerfil) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    } 

    @Override
    public String toString() {
        return "SegUsuarioPerfil [pk=" + pk + ", fechaCreacion=" + fechaCreacion + ", esActivo=" + esActivo
                + ", version=" + version + "]";
    }

    
}
