package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		// class'lar//
//		CreditManager creditManager = new CreditManager();
//		creditManager.Calculate();
//		creditManager.Save();
//
//		Customer customer = new Customer();
//		customer.ıd = 1;		
//		customer.city = "Ankara";
//
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.delete();
//
//		Company company = new Company();
//		company.taxNumber = "1000";
//		company.companyName="Arçelik";
//		company.ıd= 100;
//		
//		CustomerManager customerManager2= new CustomerManager(new Person());
//
//		Person person = new Person();
//		person.nationalIdentity = "123456";
//		person.firstName="Engin";
//		person.lastName="Demiroğ";
//				
//		
//		Customer c1= new Customer();
//		Customer c2= new Person();
//		Customer c3= new Company();

		// katmanlı Mimari ve Referans Tip

		// İoC Container Dependency Injection:
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();

//		// Referans Tipler//
//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;
//		sayi2 = 100;
//		// System.out.println(sayi1); //sayi1=20 sayi2=100
//		int[] sayilar1 = { 1, 2, 3 };
//		int[] sayilar2 = { 10, 20, 30 };
//		sayilar1 = sayilar2;
//		sayilar2[0] = 1000;
//		// System.out.println(sayilar1[0]);

	}

}
