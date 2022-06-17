package br.com.rr.helpdesk.controller;

import br.com.rr.helpdesk.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helpdesk/setores")
public class SetorController {

    @Autowired
    private SetorRepository setorRepository;

    public ResponseEntity<Void> cadastraSetor(){

        return ResponseEntity.ok().build();
    }
}
