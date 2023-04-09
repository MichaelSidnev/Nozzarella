package com.nozzarella.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nozzarella.parser.Cheese;
import com.nozzarella.parser.CheeseDAO;

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
	public String newCheese(@ModelAttribute("cheese") Cheese cheese) {
		return "new";
	}

	@PostMapping()
	public String create(@ModelAttribute("cheese") Cheese cheese) {
		CheeseDAO.save(cheese);
		return "redirect:cheese";
	}
}
