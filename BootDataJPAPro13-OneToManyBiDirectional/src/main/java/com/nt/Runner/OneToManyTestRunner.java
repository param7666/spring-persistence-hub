package com.nt.Runner;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.Person;
import com.nt.Entity.PhoneNumber;
import com.nt.Service.IOneTOManyOpService;

@Component
public class OneToManyTestRunner implements CommandLineRunner{
	
	@Autowired
	private IOneTOManyOpService ser;

	
	
	
	@Override
	public void run(String... args) throws Exception {
		ser.getPersonWithHisPhoneNumber().forEach(System.out::println);
		
	}

	
	

/*
	@Override
	public void run(String... args) throws Exception {
		Person p1=new Person("Rahim", "UP");
		PhoneNumber ph1=new PhoneNumber("Persional", 5375144151L, "JIO");
		PhoneNumber ph2=new PhoneNumber("Private", 5375144890L, "Airtel");
		ph1.setPerson(p1);
		ph2.setPerson(p1);
		Set<PhoneNumber> phoneSet=new HashSet<PhoneNumber>();
		phoneSet.add(ph1);
		phoneSet.add(ph2);
		p1.setContacts(phoneSet);
		List<PhoneNumber> list=List.of(ph1,ph2);
		System.out.println(ser.registerPhoneNumberWithPersoon(list));

	}
	
	
	

	@Override
	public void run(String... args) throws Exception {
		Person p1=new Person("Param", "HYD");
		PhoneNumber ph1=new PhoneNumber("Home", 7666845301L, "JIO");
		PhoneNumber ph2 = new PhoneNumber("Personal", 8999844631L, "JIO");
		ph1.setPerson(p1);
		ph2.setPerson(p1);
		p1.setContacts(Set.of(ph1,ph2));
		try {
			String result=ser.registerPersonWithPhoneNumber(p1);
			System.out.println(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
*/
}
