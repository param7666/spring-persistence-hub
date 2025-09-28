package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.Entity.Person;
import com.nt.Entity.PhoneNumber;
import com.nt.Repository.IPersonRepository;
import com.nt.Repository.IPhoneNumberRepository;

@Service
public class OneTOManyService implements IOneTOManyOpService {
	
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository phoneRepo;

	@Override
	public String registerPersonWithPhoneNumber(Person p) {
		Integer pid=personRepo.save(p).getPid();
		return "Person saved with id "+pid;
	}

	@Override
	public String registerPhoneNumberWithPersoon(List<PhoneNumber> list) {
		List<PhoneNumber> saved= phoneRepo.saveAll(list);
		return "Phone Number saved with"+saved;
	}

	@Override
	public List<Person> getPersonWithHisPhoneNumber() {
		
		return personRepo.findAll();
	}

}
