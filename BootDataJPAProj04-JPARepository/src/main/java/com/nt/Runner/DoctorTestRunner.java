package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.Doctor;
import com.nt.Service.IDoctorService;

@Component
public class DoctorTestRunner implements CommandLineRunner{

	@Autowired
	private IDoctorService service;
	
	
	@Override
	public void run(String... args) throws Exception {
		Doctor d=service.showDoctorById(199);
		System.out.println(d);
		
	}
	
	

/*	@Override
	public void run(String... args) throws Exception {
		Doctor d=new Doctor();
		d.setName("Param");
		d.setQlfy("MBBS");
		List<Doctor> list=service.findDoctorByExampleData(d, true, "name");
		list.forEach(System.out::println);
	}	
	

	@Override
	public void run(String... args) throws Exception {
		List<Integer> ids=List.of(120,121,122,123,199);
		System.out.println(service.removeAllDoctorByBatch(ids));
	}
*/
}
