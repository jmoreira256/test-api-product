package com.api.products.models;

import javax.persistence.*;

import java.util.Date;

@Entity
public class ProductsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long sku;
    private String name;
    private Double price;
    private Date dateCreation;

	public Long getSku() {
		return this.sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}



}