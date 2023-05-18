package com.nozzarella.repository;

import org.springframework.data.repository.CrudRepository;

import com.nozzarella.domain.Cheese;

public interface CheeseRepository extends CrudRepository<Cheese, Integer> {

}
