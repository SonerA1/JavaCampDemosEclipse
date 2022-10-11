package kodlamaIOoop.dataAccess.jdbc;

import kodlamaIOoop.dataAccess.CourseDao;
import kodlamaIOoop.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to Database with JDBC:  " + course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Course updated to Database with JDBC:  " + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course deleted from Database with JDBC:  " + course.getCourseName());
			}

}
