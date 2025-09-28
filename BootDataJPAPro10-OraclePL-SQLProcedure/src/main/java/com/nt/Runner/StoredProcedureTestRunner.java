package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.Service.IDoctorService;


@Component
public class StoredProcedureTestRunner implements CommandLineRunner{

	@Autowired
	private IDoctorService ser;
	
	
	@Override
	public void run(String... args) throws Exception {
		//ser.showDoctoryByIncomeRenge(30000, 90000).forEach(System.out::println);
	   //ser.showDoctorBySpecilization("BAMS").forEach(System.out::println);
		ser.showAllDoctorByQLFYAndLowestIncome("DM", 50000).forEach(System.out::println);
		
		
		
	}

}
