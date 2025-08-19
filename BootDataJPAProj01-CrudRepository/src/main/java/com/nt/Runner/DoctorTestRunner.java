package com.nt.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.Entity.Doctor;
import com.nt.Exception.DoctorNotFoundException;
import com.nt.Service.IDoctorService;

@Component
public class DoctorTestRunner implements CommandLineRunner{

	@Autowired
	private IDoctorService service;
	Scanner sc=new Scanner(System.in);
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enter the id");
		Integer id=sc.nextInt();
		System.out.println(service.deleteDoctorById(id));
		
	}
	
	
	
	
/*	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(service.countDoctors());
		
	}
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enter Doctor id..");
		Integer id=sc.nextInt();
		System.out.println(id);
		
	}

	
	@Override
	public void run(String... args) throws Exception {
		//FInd Doctor by id
		System.out.println("Enter the Doctor id");
		Integer id=sc.nextInt();
		Optional<Doctor> doc= service.showDoctorById(id);
		if(doc.isPresent()) System.out.println(doc);
		else throw new DoctorNotFoundException("Invalid Doctor id!");
		
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		//Show All Doctors
		Iterable<Doctor> allDoctors=service.showAllDoctor();
		allDoctors.forEach(System.out::println);
		
	}
	

	@Override
	public void run(String... args) throws Exception {
		// save 1 doctor
		Doctor d1=new Doctor("Ramesh","MBBS", 95000L, 76665665L, "BAMS");
		String message=service.registerDoctor(d1);
		System.out.println(message);
	} 
	
	@Override
	public void run(String... args) throws Exception {
		
		Doctor d1=new Doctor("Ramesh","MBBS", 95000L, 76665665L, "BAMS");
		Doctor d2=new Doctor("Kishor","MBBS", 45000L, 79995665L, "BAMS");
		Doctor d3  = new Doctor("Sneha",   "MBBS", 78000L, 78811234L, "BAMS");
		Doctor d4  = new Doctor("Manoj",   "MD",   120000L, 79811235L, "Ayurveda");
		Doctor d5  = new Doctor("Pooja",   "MBBS", 50000L, 70011236L, "BDS");
		Doctor d6  = new Doctor("Arjun",   "BAMS", 60000L, 70111237L, "MBBS");
		Doctor d7  = new Doctor("Ritika",  "BHMS", 55000L, 70211238L, "MD");
		Doctor d8  = new Doctor("Neha",    "MBBS", 80000L, 70311239L, "BAMS");
		Doctor d9  = new Doctor("Suresh",  "MD",   130000L, 70411240L, "MBBS");
		Doctor d10 = new Doctor("Kiran",   "MBBS", 49000L, 70511241L, "BDS");
		Doctor d11 = new Doctor("Divya",   "BDS",  47000L, 70611242L, "BAMS");
		Doctor d12 = new Doctor("Ankita",  "MBBS", 56000L, 70711243L, "BHMS");
		Doctor d13 = new Doctor("Yogesh",  "BAMS", 51000L, 70811244L, "MBBS");
		Doctor d14 = new Doctor("Tanvi",   "MBBS", 95000L, 70911245L, "MD");
		Doctor d15 = new Doctor("Ajay",    "BHMS", 60000L, 71011246L, "MBBS");
		Doctor d16 = new Doctor("Geeta",   "MBBS", 58000L, 71111247L, "BAMS");
		Doctor d17 = new Doctor("Omkar",   "MD",   145000L, 71211248L, "BDS");
		Doctor d18 = new Doctor("Shweta",  "MBBS", 75000L, 71311249L, "Ayurveda");
		Doctor d19 = new Doctor("Rahul",   "BAMS", 62000L, 71411250L, "MBBS");
		Doctor d20 = new Doctor("Nikita",  "MBBS", 85000L, 71511251L, "BHMS");
		Doctor d21 = new Doctor("Swapnil", "BHMS", 54000L, 71611252L, "MD");
		Doctor d22 = new Doctor("Aarti",   "MBBS", 70000L, 71711253L, "BDS");
		
		 List<Doctor> doctorList = List.of(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22);
		
		String message=service.registerAllDoctor(doctorList);
		System.out.println(message);
		
	} 
*/
	
}
