package miniProjeAsalSayilar;

public class Main {
	public static void main(String[] args) {
		//bug= sistemsel açık
		int number=13;
		int remainder = number%2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if (number==1) {
			System.out.println("Number is not a Prime");
		}
		if (number<1) {
			System.out.println("Number is invalid");
		}
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime = false;
			}			
		}
		if (isPrime) {
			System.out.println("Number is a Prime");
		}
		else {
			System.out.println("Number is not a Prime");
		}
	}
}
