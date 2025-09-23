package com.nt.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.BankAccount;
import com.nt.Repository.BankManagmentRepository;

@Service
public class BankAccountService implements IBankAccountService{
	
	@Autowired
	private BankManagmentRepository repo;

	@Override
	public String createBankAccount(BankAccount b) {
		
		Long accNo=repo.save(b).getAcno();
		return "Account Created with "+accNo;
		
	}

	@Override
	public String withdrowMoney(Long accNo, Double balance) {
		
		Optional<BankAccount> b=repo.findById(accNo);
		if(b.isPresent()) {
			BankAccount account=b.get();
			account.setBalance(account.getBalance()-balance);
			repo.save(account);
			return "Balance withdrow success "+account.getBalance();
		}
		
		return null;
	}

	@Override
	public String depositeMoney(Long accNo, Double balance) {
		Optional<BankAccount> b=repo.findById(accNo);
		if(b.isPresent()) {
			BankAccount account=b.get();
			account.setBalance(account.getBalance()+balance);
			repo.save(account);
		}
		return "Deposite Success Total Balance"+repo.findById(accNo).get().getBalance();
	}

	@Override
	public BankAccount findBankAccountById(long accNo) {
		BankAccount b=repo.findById(accNo).orElseThrow(()->new IllegalArgumentException("Not Found BankAccount"));
		return b;
	}

}
