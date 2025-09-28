package com.nt.Service;

import java.util.List;

import com.nt.Entity.Person;
import com.nt.Entity.PhoneNumber;

public interface IOneTOManyOpService {

	public String registerPersonWithPhoneNumber(Person p);
	public String registerPhoneNumberWithPersoon(List<PhoneNumber> list);
	public List<Person> getPersonWithHisPhoneNumber();
	
}
