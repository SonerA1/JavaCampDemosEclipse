package loopDemo;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti!");

		// while
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While döngüsü bitti!");

		// Do While
		int j = 100;
		do {
			//System.out.println("Loglandı"); diyerek if bloğu içine alıp, sadece 1 kere çalışmasını istediğimiz zamanlarda kullanabiliriz.
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While döngüsü bitti!");
	}
}
