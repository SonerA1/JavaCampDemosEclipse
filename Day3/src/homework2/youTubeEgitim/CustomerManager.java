package youTubeEgitim;

public class CustomerManager extends Person {
	public void save() {
		System.out.println("Müşteri Kaydedildi :");
		}

	public void delete() {
		System.out.println("Müşteri Silindi :");
	}
	private Customer _customer;
	public CustomerManager(Customer customer){
		_customer = customer;
	}	
	private ICreditManager _creditManager;
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	public void giveCredit() {
		
		_creditManager.calculate();
		System.out.println("Kredi verildi");
	}
	
		
	
}
