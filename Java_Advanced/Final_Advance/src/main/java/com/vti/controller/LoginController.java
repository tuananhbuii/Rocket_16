package com.vti.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Account;
import com.vti.form.LoginInfoDTO;
import com.vti.service.IAccountService;

@RestController
@RequestMapping(value = "api/v1/login")
@CrossOrigin("*")
public class LoginController {
	@Autowired
	private IAccountService accountService;

	@GetMapping
	public ResponseEntity<?> Login(Principal principal) {
		String username = principal.getName();
		Account entity = accountService.getAccountByUsername(username);

		LoginInfoDTO dto = new LoginInfoDTO(entity.getId(), entity.getEmail(), entity.getFullname(),
				entity.getRole().toString());
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
}
