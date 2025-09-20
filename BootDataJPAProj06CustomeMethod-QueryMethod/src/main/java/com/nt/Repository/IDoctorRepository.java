package com.nt.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nt.Entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer>{

	//@Query("From Doctor") // SELECT * FROM DOCTOR101(TABLE NAME)
	//@Query("select doc from Doctor doc") // SELECT doc(full object) FROM DOCTOR101(TABLE NAME) as doc(alies name)
	//@Query("from Doctor doc") //SELECT * FROM DOCTOR101(TABLE NAME) as doc(alies name)
	@Query("from Doctor as doc") //same as query 3
	public List<Doctor> showAllDoctor();
	
	@Query("select doc.name from Doctor doc") // geting name from doc object
	public List<String> showNameOfDoctor();
	
	// JPQL query using positional parameters (?1, ?2, ?3) to filter doctors by three specializations.
	// ?1 → sp1, ?2 → sp2, ?3 → sp3 → These are called Positional Parameters.
	@Query("from Doctor where specilization in(?1,?2,?3) order by specilization asc") 
	public List<Doctor> showAllDoctorBySpecilization(String sp1,String sp2,String sp3);

	
	// JPQL query using named parameters (:sp1, :sp2, :sp3) to filter doctors by three specializations.
	// These are Named Parameters, mapped using @Param.
	@Query("from Doctor where specilization IN(:sp1,:sp2,:sp3) order by specilization asc")
	public List<Doctor> showAllDoctorBySpecilizations(@Param("sp1")String spec1,
													  @Param("sp2")String spec2,
													  @Param("sp3")String spec3	);
	

	
	// JPQL query using a mix of positional (?1, ?2) and named (:sp) parameters to filter doctors.
	// Named parameter and varible name should be same or use @Param
	@Query("from Doctor where specilization in(?1,?2,:sp) order by specilization desc")
	public List<Doctor> showAllDoctorsBySpecilization(String s1,String s2,String sp);
	
	
	// JPQL query using named parameters (:s1, :s2, :s3) to filter doctors by specialization.
	// Here varible name and parameter name should be same
	@Query("from Doctor where specilization in(:s1,:s2,:s3) order by specilization desc")
	public List<Doctor> showAllDoctorsBySpeci(String s1,String s2,String s3);
	
	
	// Combination of named parameter and @param
	@Query("from Doctor where specilization in(:s1,:s2,:s3) order by specilization desc")
	public List<Doctor> showAllDoctorsBySpecili(String s1,String s2,@Param("s3") String speci);
	
/*	      	THIS WILL NOT WORK
	@Query("from Doctor where specilization in(:s1,:s2,:s3) order by specilization desc")
	public List<Doctor> showAllDoctorsBySpecili(String s1,String s2,@Param("speci") String s3);
	
*/
	
	@Query("from Doctor where income>=:sRenge and income<=:eRenge order by income desc")
	public List<Doctor> showAllDoctorByIncome(double sRenge, double eRenge);
	
	
	@Query("select did, name,income,qlfy from Doctor where qlfy in(?1,?2,?3)")
	public List<Object[]> showAllDoctorByQualification(String s1,String s2,String s3);
	
	@Query("select name from Doctor where specilization=:spec")
	public List<String> showDoctorNameBySpeci(String spec);
	
	@Query("select name from Doctor where name=?1")
	public List<String> showDoctorNameByName(String name);
	
	@Query("from Doctor where name=:name")
	public Doctor showDoctorByName(String name);
	
//  =======   Aggregate functions   =======
	@Query("select distinct count(name) from Doctor")
	public long showUniqueDoctorCount();
	
	
	@Query("select count(*), max(income), min(income), sum(income), avg(income) from Doctor")
	public Object showAggregateDataOfDoctor();
	
	//===============================NON-SELECT Operations==========================
	
	@Query("update Doctor set income=?1 where specilization in(?2,?3)")
	@Modifying
	@Transactional
	public int updateDoctorBySpecilization(double newIncome,String sp1,String sp2);
	
	@Query("update Doctor set name=:name where did=:id")
	@Transactional
	@Modifying
	public int updateDoctorById(int id,String name);
	
	@Query("delete from Doctor where income>=:sSal and income<=:eSal")
	@Modifying
	@Transactional
	public int deleteDoctorByIncome(double sSal,double eSal);
	
//	@Query( value="SELECT now() FROM dual",nativeQuery = true) //for MYSQL DB
	@Query( value="SELECT sysdate FROM dual",nativeQuery = true) // for Oracle SQL DB
	public LocalDateTime showSystemLocalDateAndTime();
	
	
	
}
                                                                                                  
