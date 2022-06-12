package br.com.rr.helpdesk.service;

import br.com.rr.helpdesk.model.Chamado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rr.helpdesk.repository.ChamadoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ChamadoService {
	
	@Autowired
	ChamadoRepository chamadoRepository;

	public void cadastrarChamado(Chamado chamado){
		chamadoRepository.save(chamado);
	}
	public List<Chamado> listarChamados(){
		List<Chamado> chamados = chamadoRepository.findAll();
		return chamados;
	}
}
