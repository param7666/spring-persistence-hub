package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IUserAuthenticationService;

@Component
public class AuthenticationTestRunner implements CommandLineRunner{
	
	@Autowired
	private IUserAuthenticationService sr;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(sr.authenticate("admin", "admin1234"));
		
	}

}
