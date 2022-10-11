package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) { //  base kredimanagera public final double hesapla() şeklinde de yazılabilirdi
		return tutar * 1.10; // override ederek ogrenci kredisini 1.10 olarak aldık
		// base kredi manager bu durumu kabul ederek devam eder.
	}
}
