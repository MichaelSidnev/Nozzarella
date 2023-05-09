package com.nozzarella.parser;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			String SQL = "SELECT * FROM cheese_sql_table";
			ResultSet resultSet = statement.executeQuery(SQL);
			
			while(resultSet.next()) {
				Cheese currentCheese = new Cheese();
				
				currentCheese.setId(resultSet.getInt("id"));
				currentCheese.setProductName(resultSet.getString("name"));
				currentCheese.setCheesePrice(resultSet.getBigDecimal("price"));
				currentCheese.setCheeseCountry(resultSet.getString("country"));
				
				cheeses.add(currentCheese);;
			}
			
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		
		return cheeses;
	}

	public Cheese show(int id) {
		
		Cheese cheese = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SECT * FROM cheese_sql_table WHERE id = ?");
			
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			resultSet.next();

			cheese = new Cheese();
			
			cheese.setId(resultSet.getInt("id"));
			cheese.setProductName(resultSet.getString("name"));
			cheese.setCheesePrice(resultSet.getBigDecimal("price"));
			cheese.setCheeseCountry(resultSet.getString("country"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cheese;
	}

	public void save(Cheese cheese) {
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO cheese_sql_table VALUES (1,?,?,?)");
		
			preparedStatement.setString(1, cheese.getProductName());
			preparedStatement.setBigDecimal(2, cheese.getCheesePrice());
			preparedStatement.setString(3, cheese.getCheeseCountry());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}