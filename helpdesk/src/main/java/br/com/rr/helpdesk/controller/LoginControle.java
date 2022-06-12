package br.com.rr.helpdesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helpdesk")
public class LoginControle {
	
	@GetMapping("/login")
	public String login() {
		return "Login";
	}

}
