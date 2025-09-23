package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.Entity.BankAccount;

public interface BankManagmentRepository extends JpaRepository<BankAccount, Long> {

	
}
