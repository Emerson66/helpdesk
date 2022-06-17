package br.com.rr.helpdesk.controller.responseDto;

import br.com.rr.helpdesk.model.Chamado;
import br.com.rr.helpdesk.model.enums.ListaStatusChamado;

import java.time.LocalDate;

public class ChamadoResponseDto {

    private ListaStatusChamado statusChamado;
    private String assuntosChamado;
    private String descricaoChamado;
    private LocalDate dataSolicitacao;

    public ChamadoResponseDto(Chamado chamado) {
        this.statusChamado = chamado.getStatusChamado();
        this.assuntosChamado = chamado.getAssuntosChamado();
        this.descricaoChamado = chamado.getDescricaoChamado();
        this.dataSolicitacao = chamado.getDataSolicitacao();
    }

    public ChamadoResponseDto() {
    }
}
