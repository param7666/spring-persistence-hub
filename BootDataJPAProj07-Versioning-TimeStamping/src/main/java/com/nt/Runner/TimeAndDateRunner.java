package com.nt.Runner;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.Entity.JobSeeker;
import com.nt.Service.IJobService;

@Component
public class TimeAndDateRunner implements CommandLineRunner {

	@Autowired
	private IJobService ser;

	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(ser.showJSById(1L));
	}

	
/*	
	@Override
	public void run(String... args) throws Exception {
	ser.showAllJobSeekers().forEach(System.out::println);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		JobSeeker j1=new JobSeeker("Parmeshwar", "HYD", LocalDate.now(), LocalTime.now(), LocalDate.now());
		System.out.println(ser.saveJobSeeker(j1));
	}
*/
	
}
