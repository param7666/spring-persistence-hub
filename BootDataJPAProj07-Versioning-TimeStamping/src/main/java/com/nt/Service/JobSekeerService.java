package com.nt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.Entity.JobSeeker;
import com.nt.Repository.JobSeekerRepo;

@Service
public class JobSekeerService implements IJobService{
	
	@Autowired
	public JobSeekerRepo repo;

	@Override
	public String saveJobSeeker(JobSeeker job) {
		Long id=repo.save(job).getId();
		return "Candidate Registered with id "+id;
	}

	@Override
	public Iterable<JobSeeker> showAllJobSeekers() {
		return repo.findAll();
	}

	@Override
	public double showJSById(Long id) {
		return repo.showJSAgeById(id);
	}

}
