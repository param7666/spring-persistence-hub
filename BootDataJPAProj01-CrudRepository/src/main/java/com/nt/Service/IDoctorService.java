package com.nt.Service;

import java.util.List;
import java.util.Optional;

import com.nt.Entity.Doctor;

public interface IDoctorService {

	public String registerDoctor(Doctor d);
	public String registerAllDoctor(Iterable<Doctor> dList);
	public Iterable<Doctor> showAllDoctor();
	public Optional<Doctor> showDoctorById(Integer id);
	public String checkDoctorExits(Integer id);
	public Long countDoctors();
	public String deleteDoctorById(Integer id);
}
