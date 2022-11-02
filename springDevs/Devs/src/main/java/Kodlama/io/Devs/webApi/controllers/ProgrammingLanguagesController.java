package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController // Annotation
@RequestMapping("/api/devs/programming")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService service;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService service) {
		this.service = service;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return service.getAll();
	}

	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		service.add(programmingLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(int id) throws Exception {
		service.delete(id);
	}

	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		service.update(programmingLanguage, 0);

	}

	@GetMapping("/id")
	public ProgrammingLanguage getById(@PathVariable int id) throws Exception {
		return service.getById(id);
	}

}
