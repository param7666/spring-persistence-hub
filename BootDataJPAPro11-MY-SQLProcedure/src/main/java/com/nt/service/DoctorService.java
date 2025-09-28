package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.Entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;


@Service
public class DoctorService implements IDoctorService{
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Doctor> getDoctorByIncomeRenge(double s, double e) {
		String p_name="get_doctors_by_income_range";
		StoredProcedureQuery query=manager.createStoredProcedureQuery(p_name, Doctor.class);
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		
		query.setParameter(1, s);
		query.setParameter(2, e);
		
		List<Doctor> list=query.getResultList();

		return list;
	}

	@Override
	public List<Doctor> getDoctorBySpecilizatioin(String sp) {
		String p_name="get_doctors_by_specialization";
		StoredProcedureQuery query=manager.createStoredProcedureQuery(p_name, Doctor.class);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.setParameter(1, sp);
		List<Doctor> list=query.getResultList();
		return list;
	}

}
