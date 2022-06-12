package br.com.rr.helpdesk.controller;

import br.com.rr.helpdesk.controller.requestDto.UsuarioRequestDto;
import br.com.rr.helpdesk.model.Usuario;
import br.com.rr.helpdesk.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/helpdesk/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(UsuarioRequestDto usuarioRequestDto){
        Usuario usuario = usuarioRequestDto.toModel();
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }
}
