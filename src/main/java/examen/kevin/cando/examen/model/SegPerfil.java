package examen.kevin.cando.examen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_PERFIL")
public class SegPerfil {
    @Id
    @Column(name="COD_PERFIL", nullable = false, length = 8)
    private String codigo;

    @Column(name="NOMBRE", nullable = false)
    private Integer nombre;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public SegPerfil() {
    }

    public SegPerfil(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
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
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        SegPerfil other = (SegPerfil) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegPerfil [codigo=" + codigo + ", nombre=" + nombre + ", version=" + version + "]";
    }

    
}
