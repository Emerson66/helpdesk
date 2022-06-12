package br.com.rr.helpdesk.controller.requestDto;

import br.com.rr.helpdesk.model.Usuario;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Getter
public class UsuarioRequestDto {

    @NotBlank
    @Size(max = 50)
    private String nome;
    @NotBlank
    @Size(max = 20)
    private String login;
    @Email
    private String email;
    @NotBlank
    @Size(min = 5)
    private String senha;

    public UsuarioRequestDto(@NotBlank @Size(max = 50) String nome,
                             @NotBlank @Size(max = 20)String login,
                             @Email String email,
                             @NotBlank @Size(min = 5) String senha) {
        this.nome = nome;
        this.login = login;
        this.email = email;
        this.senha = senha;
    }
    @Deprecated
    public UsuarioRequestDto() {
    }
    public Usuario toModel(){
        return new Usuario(this.nome, this.login, this.senha, this.email);
    }


}
