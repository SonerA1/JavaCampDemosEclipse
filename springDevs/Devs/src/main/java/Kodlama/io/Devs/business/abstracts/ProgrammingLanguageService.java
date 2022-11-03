package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.request.ProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.ProgrammingLanguageResponse;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguageResponse> getAll();

	ProgrammingLanguageResponse getResponseById(int id);

	ProgrammingLanguage getById(int id);

	void add(ProgrammingLanguageRequest programmingLanguageRequest) throws Exception;

	void delete(int id) throws Exception;

	void update(ProgrammingLanguageRequest programmingLanguageRequest, int id) throws Exception;

}
