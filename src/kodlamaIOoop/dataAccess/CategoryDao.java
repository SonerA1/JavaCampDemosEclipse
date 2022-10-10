package kodlamaIOoop.dataAccess;

import kodlamaIOoop.entities.Category;

public interface CategoryDao {
	void add(Category category);

	void update(Category category);

	void delete(Category category);

}
