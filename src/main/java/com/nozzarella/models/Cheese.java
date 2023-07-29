package com.nozzarella.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Cheese {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull(message = "name shoud not be null")
	private String cheeseProductName;
	@NotNull(message = "price shoud not be null")
	private BigDecimal cheesePrice;
	@NotNull(message = "country shoud not be null")
	private String cheeseCountry;
	@NotNull(message = "timing shood not be null")	
	private LocalDate timing;

	public Cheese(int id, String cheeseProductName, BigDecimal cheesePrice, String cheeseCountry, LocalDate timing) {
		this.id = id;
		this.cheeseProductName = cheeseProductName;
		this.cheesePrice = cheesePrice;
		this.cheeseCountry = cheeseCountry;
		this.timing = timing;
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

	public LocalDate getTiming() {
		return timing;
	}

	public void setTiming(LocalDate localDate) {
		this.timing = localDate;
	}

}
