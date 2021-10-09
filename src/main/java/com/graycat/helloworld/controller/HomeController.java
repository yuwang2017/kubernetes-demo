package com.graycat.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.graycat.helloworld.domain.CatBreed;
import com.graycat.helloworld.service.CatService;

@Controller
public class HomeController {
	
	@Autowired
	CatService catService;
	
	
	@GetMapping("/")
	public String gohome(Model model){
		List<CatBreed> cats = catService.getAllCats();
		model.addAttribute("cats", cats);
		model.addAttribute("message", "Number of Breed :" + cats.size());
		return "homePage";
	}
	
	@GetMapping("/addCats")
	public String populateCats(Model model){
		
		CatBreed ragdoll = new CatBreed("Ragdoll", 15);
		CatBreed bsh = new CatBreed("British Shorthair", 8);
		catService.saveCat(ragdoll);
		catService.saveCat(bsh);
		List<CatBreed> cats = catService.getAllCats();
		
		
		model.addAttribute("cats", cats);
		model.addAttribute("message", "Number of Breed :" + cats.size());
		return "homePage";
	}

}
