package com.nt.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.nt.Entity.Doctor;
import com.nt.Exception.DoctorNotFoundException;
import com.nt.Repository.IDoctorRepository;

@Service
public class DoctorServiceImplemention implements IDoctorService{
	
	@Autowired
	private IDoctorRepository repo; //Injects the dynamically InMemory Proxy class obj 

	@Override
	public String removeAllDoctorByBatch(Iterable<Integer> ids) {
		//Load the object based on given id
		List<Doctor> list=repo.findAllById(ids);
		int count=list.size();
		repo.deleteAllById(ids);
		
		return count+" Doctors Removed....";
	}

	@Override
	public List<Doctor> findDoctorByExampleData(Doctor d, boolean ascOrder, String... props) {
		Example<Doctor> example=Example.of(d);
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		List<Doctor> list=repo.findAll(example);
		return list;
	}

	@Override
	public Doctor showDoctorById(int id) {
		Doctor d=repo.findById(id).orElseThrow(()-> new DoctorNotFoundException("Invalid Doctor id"));
		return d;
	}

}
