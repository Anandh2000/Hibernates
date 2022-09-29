package com.javaByKiran.assignment.service;

import java.util.ArrayList;
import java.util.List;

import com.javaByKiran.assignment.entity.Login;
import com.javaByKiran.assignment.entity.SignUp;
import com.javaByKiran.assignment.repository.signInRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LoginService {
	@Autowired
	private signInRepository signInRepo;
	

	
	public List<SignUp> saveAll(){
		List<SignUp> all = new ArrayList<>();
		all.add(new SignUp("Anandh", "Anandh123", "anandh@gmail.com", "1234"));
		all.add(new SignUp("Anah", "Anadh123", "ananh@gmail.com", "234"));
		all.add(new SignUp("nandh", "nandh123", "nandh@gmail.com", "134"));
		return signInRepo.saveAll(all);
	}
	

}
