package br.com.rr.helpdesk.controller.responseDto;

import br.com.rr.helpdesk.model.Chamado;
import br.com.rr.helpdesk.model.Usuario;
import br.com.rr.helpdesk.repository.ChamadoRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Getter
public class UsuarioResponseDto {

    private String nome;
    private List<ChamadoResponseDto> chamadosRequerentes;

    public UsuarioResponseDto(Usuario usuario) {
        this.nome = usuario.getNome();
        this.chamadosRequerentes = new ArrayList<>();
        this.chamadosRequerentes.addAll(usuario.getChamadosRequerente().stream().
                map(ChamadoResponseDto::new).
                collect(Collectors.toList()));
    }
    @Deprecated
    public UsuarioResponseDto() {
    }



    public static List<UsuarioResponseDto> toModel(List<Usuario> usuarios){

        return usuarios.stream().map(UsuarioResponseDto::new).collect(Collectors.toList());
    }
}
