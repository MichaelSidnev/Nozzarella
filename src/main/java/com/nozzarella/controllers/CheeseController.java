package com.nozzarella.controllers;

import java.util.Optional;

import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nozzarella.domain.Cheese;
import com.nozzarella.parser.Lenta;
import com.nozzarella.parser.Somelie;
import com.nozzarella.repository.CheeseRepository;

@Controller
@RequestMapping("/cheese")
public class CheeseController {
	@Autowired
	private CheeseRepository cheeseRepository;

	@GetMapping()
	public String index(Model model) {
		Iterable<Cheese> cheese = cheeseRepository.findAll();
		model.addAttribute("cheese", cheese);
		return "index";
	}

	@GetMapping("/{id}")
	public String show(@RequestParam(value = "id", required = false) Integer id, Model model) {
		Optional<Cheese> cheese = cheeseRepository.findById(id);
		if (cheese.isEmpty()) {
			return "cheese not found";
		}
	model.addAttribute("Cheese", cheese);
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
		cheeseRepository.save(cheese);

		cheese1.setCheesePrice(product.lentaParmesanPrice());
		cheese1.setProductName(product.lentaParmesanProductName());
		cheese1.setCheeseCountry(product.lentaParmesanCountry());
		cheeseRepository.save(cheese1);

		Somelie product2 = new Somelie();
		Somelie page = new Somelie();
		Element parsePage = page.SomelieParse();
		Cheese cheese2 = new Cheese();

		cheese2.setCheesePrice(product2.somelieCheesePrice(parsePage));
		cheese2.setProductName(product2.somelieCheeseProductName(parsePage));
		cheese2.setCheeseCountry(product2.somelieCheeseCountry());
		cheeseRepository.save(cheese2);

		return "redirect:cheese";
	}
}
