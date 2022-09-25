package sesliHarfler;

public class Main {
	public static void main(String[] args) {
		char harf = 'K';
		
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");			
			break;

		default:
			System.out.println("İnce sesli harf");
		}
		
//		char[] kalınHarfler = new char[4];
//		kalınHarfler[0] ='A';
//		kalınHarfler[1] ='I';
//		kalınHarfler[2] ='O';
//		kalınHarfler[3] ='U';
//		char[] inceHarfler = new char[4];
//		inceHarfler[0] ='E';
//		inceHarfler[1] ='İ';
//		inceHarfler[2] ='Ö';
//		inceHarfler[3] ='Ü';
//		
//		for (char harf1 : kalınHarfler) {
//			if (harf1) {
//				
//			}
//			System.out.println(harf1);
//		}
//			for (char harf2 : inceHarfler) {
//				System.out.println(harf2);
//			}
		
	}

}
