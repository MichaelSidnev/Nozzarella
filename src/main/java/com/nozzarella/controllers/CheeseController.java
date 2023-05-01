package com.nozzarella.controllers;

import java.io.IOException;

import org.jsoup.nodes.Element;
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
import parsers.Somelie;

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
	public String create() throws Exception {
		Lenta product = new Lenta();
		Cheese cheese = new Cheese();
		Cheese cheese1 = new Cheese();

		product.lentaParse();
		cheese.setCheesePrice(product.lentaLamberPrice());
		cheese.setProductName(product.lentaLamberProductName());
		cheese.setCheeseCountry(product.lentaLamberCountry());
		CheeseDAO.save(cheese);
		
		cheese1.setCheesePrice(product.lentaParmesanPrice());
		cheese1.setProductName(product.lentaParmesanProductName());
		cheese1.setCheeseCountry(product.lentaParmesanCountry());
		CheeseDAO.save(cheese1);
		
		Somelie product2 = new Somelie();
		Somelie page = new Somelie();
		Element parsePage = page.SomelieParse();
		Cheese cheese2 = new Cheese();
		
		cheese2.setCheesePrice(product2.somelieCheesePrice(parsePage));
		cheese2.setProductName(product2.somelieCheeseProductName(parsePage));
		cheese2.setCheeseCountry(product2.somelieCheeseCountry());
		CheeseDAO.save(cheese2);
			
		return "redirect:cheese";
	}
}
