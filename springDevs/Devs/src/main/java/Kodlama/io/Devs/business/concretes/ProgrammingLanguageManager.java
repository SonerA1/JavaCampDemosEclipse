package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.request.ProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.ProgrammingLanguageResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service // business nesnesidir.
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		// super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguageResponse> responses = new ArrayList<ProgrammingLanguageResponse>();
		List<ProgrammingLanguage> languages = programmingLanguageRepository.findAll();
		for (ProgrammingLanguage programmingLanguage : languages) {
			ProgrammingLanguageResponse responseItem = new ProgrammingLanguageResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			responses.add(responseItem);
		}
		// İş kuralları.
		return responses;
	}

	@Override
	public ProgrammingLanguage getById(int id)  {
		return programmingLanguageRepository.findById(id);
	}

	@Override
	public void add(ProgrammingLanguageRequest programmingLanguageRequest) throws Exception {
		checkNameValid(programmingLanguageRequest.getName());
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(programmingLanguage.getName());
		programmingLanguageRepository.save(programmingLanguage);

	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.deleteById(id);

	}

	@Override
	public void update(ProgrammingLanguageRequest programmingLanguageRequest, int id) throws Exception {
		checkNameValid(programmingLanguageRequest.getName());
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id);
		programmingLanguage.setName(programmingLanguageRequest.getName());
		programmingLanguageRepository.save(programmingLanguage);

	}

	@Override
	public ProgrammingLanguageResponse getResponseById(int id) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id);
		ProgrammingLanguageResponse programmingLanguageResponse = new ProgrammingLanguageResponse();
		programmingLanguageRepository.findById(programmingLanguage.getId());
		return programmingLanguageResponse;
	}

	private void checkNameValid(String name) throws Exception {
		ProgrammingLanguage isExist = programmingLanguageRepository.findByName(name);
		if (isExist != null) {
			throw new Exception("This name already exist!");
		}
		if (name.isBlank()) {
			throw new Exception("Name can't be null");
		}
	}

}
