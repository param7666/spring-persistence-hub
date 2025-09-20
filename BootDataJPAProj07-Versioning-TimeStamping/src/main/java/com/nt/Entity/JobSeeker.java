package com.nt.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="JOBSEEKER101")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor

public class JobSeeker {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NonNull
	@Column(length = 20)
	private String name;
	
	@NonNull
	@Column(length = 20)
	private String addrs;
	
	@NonNull
	private LocalDate dob;
	
	@NonNull
	private LocalTime tob;
	
	@NonNull
	private LocalDate doj;
}
