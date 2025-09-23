package com.nt.service;

import com.nt.Entity.Merrage;

public interface IMerrageService {

	public String registerUser(Merrage m);
	public Merrage findUserById(long id);
}
