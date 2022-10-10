package kodlamaIOoop.dataAccess.hibernate;

import kodlamaIOoop.dataAccess.CourseDao;
import kodlamaIOoop.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to Database with Hibernate:  " + course.getCourseName());
	}

	@Override
	public void update(Course course) {
		System.out.println("Course updated to Database with Hibernate:  " + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course deleted from Database with Hibernate:  " + course.getCourseName());
	}

}
