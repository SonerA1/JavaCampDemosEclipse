package kodlamaIOoop.dataAccess.jdbc;

import kodlamaIOoop.dataAccess.CategoryDao;
import kodlamaIOoop.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category added to Database with JDBC:  " + category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category updated to Database with JDBC:  " + category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category deleted from Database with JDBC:  " + category.getCategoryName());
		
	}

}
