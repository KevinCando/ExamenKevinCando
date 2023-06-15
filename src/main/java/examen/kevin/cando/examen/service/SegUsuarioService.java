package examen.kevin.cando.examen.service;

import java.util.ArrayList;
import java.util.List;

import examen.kevin.cando.examen.model.SegPerfil;
import examen.kevin.cando.examen.model.SegUsuario;
import examen.kevin.cando.examen.model.SegUsuarioPerfil;
import examen.kevin.cando.examen.repository.SegUsuarioPerfilRepository;
import examen.kevin.cando.examen.repository.SegUsuarioRepository;
import jakarta.transaction.Transactional;

public class SegUsuarioService {
    private final SegUsuarioRepository segUsuarioRepository;

    private final SegUsuarioPerfilRepository segUsuarioPerfilRepository;


    public SegUsuarioService(SegUsuarioRepository segUsuarioRepository,
            SegUsuarioPerfilRepository segUsuarioPerfilRepository) {
        this.segUsuarioRepository = segUsuarioRepository;
        this.segUsuarioPerfilRepository = segUsuarioPerfilRepository;
    }

    @Transactional
    public SegUsuario create (SegUsuario segUsuario){
        SegUsuario usuarioTmp = this.segUsuarioRepository.findByMail(segUsuario.getMail());
        if (usuarioTmp == null){
            return this.segUsuarioRepository.save(segUsuario);
        } else{
            throw new RuntimeException("El usuario ya existe");
        }
    }

   
}
