package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.request.TechnologyRequest;
import Kodlama.io.Devs.business.responses.TechnologyResponse;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.concretes.Technology;

public class TechnologyManager implements TechnologyService {
	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageService programmingLanguageService;

	public TechnologyManager(TechnologyRepository technologyRepository,
			ProgrammingLanguageService programmingLanguageService) {
		this.technologyRepository = technologyRepository;
		this.programmingLanguageService = programmingLanguageService;
	}

	@Override
	public List<TechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<TechnologyResponse> responses = new ArrayList<>();
		for (Technology technology : technologies) {
			TechnologyResponse technologyResponse = new TechnologyResponse();
			technologyResponse.setName(technology.getName());
			technologyResponse.setProgrammingLanguageId(technology.getProgrammingLanguage().getId());
			technologyResponse.setId(technology.getId());
			responses.add(technologyResponse);

		}

		return responses;
	}

	@Override
	public void add(TechnologyRequest technologyRequest) {
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage =
				programmingLanguageService.getById(technologyRequest.getProgrammingLanguageId());
		technology.setName(technologyRequest.getName());
		technology.setProgrammingLanguage(programmingLanguage);
	
		technologyRepository.save(technology);

	}

	@Override
	public void update(TechnologyRequest technologyRequest, int id) {
		Technology updateTechnology = technologyRepository.findById(id);
		ProgrammingLanguage updateProgrammingLanguadeId = programmingLanguageService
				.getById(technologyRequest.getProgrammingLanguageId());

		updateTechnology.setName(technologyRequest.getName());
		updateTechnology.setProgrammingLanguage(updateProgrammingLanguadeId);
		technologyRepository.save(updateTechnology);

	}

	@Override
	public void delete(int id) {
		technologyRepository.deleteById(id);

	}

}
