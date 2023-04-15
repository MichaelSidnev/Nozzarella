package com.nozzarella.parser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import parsers.Lenta;


@Component
public class CheeseDAO {
	private static int CHEESE_COUNT;
	private BigDecimal cheesePrice;
	private String cheeseProductName;
	private List<Cheese> cheese;


	{
		cheese = new ArrayList<>();

		cheese.add(new Cheese(++CHEESE_COUNT, "Lamber1", new BigDecimal(599.99)));
		cheese.add(new Cheese(++CHEESE_COUNT, "Lamber2", new BigDecimal(600)));
		cheese.add(new Cheese(++CHEESE_COUNT, "Lamber3", new BigDecimal(600.01)));
		cheese.add(new Cheese(++CHEESE_COUNT, "Lamber4", new BigDecimal(600.02)));
	}

	public List<Cheese> index() {
		return cheese;
	}

	public Cheese show(int id) {
		return cheese.stream().filter(Cheese -> Cheese.getId() == id).findAny().orElse(null);
	}

	public void save(Cheese Cheese) {
		Cheese.setId(++CHEESE_COUNT);
		Lenta a = new Lenta();
		
		cheesePrice = a.lentaLamberPrice();
		Cheese.setCheesePrice(cheesePrice);
		
		cheeseProductName = a.lentaLamberProductName();
		Cheese.setProductName(cheeseProductName);
		
		cheese.add(Cheese);
	}
}