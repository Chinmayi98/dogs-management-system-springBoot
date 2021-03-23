package com.chinmayi.DogsManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.chinmayi.DogsManagementSystem.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
}
