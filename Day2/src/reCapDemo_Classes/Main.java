package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonucTopla = dortIslem.Topla(3, 4);
		System.out.println(sonucTopla);
		
		int sonucCıkar = dortIslem.Cıkar(4, 3);
		System.out.println(sonucCıkar);
		
		int sonucCarp = dortIslem.Carp(3, 4);
		System.out.println(sonucCarp);
		
		double sonucBol = dortIslem.Bol(3, 4);
		System.out.println(sonucBol);

	}

}
