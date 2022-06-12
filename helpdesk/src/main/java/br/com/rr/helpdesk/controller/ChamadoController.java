package br.com.rr.helpdesk.controller;

import br.com.rr.helpdesk.controller.requestDto.ChamadoRequestDto;
import br.com.rr.helpdesk.model.Chamado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import br.com.rr.helpdesk.service.ChamadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helpdesk/chamados")
public class ChamadoController {
	
	@Autowired
	ChamadoService chamadoService;

	public ResponseEntity<Void> cadastrarChamado(ChamadoRequestDto chamadoRequestDto){

		return ResponseEntity.ok().build();
	}
}
