package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.StoredProcedure;
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
	public List<Doctor> showDoctoryByIncomeRenge(double sRenge, double eRenge) {
		// Create a Stored proccedure obj pointing to pl-slq
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_INCOME",Doctor.class);
		
		//Register the in and out param
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
		
		//set values to in param
		query.setParameter(1, sRenge);
		query.setParameter(2, eRenge);
		
		List<Doctor> list=query.getResultList();
		return list;
		
	}


	@Override
	public List<Doctor> showDoctorBySpecilization(String s) {
		String proccedure_name=" P_GET_DOCTORS_BY_SPECIALIZATION"; // proccedure created in sql db using chatgpt
		//Create StoredProccedure obj using EntityManager
		StoredProcedureQuery query=manager.createStoredProcedureQuery(proccedure_name, Doctor.class);
		
		//register in paramter
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Object.class, ParameterMode.REF_CURSOR);
		
		//set values to in parameter
		query.setParameter(1, s);
		List<Doctor> list=query.getResultList(); // return resultset obj (values from db)
		
		return list;
	}


	@Override
	public List<Doctor> showAllDoctorByQLFYAndLowestIncome(String sp, double income) {
		String proccedure_Name="P_GET_DOCTORS_BY_QLFY_INCOME";
		StoredProcedureQuery query=manager.createStoredProcedureQuery(proccedure_Name, Doctor.class);
		
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
		
		query.setParameter(1, sp);
		query.setParameter(2, income);
		
		List<Doctor> list=query.getResultList();
		
		
		return list;
	}

}
