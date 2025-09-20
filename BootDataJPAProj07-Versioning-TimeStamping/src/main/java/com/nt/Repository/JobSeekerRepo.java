package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.Entity.JobSeeker;

public interface JobSeekerRepo extends JpaRepository<JobSeeker, Long>{
	
	@Query(value = "select  (SYSDATE- TO_DATE(to_char(dob,'dd-MON-yyyy'),'dd-MON-yyyy'))/365.25 from JOBSEEKER101 where id=:id", nativeQuery = true)
	public double showJSAgeById(Long id);

}
