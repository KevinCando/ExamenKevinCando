package examen.kevin.cando.examen.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import examen.kevin.cando.examen.model.SegUsuario;

public interface SegUsuarioRepository extends JpaRepository<SegUsuario, Integer>{
    
    SegUsuario findByMail(String mail);
    
}
