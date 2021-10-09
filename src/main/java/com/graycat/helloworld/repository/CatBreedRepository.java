package com.graycat.helloworld.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graycat.helloworld.domain.CatBreed;

public interface CatBreedRepository extends MongoRepository<CatBreed, String> {
	public long count();
	
	List<CatBreed> findAll();
}
