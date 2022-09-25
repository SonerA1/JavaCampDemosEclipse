package classesWithAttributes;

public class Main {
	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus",5000,2,"Siyah");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription ("Asus");
//		product.setPrice(5000);
//		product.setStockAmount(3);
//		product.setRenk(null);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
				
	}
}
