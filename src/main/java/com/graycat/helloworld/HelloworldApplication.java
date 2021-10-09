package com.graycat.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.graycat.helloworld.repository.CatBreedRepository;

@SpringBootApplication
@EnableMongoRepositories
public class HelloworldApplication {
	
	@Autowired
	CatBreedRepository catRepo;

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
