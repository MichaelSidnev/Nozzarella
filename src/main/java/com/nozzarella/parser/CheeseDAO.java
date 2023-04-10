package com.nozzarella.parser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class CheeseDAO {
	private static int CHEESE_COUNT;
	private BigDecimal cheesePrice;
	private List<Cheese> cheese;


	{
		cheese = new ArrayList<>();

		cheese.add(new Cheese(++CHEESE_COUNT, "Lamber1", new BigDecimal(599.99)));
		cheese.add(new Cheese(++CHEESE_COUNT, "Lamber2", new BigDecimal(599.99)));
		cheese.add(new Cheese(++CHEESE_COUNT, "Lamber3", new BigDecimal(599.99)));
		cheese.add(new Cheese(++CHEESE_COUNT, "Lamber4", new BigDecimal(599.99)));
	}

	public List<Cheese> index() {
		return cheese;
	}

	public Cheese show(int id) {
		return cheese.stream().filter(Cheese -> Cheese.getId() == id).findAny().orElse(null);
	}

	public void save(Cheese Cheese) {
		Cheese.setId(++CHEESE_COUNT);
		Lenta a = new Lenta() ;
		cheesePrice = a.lentaLamber();
		Cheese.setCheesePrice(cheesePrice);
		cheese.add(Cheese);
	}
}