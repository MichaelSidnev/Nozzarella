package controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nozzarella.parser.MainRepresentationClass;

import models.Person;

@Controller
@RequestMapping("/people")
public class CheeseController {

	private PersonDAO personDAO;

	@Autowired
	public CheeseController(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

//	@GetMapping()
//	public String Representation() {
//		return "mainPage";
//	}

	@GetMapping()
	public String index(Model model) {
		model.addAttribute("people", personDAO.index());
		return "index";
	}

	@GetMapping("/{id}")
	public String show(@PathVariable("id") int id, Model model) {
		model.addAttribute("person", personDAO.show(id));
		return "show";
	}
	
	@GetMapping("/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "new";
	}
	@PostMapping()
	public String create(@ModelAttribute("person") Person person) {
		personDAO.save(person);
		return "redirect:people"; 
	}
}
