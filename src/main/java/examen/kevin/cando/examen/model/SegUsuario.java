package examen.kevin.cando.examen.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_USUARIO")
public class SegUsuario {
    @Id
    @Column(name="COD_USUARIO", nullable = false)
    private Integer codigo;

    @Column(name="MAIL", nullable = false, length = 128)
    private String mail;

    @Column(name="CLAVE", nullable = false, length = 64)
    private String clave;

    @Column(name="NOMBRE", nullable = false, length = 128)
    private String nombre;

    @Column(name="INTENTOS_FALLIDOS", nullable = false)
    private Integer intentosFallidos;

    @Column(name="SUELDO", nullable = false, precision = 8, scale = 2)
    private BigDecimal sueldo;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date fechaFin;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public SegUsuario() {
    }

    public SegUsuario(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(Integer intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
        SegUsuario other = (SegUsuario) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegUsuario [codigo=" + codigo + ", mail=" + mail + ", clave=" + clave + ", nombre=" + nombre
                + ", intentosFallidos=" + intentosFallidos + ", sueldo=" + sueldo + ", fechaFin=" + fechaFin
                + ", version=" + version + "]";
    }

    
}
