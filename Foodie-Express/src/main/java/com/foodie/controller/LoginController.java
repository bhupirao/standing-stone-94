package com.foodie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodie.exception.LoginException;
import com.foodie.model.Login;
import com.foodie.model.LoginDTO;
import com.foodie.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
    private  LoginService loginService;
	
	
	
	@PostMapping("/customerLogin")
	public ResponseEntity<Login> createUserHandler(@RequestBody Login login) throws LoginException{
		
		Login logg=loginService.createUser(login);
		
		return new ResponseEntity<>(logg,HttpStatus.CREATED);
		
	}
	
	@PostMapping("/customerSignIn")
	public ResponseEntity<String> signInHandler(@RequestBody LoginDTO loginDto) throws LoginException{
		String s=loginService.signIn(loginDto);
		
		return new ResponseEntity<String>(s,HttpStatus.CREATED);
	}
	
	
	

}
