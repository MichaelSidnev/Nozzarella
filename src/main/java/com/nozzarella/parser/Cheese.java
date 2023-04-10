package com.nozzarella.parser;

import java.math.BigDecimal;

public class Cheese {
	private int id;
	private String name;
	BigDecimal cheesePrice;


	public Cheese() {

	}

	public Cheese(int id, String name, BigDecimal cheesePrice) {
		this.id = id;
		this.name = name;
		this.cheesePrice = cheesePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getCheesePrice() {
		return cheesePrice;
	}

	public void setCheesePrice(BigDecimal cheesePrice) {
		this.cheesePrice = cheesePrice;
	}


}
