package mükemmelSayi;

public class Main {
	public static void main(String[] args) {
		//6 --> 1,2,3'e tam bölünür ve toplamları 6'dır.
		//28 --> 1,2,4,7,14'e tam bölünür ve toplamları 28'dir.
		int number = 27;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				total = total + i;
			}			
		}
		if (total == number) {
			System.out.println("Mükemmel sayı!!!");	
		}
		else {
			System.out.println("Mükemmel sayı değildir!!!");
		}
				
	}
}
