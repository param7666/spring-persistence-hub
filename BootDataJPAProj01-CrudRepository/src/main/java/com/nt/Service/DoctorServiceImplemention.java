package com.nt.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Doctor;
import com.nt.Exception.DoctorNotFoundException;
import com.nt.Repository.IDoctorRepository;

@Service
public class DoctorServiceImplemention implements IDoctorService{
	
	@Autowired
	private IDoctorRepository repo; //Injects the dynamically InMemory Proxy class obj 

	@Override
	public String registerDoctor(Doctor d) {
		System.out.println("DoctorServiceImplemention.registerDoctor()::"+repo.getClass().getName());
		System.out.println("List of Implemented Interface:: "+Arrays.toString(repo.getClass().getInterfaces()));
		System.out.println("List of method:: "+Arrays.toString(repo.getClass().getDeclaredMethods()));
		
		// insert the object
		Doctor savedDoctor=repo.save(d);
		return "Docter saved with the values "+savedDoctor.getDid();
	}

	@Override
	public String registerAllDoctor(Iterable<Doctor> dList) {
		Iterable<Doctor> d=repo.saveAll(dList);
		StringBuilder result = new StringBuilder("Doctors saved with IDs: ");
	    for (Doctor doctor : d) {
	        result.append(doctor.getDid()).append(", ");
	    }
	    return result.toString();
	}

	@Override
	public Iterable<Doctor> showAllDoctor() {
		Iterable<Doctor> allDoctors=repo.findAll();
		return allDoctors;
	}

	@Override
	public Optional<Doctor> showDoctorById(Integer id) {
		Optional<Doctor> d=repo.findById(id);
		return d;
	
	}

	@Override
	public String checkDoctorExits(Integer id) {
		Optional<Doctor> d=repo.findById(id);
		if(d.isEmpty()) throw new DoctorNotFoundException("Doctor not Exits");
		else return "Present with id "+d.get();
	}

	@Override
	public Long countDoctors() {
	Long count=repo.count();
		return count;
	}

	@Override
	public String deleteDoctorById(Integer id) {
		repo.deleteById(id);
		return "Doctor deleted with id "+id;
	}
	

}
