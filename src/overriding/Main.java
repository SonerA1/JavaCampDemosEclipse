package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(), // aray olarak
																								// sınıflandırdık
				new TarimKrediManager(), new OgrenciKrediManager() };
		for (BaseKrediManager krediManager : krediManagers) { // for döngüsüyle içerisindekileri bulduk
			System.out.println(krediManager.hesapla(1000));
		}

	}
}
