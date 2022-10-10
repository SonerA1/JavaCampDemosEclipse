package kodlamaIOoop;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOoop.business.CategoryManager;
import kodlamaIOoop.business.CourseManager;
import kodlamaIOoop.business.InstructorManager;
import kodlamaIOoop.core.logging.DatabaseLogger;
import kodlamaIOoop.core.logging.EmailLogger;
import kodlamaIOoop.core.logging.FileLogger;
import kodlamaIOoop.core.logging.Logger;
import kodlamaIOoop.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaIOoop.dataAccess.hibernate.HibernateCourseDao;
import kodlamaIOoop.dataAccess.hibernate.HibernateInstructorDao;
import kodlamaIOoop.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaIOoop.dataAccess.jdbc.JdbcCourseDao;
import kodlamaIOoop.dataAccess.jdbc.JdbcInstructorDao;
import kodlamaIOoop.entities.Category;
import kodlamaIOoop.entities.Course;
import kodlamaIOoop.entities.Instructor;

public class Main {
	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		Instructor instructor = new Instructor("Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		instructor.setInstructorFirstName("Engin");
		instructorManager.update(instructor);
		System.out.println();

		Category category1 = new Category("Programlamalar");
		Category category2 = new Category("Senior"); // ("Programlamalar)=>throw Exception
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.update(category1);
		categoryManager.delete(category2);
		System.out.println();

		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı-JAVA", category1, 6);
		Course course2 = new Course("Senior Yazılım Geliştirici Yetiştirme Kapmpı (.NET)", category2, 7);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		System.out.println();

		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.update(course1);
		courseManager.delete(course2);

	}
	/*
	 * Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new
	 * EmailLogger() };
	 * 
	 * Instructor instructor = new Instructor("Engin", "Demiroğ"); InstructorManager
	 * instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
	 * instructorManager.add(instructor);
	 * instructor.setInstructorFirstName("Engin");
	 * instructorManager.update(instructor); System.out.println();
	 * 
	 * Category category1 = new Category("Programlamalar"); Category category2 = new
	 * Category("Senior"); // ("Programlamalar)=>throw Exception CategoryManager
	 * categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
	 * categoryManager.add(category1); categoryManager.add(category2);
	 * categoryManager.update(category1); System.out.println();
	 * 
	 * Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı-JAVA",
	 * category1, 6); Course course2 = new
	 * Course("Senior Yazılım Geliştirici Yetiştirme Kapmpı (.NET)", category2, 7);
	 * CourseManager courseManager = new CourseManager(new JdbcCourseDao(),
	 * loggers); System.out.println();
	 * 
	 * courseManager.add(course1); courseManager.add(course2);
	 * courseManager.update(course2); }
	 */

}
