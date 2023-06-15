package examen.kevin.cando.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import examen.kevin.cando.examen.model.SegPerfil;

public interface SegPerfilRepository extends JpaRepository<SegPerfil, String> {
    List<SegPerfil> findAllByOrderByNombre();
}
