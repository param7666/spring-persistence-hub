package com.nt.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity(name="Doctor101")
@AllArgsConstructor
@RequiredArgsConstructor
public class Doctor {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "DID_SEQ", allocationSize = 1, initialValue = 101)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer did;
	@NonNull
	@Column(name = "Dr_name",length = 20)
	private String name;
	@NonNull
	@Column(name="Dr_qlfy",length = 20)
	private String qlfy;
	@NonNull
	@Column(name="Dr_income")
	private Long income;
	@NonNull
	@Column(name="Dr_mobileNo")
	private Long mobileNo;
	@NonNull
	@Column(name="Dr_speci", length = 20)
	private String specilization;
	
	public Doctor() {
		System.out.println("Doctor.Doctor():: 0 param constructor");
	}
	
}
