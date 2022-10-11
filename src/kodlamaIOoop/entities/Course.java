package kodlamaIOoop.entities;

public class Course {
	private String courseName;
	private Category category;
	private double unitPrice;

	public Course(String courseName, Category category, double unitPrice) {
		super();
		this.courseName = courseName;
		this.category = category;
		this.unitPrice = unitPrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
