package com.graycat.helloworld.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CatBreed")
public class CatBreed {
	@Id
	private String id;

	private String name;

	private int weight;

	public CatBreed() {
		
	}
	
	public CatBreed(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
