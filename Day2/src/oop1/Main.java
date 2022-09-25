package oop1;

public class Main {
	// object oriented programming
	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		// set value
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		// get value
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("LaCimbali Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
//			System.out.println(product.unitPrice);
//			System.out.println(product.unitsInStock);
//			System.out.println(product.discount);
//			System.out.println(product.imageUrl);
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("234758");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05300000000");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("543321");

		Customer[] customers = { individualCustomer, corporateCustomer };

	}

}
