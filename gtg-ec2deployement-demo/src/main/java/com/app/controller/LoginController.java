package com.app.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDtao;

@RestController
public class LoginController {

	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getExhcangeRate(HttpServletRequest request) {

		int port = request.getServerPort();

		UserDtao dto = new UserDtao();
		dto.setUsername("admin");
		dto.setDescription("Admin user description");
		dto.setPort(port);

		return new ResponseEntity<UserDtao>(dto, HttpStatus.OK);

	}
}
