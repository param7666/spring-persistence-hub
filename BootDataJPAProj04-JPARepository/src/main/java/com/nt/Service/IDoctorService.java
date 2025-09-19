package com.nt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.nt.Entity.Doctor;

public interface IDoctorService {

	public String removeAllDoctorByBatch(Iterable<Integer> ids);
	public List<Doctor> findDoctorByExampleData(Doctor d,boolean ascOrder, String ...props);
	public Doctor showDoctorById(int id);
}
