package com.liabrary.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="JPA_BOOK")

public class Book {
	
	@Id
	@SequenceGenerator(name="bookSeq", sequenceName = "bookSeq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookSeq")
	private int bookid;
	@Nonnull
	private String bookName;
	@Nonnull
	private String authorName;
	@Nonnull
	private double price;
}
