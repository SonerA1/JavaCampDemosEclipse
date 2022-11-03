package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.request.TechnologyRequest;
import Kodlama.io.Devs.business.responses.TechnologyResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class TechnologiesController {
	private TechnologyService technologyService;

	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}

	@GetMapping("/getall")
	public List<TechnologyResponse> getAll() {
		return technologyService.getAll();
	}

	@PostMapping
	public void add(@RequestBody() TechnologyRequest technologyRequest) {
		technologyService.add(technologyRequest);
	}

	@PutMapping("/update/{id}")
	    public void update(@RequestBody() TechnologyRequest technologyRequest,@PathVariable int id){
	        technologyService.update(technologyRequest,id);
	}
	@DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        technologyService.delete(id);
	}
}
