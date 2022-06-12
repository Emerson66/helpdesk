package br.com.rr.helpdesk.controller.requestDto;

import br.com.rr.helpdesk.model.Chamado;
import br.com.rr.helpdesk.model.Usuario;
import br.com.rr.helpdesk.model.enums.ListaStatusChamado;


import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Optional;

@Getter
public class ChamadoRequestDto {

    @NotBlank
    @Size(max = 100)
    private String assunto;
    @NotBlank
    @Size(max = 1000)
    private String descricao;
    @CreationTimestamp
    private LocalDate dataSolicitacao;
    private ListaStatusChamado statusChamado = ListaStatusChamado.ANDAMENTO;
    private Usuario usuarioLogado;

    public ChamadoRequestDto(String assunto, String descricao, Usuario usuarioLogado) {
        this.assunto = assunto;
        this.descricao = descricao;
        this.usuarioLogado = usuarioLogado;
    }
    @Deprecated
    public ChamadoRequestDto() {
    }

    public Optional<Chamado> toModel(Usuario usuario){
        Chamado chamado = new Chamado(assunto,descricao,usuario.getId());
        return Optional.of(chamado);
    }
}
