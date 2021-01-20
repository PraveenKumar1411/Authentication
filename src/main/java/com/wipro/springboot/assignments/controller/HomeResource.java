package com.wipro.springboot.assignments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springboot.assignments.model.AuthRequest;
import com.wipro.springboot.assignments.util.JwtUtil;

@RestController
public class HomeResource {

	@Autowired
	private JwtUtil jwtUtil;
		
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception  {
		
		try {
		
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
			);
		}
		catch(BadCredentialsException e) {
			throw new Exception("Invalid username/password");
		}
		
		return jwtUtil.generateToken(authRequest.getUserName());
	}
}
