package com.nt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@Entity
@Table(name="Merrage101")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Merrage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	@Column(length = 20)
	private String name;
	@NonNull
	private boolean isIndian;
	@NonNull
	@Lob
	private char[] biodata;
	@NonNull
	@Lob
	private byte[] photo;
}
