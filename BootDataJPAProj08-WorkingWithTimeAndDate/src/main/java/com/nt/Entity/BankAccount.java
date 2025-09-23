package com.nt.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="BankAccount101")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class BankAccount {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "ACNO_SEQ",initialValue = 10000000, allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)  
	private Long acno;
	@NonNull
	@Column(name="HOLDER_NAME", length = 20)
	private String holderName;
	@NonNull
	private Double balance;
	@NonNull
	@Column(name="BANK_NAME", length = 20)
	private String bankName;
	@NonNull
	@Column(name="ACC_TYPE", length = 20)
	private String accType;
	
	@Version // for version means count how many time db updated
	@Column(length = 10)
	private Integer updateCount;
	
	@CreationTimestamp() // store the time when first time data is inserted
	@Column()
	private LocalDateTime openedOn;
	
	@UpdateTimestamp // store the date and time when the last time data is updated
	@Column(insertable = false)
	private LocalDateTime lastUpdatedOn;
}
