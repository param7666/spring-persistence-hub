package com.nt.service;

import com.nt.Entity.Merrage;
import com.nt.repository.MerrageRepo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MerrageService implements IMerrageService{
	
	@Autowired
	private MerrageRepo repo;

	@Override
	public String registerUser(Merrage m) {
		long id=repo.save(m).getId();
		return "User saved with "+id;
	}

	@Override
	public Merrage findUserById(long id) {
		return repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Wrong id"));
	}

	



}
