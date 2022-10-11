package kodlamaIOoop.dataAccess.jdbc;

import kodlamaIOoop.dataAccess.InstructorDao;
import kodlamaIOoop.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added to Database with JDBC :" + instructor.getInstructorFirstName() + " "
				+ instructor.getInstructorLastName());

	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Instructor updated to Database with JDBC:  " + instructor.getInstructorFirstName() + " "
				+ instructor.getInstructorLastName());

	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Instructor deleted from Database with JDBC: " + instructor.getInstructorFirstName() + " "
				+ instructor.getInstructorLastName());

	}

}
