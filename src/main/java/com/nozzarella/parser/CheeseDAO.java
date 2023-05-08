package com.nozzarella.parser;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CheeseDAO {
	private static int CHEESE_COUNT;

	private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "postgres";

	private static Connection connection;

	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException throwables) {
			throwables.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public List<Cheese> index() {
		List<Cheese> cheeses = new ArrayList<>();

		try {
			Statement statement = connection.createStatement();
			String SQL = "SELECT * FROM Cheesese";
			ResultSet resultSet = statement.executeQuery(SQL);
			
			while(resultSet.next()) {
				Cheese currentCheese = new Cheese();
				
				currentCheese.setId(resultSet.getInt("id"));
				currentCheese.setProductName(resultSet.getString("name"));
				currentCheese.setCheesePrice(resultSet.getBigDecimal("price"));
				currentCheese.setCheeseCountry(resultSet.getNString("country"));
				
				cheeses.add(currentCheese);;
			}
			
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		
		return cheeses;
	}

	public Cheese show(int id) {
//		return cheeseList.stream().filter(Cheese -> Cheese.getId() == id).findAny().orElse(null);
		return null;
	}

	public void save(Cheese cheese) {
//		cheese.setId(++CHEESE_COUNT);
//		cheeseList.add(cheese);
	}
}