package com.nt.Runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.BankAccount;
import com.nt.Repository.BankManagmentRepository;
import com.nt.Service.IBankAccountService;
@Component
public class BankTimeStampRunner implements CommandLineRunner {

	
	@Autowired
	private IBankAccountService ser;
	
	
	@Override
	public void run(String... args) throws Exception {
/*	
		BankAccount b1=new BankAccount("Parmeshwar", 99870.00, "SBI", "Current");
		String msg="Bank Account Created with Account Number: "+repo.save(b1).getAcno();
		System.out.println(msg);
	
		
		Optional<BankAccount> b=repo.findById(10000002L);
		if(b.isPresent()) {
			BankAccount acc=b.get();
			acc.setBalance(54000.00);
			Long accNo=repo.save(acc).getAcno();
			System.out.println(accNo+" is Updated");
		}
		
		
		repo.findAll().forEach(System.out::println);

		BankAccount b1=new BankAccount("Sundar", 89630.22, "HDFC", "Saving");
		String msg=ser.createBankAccount(b1);
		System.out.println(msg);
		
*/
		System.out.println(ser.findBankAccountById(10000020));
		
		//System.out.println(ser.withdrowMoney(10000020L, 2000.0));
		
		//System.out.println(ser.depositeMoney(10000020L,4500.0));
		
		
	}
	

}
