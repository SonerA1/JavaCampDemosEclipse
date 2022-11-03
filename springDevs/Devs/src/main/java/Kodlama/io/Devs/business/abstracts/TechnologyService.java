package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.request.TechnologyRequest;
import Kodlama.io.Devs.business.responses.TechnologyResponse;

public interface TechnologyService {
	List<TechnologyResponse> getAll();

	void add(TechnologyRequest technologyRequest);

	void update(TechnologyRequest technologyRequest, int id);

	void delete(int id);

}
