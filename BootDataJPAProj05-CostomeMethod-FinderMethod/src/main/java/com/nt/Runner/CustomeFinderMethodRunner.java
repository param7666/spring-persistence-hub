package com.nt.Runner;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.Entity.Doctor;
import com.nt.Repository.IDoctorRepository;

@Component
public class CustomeFinderMethodRunner implements CommandLineRunner{
	
	@Autowired
	private IDoctorRepository repo;

	@Override
	public void run(String... args) throws Exception {
		//repo.findBySpecilizationEquals("MBBS").forEach(System.out::println);
		//repo.readByspecilizationEquils("MBBS").forEach(System.out::println);
		//repo.getByspecilizationEquils("MBBS").forEach(System.out::println);
		//repo.findByspecilizationIs("MBBS").forEach(System.out::println);
		
	}

}
