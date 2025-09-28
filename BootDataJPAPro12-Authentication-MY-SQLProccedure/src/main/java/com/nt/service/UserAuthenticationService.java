package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class UserAuthenticationService implements IUserAuthenticationService{
	
	@Autowired
	private EntityManager manager;

	@Override
	public String authenticate(String username, String pass) {
		String p_name="check_login";
		StoredProcedureQuery query=manager.createStoredProcedureQuery(p_name);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		
		query.setParameter(1, username);
		query.setParameter(2, pass);
		
		String result=(String) query.getOutputParameterValue(3);
		
		return result;
	}
	
	

}
