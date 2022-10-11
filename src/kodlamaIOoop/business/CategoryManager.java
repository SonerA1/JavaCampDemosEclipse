package kodlamaIOoop.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOoop.core.logging.Logger;
import kodlamaIOoop.dataAccess.CategoryDao;
import kodlamaIOoop.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	List<Category> categories = new ArrayList<>();

	public void add(Category category) throws Exception {
		for (Category cr : categories) {
			if (cr.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Category name can not be same");
			}

		}

		categoryDao.add(category);
		categories.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

	public void update(Category category) {
		this.categoryDao.update(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());

		}

	}

	public void delete(Category category) {
		this.categoryDao.delete(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());

		}
	}

}
