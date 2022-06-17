package br.com.rr.helpdesk.controller;

import br.com.rr.helpdesk.controller.requestDto.ChamadoRequestDto;
import br.com.rr.helpdesk.model.Chamado;
import br.com.rr.helpdesk.repository.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import br.com.rr.helpdesk.service.ChamadoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/helpdesk/chamados")
public class ChamadoController {

	@Autowired
	ChamadoRepository chamadoRepository;

	@PostMapping
	public ResponseEntity<Void> cadastrarChamado(@RequestBody @Valid ChamadoRequestDto chamadoRequestDto){
		Chamado chamado = chamadoRequestDto.toModel();
		chamadoRepository.save(chamado);
		return ResponseEntity.ok().build();
	}
}
