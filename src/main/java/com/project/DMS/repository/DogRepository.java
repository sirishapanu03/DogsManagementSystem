package com.project.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.DMS.Models.Dog;


/**
 * @author s555913 Sirisha Panuganti
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{
	
	List<Dog> findByName(String name);
	

}
