package kodlamaIOoop.dataAccess.hibernate;

import kodlamaIOoop.dataAccess.CategoryDao;
import kodlamaIOoop.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Category added to Database with Hibernate:  " + category.getCategoryName());

	}

	@Override
	public void update(Category category) {
		System.out.println("Category updated to Database with Hibernate:  " + category.getCategoryName());

	}

	@Override
	public void delete(Category category) {
		System.out.println("Category deleted from Database with Hibernate:  " + category.getCategoryName());

	}

}
