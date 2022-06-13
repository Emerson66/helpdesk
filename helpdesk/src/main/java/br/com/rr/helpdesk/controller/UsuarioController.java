package br.com.rr.helpdesk.controller;

import br.com.rr.helpdesk.controller.requestDto.UsuarioRequestDto;
import br.com.rr.helpdesk.model.Usuario;
import br.com.rr.helpdesk.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/helpdesk/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario cadastrarUsuario(@RequestBody @Valid UsuarioRequestDto usuarioRequestDto){
        Usuario usuario = usuarioRequestDto.toModel();
        return usuarioRepository.save(usuario);

    }
    @GetMapping
    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }
}
