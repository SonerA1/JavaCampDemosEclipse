package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
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
	public List<ProgrammingLanguage> getAll() {
		// İş kuralları.
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Id not found.");
		}
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (isIdExist(programmingLanguage.getId())) {
			throw new Exception("Id is already used");
		}
		if (isNameValid(programmingLanguage.getName())) {
			programmingLanguageRepository.add(programmingLanguage);
		}
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);

	}

	@Override
	public void update(ProgrammingLanguage programmiLanguage, int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Program updated");
		}
		if (isNameValid(programmiLanguage.getName())) {
			programmingLanguageRepository.update(programmiLanguage, id);
			;
		}
	}

	private boolean isIdExist(int id) {
		for (ProgrammingLanguage programmingLanguage : getAll()) {
			if (programmingLanguage.getId() == id) {
				return true;

			}
		}
		return false;
	}

	public boolean isNameValid(String name) throws Exception {
		if (name.isBlank()) {
			throw new Exception("Program name is not empty");
		}
		for (ProgrammingLanguage programmingLanguage : getAll()) {
			if (programmingLanguage.getName().equals(name)) {
				throw new Exception("Program name cannot be repaired");
			}
		}
		return true;

	}
}
