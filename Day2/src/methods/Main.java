package methods;

public class Main {
	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();
		sayiBulma();
		sayiBulma();
	}

	public static void sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 3;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		String mesaj = "";
		if (varMi) {
			mesaj = "Aranan sayı bulundu!" + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Aranan sayı bulunamadı!" + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
