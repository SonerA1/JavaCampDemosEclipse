package kodlamaIOoop.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOoop.core.logging.Logger;
import kodlamaIOoop.dataAccess.CourseDao;
import kodlamaIOoop.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	List<Course> courses = new ArrayList<>();

	public void add(Course course) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Course price can not less than zero");
		}
		for (Course crs : courses) {
			if (crs.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course name can not be same");
			}

		}
		courseDao.add(course);
		courses.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName() + " " + course.getUnitPrice());

		}

	}

	public void update(Course course) {
		this.courseDao.update(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName() + " " + course.getUnitPrice());

		}
	}

	public void delete(Course course) {
		this.courseDao.delete(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName() + " " + course.getUnitPrice());

		}
	}

}
