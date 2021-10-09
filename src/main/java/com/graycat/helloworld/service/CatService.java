package com.graycat.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graycat.helloworld.domain.CatBreed;
import com.graycat.helloworld.repository.CatBreedRepository;

@Component
public class CatService {
	
	@Autowired
	CatBreedRepository catRepo;
	
	public List<CatBreed> getAllCats() {
		return catRepo.findAll();
	}
	
	public void saveCat(CatBreed cat) {
		catRepo.save(cat);
	}
}
