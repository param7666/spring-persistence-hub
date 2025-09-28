package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IDoctorService;
@Component
public class MySQLProccedureTestRunner implements CommandLineRunner{
	
	@Autowired
	private IDoctorService ser;

	@Override
	public void run(String... args) throws Exception {
		//ser.getDoctorByIncomeRenge(50000, 100000).forEach(System.out::println);
		ser.getDoctorBySpecilizatioin("Pediatrics").forEach(System.out::println);
		
	}

}
