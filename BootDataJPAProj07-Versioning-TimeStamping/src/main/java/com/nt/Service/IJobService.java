package com.nt.Service;

import com.nt.Entity.JobSeeker;

public interface IJobService {

	public String saveJobSeeker(JobSeeker job);
	public Iterable<JobSeeker> showAllJobSeekers();
	public double showJSById(Long id);
}
