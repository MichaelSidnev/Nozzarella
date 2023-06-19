package com.nozzarella.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nozzarella.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
	

}
