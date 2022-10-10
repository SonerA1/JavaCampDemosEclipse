package kodlamaIOoop.entities;

public class Instructor {
	private String instructorFirstName;
	private String instructorLastName;

	public Instructor(String instructorFirstName, String instructorLastName) {
		super();
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
	}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}

}
