package com.nt.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name="Contact101")
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regNo;
	@NonNull
	@Column(length = 20)
	private String numberType;
	@NonNull
	private long PhoneNumber;
	@NonNull
	@Column(length = 20)
	private String provider;
	
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PersonId", referencedColumnName = "pid")
	private Person person;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", numberType=" + numberType + ", PhoneNumber=" + PhoneNumber
				+ ", provider=" + provider + "]";
	}
	
	
	
}
