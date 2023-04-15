package com.nozzarella.parser;

import java.math.BigDecimal;

public class Cheese {
	private int id;
	private String cheeseProductName;
	private BigDecimal cheesePrice;


	public Cheese() {

	}

	public Cheese(int id, String cheeseProductName, BigDecimal cheesePrice) {
		this.id = id;
		this.cheeseProductName = cheeseProductName;
		this.cheesePrice = cheesePrice;
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


}
