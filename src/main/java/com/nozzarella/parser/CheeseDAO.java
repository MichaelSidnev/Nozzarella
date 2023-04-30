package com.nozzarella.parser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class CheeseDAO {
	private static int CHEESE_COUNT;
	private List<Cheese> cheeseList;

	public CheeseDAO() {
		cheeseList = new ArrayList<>();

		cheeseList.add(new Cheese(++CHEESE_COUNT, "Lamber1", new BigDecimal(599.99), "USA"));
		cheeseList.add(new Cheese(++CHEESE_COUNT, "Lamber2", new BigDecimal(600), "USA"));
		cheeseList.add(new Cheese(++CHEESE_COUNT, "Lamber3", new BigDecimal(600.01), "USA"));
		cheeseList.add(new Cheese(++CHEESE_COUNT, "Lamber4", new BigDecimal(600.02), "USA"));
	}

	public List<Cheese> index() {
		return cheeseList;
	}

	public Cheese show(int id) {
		return cheeseList.stream().filter(Cheese -> Cheese.getId() == id).findAny().orElse(null);
	}

	public void save(Cheese cheese) {
		cheese.setId(++CHEESE_COUNT);
		cheeseList.add(cheese);
	}
}