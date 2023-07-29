package com.nozzarella.repository;

import org.springframework.data.repository.CrudRepository;

import com.nozzarella.models.Cheese;

public interface CheeseRepository extends CrudRepository<Cheese, Integer> {

}
