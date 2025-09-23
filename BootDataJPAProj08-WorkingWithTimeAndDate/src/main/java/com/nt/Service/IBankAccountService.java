package com.nt.Service;

import com.nt.Entity.BankAccount;

public interface IBankAccountService {

	public String createBankAccount(BankAccount b);
	public String withdrowMoney(Long accNo,Double balance);
	public String depositeMoney(Long accNo,Double Balance);
	public BankAccount findBankAccountById(long accNo);
	
}
