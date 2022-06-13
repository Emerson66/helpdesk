package br.com.rr.helpdesk.controller.responseDto;

import br.com.rr.helpdesk.model.Chamado;
import br.com.rr.helpdesk.model.Usuario;
import br.com.rr.helpdesk.repository.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UsuarioResponseDto {
    @Autowired
    ChamadoRepository chamadoRepository;
    private String nome;
    private Set<Chamado> chamadosRequerentes;

    public UsuarioResponseDto(Usuario usuario) {
        this.nome = usuario.getNome();
        this.chamadosRequerentes = new HashSet<>();
        this.chamadosRequerentes.addAll(usuario.getChamadosRequerente().stream().map(Chamado::new).collect(Collectors.toSet()));
    }
    @Deprecated
    public UsuarioResponseDto() {
    }



    public static List<UsuarioResponseDto> toModel(List<Usuario> usuarios){

        return usuarios.stream().map(UsuarioResponseDto::new).collect(Collectors.toList());
    }
}
