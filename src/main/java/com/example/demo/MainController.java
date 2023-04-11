package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Controller
public class MainController {

	private final PersonRepository repository;

	@Autowired
	public MainController(PersonRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/")
	public String write1() {
		return "index";
	}

	@GetMapping("/item")
	public String home() {
		return "item";
	}

	@GetMapping("/form")
	public String home(@ModelAttribute Person person) {
		return "form";
	}

	@PostMapping("/form")
	public String result(@Validated @ModelAttribute Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "form";
		}
		repository.save(person);
		return "result";
	}
}