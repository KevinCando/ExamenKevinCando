package examen.kevin.cando.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import examen.kevin.cando.examen.model.SegUsuarioPerfil;
import examen.kevin.cando.examen.model.SegUsuarioPerfilPK;
import examen.kevin.cando.examen.model.SegPerfil;

public interface SegUsuarioPerfilRepository extends JpaRepository<SegUsuarioPerfil, SegUsuarioPerfilPK> {
    List<SegUsuarioPerfil> findAllByPerfil(SegPerfil perfil);
}
