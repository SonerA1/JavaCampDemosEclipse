package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository // dataAccess nesnesidir.
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {
	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguage() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
		programmingLanguages.add(new ProgrammingLanguage(4, "Kotlin"));
		programmingLanguages.add(new ProgrammingLanguage(5, "JavaScript"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id)
				return programmingLanguage;

		}
		return null;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);

	}

	@Override
	public void delete(int id) {
		ProgrammingLanguage programmingLanguage = getById(id);
		programmingLanguages.remove(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, int id) {
		ProgrammingLanguage newPLanguage = getById(id);
		newPLanguage.setName(programmingLanguage.getName());

	}

}
