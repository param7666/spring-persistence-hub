package com.nt.Service;

import java.util.List;

import com.nt.Entity.Doctor;

public interface IDoctorService {

	public List<Doctor> showDoctoryByIncomeRenge(double sRenge, double eRenge);
	public List<Doctor> showDoctorBySpecilization(String s);
	public List<Doctor> showAllDoctorByQLFYAndLowestIncome(String sp,double income);
}

