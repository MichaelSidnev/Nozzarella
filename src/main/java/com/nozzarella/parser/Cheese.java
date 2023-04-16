package com.nozzarella.parser;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.validation.constraints.NotNull;

public class Cheese {
	
	//@NotNull(message = "id shoud not be null")
	private int id;
	//@NotNull(message = "name shoud not be null")
	private String cheeseProductName;
	//@NotNull(message = "price shoud not be null")
	private BigDecimal cheesePrice;
	//@NotNull(message = "country shoud not be null")
	private String cheeseCountry;
	

	public Cheese(int id, String cheeseProductName, BigDecimal cheesePrice, String cheeseCountry) {
		this.id = id;
		this.cheeseProductName = cheeseProductName;
		this.cheesePrice = cheesePrice;
		this.cheeseCountry = cheeseCountry;
	}

	public Cheese() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return cheeseProductName;
	}

	public void setProductName(String cheeseProductName) {
		this.cheeseProductName = cheeseProductName;
	}
	
	public BigDecimal getCheesePrice() {
		return cheesePrice;
	}

	public void setCheesePrice(BigDecimal cheesePrice) {
		this.cheesePrice = cheesePrice;
	}

	public String getCheeseCountry() {
		return cheeseCountry;
	}

	public void setCheeseCountry(String cheeseCountry) {
		this.cheeseCountry = cheeseCountry;
	}


}
