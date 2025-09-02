package com.product.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="JPA_PRODUCT")
public class Product {
	@Id
	@Column(name="Product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Nonnull
	private String name;
	@Nonnull
	private String desc;
	@Nonnull
	private double price;
}
