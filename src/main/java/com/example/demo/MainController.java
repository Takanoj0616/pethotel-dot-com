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

	@GetMapping("/list")
	public String list() {
		return "list";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/confirm")
	public String coform() {
		return "confirm";
	}

	@GetMapping("/form")
	public String home(@ModelAttribute Person person) {
		return "form";
	}

	@GetMapping("/show")
	public String show() {
		return "show";
	}

	@GetMapping("/show2")
	public String show2() {
		return "show2";
	}

	@GetMapping("/sample1")
	public String sample1() {
		return "sampel1";
	}

	@GetMapping("/sample2")
	public String sample2() {
		return "sample2";
	}

	@GetMapping("/sample3")
	public String sample3() {
		return "sample3";
	}

	@GetMapping("/sample4")
	public String sample4() {
		return "sample4";
	}

	@GetMapping("/sample5")
	public String sample5() {
		return "sample5";
	}

	@GetMapping("/sample6")
	public String sample6() {
		return "sample6";
	}

	@GetMapping("/sample7")
	public String sample7() {
		return "sample7";
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