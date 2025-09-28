package com.nt.service;

import java.util.List;

import com.nt.Entity.Doctor;

public interface IDoctorService {

	public List<Doctor> getDoctorByIncomeRenge(double s,double e);
	public List<Doctor> getDoctorBySpecilizatioin(String sp);
}
