package kodlamaIOoop.dataAccess;

import kodlamaIOoop.entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);

	void update(Instructor instructor);

	void delete(Instructor instructor);

}
