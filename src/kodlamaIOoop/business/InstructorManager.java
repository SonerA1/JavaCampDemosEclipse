package kodlamaIOoop.business;

import kodlamaIOoop.core.logging.Logger;
import kodlamaIOoop.dataAccess.InstructorDao;
import kodlamaIOoop.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		this.instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName());
		}

	}

	public void update(Instructor instructor) {
		this.instructorDao.update(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName());
		}
	}
	public void delete(Instructor instructor) {
		this.instructorDao.delete(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName() );
			
		}
	}
}
