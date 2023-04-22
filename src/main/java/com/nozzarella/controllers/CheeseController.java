package com.nozzarella.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nozzarella.parser.Cheese;
import com.nozzarella.parser.CheeseDAO;

import jakarta.validation.Valid;
import parsers.Lenta;

@Controller
@RequestMapping("/cheese")
public class CheeseController {
	@Autowired
	private CheeseDAO CheeseDAO;

	@GetMapping()	
	public String index(Model model) {
		model.addAttribute("cheese", CheeseDAO.index());
		return "index";
	}

	@GetMapping("/{id}")
	public String show(@PathVariable("id") int id, Model model) {
		model.addAttribute("cheese", CheeseDAO.show(id));
		return "show";
	}

	@GetMapping("/new")
	public String newCheese() {
		return "new";
	}

	@PostMapping()
	public String create() {
		Cheese cheese = new Cheese();
		Cheese cheese1 = new Cheese();
		Lenta product = new Lenta();
		
		product.lentaParse();
		cheese.setCheesePrice(product.lentaLamberPrice());
		cheese.setProductName(product.lentaLamberProductName());
		cheese.setCheeseCountry(product.lentaLamberCountry());
		CheeseDAO.save(cheese);
		
		cheese1.setCheesePrice(product.lentaParmesanPrice());
		cheese1.setProductName(product.lentaParmesanProductName());
		cheese1.setCheeseCountry(product.lentaParmesanCountry());
		CheeseDAO.save(cheese1);
		return "redirect:cheese";
	}
}
