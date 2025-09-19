package com.nt.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.Entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer>{

	//public List<Doctor> findBySpecilizationEquals(String specilization);
	public List<Doctor> readByspecilizationEquils(String speccilization);
	//public List<Doctor> getByspecilizationEquils(String specilization);
	  public List<Doctor> findByspecilizationIs(String  speciality);


	
}
