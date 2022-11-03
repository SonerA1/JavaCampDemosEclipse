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
import Kodlama.io.Devs.business.request.ProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.ProgrammingLanguageResponse;
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
	public List<ProgrammingLanguageResponse> getAll() {
		return service.getAll();
	}

	@PostMapping("/add")
	public void add(ProgrammingLanguageRequest programmingLanguageRequest) throws Exception {
		service.add(programmingLanguageRequest);
	}

	@DeleteMapping("/delete")
	public void delete(int id) throws Exception {
		service.delete(id);
	}

	@PutMapping("/update")
	public void update(ProgrammingLanguageRequest programmingLanguageRequest) throws Exception {
		service.update(programmingLanguageRequest, 1);

	}

	@GetMapping("/id")
	public ProgrammingLanguageResponse getById(@PathVariable int id) throws Exception {
		return service.getResponseById(id);
	}

}
