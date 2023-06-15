package examen.kevin.cando.examen.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class SegUsuarioPerfilPK implements Serializable{
    @Column(name="COD_PERFIL", nullable = false, length = 8)
    private String codigoPerfil;
    @Column(name="COD_USUARIO", nullable = false)
    private Integer codigoUsuario;

    public SegUsuarioPerfilPK() {
    }

    public SegUsuarioPerfilPK(String codigoPerfil, Integer codigoUsuario) {
        this.codigoPerfil = codigoPerfil;
        this.codigoUsuario = codigoUsuario;
    }

    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public String toString() {
        return "SegUsuarioPerfilPK [codigoPerfil=" + codigoPerfil + ", codigoUsuario=" + codigoUsuario + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoPerfil == null) ? 0 : codigoPerfil.hashCode());
        result = prime * result + ((codigoUsuario == null) ? 0 : codigoUsuario.hashCode());
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
        SegUsuarioPerfilPK other = (SegUsuarioPerfilPK) obj;
        if (codigoPerfil == null) {
            if (other.codigoPerfil != null)
                return false;
        } else if (!codigoPerfil.equals(other.codigoPerfil))
            return false;
        if (codigoUsuario == null) {
            if (other.codigoUsuario != null)
                return false;
        } else if (!codigoUsuario.equals(other.codigoUsuario))
            return false;
        return true;
    }

    
    
}
