package youTubeEgitim;

public class Customer {
	public Customer() {
		System.out.println("Müşteri Nesnesi başlatıldı");
	}

	public int ıd;
	public String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return ıd;
	}

	public void setId(int id) {
		ıd = id;
	}

}
