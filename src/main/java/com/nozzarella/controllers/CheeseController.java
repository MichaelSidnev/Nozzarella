package com.nozzarella.controllers;

import java.security.Principal;
import java.time.LocalDate;
import java.util.Optional;

import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nozzarella.models.Cheese;
import com.nozzarella.parsers.Lenta;
import com.nozzarella.parsers.Somelie;
import com.nozzarella.repository.CheeseRepository;

@Controller
public class CheeseController {
	@Autowired
	private CheeseRepository cheeseRepository;

	@GetMapping("/authenticated")
	public String pageForAuthenticatedUsers(Principal principal) {
		Authentication  a = SecurityContextHolder.getContext().getAuthentication();
		return "secured part of web service:" + principal.getName();
	}
	
	@GetMapping("cheese")
	public String index(Model model) {
		Iterable<Cheese> cheese = cheeseRepository.findAll();
		model.addAttribute("cheese", cheese);
		return "index";
	}
	
	@GetMapping("/")
	public String greeting() {
		return "home";
	}

	@GetMapping("cheese/{id}")
	public String show(@PathVariable(value = "id", required = true) Integer id, Model model) {
		Optional<Cheese> cheese = cheeseRepository.findById(id);
		if (cheese.isEmpty()) {
			return "cheese not found";
		}
		model.addAttribute("cheese", cheese.get());
		return "show";
	}

	@GetMapping("/new")
	public String newCheese() {
		return "new";
	}
	

	@PostMapping("cheese")
	public String create() throws Exception {
		LocalDate localDate = LocalDate.now();
		Lenta product = new Lenta();
		Cheese cheese = new Cheese();
		Cheese cheese1 = new Cheese();

		product.lentaParse();
		cheese.setProductName(product.lentaLamberProductName());
		cheese.setCheesePrice(product.lentaLamberPrice());
		cheese.setCheeseCountry(product.lentaLamberCountry());
		cheese.setTiming(localDate);
		cheeseRepository.save(cheese);

		cheese1.setProductName(product.lentaParmesanProductName());
		cheese1.setCheesePrice(product.lentaParmesanPrice());
		cheese1.setCheeseCountry(product.lentaParmesanCountry());
		cheese1.setTiming(localDate);
		cheeseRepository.save(cheese1);

		Somelie product2 = new Somelie();
		Somelie page = new Somelie();
		Element parsePage = page.SomelieParse();
		Cheese cheese2 = new Cheese();

		cheese2.setProductName(product2.somelieCheeseProductName(parsePage));
		cheese2.setCheesePrice(product2.somelieCheesePrice(parsePage));
		cheese2.setCheeseCountry(product2.somelieCheeseCountry());
		cheese2.setTiming(localDate);
		cheeseRepository.save(cheese2);

		return "redirect:cheese";
	}
}
