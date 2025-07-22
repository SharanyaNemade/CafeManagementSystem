package com.cafe.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe.model.CafeItem;

@Controller
public class CafeController
{
	
	
//=====================================================================================================================================================================
	
	
	//	18/7/2025
	
	
	
	//	ON GOOGLE :- http://localhost:8080/
	
	
	
	@GetMapping("/")
	public String viewHome(Model model)
	{
//===================================================================================================================================================================		

		
		//	22/7/2025
		
		
		List <CafeItem> items = Arrays.asList(
				new CafeItem("Mocha",95,3,true),
				new CafeItem("Latte",85,5,false),
				new CafeItem("Classic",75,4,true),
				new CafeItem("Expresso",65,2,false),
				new CafeItem("Brew",95,7,true)
				);
		
				
		model.addAttribute("items", items);
		

		
		
//====================================================================================================================================================================
		
		
		
		//	18/7/2025
	
		
		
		
//		CafeItem item1 = new CafeItem("Mocha",95,5);
		
//		model.addAttribute("item1", item1);
		
		
		return "index";
	}
	
	
	
	
	// ON GOOGLE:-	http://localhost:8080/contact
	
	
	@GetMapping("/contact")
	public String viewContact()
	{
		return "contact";
	}
	
	
	
	
//=====================================================================================================================================================================
	
	
}
