package oop1;

public class Customer {
	private int id;
	private String customerNumber;
	private String phone; // farklı ortamlarla çalışılacağı zaman veri transferinde sıkıntı çıkmaması
							// için, üzerinde işlem yapılmayacak numaralar string veri tipi ile girilir.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
