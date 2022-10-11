package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibarnateProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve sadece db erişim kodları yazılır...
		System.out.println("Hibarnate ile veritabanına eklendi");

	}

}
